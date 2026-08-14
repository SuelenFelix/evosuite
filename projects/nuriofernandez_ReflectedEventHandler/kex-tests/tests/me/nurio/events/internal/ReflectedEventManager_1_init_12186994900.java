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

public class ReflectedEventManager_1_init_12186994900 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6006;

    public ReflectedEventManager_1_init_12186994900() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6008 = new HashMap();
        Object term6016 = newInstance(Class.forName("me.nurio.events.internal.annotations.EventHandlerAnnotationEventHandler"));
        setField(term6016, term6016.getClass(), "annotation", null);
        ArrayList term6014 = new ArrayList();
        ((ArrayList) term6014).add(term6016);
        term6006 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager"));
        Object term6007 = newInstance(Class.forName("me.nurio.events.internal.EventManagement"));
        Object term6013 = newInstance(Class.forName("me.nurio.events.internal.ReflectedEventManager$1"));
        setField(term6007, term6007.getClass(), "eventManager", term6006);
        setField(term6007, term6007.getClass(), "eventMap", term6008);
        setField(term6006, term6006.getClass(), "eventManagement", term6007);
        setField(term6013, term6013.getClass(), "this$0", term6006);
        setField(term6013, term6013.getClass(), "annotationHandlers", term6014);
        setField(term6006, term6006.getClass(), "handlersManager", term6013);
        setBooleanField(term6006, term6006.getClass(), "debugLoggingEnabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("me.nurio.events.internal.ReflectedEventManager$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("me.nurio.events.internal.ReflectedEventManager");
        Object[] args = new Object[1];
        args[0] = term6006;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


