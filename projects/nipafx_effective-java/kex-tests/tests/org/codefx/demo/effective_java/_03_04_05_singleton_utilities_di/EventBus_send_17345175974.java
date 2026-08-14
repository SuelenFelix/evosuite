package org.codefx.demo.effective_java._03_04_05_singleton_utilities_di;

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
import static org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EventBus_send_17345175974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10339;

    public EventBus_send_17345175974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10339 = newInstance(Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.EventBus"));
        setField(term10339, term10339.getClass(), "state", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.EventBus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "send", argTypes, term10339, args);
    }

};


