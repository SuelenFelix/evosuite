package org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.facades;

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
import static org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.facades.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class EventBusUtility_send_15120555211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5254;

    public EventBusUtility_send_15120555211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5291 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term5290 = ((Class) term5291).getDeclaredField((String) "USER");
        ((Field) term5290).setAccessible(true);
        Object enum12 =  ((Field) term5290).get((Object) null);
        Class<? extends Object> term5675 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term5674 = ((Class) term5675).getDeclaredField((String) "ORDER");
        ((Field) term5674).setAccessible(true);
        Object enum13 =  ((Field) term5674).get((Object) null);
        Class<? extends Object> term6062 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term6061 = ((Class) term6062).getDeclaredField((String) "ORDER");
        ((Field) term6061).setAccessible(true);
        Object enum14 =  ((Field) term6061).get((Object) null);
        ArrayList term5267 = new ArrayList();
        ((ArrayList) term5267).add(enum12);
        ((ArrayList) term5267).add(enum13);
        ((ArrayList) term5267).add(enum13);
        ((ArrayList) term5267).add(enum14);
        ((ArrayList) term5267).add(enum14);
        ((ArrayList) term5267).add(enum13);
        ((ArrayList) term5267).add(enum13);
        term5254 = newInstance(Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event"));
        setField(term5254, term5254.getClass(), "message", "jJCZpVmanW");
        setField(term5254, term5254.getClass(), "tags", term5267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.facades.EventBusUtility");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event");
        Object[] args = new Object[1];
        args[0] = term5254;
        callMethod(klass, "send", argTypes, null, args);
    }

};


