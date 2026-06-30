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

public class Event_getAttr1_15616269591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Event_getAttr1_15616269591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term1, term1.getClass(), "attr_1", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "attr_2", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "attr_3", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "attr_4", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "attr_5", "jJCZpVmanW");
        setField(term1, term1.getClass(), "attr_6", "EGtDIRbSSb");
        setLongField(term1, term1.getClass(), "attr_7", 2442117782898005296L);
        setField(term1, term1.getClass(), "attr_8", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "session_id", "MjGYSRKTNF");
        setLongField(term1, term1.getClass(), "timestamp", 6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttr_1", argTypes, term1, args);
    }

};


