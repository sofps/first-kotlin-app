package com.sofiaperez.kotlinapp

import android.content.Context
import android.util.AttributeSet
import android.view.View

/**
 * Created by sofiaperez on 22/10/17.
 */
class KotlinView : View {
    constructor(context: Context?) : super(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
}