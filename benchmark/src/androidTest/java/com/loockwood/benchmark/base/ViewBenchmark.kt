package com.loockwood.benchmark.base

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import androidx.annotation.LayoutRes
import androidx.test.core.app.ApplicationProvider

abstract class ViewBenchmark {

    companion object {

        private const val WIDTH = 1920
        private const val HEIGHT = 1080
    }

    private val context = ApplicationProvider.getApplicationContext<Context>()
    private val inflater = LayoutInflater.from(context)
    private val root = FrameLayout(context)

    protected fun inflateView(@LayoutRes id: Int): View {
        return inflater.inflate(id, root, false)
    }

    protected fun measureAndLayoutWrapSpec(container: View) {
        val widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(
            WIDTH,
            View.MeasureSpec.AT_MOST
        )
        val heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(
            HEIGHT,
            View.MeasureSpec.AT_MOST
        )
        container.measure(widthMeasureSpec, heightMeasureSpec)
        container.layout(
            0,
            0,
            container.measuredWidth,
            container.measuredHeight
        )
    }

    protected fun measureAndLayoutExactSpec(container: View) {
        val widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(
            WIDTH,
            View.MeasureSpec.EXACTLY
        )
        val heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(
            HEIGHT,
            View.MeasureSpec.EXACTLY
        )
        container.measure(widthMeasureSpec, heightMeasureSpec)
        container.layout(
            0, 0,
            container.measuredWidth,
            container.measuredHeight
        )
    }

}