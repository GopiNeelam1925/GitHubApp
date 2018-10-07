package com.piotr.xapo

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.piotr.xapo.model.User

object TestValues {
    val testResponse: String = "[\n" +
            "  {\n" +
            "    \"login\": \"mojombo\",\n" +
            "    \"id\": 1,\n" +
            "    \"node_id\": \"MDQ6VXNlcjE=\",\n" +
            "    \"avatar_url\": \"https://avatars0.githubusercontent.com/u/1?v=4\",\n" +
            "    \"gravatar_id\": \"\",\n" +
            "    \"url\": \"https://api.github.com/users/mojombo\",\n" +
            "    \"html_url\": \"https://github.com/mojombo\",\n" +
            "    \"followers_url\": \"https://api.github.com/users/mojombo/followers\",\n" +
            "    \"following_url\": \"https://api.github.com/users/mojombo/following{/other_user}\",\n" +
            "    \"gists_url\": \"https://api.github.com/users/mojombo/gists{/gist_id}\",\n" +
            "    \"starred_url\": \"https://api.github.com/users/mojombo/starred{/owner}{/repo}\",\n" +
            "    \"subscriptions_url\": \"https://api.github.com/users/mojombo/subscriptions\",\n" +
            "    \"organizations_url\": \"https://api.github.com/users/mojombo/orgs\",\n" +
            "    \"repos_url\": \"https://api.github.com/users/mojombo/repos\",\n" +
            "    \"events_url\": \"https://api.github.com/users/mojombo/events{/privacy}\",\n" +
            "    \"received_events_url\": \"https://api.github.com/users/mojombo/received_events\",\n" +
            "    \"type\": \"User\",\n" +
            "    \"site_admin\": false\n" +
            "  },\n" +
            "  {\n" +
            "    \"login\": \"defunkt\",\n" +
            "    \"id\": 2,\n" +
            "    \"node_id\": \"MDQ6VXNlcjI=\",\n" +
            "    \"avatar_url\": \"https://avatars0.githubusercontent.com/u/2?v=4\",\n" +
            "    \"gravatar_id\": \"\",\n" +
            "    \"url\": \"https://api.github.com/users/defunkt\",\n" +
            "    \"html_url\": \"https://github.com/defunkt\",\n" +
            "    \"followers_url\": \"https://api.github.com/users/defunkt/followers\",\n" +
            "    \"following_url\": \"https://api.github.com/users/defunkt/following{/other_user}\",\n" +
            "    \"gists_url\": \"https://api.github.com/users/defunkt/gists{/gist_id}\",\n" +
            "    \"starred_url\": \"https://api.github.com/users/defunkt/starred{/owner}{/repo}\",\n" +
            "    \"subscriptions_url\": \"https://api.github.com/users/defunkt/subscriptions\",\n" +
            "    \"organizations_url\": \"https://api.github.com/users/defunkt/orgs\",\n" +
            "    \"repos_url\": \"https://api.github.com/users/defunkt/repos\",\n" +
            "    \"events_url\": \"https://api.github.com/users/defunkt/events{/privacy}\",\n" +
            "    \"received_events_url\": \"https://api.github.com/users/defunkt/received_events\",\n" +
            "    \"type\": \"User\",\n" +
            "    \"site_admin\": true\n" +
            "  },\n" +
            "  {\n" +
            "    \"login\": \"pjhyett\",\n" +
            "    \"id\": 3,\n" +
            "    \"node_id\": \"MDQ6VXNlcjM=\",\n" +
            "    \"avatar_url\": \"https://avatars0.githubusercontent.com/u/3?v=4\",\n" +
            "    \"gravatar_id\": \"\",\n" +
            "    \"url\": \"https://api.github.com/users/pjhyett\",\n" +
            "    \"html_url\": \"https://github.com/pjhyett\",\n" +
            "    \"followers_url\": \"https://api.github.com/users/pjhyett/followers\",\n" +
            "    \"following_url\": \"https://api.github.com/users/pjhyett/following{/other_user}\",\n" +
            "    \"gists_url\": \"https://api.github.com/users/pjhyett/gists{/gist_id}\",\n" +
            "    \"starred_url\": \"https://api.github.com/users/pjhyett/starred{/owner}{/repo}\",\n" +
            "    \"subscriptions_url\": \"https://api.github.com/users/pjhyett/subscriptions\",\n" +
            "    \"organizations_url\": \"https://api.github.com/users/pjhyett/orgs\",\n" +
            "    \"repos_url\": \"https://api.github.com/users/pjhyett/repos\",\n" +
            "    \"events_url\": \"https://api.github.com/users/pjhyett/events{/privacy}\",\n" +
            "    \"received_events_url\": \"https://api.github.com/users/pjhyett/received_events\",\n" +
            "    \"type\": \"User\",\n" +
            "    \"site_admin\": false\n" +
            "  }]"


    fun getTestUsers(): List<User>{
        val usersType = object : TypeToken<List<User>>() {}.type
        return Gson().fromJson<List<User>>(testResponse, usersType)
    }
}