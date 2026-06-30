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

public class Event_getTimestamp_13141759495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term761;

    public Event_getTimestamp_13141759495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term761 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term761, term761.getClass(), "attr_1", "kuTXqwMtDB");
        setField(term761, term761.getClass(), "attr_2", "Ghbwtircqb");
        setField(term761, term761.getClass(), "attr_3", "xrwlQZdwCp");
        setField(term761, term761.getClass(), "attr_4", "IDCWpPLRkE");
        setField(term761, term761.getClass(), "attr_5", "nyiiPDVjAc");
        setField(term761, term761.getClass(), "attr_6", "aKnKipADSo");
        setLongField(term761, term761.getClass(), "attr_7", -7237588299778557629L);
        setField(term761, term761.getClass(), "attr_8", "wSQxaModmm");
        setField(term761, term761.getClass(), "session_id", "UlajhuVLaP");
        setLongField(term761, term761.getClass(), "timestamp", 6967924379644551255L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimestamp", argTypes, term761, args);
    }

};


