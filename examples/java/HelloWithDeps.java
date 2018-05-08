package io.kubeless;

import org.joda.time.LocalTime;

public class Hello {
    public String sayHello(io.kubeless.Event event, io.kubeless.Context context) {
        System.out.println(event.Data))
        LocalTime currentTime = new LocalTime();
        return "Hello world! Current local time is: " + currentTime;
    }
}
