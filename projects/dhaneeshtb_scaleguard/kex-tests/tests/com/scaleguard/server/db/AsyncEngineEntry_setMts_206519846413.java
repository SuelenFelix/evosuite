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
import java.lang.Long;

public class AsyncEngineEntry_setMts_206519846413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1600;
     Object term1663;

    public AsyncEngineEntry_setMts_206519846413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1600 = newInstance(Class.forName("com.scaleguard.server.db.AsyncEngineEntry"));
        setField(term1600, term1600.getClass(), "id", "IgRJUzaCwW");
        setField(term1600, term1600.getClass(), "name", "JUmudUmaaV");
        setField(term1600, term1600.getClass(), "description", "KoyGrUJeJW");
        setField(term1600, term1600.getClass(), "payload", "HqBOwkVqjD");
        setField(term1600, term1600.getClass(), "type", "MAcUBcBckh");
        setLongField(term1600, term1600.getClass(), "mts", 8059786003080744426L);
        setLongField(term1600, term1600.getClass(), "uts", -4365849114644724155L);
        term1663 = new Long(2486810210675247493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.AsyncEngineEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1663;
        callMethod(klass, "setMts", argTypes, term1600, args);
    }

};


