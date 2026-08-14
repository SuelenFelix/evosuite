package com.scaleguard.server.db;

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
import static com.scaleguard.server.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AsyncEngineEntry_setPayload_19470688612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357;

    public AsyncEngineEntry_setPayload_19470688612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357 = newInstance(Class.forName("com.scaleguard.server.db.AsyncEngineEntry"));
        setField(term357, term357.getClass(), "id", "ZiaGIbnzTs");
        setField(term357, term357.getClass(), "name", "tbcdzjIfER");
        setField(term357, term357.getClass(), "description", "HyxfbSQYBe");
        setField(term357, term357.getClass(), "payload", "pCTimMblYc");
        setField(term357, term357.getClass(), "type", "hNxWaHcfhY");
        setLongField(term357, term357.getClass(), "mts", -8257434502486459194L);
        setLongField(term357, term357.getClass(), "uts", -8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.AsyncEngineEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RkybSrpybU";
        callMethod(klass, "setPayload", argTypes, term357, args);
    }

};


