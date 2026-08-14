package com.scaleguard.server.http.reverse;

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
import static com.scaleguard.server.http.reverse.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EventSubscriber_onNext_5167004847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4185;

    public EventSubscriber_onNext_5167004847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4185 = newInstance(Class.forName("com.scaleguard.server.http.reverse.EventSubscriber"));
        setField(term4185, term4185.getClass(), "appServer", null);
        setField(term4185, term4185.getClass(), "subscription", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.reverse.EventSubscriber");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "onNext", argTypes, term4185, args);
    }

};


