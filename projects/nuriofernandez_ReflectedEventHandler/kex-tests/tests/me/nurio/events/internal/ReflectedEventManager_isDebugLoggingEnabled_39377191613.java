package me.nurio.events.internal;

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
import static me.nurio.events.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ReflectedEventManager_isDebugLoggingEnabled_39377191613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8975;

    public ReflectedEventManager_isDebugLoggingEnabled_39377191613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8975 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        setField(term8975, term8975.getClass(), "eventManagement", null);
        setField(term8975, term8975.getClass(), "handlersManager", null);
        setBooleanField(term8975, term8975.getClass(), "debugLoggingEnabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.ReflectedEventManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDebugLoggingEnabled", argTypes, term8975, args);
    }

};


