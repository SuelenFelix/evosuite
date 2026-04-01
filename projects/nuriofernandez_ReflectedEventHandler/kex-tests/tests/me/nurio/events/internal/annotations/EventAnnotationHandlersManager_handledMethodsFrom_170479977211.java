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

public class EventAnnotationHandlersManager_handledMethodsFrom_170479977211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5686;

    public EventAnnotationHandlersManager_handledMethodsFrom_170479977211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5686 = newInstance(Class.forName("me.nurio.events.internal.annotations.EventAnnotationHandlersManager"));
        setField(term5686, term5686.getClass(), "annotationHandlers", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.annotations.EventAnnotationHandlersManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handledMethodsFrom", argTypes, term5686, args);
    }

};


