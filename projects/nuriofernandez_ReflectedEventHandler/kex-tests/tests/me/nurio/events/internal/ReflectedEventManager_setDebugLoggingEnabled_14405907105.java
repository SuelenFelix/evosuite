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
import java.lang.Boolean;

public class ReflectedEventManager_setDebugLoggingEnabled_14405907105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8933;
     Object term8947;

    public ReflectedEventManager_setDebugLoggingEnabled_14405907105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8935 = new HashMap();
        Object term8943 = newInstance(Class.forName("me.nurio.events.internal.annotations.EventHandlerAnnotationEventHandler"));
        setField(term8943, term8943.getClass(), "annotation", null);
        ArrayList term8941 = new ArrayList();
        ((ArrayList) term8941).add(term8943);
        term8933 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        Object term8934 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term8940 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager$1"));
        setField(term8934, term8934.getClass(), "eventManager", term8933);
        setField(term8934, term8934.getClass(), "eventMap", term8935);
        setField(term8933, term8933.getClass(), "eventManagement", term8934);
        setField(term8940, term8940.getClass(), "this$0", term8933);
        setField(term8940, term8940.getClass(), "annotationHandlers", term8941);
        setField(term8933, term8933.getClass(), "handlersManager", term8940);
        setBooleanField(term8933, term8933.getClass(), "debugLoggingEnabled", false);
        term8947 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.ReflectedEventManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term8947;
        callMethod(klass, "setDebugLoggingEnabled", argTypes, term8933, args);
    }

};


