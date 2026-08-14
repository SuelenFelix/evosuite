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

public class AsyncEngineEntry_getDescription_19696733656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term743;

    public AsyncEngineEntry_getDescription_19696733656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term743 = newInstance(Class.forName("com.scaleguard.server.db.AsyncEngineEntry"));
        setField(term743, term743.getClass(), "id", "SbAoxhfrkn");
        setField(term743, term743.getClass(), "name", "kuTXqwMtDB");
        setField(term743, term743.getClass(), "description", "Ghbwtircqb");
        setField(term743, term743.getClass(), "payload", "xrwlQZdwCp");
        setField(term743, term743.getClass(), "type", "IDCWpPLRkE");
        setLongField(term743, term743.getClass(), "mts", -7237588299778557629L);
        setLongField(term743, term743.getClass(), "uts", 6967924379644551255L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.AsyncEngineEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term743, args);
    }

};


