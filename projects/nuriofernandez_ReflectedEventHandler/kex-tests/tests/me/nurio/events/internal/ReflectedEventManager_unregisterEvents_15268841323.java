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

public class ReflectedEventManager_unregisterEvents_15268841323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8905;

    public ReflectedEventManager_unregisterEvents_15268841323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8907 = new HashMap();
        Object term8915 = newInstance(Class.forName("me.nurio.events.internal.annotations.EventHandlerAnnotationEventHandler"));
        setField(term8915, term8915.getClass(), "annotation", null);
        ArrayList term8913 = new ArrayList();
        ((ArrayList) term8913).add(term8915);
        term8905 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        Object term8906 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term8912 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager$1"));
        setField(term8906, term8906.getClass(), "eventManager", term8905);
        setField(term8906, term8906.getClass(), "eventMap", term8907);
        setField(term8905, term8905.getClass(), "eventManagement", term8906);
        setField(term8912, term8912.getClass(), "this$0", term8905);
        setField(term8912, term8912.getClass(), "annotationHandlers", term8913);
        setField(term8905, term8905.getClass(), "handlersManager", term8912);
        setBooleanField(term8905, term8905.getClass(), "debugLoggingEnabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.ReflectedEventManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("me.nurio.events.handler.EventListener");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "unregisterEvents", argTypes, term8905, args);
    }

};


