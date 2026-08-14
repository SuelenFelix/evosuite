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

public class ReflectedEventManager_getRegisteredListeners_15657902981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8877;

    public ReflectedEventManager_getRegisteredListeners_15657902981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8879 = new HashMap();
        Object term8887 = newInstance(Class.forName("me.nurio.events.internal.annotations.EventHandlerAnnotationEventHandler"));
        setField(term8887, term8887.getClass(), "annotation", null);
        ArrayList term8885 = new ArrayList();
        ((ArrayList) term8885).add(term8887);
        term8877 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        Object term8878 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term8884 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager$1"));
        setField(term8878, term8878.getClass(), "eventManager", term8877);
        setField(term8878, term8878.getClass(), "eventMap", term8879);
        setField(term8877, term8877.getClass(), "eventManagement", term8878);
        setField(term8884, term8884.getClass(), "this$0", term8877);
        setField(term8884, term8884.getClass(), "annotationHandlers", term8885);
        setField(term8877, term8877.getClass(), "handlersManager", term8884);
        setBooleanField(term8877, term8877.getClass(), "debugLoggingEnabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.ReflectedEventManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegisteredListeners", argTypes, term8877, args);
    }

};


