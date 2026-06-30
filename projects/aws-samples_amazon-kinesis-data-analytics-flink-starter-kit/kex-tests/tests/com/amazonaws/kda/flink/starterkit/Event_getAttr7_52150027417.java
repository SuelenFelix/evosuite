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

public class Event_getAttr7_52150027417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3021;

    public Event_getAttr7_52150027417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3021 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term3021, term3021.getClass(), "attr_1", "fWKJoSoCwE");
        setField(term3021, term3021.getClass(), "attr_2", "wfaXBpWAUH");
        setField(term3021, term3021.getClass(), "attr_3", "VMeAzAHwZj");
        setField(term3021, term3021.getClass(), "attr_4", "PznxWXsZME");
        setField(term3021, term3021.getClass(), "attr_5", "ZzIujlwVsw");
        setField(term3021, term3021.getClass(), "attr_6", "LWyEaeIyAo");
        setLongField(term3021, term3021.getClass(), "attr_7", -6823727938421990489L);
        setField(term3021, term3021.getClass(), "attr_8", "yVMkkQhvmN");
        setField(term3021, term3021.getClass(), "session_id", "mvrkADEgpp");
        setLongField(term3021, term3021.getClass(), "timestamp", -484994522244390100L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttr_7", argTypes, term3021, args);
    }

};


