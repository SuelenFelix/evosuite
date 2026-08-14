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

public class ReflectedEventManager_registerEvents_6149461652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8891;

    public ReflectedEventManager_registerEvents_6149461652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8893 = new HashMap();
        Object term8901 = newInstance(Class.forName("me.nurio.events.internal.annotations.EventHandlerAnnotationEventHandler"));
        setField(term8901, term8901.getClass(), "annotation", null);
        ArrayList term8899 = new ArrayList();
        ((ArrayList) term8899).add(term8901);
        term8891 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        Object term8892 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term8898 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager$1"));
        setField(term8892, term8892.getClass(), "eventManager", term8891);
        setField(term8892, term8892.getClass(), "eventMap", term8893);
        setField(term8891, term8891.getClass(), "eventManagement", term8892);
        setField(term8898, term8898.getClass(), "this$0", term8891);
        setField(term8898, term8898.getClass(), "annotationHandlers", term8899);
        setField(term8891, term8891.getClass(), "handlersManager", term8898);
        setBooleanField(term8891, term8891.getClass(), "debugLoggingEnabled", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.ReflectedEventManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("me.nurio.events.handler.EventListener");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "registerEvents", argTypes, term8891, args);
    }

};


