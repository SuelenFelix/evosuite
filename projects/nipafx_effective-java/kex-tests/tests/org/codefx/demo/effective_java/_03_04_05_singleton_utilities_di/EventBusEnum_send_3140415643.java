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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class EventBusEnum_send_3140415643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum24;
     Object term10375;

    public EventBusEnum_send_3140415643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10411 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.EventBusEnum");
        Field term10410 = ((Class) term10411).getDeclaredField((String) "INSTANCE");
        ((Field) term10410).setAccessible(true);
        enum24 = ((Field) term10410).get((Object) null);
        Class<? extends Object> term10832 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term10831 = ((Class) term10832).getDeclaredField((String) "ORDER");
        ((Field) term10831).setAccessible(true);
        Object enum25 =  ((Field) term10831).get((Object) null);
        Class<? extends Object> term11219 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term11218 = ((Class) term11219).getDeclaredField((String) "FINANCIAL");
        ((Field) term11218).setAccessible(true);
        Object enum26 =  ((Field) term11218).get((Object) null);
        ArrayList term10388 = new ArrayList();
        ((ArrayList) term10388).add(enum25);
        ((ArrayList) term10388).add(enum26);
        ((ArrayList) term10388).add(enum25);
        ((ArrayList) term10388).add(enum25);
        ((ArrayList) term10388).add(enum25);
        ((ArrayList) term10388).add(enum25);
        term10375 = newInstance(Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event"));
        setField(term10375, term10375.getClass(), "message", "RkybSrpybU");
        setField(term10375, term10375.getClass(), "tags", term10388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.EventBusEnum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event");
        Object[] args = new Object[1];
        args[0] = term10375;
        callMethod(klass, "send", argTypes, enum24, args);
    }

};


