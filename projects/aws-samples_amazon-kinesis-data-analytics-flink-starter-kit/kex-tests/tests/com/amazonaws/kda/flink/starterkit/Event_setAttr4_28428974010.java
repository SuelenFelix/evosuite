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

public class Event_setAttr4_28428974010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1680;

    public Event_setAttr4_28428974010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1680 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term1680, term1680.getClass(), "attr_1", "MAcUBcBckh");
        setField(term1680, term1680.getClass(), "attr_2", "oVgzLbrsFr");
        setField(term1680, term1680.getClass(), "attr_3", "vQVyKLdtaz");
        setField(term1680, term1680.getClass(), "attr_4", "OWKQODBLzb");
        setField(term1680, term1680.getClass(), "attr_5", "wGmYcqUkgE");
        setField(term1680, term1680.getClass(), "attr_6", "idgaQsnJpQ");
        setLongField(term1680, term1680.getClass(), "attr_7", -4920224193275732920L);
        setField(term1680, term1680.getClass(), "attr_8", "VgZnGoIFwQ");
        setField(term1680, term1680.getClass(), "session_id", "jUbSRrkrYZ");
        setLongField(term1680, term1680.getClass(), "timestamp", 8428634514691209827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bWWfajKbEX";
        callMethod(klass, "setAttr_4", argTypes, term1680, args);
    }

};


