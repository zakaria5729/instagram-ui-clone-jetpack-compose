package com.zakariahossain.instagramcomposeui.data_source

import com.zakariahossain.instagramcomposeui.R
import com.zakariahossain.instagramcomposeui.models.ProfileDescription
import com.zakariahossain.instagramcomposeui.models.ImageWithText

object DataSource {
    fun getProfileDescription(): ProfileDescription {
        return ProfileDescription(
            otherCount = 17,
            displayName = "Zakaria Hossain",
            url = "https://github.com/zakaria5729",
            followedBy = listOf("Asfaq Ar Rafi", "Shamim Iqbal", "Kaisar Ahmed", "Ashiqul Islam"),
            description = "Software Engineer | Android | Flutter | Spring Boot"
        )
    }

    fun getStoryHighlights(): List<ImageWithText> {
        return listOf(
            ImageWithText(
                text = "Youtube",
                drawableId = R.drawable.youtube
            ),
            ImageWithText(
                text = "Q&A",
                drawableId = R.drawable.qa
            ),
            ImageWithText(
                text = "Discord",
                drawableId = R.drawable.discord
            ),
            ImageWithText(
                text = "Telegram",
                drawableId = R.drawable.telegram
            )
        )
    }

    fun getTabValues(): List<ImageWithText> {
        return listOf(
            ImageWithText(
                text = "Posts",
                drawableId = R.drawable.ic_grid
            ),
            ImageWithText(
                text = "Reels",
                drawableId = R.drawable.ic_reels
            ),
            ImageWithText(
                text = "IGTV",
                drawableId = R.drawable.ic_igtv
            ),
            ImageWithText(
                text = "Profile",
                drawableId = R.drawable.profile
            )
        )
    }

    fun getPostImages(): List<Int> {
        return listOf(
            R.drawable.bad_habits,
            R.drawable.intermediate_dev,
            R.drawable.multiple_languages,
            R.drawable.master_logical_thinking
        )
    }
}