package com.loockwood.benchmark

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.loockwood.benchmark.base.LayoutCompareBenchmark
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ComplexViewBenchmark : LayoutCompareBenchmark() {

    override val traditionalRes: Int = R.layout.complex_traditional
    override val constraintRes: Int = R.layout.complex_constraint

}