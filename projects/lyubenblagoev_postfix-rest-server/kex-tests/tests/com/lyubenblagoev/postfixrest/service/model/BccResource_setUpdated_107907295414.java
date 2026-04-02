package com.lyubenblagoev.postfixrest.service.model;

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
import static com.lyubenblagoev.postfixrest.service.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class BccResource_setUpdated_107907295414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2107;
     Object term2129;

    public BccResource_setUpdated_107907295414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2108 = new Long(305759998609888272L);
        Long term2110 = new Long(-8654565919063661957L);
        term2107 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource"));
        Object term2125 = newInstance(Class.forName("java.util.Date"));
        Object term2127 = newInstance(Class.forName("java.util.Date"));
        setField(term2107, term2107.getClass(), "id", term2108);
        setField(term2107, term2107.getClass(), "accountId", term2110);
        setField(term2107, term2107.getClass(), "email", "vQVyKLdtaz");
        setBooleanField(term2107, term2107.getClass(), "enabled", true);
        setLongField(term2125, term2125.getClass(), "fastTime", 1597233967116L);
        setField(term2125, term2125.getClass(), "cdate", null);
        setField(term2107, term2107.getClass(), "created", term2125);
        setLongField(term2127, term2127.getClass(), "fastTime", 1276505397937L);
        setField(term2127, term2127.getClass(), "cdate", null);
        setField(term2107, term2107.getClass(), "updated", term2127);
        term2129 = newInstance(Class.forName("java.util.Date"));
        setLongField(term2129, term2129.getClass(), "fastTime", 1278177575793L);
        setField(term2129, term2129.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term2129;
        callMethod(klass, "setUpdated", argTypes, term2107, args);
    }

};


