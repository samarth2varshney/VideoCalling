package com.codewithkael.webrtcprojectforrecord.models

data class MessageModel(
     val type: String,
     val name: String? = null,
     val target: String? = null,
     val data:Any?=null,
     val users_list:MutableList<String>?=null,
)
