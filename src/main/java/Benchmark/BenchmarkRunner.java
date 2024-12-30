/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package Benchmark;
import org.apache.commons.daemon.support.DaemonLoader;
import org.openjdk.jmh.annotations.*;

import java.security.Permission;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.Throughput) // Measures operations per second
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread) // Each thread gets its own state
public class BenchmarkRunner {

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
    private DaemonLoader permissionWithActions;
    private DaemonLoader permissionWithoutActions;
    private Permission anotherPermission;

    @Param({"1", "10", "100"})
    private int numberOfActions;
    private String actions;

    @Setup(Level.Iteration)
    public void setup() {
        StringBuilder actionBuilder = new StringBuilder();
        for (int i = 1; i <= numberOfActions; i++) {
            if (i > 1) {
                actionBuilder.append(",");
            }
            actionBuilder.append("action").append(i);
        }
        actions = actionBuilder.toString();
    }

    @Benchmark
    public DaemonLoader benchmarkConstructorWithActions() {
        return new DaemonLoader("control", actions);
    }

    @Benchmark
    public DaemonLoader benchmarkConstructorWithoutActions() {
        return new DaemonLoader("control");
    }

}
