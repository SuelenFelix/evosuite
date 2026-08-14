package org.codefx.demo.effective_java._03_04_05_singleton_utilities_di;

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
import static org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class EventBus_send_17345175971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9492;
     Object term9505;

    public EventBus_send_17345175971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9492 = newInstance(Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.EventBus"));
        setField(term9492, term9492.getClass(), "state", "tbcdzjIfER");
        Class<? extends Object> term9549 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term9548 = ((Class) term9549).getDeclaredField((String) "USER");
        ((Field) term9548).setAccessible(true);
        Object enum22 =  ((Field) term9548).get((Object) null);
        Class<? extends Object> term9933 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term9932 = ((Class) term9933).getDeclaredField((String) "USER");
        ((Field) term9932).setAccessible(true);
        Object enum23 =  ((Field) term9932).get((Object) null);
        ArrayList term9518 = new ArrayList();
        ((ArrayList) term9518).add(enum22);
        ((ArrayList) term9518).add(enum23);
        term9505 = newInstance(Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event"));
        setField(term9505, term9505.getClass(), "message", "HyxfbSQYBe");
        setField(term9505, term9505.getClass(), "tags", term9518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.EventBus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event");
        Object[] args = new Object[1];
        args[0] = term9505;
        callMethod(klass, "send", argTypes, term9492, args);
    }

};


