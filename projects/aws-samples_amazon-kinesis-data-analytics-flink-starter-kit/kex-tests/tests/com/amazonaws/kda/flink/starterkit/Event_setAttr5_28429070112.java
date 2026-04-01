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

public class Event_setAttr5_28429070112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2060;

    public Event_setAttr5_28429070112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2060 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term2060, term2060.getClass(), "attr_1", "GVizqqzXpy");
        setField(term2060, term2060.getClass(), "attr_2", "JqXGgAhZPl");
        setField(term2060, term2060.getClass(), "attr_3", "jiKYgYHqIS");
        setField(term2060, term2060.getClass(), "attr_4", "DfISiziTgG");
        setField(term2060, term2060.getClass(), "attr_5", "XqgfKFvPSD");
        setField(term2060, term2060.getClass(), "attr_6", "JiVRgTZvKc");
        setLongField(term2060, term2060.getClass(), "attr_7", -4365849114644724155L);
        setField(term2060, term2060.getClass(), "attr_8", "XPKmummaqg");
        setField(term2060, term2060.getClass(), "session_id", "BKLfkLiZTH");
        setLongField(term2060, term2060.getClass(), "timestamp", 2486810210675247493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SPpkrGcPRr";
        callMethod(klass, "setAttr_5", argTypes, term2060, args);
    }

};


