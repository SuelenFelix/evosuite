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

public class Event_setSessionid_40861586214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2440;

    public Event_setSessionid_40861586214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2440 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term2440, term2440.getClass(), "attr_1", "fztQhjqwdP");
        setField(term2440, term2440.getClass(), "attr_2", "eVpkWxjuki");
        setField(term2440, term2440.getClass(), "attr_3", "SJiQaLvSKv");
        setField(term2440, term2440.getClass(), "attr_4", "OEXDRUKcFl");
        setField(term2440, term2440.getClass(), "attr_5", "RYdKCNNMBR");
        setField(term2440, term2440.getClass(), "attr_6", "yGtHPyvYiQ");
        setLongField(term2440, term2440.getClass(), "attr_7", -4502405999831680926L);
        setField(term2440, term2440.getClass(), "attr_8", "MvRIxilFMJ");
        setField(term2440, term2440.getClass(), "session_id", "iNwOJRBEjp");
        setLongField(term2440, term2440.getClass(), "timestamp", 1967728129628047933L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XylxrMBraH";
        callMethod(klass, "setSession_id", argTypes, term2440, args);
    }

};


