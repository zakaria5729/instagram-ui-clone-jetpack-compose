package com.zakariahossain.instagramcomposeui.models

data class ProfileDescription(
    val url: String,
    val otherCount: Int,
    val displayName: String,
    val description: String,
    val followedBy: List<String>
)
