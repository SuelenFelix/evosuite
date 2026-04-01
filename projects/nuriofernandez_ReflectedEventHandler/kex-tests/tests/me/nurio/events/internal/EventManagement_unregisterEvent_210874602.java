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
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.String;

public class EventManagement_unregisterEvent_210874602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8451;
     Object term8470;

    public EventManagement_unregisterEvent_210874602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8454 = new HashMap();
        ArrayList term8460 = new ArrayList();
        ((ArrayList) term8460).add((Object)null);
        HashMap term8465 = new HashMap();
        term8451 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term8452 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        Object term8453 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term8459 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager$1"));
        setField(term8453, term8453.getClass(), "eventManager", term8452);
        setField(term8453, term8453.getClass(), "eventMap", term8454);
        setField(term8452, term8452.getClass(), "eventManagement", term8453);
        setField(term8459, term8459.getClass(), "this$0", term8452);
        setField(term8459, term8459.getClass(), "annotationHandlers", term8460);
        setField(term8452, term8452.getClass(), "handlersManager", term8459);
        setBooleanField(term8452, term8452.getClass(), "debugLoggingEnabled", true);
        setField(term8451, term8451.getClass(), "eventManager", term8452);
        setField(term8451, term8451.getClass(), "eventMap", term8465);
        Class<? extends Object> term8670 = Class.forName((String) "kex.java.lang.Character$Subset");
        Object[] term8819 = (Object[]) newArray("java.lang.Class", 0);
        Method term8471 = ((Class) term8670).getDeclaredMethod((String) "toString", (Class[]) term8819);
        ((Method) term8471).setAccessible(true);
        term8470 = newInstance(Class.forName("me.nurio.events.internal.RegisteredEventHandler"));
        setField(term8470, term8470.getClass(), "method", term8471);
        setField(term8470, term8470.getClass(), "handler", null);
        setField(term8470, term8470.getClass(), "event", null);
        setField(term8470, term8470.getClass(), "listener", null);
        setField(term8470, term8470.getClass(), "priority", null);
        setBooleanField(term8470, term8470.getClass(), "ignoreCancelled", false);
        setField(term8470, term8470.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.EventManagement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("me.nurio.events.internal.RegisteredEventHandler");
        Object[] args = new Object[1];
        args[0] = term8470;
        callMethod(klass, "unregisterEvent", argTypes, term8451, args);
    }

};


