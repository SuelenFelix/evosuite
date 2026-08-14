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

public class GreetingController_createGreeting_73424305410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676;

    public GreetingController_createGreeting_73424305410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term676 = newInstance(Class.forName("com.leanstacks.ws.web.api.GreetingController"));
        setField(term676, term676.getClass(), "greetingService", null);
        setField(term676, term676.getClass(), "emailService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.web.api.GreetingController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.leanstacks.ws.model.Greeting");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createGreeting", argTypes, term676, args);
    }

};


