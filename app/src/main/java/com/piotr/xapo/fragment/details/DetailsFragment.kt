package com.piotr.xapo.fragment.details

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.piotr.xapo.MyApplication
import com.piotr.xapo.databinding.FragmentDetailsBinding
import com.piotr.xapo.model.User

public class DetailsFragment : Fragment(), Contract.View {

    lateinit var binding: FragmentDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerDetailsComponent.builder().applicationComponent(MyApplication.instance.getAppComponent()).detailsModule(DetailsModule(this)).build().inject(this)

        super.onCreate(savedInstanceState);
    }

    override fun onCreateView(inflater: LayoutInflater, parent: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentDetailsBinding.inflate(inflater)
        (activity as AppCompatActivity).setSupportActionBar(binding.toolbar)
        readArgs()
        return binding.root
    }

    fun readArgs() {
        val user: User = arguments!!.getSerializable("user") as User
        binding.user = user
    }

}
                