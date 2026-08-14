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

public class DBModelSystem_setMts_84826555212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3339;
     Object term3402;

    public DBModelSystem_setMts_84826555212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3339 = newInstance(Class.forName("com.scaleguard.server.db.DBModelSystem"));
        setField(term3339, term3339.getClass(), "id", "UfQtPRyWRC");
        setField(term3339, term3339.getClass(), "name", "FPvxVzzSvD");
        setField(term3339, term3339.getClass(), "groupId", "WHcwFgsGFC");
        setField(term3339, term3339.getClass(), "status", "HzqpegHiRq");
        setField(term3339, term3339.getClass(), "payload", "jwsfVjMoJT");
        setLongField(term3339, term3339.getClass(), "mts", -1154553077993834885L);
        setLongField(term3339, term3339.getClass(), "uts", -2850532706972744550L);
        term3402 = new Long(-2644215923136513282L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DBModelSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3402;
        callMethod(klass, "setMts", argTypes, term3339, args);
    }

};


