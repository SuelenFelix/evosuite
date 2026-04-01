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

public class RegisteredEventHandler_getName_188061891413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5495;

    public RegisteredEventHandler_getName_188061891413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5495 = newInstance(Class.forName("me.nurio.events.internal.RegisteredEventHandler"));
        setField(term5495, term5495.getClass(), "method", null);
        setField(term5495, term5495.getClass(), "handler", null);
        setField(term5495, term5495.getClass(), "event", null);
        setField(term5495, term5495.getClass(), "listener", null);
        setField(term5495, term5495.getClass(), "priority", null);
        setBooleanField(term5495, term5495.getClass(), "ignoreCancelled", false);
        setField(term5495, term5495.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.RegisteredEventHandler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term5495, args);
    }

};


