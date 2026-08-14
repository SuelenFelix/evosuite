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
import java.lang.Boolean;

public class ReflectedEventManager_setDebugLoggingEnabled_144059071012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8971;
     Object term8973;

    public ReflectedEventManager_setDebugLoggingEnabled_144059071012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8971 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        setField(term8971, term8971.getClass(), "eventManagement", null);
        setField(term8971, term8971.getClass(), "handlersManager", null);
        setBooleanField(term8971, term8971.getClass(), "debugLoggingEnabled", false);
        term8973 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.ReflectedEventManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term8973;
        callMethod(klass, "setDebugLoggingEnabled", argTypes, term8971, args);
    }

};


