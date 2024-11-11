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
import com.sun.net.httpserver.HttpServer;


import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class example {

    public static void main(String[] args) throws IOException {

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/", new MainHandler());
        server.createContext("/create-file", new fileCreation.FileCreationHandler());
        server.setExecutor(Executors.newCachedThreadPool()); // Thread pool per il server
        server.start();

        // Avvia un thread per il daemon che monitora le modifiche in background
        new Thread(new fileDaemon.FileMonitorDaemon("output.txt", "log.txt")).start();
    }

    static class MainHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            String response =
                    "<html>\n" +
                            "<head>\n" +
                            "<title>File Creation Page</title>\n" +
                            "<style>\n" +
                            "   body { font-family: Arial, sans-serif; background-color: #f4f4f9; margin: 0; padding: 0; display: flex; align-items: center; justify-content: center; height: 100vh; }\n" +
                            "   .container { text-align: center; background-color: #ffffff; padding: 30px; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.2); max-width: 400px; width: 100%; }\n" +
                            "   h1 { color: #333333; font-size: 24px; }\n" +
                            "   p { color: #555555; font-size: 16px; }\n" +
                            "   button { background-color: #4CAF50; color: white; padding: 10px 20px; border: none; border-radius: 4px; cursor: pointer; font-size: 16px; }\n" +
                            "   button:hover { background-color: #45a049; }\n" +
                            "</style>\n" +
                            "</head>\n" +
                            "<body>\n" +
                            "   <div class='container'>\n" +
                            "       <h1>Hello World!</h1>\n" +
                            "       <p>This Maven project is Dockerized and ready to create files.</p>\n" +
                            "       <form action=\"/create-file\" method=\"post\">\n" +
                            "           <button type=\"submit\">Create output.txt</button>\n" +
                            "       </form>\n" +
                            "   </div>\n" +
                            "</body>\n" +
                            "</html>\n";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

}