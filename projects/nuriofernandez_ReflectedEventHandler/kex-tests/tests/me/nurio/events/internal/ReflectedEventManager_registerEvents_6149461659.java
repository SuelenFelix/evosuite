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

public class ReflectedEventManager_registerEvents_6149461659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8965;

    public ReflectedEventManager_registerEvents_6149461659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8965 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        setField(term8965, term8965.getClass(), "eventManagement", null);
        setField(term8965, term8965.getClass(), "handlersManager", null);
        setBooleanField(term8965, term8965.getClass(), "debugLoggingEnabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.ReflectedEventManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("me.nurio.events.handler.EventListener");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "registerEvents", argTypes, term8965, args);
    }

};


