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

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class fileCreation {
    static class FileCreationHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            if ("POST".equalsIgnoreCase(t.getRequestMethod())) {
                String entry = createFile("output.txt");
                logEntry("log.txt", entry);
                String response =
                        "<html>\n" +
                                "<head>\n" +
                                "<title>File Created</title>\n" +
                                "<style>\n" +
                                "   body { font-family: Arial, sans-serif; background-color: #f4f4f9; display: flex; align-items: center; justify-content: center; height: 100vh; margin: 0; }\n" +
                                "   .container { text-align: center; padding: 20px; background-color: #ffffff; border-radius: 8px; }\n" +
                                "   h2 { color: #4CAF50; }\n" +
                                "   a { text-decoration: none; color: #ffffff; background-color: #4CAF50; padding: 10px 15px; border-radius: 4px; display: inline-block; }\n" +
                                "</style>\n" +
                                "</head>\n" +
                                "<body>\n" +
                                "   <div class='container'>\n" +
                                "       <h2>File output.txt creato con successo!</h2>\n" +
                                "       <a href='/'>Torna alla home</a>\n" +
                                "   </div>\n" +
                                "</body>\n" +
                                "</html>";
                t.sendResponseHeaders(200, response.length());
                OutputStream os = t.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        }

        public String createFile(String name) throws IOException {
            String entry;
            try (OutputStream file = new FileOutputStream(name, true);
                 PrintStream out = new PrintStream(file)) {
                SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                entry = fmt.format(new Date());
                out.println(entry);
            }
            return entry;
        }


        public void logEntry(String logFileName, String entry) throws IOException {
            try (OutputStream logFile = new FileOutputStream(logFileName, true);
                 PrintStream logOut = new PrintStream(logFile)) {
                SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String logEntry = fmt.format(new Date()) + " - Avviso Modifica (no Daemon): " + entry;
                logOut.println(logEntry);
            }
        }
    }
}
