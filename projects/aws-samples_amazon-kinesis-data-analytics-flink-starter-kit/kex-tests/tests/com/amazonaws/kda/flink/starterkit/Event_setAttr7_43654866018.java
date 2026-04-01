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
import java.lang.Long;

public class Event_setAttr7_43654866018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3200;
     Object term3299;

    public Event_setAttr7_43654866018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3200 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term3200, term3200.getClass(), "attr_1", "pXOkjyeIRb");
        setField(term3200, term3200.getClass(), "attr_2", "GgZWSjxjyE");
        setField(term3200, term3200.getClass(), "attr_3", "EeBVbzjcCI");
        setField(term3200, term3200.getClass(), "attr_4", "UfQtPRyWRC");
        setField(term3200, term3200.getClass(), "attr_5", "FPvxVzzSvD");
        setField(term3200, term3200.getClass(), "attr_6", "WHcwFgsGFC");
        setLongField(term3200, term3200.getClass(), "attr_7", 1233889271256172047L);
        setField(term3200, term3200.getClass(), "attr_8", "HzqpegHiRq");
        setField(term3200, term3200.getClass(), "session_id", "jwsfVjMoJT");
        setLongField(term3200, term3200.getClass(), "timestamp", 6617340557564669657L);
        term3299 = new Long(1439298019805881866L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3299;
        callMethod(klass, "setAttr_7", argTypes, term3200, args);
    }

};


