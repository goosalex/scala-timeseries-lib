package io.sqooba.public.timeseries.immutable

import io.sqooba.public.timeseries.TimeSeriesTestBench
import org.scalatest.{FlatSpec, Matchers}

class ColumnTimeSeriesSpec extends FlatSpec with Matchers with TimeSeriesTestBench {

  "A ColumnTimeSeries" should behave like nonEmptyNonSingletonDoubleTimeSeries(
    ColumnTimeSeries.ofOrderedEntriesSafe[Double](_)
  )

  it should behave like nonEmptyNonSingletonGenericTimeSeries(
    ColumnTimeSeries.ofOrderedEntriesSafe[String](_)
  )
}
