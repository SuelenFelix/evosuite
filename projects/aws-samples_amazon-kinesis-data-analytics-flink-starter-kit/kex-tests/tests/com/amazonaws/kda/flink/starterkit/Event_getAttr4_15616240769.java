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

public class Event_getAttr4_15616240769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1501;

    public Event_getAttr4_15616240769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1501 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term1501, term1501.getClass(), "attr_1", "TJmVBGfTML");
        setField(term1501, term1501.getClass(), "attr_2", "tPlsykYBqO");
        setField(term1501, term1501.getClass(), "attr_3", "bLPjGVBhlX");
        setField(term1501, term1501.getClass(), "attr_4", "whBvTVIIlC");
        setField(term1501, term1501.getClass(), "attr_5", "IgRJUzaCwW");
        setField(term1501, term1501.getClass(), "attr_6", "JUmudUmaaV");
        setLongField(term1501, term1501.getClass(), "attr_7", 5127676408959197577L);
        setField(term1501, term1501.getClass(), "attr_8", "KoyGrUJeJW");
        setField(term1501, term1501.getClass(), "session_id", "HqBOwkVqjD");
        setLongField(term1501, term1501.getClass(), "timestamp", -6573104506744284592L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttr_4", argTypes, term1501, args);
    }

};


