package com.eduardolwx.kotlinxt

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun checkOptionCharactersIsDisplayed(){
        onView(withText("Personagens")).check(matches(isDisplayed()))
    }

    @Test
    fun checkOptionComicsIsDisplayed(){
        onView(withText("Revistas")).check(matches(isDisplayed()))
    }

    @Test
    fun checkOptionCreatorsIsDisplayed(){
        onView(withText("Criadores")).check(matches(isDisplayed()))
    }

    @Test
    fun checkOptionEventsIsDisplayed(){
        onView(withText("Eventos")).check(matches(isDisplayed()))
    }

    @Test
    fun checkOptionSeriesIsDisplayed(){
        onView(withText("Series")).check(matches(isDisplayed()))
    }

    @Test
    fun checkOptionStoriesIsDisplayed(){
        onView(withText("Estórias")).check(matches(isDisplayed()))
    }

}