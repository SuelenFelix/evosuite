package com.sigma.auth.controllers;

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
import static com.sigma.auth.controllers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ChatController_send_17856551373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53;

    public ChatController_send_17856551373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53 = newInstance(Class.forName("com.sigma.auth.controllers.ChatController"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.controllers.ChatController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sigma.auth.payload.request.Message");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "send", argTypes, term53, args);
    }

};


