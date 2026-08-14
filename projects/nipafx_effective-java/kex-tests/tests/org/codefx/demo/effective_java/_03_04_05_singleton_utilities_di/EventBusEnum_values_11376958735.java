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
import java.lang.String;
import java.lang.Object;

public class EventBusEnum_values_11376958735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum28;

    public EventBusEnum_values_11376958735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12043 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.EventBusEnum");
        Field term12042 = ((Class) term12043).getDeclaredField((String) "INSTANCE");
        ((Field) term12042).setAccessible(true);
        enum28 = ((Field) term12042).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.EventBusEnum");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "values", argTypes, enum28, args);
    }

};


