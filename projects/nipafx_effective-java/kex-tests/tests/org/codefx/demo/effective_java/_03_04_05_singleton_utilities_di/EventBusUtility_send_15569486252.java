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
import java.lang.Boolean;

public class EventBusUtility_send_15569486252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4086;
     Object term4112;

    public EventBusUtility_send_15569486252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4125 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term4124 = ((Class) term4125).getDeclaredField((String) "USER");
        ((Field) term4124).setAccessible(true);
        Object enum9 =  ((Field) term4124).get((Object) null);
        Class<? extends Object> term4509 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term4508 = ((Class) term4509).getDeclaredField((String) "FINANCIAL");
        ((Field) term4508).setAccessible(true);
        Object enum10 =  ((Field) term4508).get((Object) null);
        Class<? extends Object> term4908 = Class.forName((String) "org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event$Tag");
        Field term4907 = ((Class) term4908).getDeclaredField((String) "ORDER");
        ((Field) term4907).setAccessible(true);
        Object enum11 =  ((Field) term4907).get((Object) null);
        ArrayList term4099 = new ArrayList();
        ((ArrayList) term4099).add(enum9);
        ((ArrayList) term4099).add(enum10);
        ((ArrayList) term4099).add(enum11);
        ((ArrayList) term4099).add(enum11);
        ((ArrayList) term4099).add(enum11);
        ((ArrayList) term4099).add(enum9);
        ((ArrayList) term4099).add(enum11);
        ((ArrayList) term4099).add(enum9);
        ((ArrayList) term4099).add(enum11);
        term4086 = newInstance(Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event"));
        setField(term4086, term4086.getClass(), "message", "EGtDIRbSSb");
        setField(term4086, term4086.getClass(), "tags", term4099);
        term4112 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.EventBusUtility");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.codefx.demo.effective_java._03_04_05_singleton_utilities_di.Event");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term4086;
        args[1] = term4112;
        callMethod(klass, "send", argTypes, null, args);
    }

};


