/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.streampipes.sinks.internal.jvm.datalake;

import org.apache.streampipes.model.graph.DataSinkInvocation;
import org.apache.streampipes.wrapper.params.binding.EventSinkBindingParams;

/**
 * Code is the same as InfluxDB (org.apache.streampipes.sinks.databases.jvm.influxdb) sink. Changes applied here should also be applied in the InfluxDB sink
 */
public class DataLakeParameters extends EventSinkBindingParams {

  private String influxDbHost;
  private Integer influxDbPort;
  private String databaseName;
  private String measureName;
  private String user;
  private String password;
  private String timestampField;
  private Integer batchSize;
  private Integer flushDuration;

  public DataLakeParameters(DataSinkInvocation graph,
                            String influxDbHost,
                            Integer influxDbPort,
                            String databaseName,
                            String measureName,
                            String user,
                            String password,
                            String timestampField,
                            Integer batchSize,
                            Integer flushDuration) {
    super(graph);

    this.influxDbHost = influxDbHost;
    this.influxDbPort = influxDbPort;
    this.databaseName = databaseName;
    this.measureName = measureName;
    this.user = user;
    this.password = password;
    this.timestampField = timestampField;
    this.batchSize = batchSize;
    this.flushDuration = flushDuration;
  }

  public String getInfluxDbHost() {
    return influxDbHost;
  }

  public Integer getInfluxDbPort() {
    return influxDbPort;
  }

  public String getDatabaseName() {
    return databaseName;
  }

  public String getMeasurementName() {
    return measureName;
  }

  public String getUsername() {
    return user;
  }

  public String getPassword() {
    return password;
  }

  public String getTimestampField() {
    return timestampField;
  }

  public Integer getBatchSize() {
    return batchSize;
  }

  public Integer getFlushDuration() {
    return flushDuration;
  }

}
