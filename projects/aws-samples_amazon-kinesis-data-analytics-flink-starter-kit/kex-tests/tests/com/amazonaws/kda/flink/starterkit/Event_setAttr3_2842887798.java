package com.amazonaws.kda.flink.starterkit;

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
import static com.amazonaws.kda.flink.starterkit.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Event_setAttr3_2842887798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1300;

    public Event_setAttr3_2842887798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1300 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term1300, term1300.getClass(), "attr_1", "ytSBIKXogI");
        setField(term1300, term1300.getClass(), "attr_2", "nHXjMycHlU");
        setField(term1300, term1300.getClass(), "attr_3", "ieCtQFdkii");
        setField(term1300, term1300.getClass(), "attr_4", "dEnhdmILtU");
        setField(term1300, term1300.getClass(), "attr_5", "hoicvmsovO");
        setField(term1300, term1300.getClass(), "attr_6", "eqJfYWRaEL");
        setLongField(term1300, term1300.getClass(), "attr_7", -872011222785455006L);
        setField(term1300, term1300.getClass(), "attr_8", "fhkbdRViHi");
        setField(term1300, term1300.getClass(), "session_id", "uWHnvSvaPl");
        setLongField(term1300, term1300.getClass(), "timestamp", -316468845751588286L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kBdSllIBVz";
        callMethod(klass, "setAttr_3", argTypes, term1300, args);
    }

};


