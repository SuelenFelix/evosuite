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

public class EventBusUtilityFacade_send_18727945851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4042;
     Object term4043;

    public EventBusUtilityFacade_send_18727945851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4042 = newInstance(Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.facades.EventBusUtilityFacade"));
        Class<? extends Object> term4080 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term4079 = ((Class) term4080).getDeclaredField((String) "USER");
        ((Field) term4079).setAccessible(true);
        Object enum9 =  ((Field) term4079).get((Object) null);
        Class<? extends Object> term4464 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term4463 = ((Class) term4464).getDeclaredField((String) "FINANCIAL");
        ((Field) term4463).setAccessible(true);
        Object enum10 =  ((Field) term4463).get((Object) null);
        Class<? extends Object> term4863 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term4862 = ((Class) term4863).getDeclaredField((String) "ORDER");
        ((Field) term4862).setAccessible(true);
        Object enum11 =  ((Field) term4862).get((Object) null);
        ArrayList term4056 = new ArrayList();
        ((ArrayList) term4056).add(enum9);
        ((ArrayList) term4056).add(enum10);
        ((ArrayList) term4056).add(enum11);
        ((ArrayList) term4056).add(enum11);
        ((ArrayList) term4056).add(enum11);
        ((ArrayList) term4056).add(enum9);
        ((ArrayList) term4056).add(enum11);
        ((ArrayList) term4056).add(enum9);
        ((ArrayList) term4056).add(enum11);
        term4043 = newInstance(Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event"));
        setField(term4043, term4043.getClass(), "message", "xxtlPwDYFs");
        setField(term4043, term4043.getClass(), "tags", term4056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.facades.EventBusUtilityFacade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event");
        Object[] args = new Object[1];
        args[0] = term4043;
        callMethod(klass, "send", argTypes, term4042, args);
    }

};


