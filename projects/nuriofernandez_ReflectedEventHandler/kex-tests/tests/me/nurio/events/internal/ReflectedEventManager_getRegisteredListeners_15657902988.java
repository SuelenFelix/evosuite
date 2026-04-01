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

public class ReflectedEventManager_getRegisteredListeners_15657902988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8963;

    public ReflectedEventManager_getRegisteredListeners_15657902988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8963 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        setField(term8963, term8963.getClass(), "eventManagement", null);
        setField(term8963, term8963.getClass(), "handlersManager", null);
        setBooleanField(term8963, term8963.getClass(), "debugLoggingEnabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.ReflectedEventManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegisteredListeners", argTypes, term8963, args);
    }

};


