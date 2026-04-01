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

public class ReflectedEventManager_isDebugLoggingEnabled_3937719166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8949;

    public ReflectedEventManager_isDebugLoggingEnabled_3937719166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8951 = new HashMap();
        Object term8959 = newInstance(Class.forName("me.nurio.events.internal.annotations.EventHandlerAnnotationEventHandler"));
        setField(term8959, term8959.getClass(), "annotation", null);
        ArrayList term8957 = new ArrayList();
        ((ArrayList) term8957).add(term8959);
        term8949 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        Object term8950 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term8956 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager$1"));
        setField(term8950, term8950.getClass(), "eventManager", term8949);
        setField(term8950, term8950.getClass(), "eventMap", term8951);
        setField(term8949, term8949.getClass(), "eventManagement", term8950);
        setField(term8956, term8956.getClass(), "this$0", term8949);
        setField(term8956, term8956.getClass(), "annotationHandlers", term8957);
        setField(term8949, term8949.getClass(), "handlersManager", term8956);
        setBooleanField(term8949, term8949.getClass(), "debugLoggingEnabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.ReflectedEventManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDebugLoggingEnabled", argTypes, term8949, args);
    }

};


