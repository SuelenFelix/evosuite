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

public class ReflectedEventManager_callEvent_10697487674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8919;

    public ReflectedEventManager_callEvent_10697487674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8921 = new HashMap();
        Object term8929 = newInstance(Class.forName("me.nurio.events.internal.annotations.EventHandlerAnnotationEventHandler"));
        setField(term8929, term8929.getClass(), "annotation", null);
        ArrayList term8927 = new ArrayList();
        ((ArrayList) term8927).add(term8929);
        term8919 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        Object term8920 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term8926 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager$1"));
        setField(term8920, term8920.getClass(), "eventManager", term8919);
        setField(term8920, term8920.getClass(), "eventMap", term8921);
        setField(term8919, term8919.getClass(), "eventManagement", term8920);
        setField(term8926, term8926.getClass(), "this$0", term8919);
        setField(term8926, term8926.getClass(), "annotationHandlers", term8927);
        setField(term8919, term8919.getClass(), "handlersManager", term8926);
        setBooleanField(term8919, term8919.getClass(), "debugLoggingEnabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.ReflectedEventManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("me.nurio.events.handler.Event");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "callEvent", argTypes, term8919, args);
    }

};


