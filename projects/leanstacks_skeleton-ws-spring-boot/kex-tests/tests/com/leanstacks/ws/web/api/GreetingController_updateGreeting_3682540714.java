package com.leanstacks.ws.web.api;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.leanstacks.ws.web.api.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class GreetingController_updateGreeting_3682540714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512;
     Object term513;
     Object term515;

    public GreetingController_updateGreeting_3682540714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term512 = newInstance(Class.forName("com.leanstacks.ws.web.api.GreetingController"));
        setField(term512, term512.getClass(), "greetingService", null);
        setField(term512, term512.getClass(), "emailService", null);
        term513 = new Long(-8257434502486459194L);
        Long term528 = new Long(-8400487765614892086L);
        Integer term568 = new Integer(1162663216);
        term515 = newInstance(Class.forName("com.leanstacks.ws.model.Greeting"));
        Object term582 = newInstance(Class.forName("java.time.Instant"));
        Object term597 = newInstance(Class.forName("java.time.Instant"));
        setField(term515, term515.getClass(), "text", "hRNSzYYIrc");
        setField(term515, term515.getClass(), "id", term528);
        setField(term515, term515.getClass(), "referenceId", "32b00b37-2ba3-423c-8b5b-701ccdef6869");
        setField(term515, term515.getClass(), "version", term568);
        setField(term515, term515.getClass(), "createdBy", "RMFIsYGgne");
        setLongField(term582, term582.getClass(), "seconds", 1606045635L);
        setIntField(term582, term582.getClass(), "nanos", 837000000);
        setField(term515, term515.getClass(), "createdAt", term582);
        setField(term515, term515.getClass(), "updatedBy", "NRdvgJlhkX");
        setLongField(term597, term597.getClass(), "seconds", 1442639565L);
        setIntField(term597, term597.getClass(), "nanos", 302000000);
        setField(term515, term515.getClass(), "updatedAt", term597);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.GreetingController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("com.leanstacks.ws.model.Greeting");
        Object[] args = new Object[2];
        args[0] = term513;
        args[1] = term515;
        callMethod(klass, "updateGreeting", argTypes, term512, args);
    }

};


