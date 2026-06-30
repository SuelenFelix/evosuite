package io.graversen.minecraft.rcon.service;

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
import static io.graversen.minecraft.rcon.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class ConnectionWatcherTask_pingResult_17022646152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1197;
     Object term1198;
     Object term1208;

    public ConnectionWatcherTask_pingResult_17022646152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1197 = newInstance(Class.forName("io.graversen.minecraft.rcon.service.ConnectionWatcherTask"));
        setField(term1197, term1197.getClass(), "connectionWatcher", null);
        term1198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1203 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1199, term1199.getClass(), "year", 2012);
        setShortField(term1199, term1199.getClass(), "month", (short) 8);
        setShortField(term1199, term1199.getClass(), "day", (short) 25);
        setField(term1198, term1198.getClass(), "date", term1199);
        setByteField(term1203, term1203.getClass(), "hour", (byte) 5);
        setByteField(term1203, term1203.getClass(), "minute", (byte) 20);
        setByteField(term1203, term1203.getClass(), "second", (byte) 50);
        setIntField(term1203, term1203.getClass(), "nano", 345595912);
        setField(term1198, term1198.getClass(), "time", term1203);
        term1208 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.service.ConnectionWatcherTask");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1198;
        args[1] = term1208;
        callMethod(klass, "pingResult", argTypes, term1197, args);
    }

};


