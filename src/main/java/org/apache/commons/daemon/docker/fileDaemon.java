/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.commons.daemon.docker;

import org.apache.commons.daemon.support.DaemonLoader;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import java.util.logging.Level;

public class fileDaemon {

    private static final Logger logger = Logger.getLogger(example.class.getName());
    static class FileMonitorDaemon implements Runnable {
        private final String monitoredFile;
        private final String logFile;
        private long lastModified = 0;

        public FileMonitorDaemon(String monitoredFile, String logFile) {
            this.monitoredFile = monitoredFile;
            this.logFile = logFile;
        }

        @Override
        public void run() {
            System.out.println("File monitor daemon avviato.");
            while (true) {
                try {
                    Thread.sleep(5000); // Intervallo di 5 secondi per il monitoraggio
                    checkForNewEntries();
                } catch (InterruptedException | IOException e) {
                    logger.log(Level.SEVERE, "An error occurred", e);

                    if (e instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        private void checkForNewEntries() throws IOException {
            File file = new File(monitoredFile);
            if (file.exists() && file.lastModified() > lastModified) {
                logEntry(logFile, "File " + monitoredFile + " modificato alle " + new Date(file.lastModified()));
                lastModified = file.lastModified();
            }
        }

        private void logEntry(String logFileName, String message) throws IOException {
            try (OutputStream logFile = new FileOutputStream(logFileName, true);
                 PrintStream logOut = new PrintStream(logFile)) {
                SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String logEntry = fmt.format(new Date()) + " - " + message;
                logOut.println(logEntry);
            }
        }
    }
}
