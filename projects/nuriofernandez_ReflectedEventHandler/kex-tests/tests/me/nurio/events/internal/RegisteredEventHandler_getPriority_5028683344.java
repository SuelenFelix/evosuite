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
import java.lang.String;
import java.lang.Object;

public class RegisteredEventHandler_getPriority_5028683344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3601;

    public RegisteredEventHandler_getPriority_5028683344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3812 = Class.forName((String) "java.util.stream.ReduceOps$5");
        Class<? extends Object> term4002 = Class.forName((String) "java.util.stream.PipelineHelper");
        Class<? extends Object> term4026 = Class.forName((String) "java.util.Spliterator");
        Object[] term4027 = (Object[]) newArray("java.lang.Class", 2);
        setElement(term4027, 0, term4002);
        setElement(term4027, 1, term4026);
        Method term3602 = ((Class) term3812).getDeclaredMethod((String) "evaluateParallel", (Class[]) term4027);
        ((Method) term3602).setAccessible(false);
        term3601 = newInstance(Class.forName("me.nurio.events.internal.RegisteredEventHandler"));
        setField(term3601, term3601.getClass(), "method", term3602);
        setField(term3601, term3601.getClass(), "handler", null);
        setField(term3601, term3601.getClass(), "event", null);
        setField(term3601, term3601.getClass(), "listener", null);
        setField(term3601, term3601.getClass(), "priority", null);
        setBooleanField(term3601, term3601.getClass(), "ignoreCancelled", false);
        setField(term3601, term3601.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.RegisteredEventHandler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPriority", argTypes, term3601, args);
    }

};


