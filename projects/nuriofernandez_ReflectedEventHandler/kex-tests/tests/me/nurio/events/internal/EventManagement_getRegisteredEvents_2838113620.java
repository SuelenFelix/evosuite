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

public class EventManagement_getRegisteredEvents_2838113620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7577;

    public EventManagement_getRegisteredEvents_2838113620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7580 = new HashMap();
        ArrayList term7586 = new ArrayList();
        ((ArrayList) term7586).add((Object)null);
        HashMap term7591 = new HashMap();
        term7577 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term7578 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        Object term7579 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term7585 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager$1"));
        setField(term7579, term7579.getClass(), "eventManager", term7578);
        setField(term7579, term7579.getClass(), "eventMap", term7580);
        setField(term7578, term7578.getClass(), "eventManagement", term7579);
        setField(term7585, term7585.getClass(), "this$0", term7578);
        setField(term7585, term7585.getClass(), "annotationHandlers", term7586);
        setField(term7578, term7578.getClass(), "handlersManager", term7585);
        setBooleanField(term7578, term7578.getClass(), "debugLoggingEnabled", false);
        setField(term7577, term7577.getClass(), "eventManager", term7578);
        setField(term7577, term7577.getClass(), "eventMap", term7591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.EventManagement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegisteredEvents", argTypes, term7577, args);
    }

};


