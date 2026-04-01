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

public class EventHandlerAnnotationEventHandler_getEventPriority_7207139371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2729;
     Object term2828;

    public EventHandlerAnnotationEventHandler_getEventPriority_7207139371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2730 = Class.forName((String) "me.nurio.events.handler.EventHandler");
        term2729 = newInstance(Class.forName("me.nurio.events.internal.annotations.EventHandlerAnnotationEventHandler"));
        setField(term2729, term2729.getClass(), "annotation", term2730);
        Class<? extends Object> term3235 = Class.forName((String) "java.util.concurrent.locks.AbstractQueuedSynchronizer$Node");
        Class<? extends Object> term3568 = Class.forName((String) "java.util.concurrent.locks.AbstractQueuedSynchronizer$Node");
        Object[] term3569 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term3569, 0, term3568);
        term2828 = ((Class) term3235).getDeclaredMethod((String) "setPrevRelaxed", (Class[]) term3569);
        ((Method) term2828).setAccessible(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.annotations.EventHandlerAnnotationEventHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Method");
        Object[] args = new Object[1];
        args[0] = term2828;
        callMethod(klass, "getEventPriority", argTypes, term2729, args);
    }

};


