package com.example.bplevin.androidwebserver;

import fi.iki.elonen.NanoHTTPD;

/**
 * Created by therm_000 on 3/2/2016.
 */
public class MyHTTPD extends NanoHTTPD {
    public MyHTTPD(){
        super(8080);
    }

    @Override
    public Response serve(IHTTPSession session) {
        Method method = session.getMethod();
        String uri = session.getUri();

        String msg = "<html><body><h1>Hello thing</h1></body></html>";

        return newFixedLengthResponse(msg);
    }
}