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

public class DBModelSystem_setUts_84087738414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3567;
     Object term3630;

    public DBModelSystem_setUts_84087738414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3567 = newInstance(Class.forName("com.scaleguard.server.db.DBModelSystem"));
        setField(term3567, term3567.getClass(), "id", "HHmNoYxIGj");
        setField(term3567, term3567.getClass(), "name", "PtirvZmsGt");
        setField(term3567, term3567.getClass(), "groupId", "HWkpTmtlrc");
        setField(term3567, term3567.getClass(), "status", "hMmaoREuCK");
        setField(term3567, term3567.getClass(), "payload", "VeDtgDzGAN");
        setLongField(term3567, term3567.getClass(), "mts", 3825396310311739952L);
        setLongField(term3567, term3567.getClass(), "uts", -3838084482494604218L);
        term3630 = new Long(3892018155439224435L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DBModelSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3630;
        callMethod(klass, "setUts", argTypes, term3567, args);
    }

};


