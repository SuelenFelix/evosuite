package me.nurio.events.internal.annotations;

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
import static me.nurio.events.internal.annotations.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EventHandlerAnnotationEventHandler_getEventPriority_7207139375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4671;

    public EventHandlerAnnotationEventHandler_getEventPriority_7207139375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4671 = newInstance(Class.forName("me.nurio.events.internal.annotations.EventHandlerAnnotationEventHandler"));
        setField(term4671, term4671.getClass(), "annotation", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.annotations.EventHandlerAnnotationEventHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Method");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getEventPriority", argTypes, term4671, args);
    }

};


