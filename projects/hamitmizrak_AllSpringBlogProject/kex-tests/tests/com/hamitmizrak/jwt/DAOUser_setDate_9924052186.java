package com.hamitmizrak.jwt;

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
import static com.hamitmizrak.jwt.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class DAOUser_setDate_9924052186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1262;
     Object term1319;

    public DAOUser_setDate_9924052186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1289 = new Long(7411271909051562686L);
        term1262 = newInstance(Class.forName("com.hamitmizrak.jwt.DAOUser"));
        Object term1287 = newInstance(Class.forName("java.util.Date"));
        Object term1303 = newInstance(Class.forName("java.util.Date"));
        Object term1317 = newInstance(Class.forName("java.util.Date"));
        setField(term1262, term1262.getClass(), "username", "onpbIeEKoi");
        setField(term1262, term1262.getClass(), "password", "YRHGsAkhxb");
        setLongField(term1287, term1287.getClass(), "fastTime", 1863631094992L);
        setField(term1287, term1287.getClass(), "cdate", null);
        setField(term1262, term1262.getClass(), "date", term1287);
        setField(term1262, term1262.getClass(), "id", term1289);
        setField(term1262, term1262.getClass(), "createdBy", "ffYhPOzlUs");
        setLongField(term1303, term1303.getClass(), "fastTime", 1882638884364L);
        setField(term1303, term1303.getClass(), "cdate", null);
        setField(term1262, term1262.getClass(), "createdDate", term1303);
        setField(term1262, term1262.getClass(), "updateBy", "MLqYREekMl");
        setLongField(term1317, term1317.getClass(), "fastTime", 1437757323580L);
        setField(term1317, term1317.getClass(), "cdate", null);
        setField(term1262, term1262.getClass(), "updateDate", term1317);
        term1319 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1319, term1319.getClass(), "fastTime", 1668569229825L);
        setField(term1319, term1319.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.jwt.DAOUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term1319;
        callMethod(klass, "setDate", argTypes, term1262, args);
    }

};


