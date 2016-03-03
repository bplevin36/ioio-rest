package com.example.bplevin.androidwebserver;

import ioio.lib.api.DigitalOutput;
import ioio.lib.api.exception.ConnectionLostException;
import ioio.lib.util.AbstractIOIOActivity;

class IOIOThread extends AbstractIOIOActivity.IOIOThread {

    @Override
    protected void setup() throws ConnectionLostException {
        /* Executed when thread begins */
    }

    @Override
    protected void loop() throws ConnectionLostException {

        /* Executed continuously while board operates */

        try {
            sleep(10);
        } catch (InterruptedException e) {
        }
    }
}