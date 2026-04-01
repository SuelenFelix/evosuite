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

public class Event_setTimestamp_12126833576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940;
     Object term1039;

    public Event_setTimestamp_12126833576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940 = newInstance(Class.forName("com.amazonaws.kda.flink.starterkit.Event"));
        setField(term940, term940.getClass(), "attr_1", "gGSMzuGICf");
        setField(term940, term940.getClass(), "attr_2", "hxCBltsObl");
        setField(term940, term940.getClass(), "attr_3", "BndsHwAFMv");
        setField(term940, term940.getClass(), "attr_4", "GzFkzHGYFt");
        setField(term940, term940.getClass(), "attr_5", "tShwQLRGNe");
        setField(term940, term940.getClass(), "attr_6", "LvtrsXUliU");
        setLongField(term940, term940.getClass(), "attr_7", -2813493605142626659L);
        setField(term940, term940.getClass(), "attr_8", "xLbjWUgOIL");
        setField(term940, term940.getClass(), "session_id", "jDtqGUpnZN");
        setLongField(term940, term940.getClass(), "timestamp", -8885298608300233488L);
        term1039 = new Long(-4325723315152823407L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.kda.flink.starterkit.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1039;
        callMethod(klass, "setTimestamp", argTypes, term940, args);
    }

};


