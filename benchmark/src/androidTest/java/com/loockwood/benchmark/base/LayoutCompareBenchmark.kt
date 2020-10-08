package com.loockwood.benchmark.base

import android.view.View
import androidx.annotation.LayoutRes
import androidx.benchmark.junit4.BenchmarkRule
import androidx.benchmark.junit4.measureRepeated
import org.junit.Rule
import org.junit.Test

abstract class LayoutCompareBenchmark : ViewBenchmark() {

    @get:LayoutRes
    abstract val traditionalRes: Int

    @get:LayoutRes
    abstract val constraintRes: Int

    @get:Rule
    val benchmarkRule: BenchmarkRule = BenchmarkRule()

    @Test
    fun traditionalInflate() {
        benchmarkRule.measureRepeated { inflateView(traditionalRes) }
    }

    @Test
    fun traditionalMeasureAndLayoutExactSpec() {
        benchmarkRule.measureRepeated {
            val view = inflateViewWithTimingDisabled(traditionalRes)
            measureAndLayoutExactSpec(view)
        }
    }

    @Test
    fun traditionalMeasureAndLayoutWrapSpec() {
        benchmarkRule.measureRepeated {
            val view = inflateViewWithTimingDisabled(traditionalRes)
            measureAndLayoutWrapSpec(view)
        }
    }

    @Test
    fun constraintInflate() {
        benchmarkRule.measureRepeated { inflateView(constraintRes) }
    }

    @Test
    fun constraintMeasureAndLayoutExactSpec() {
        benchmarkRule.measureRepeated {
            val view = inflateViewWithTimingDisabled(constraintRes)
            measureAndLayoutExactSpec(view)
        }
    }

    @Test
    fun constraintMeasureAndLayoutWrapSpec() {
        benchmarkRule.measureRepeated {
            val view = inflateViewWithTimingDisabled(constraintRes)
            measureAndLayoutWrapSpec(view)
        }
    }

    private fun BenchmarkRule.Scope.inflateViewWithTimingDisabled(@LayoutRes resId: Int): View {
        return runWithTimingDisabled { inflateView(resId) }
    }

}