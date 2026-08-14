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

public class EventHandlerAnnotationEventHandler_shouldIgnoreCancellable_10826671902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3744;
     Object term3843;

    public EventHandlerAnnotationEventHandler_shouldIgnoreCancellable_10826671902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3745 = Class.forName((String) "me.nurio.events.handler.EventHandler");
        term3744 = newInstance(Class.forName("me.nurio.events.internal.annotations.EventHandlerAnnotationEventHandler"));
        setField(term3744, term3744.getClass(), "annotation", term3745);
        Class<? extends Object> term4217 = Class.forName((String) "java.util.Currency$OtherCurrencyEntry");
        Class<? extends Object> term4414 = Class.forName((String) "java.lang.String");
        Object[] term4415 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term4415, 0, term4414);
        term3843 = ((Class) term4217).getDeclaredMethod((String) "findEntry", (Class[]) term4415);
        ((Method) term3843).setAccessible(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.annotations.EventHandlerAnnotationEventHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Method");
        Object[] args = new Object[1];
        args[0] = term3843;
        callMethod(klass, "shouldIgnoreCancellable", argTypes, term3744, args);
    }

};


