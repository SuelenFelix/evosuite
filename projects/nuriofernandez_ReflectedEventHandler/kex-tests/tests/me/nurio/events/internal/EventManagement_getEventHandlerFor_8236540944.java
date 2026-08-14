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

public class EventManagement_getEventHandlerFor_8236540944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8839;

    public EventManagement_getEventHandlerFor_8236540944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8842 = new HashMap();
        ArrayList term8848 = new ArrayList();
        ((ArrayList) term8848).add((Object)null);
        HashMap term8853 = new HashMap();
        term8839 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term8840 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        Object term8841 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term8847 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager$1"));
        setField(term8841, term8841.getClass(), "eventManager", term8840);
        setField(term8841, term8841.getClass(), "eventMap", term8842);
        setField(term8840, term8840.getClass(), "eventManagement", term8841);
        setField(term8847, term8847.getClass(), "this$0", term8840);
        setField(term8847, term8847.getClass(), "annotationHandlers", term8848);
        setField(term8840, term8840.getClass(), "handlersManager", term8847);
        setBooleanField(term8840, term8840.getClass(), "debugLoggingEnabled", true);
        setField(term8839, term8839.getClass(), "eventManager", term8840);
        setField(term8839, term8839.getClass(), "eventMap", term8853);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.EventManagement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Class");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getEventHandlerFor", argTypes, term8839, args);
    }

};


