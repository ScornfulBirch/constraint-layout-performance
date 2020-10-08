package com.loockwood.benchmark

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.loockwood.benchmark.base.LayoutCompareBenchmark
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SimpleViewBenchmark : LayoutCompareBenchmark() {

    override val traditionalRes: Int = R.layout.simple_traditional
    override val constraintRes: Int = R.layout.simple_constraint

}