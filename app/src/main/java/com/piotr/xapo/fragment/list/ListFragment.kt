package com.piotr.xapo.fragment.list

import android.view.LayoutInflater
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.os.Bundle
import javax.inject.Inject
import android.support.v7.widget.LinearLayoutManager
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.RecyclerView
import com.piotr.xapo.MyApplication
import com.piotr.xapo.adapter.AdapterRepositorys
import com.piotr.xapo.base.NavigationInterface
import com.piotr.xapo.databinding.FragmentListBinding
import com.piotr.xapo.model.Repository

public class ListFragment : Fragment(), Contract.View {

    private lateinit var binding: FragmentListBinding
    private val adapterRepositorys: AdapterRepositorys = AdapterRepositorys()
    @Inject
    lateinit var presenter: Contract.Presenter
    private var initialized = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerListComponent.builder().applicationComponent(MyApplication.instance.getAppComponent()).listModule(ListModule(this)).build().inject(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        presenter.dispose()

    }

    override fun onCreateView(inflater: LayoutInflater, parent: ViewGroup?, savedInstanceState: Bundle?): View {
        val context = this@ListFragment.activity as Context
        if (initialized) {
            return binding.root
        }

        binding = FragmentListBinding.inflate(inflater)
        (activity as AppCompatActivity).setSupportActionBar(binding.toolbar)
        binding.recyclerview10.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))
        binding.recyclerview10.layoutManager = LinearLayoutManager(context) as RecyclerView.LayoutManager
        binding.recyclerview10.adapter = adapterRepositorys
        adapterRepositorys.setOnItemClickListener(object : AdapterRepositorys.OnItemClickListener {
            override fun onItemClick(position: Int, item: Repository, image: View) {
                openDetailsScreen(item, image)
            }
        })

        binding.errorLayout.setOnClickListener {
            binding.errorLayout.visibility = View.GONE
            presenter.loadData()
        }

        presenter.loadData()
        initialized = true
        return binding.root

    }

    override fun setAdapterData(Repositorys: List<Repository>) {
        adapterRepositorys.setData(Repositorys)
    }

    override fun setAdapterOnClickListener(onClickListener: AdapterRepositorys.OnItemClickListener) {
        adapterRepositorys.setOnItemClickListener(onItemClickListener = onClickListener)
    }

    override fun openDetailsScreen(Repository: Repository, image: View) {
        (activity as NavigationInterface).openDetailsFragment(Repository, image)
    }

    override fun hideProgress() {
        binding.bar.visibility = View.GONE
    }

    override fun showProgress() {
        binding.bar.visibility = View.VISIBLE
    }

    override fun onNoDataFetched() {
        binding.errorLayout.visibility = View.VISIBLE
    }
}
                