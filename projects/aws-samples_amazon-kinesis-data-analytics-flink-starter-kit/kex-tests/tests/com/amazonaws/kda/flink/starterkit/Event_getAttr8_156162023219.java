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

public class Event_getAttr8_156162023219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3381;

    public Event_getAttr8_156162023219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3381 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term3381, term3381.getClass(), "attr_1", "ZfdXfCCFDf");
        setField(term3381, term3381.getClass(), "attr_2", "MwwjNtdOFT");
        setField(term3381, term3381.getClass(), "attr_3", "VYkqXKVlAJ");
        setField(term3381, term3381.getClass(), "attr_4", "XkIoWJRNwN");
        setField(term3381, term3381.getClass(), "attr_5", "aNWLJdrZMq");
        setField(term3381, term3381.getClass(), "attr_6", "HHmNoYxIGj");
        setLongField(term3381, term3381.getClass(), "attr_7", -8708192233349544946L);
        setField(term3381, term3381.getClass(), "attr_8", "PtirvZmsGt");
        setField(term3381, term3381.getClass(), "session_id", "HWkpTmtlrc");
        setLongField(term3381, term3381.getClass(), "timestamp", 5907001541142728739L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttr_8", argTypes, term3381, args);
    }

};


