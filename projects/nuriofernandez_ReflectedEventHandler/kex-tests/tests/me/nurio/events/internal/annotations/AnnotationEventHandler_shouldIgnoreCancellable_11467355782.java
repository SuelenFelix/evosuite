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

public class AnnotationEventHandler_shouldIgnoreCancellable_11467355782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2254;

    public AnnotationEventHandler_shouldIgnoreCancellable_11467355782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2516 = Class.forName((String) "java.util.stream.IntStream$1");
        Class<? extends Object> term2679 = Class.forName((String) "java.lang.Object");
        Object[] term2680 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term2680, 0, term2679);
        term2254 = ((Class) term2516).getDeclaredMethod((String) "tryAdvance", (Class[]) term2680);
        ((Method) term2254).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.annotations.AnnotationEventHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Method");
        Object[] args = new Object[1];
        args[0] = term2254;
        callMethod(klass, "shouldIgnoreCancellable", argTypes, null, args);
    }

};


