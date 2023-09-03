package edu.vt.cs5254.GeoQuiz

import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answer: Boolean)