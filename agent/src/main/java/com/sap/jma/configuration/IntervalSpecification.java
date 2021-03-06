/*
 * Copyright (c) 2017 SAP SE or an SAP affiliate company. All rights reserved.
 * This file is licensed under the Apache Software License, v. 2 except as noted
 * otherwise in the LICENSE file at the root of the repository.
 */

package com.sap.jma.configuration;

class IntervalSpecification {

  private final double value;

  private final IntervalTimeUnit intervalTimeUnit;

  IntervalSpecification(final double value, final IntervalTimeUnit intervalTimeUnit) {
    this.value = value;
    this.intervalTimeUnit = intervalTimeUnit;
  }

  public double getValue() {
    return value;
  }

  public IntervalTimeUnit getIntervalTimeUnit() {
    return intervalTimeUnit;
  }

  public long toMilliSeconds() {
    return intervalTimeUnit.toMilliSeconds(value);
  }
}
