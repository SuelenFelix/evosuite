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

public class Event_getAttr6_156162215415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2641;

    public Event_getAttr6_156162215415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2641 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term2641, term2641.getClass(), "attr_1", "pORebkoRdD");
        setField(term2641, term2641.getClass(), "attr_2", "mXGCWJDOqA");
        setField(term2641, term2641.getClass(), "attr_3", "dpNsDgfPso");
        setField(term2641, term2641.getClass(), "attr_4", "hCWPJQKpdc");
        setField(term2641, term2641.getClass(), "attr_5", "WzMEhMXkKx");
        setField(term2641, term2641.getClass(), "attr_6", "XOiDvlDhdc");
        setLongField(term2641, term2641.getClass(), "attr_7", 2120084523938730454L);
        setField(term2641, term2641.getClass(), "attr_8", "AdxvLJhNLe");
        setField(term2641, term2641.getClass(), "session_id", "lHfTrWKMPk");
        setLongField(term2641, term2641.getClass(), "timestamp", 6855071767938501807L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttr_6", argTypes, term2641, args);
    }

};


