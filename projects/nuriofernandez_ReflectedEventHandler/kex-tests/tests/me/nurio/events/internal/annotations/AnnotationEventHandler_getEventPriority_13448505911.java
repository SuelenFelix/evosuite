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
import java.lang.String;
import java.lang.Object;

public class AnnotationEventHandler_getEventPriority_13448505911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1779;

    public AnnotationEventHandler_getEventPriority_13448505911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2017 = Class.forName((String) "java.util.function.ObjIntConsumer");
        Class<? extends Object> term2192 = Class.forName((String) "java.lang.Object");
        Class term2198 = int.class;
        Object[] term2199 = (Object[]) newArray("java.lang.Class", 2);
        setElement(term2199, 0, term2192);
        setElement(term2199, 1, term2198);
        term1779 = ((Class) term2017).getDeclaredMethod((String) "accept", (Class[]) term2199);
        ((Method) term1779).setAccessible(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.annotations.AnnotationEventHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Method");
        Object[] args = new Object[1];
        args[0] = term1779;
        callMethod(klass, "getEventPriority", argTypes, null, args);
    }

};


