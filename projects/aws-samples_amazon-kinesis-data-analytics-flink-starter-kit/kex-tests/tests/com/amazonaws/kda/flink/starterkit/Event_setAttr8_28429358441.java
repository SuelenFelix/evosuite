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

public class Event_setAttr8_28429358441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3822;

    public Event_setAttr8_28429358441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3822 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term3822, term3822.getClass(), "attr_1", null);
        setField(term3822, term3822.getClass(), "attr_2", null);
        setField(term3822, term3822.getClass(), "attr_3", null);
        setField(term3822, term3822.getClass(), "attr_4", null);
        setField(term3822, term3822.getClass(), "attr_5", null);
        setField(term3822, term3822.getClass(), "attr_6", null);
        setLongField(term3822, term3822.getClass(), "attr_7", 0L);
        setField(term3822, term3822.getClass(), "attr_8", null);
        setField(term3822, term3822.getClass(), "session_id", null);
        setLongField(term3822, term3822.getClass(), "timestamp", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAttr_8", argTypes, term3822, args);
    }

};


