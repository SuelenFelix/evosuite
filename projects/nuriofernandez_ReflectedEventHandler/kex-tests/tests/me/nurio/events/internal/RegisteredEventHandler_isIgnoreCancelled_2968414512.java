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

public class RegisteredEventHandler_isIgnoreCancelled_2968414512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5493;

    public RegisteredEventHandler_isIgnoreCancelled_2968414512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5493 = newInstance(Class.forName("me.nurio.events.internal.RegisteredEventHandler"));
        setField(term5493, term5493.getClass(), "method", null);
        setField(term5493, term5493.getClass(), "handler", null);
        setField(term5493, term5493.getClass(), "event", null);
        setField(term5493, term5493.getClass(), "listener", null);
        setField(term5493, term5493.getClass(), "priority", null);
        setBooleanField(term5493, term5493.getClass(), "ignoreCancelled", false);
        setField(term5493, term5493.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.RegisteredEventHandler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isIgnoreCancelled", argTypes, term5493, args);
    }

};


