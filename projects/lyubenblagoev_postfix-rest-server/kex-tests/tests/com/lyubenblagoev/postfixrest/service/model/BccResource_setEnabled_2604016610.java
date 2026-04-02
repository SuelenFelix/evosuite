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
import java.lang.Boolean;

public class BccResource_setEnabled_2604016610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1975;
     Object term1997;

    public BccResource_setEnabled_2604016610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1976 = new Long(5953383087795962419L);
        Long term1978 = new Long(7994303628307559416L);
        term1975 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource"));
        Object term1993 = newInstance(Class.forName("java.util.Date"));
        Object term1995 = newInstance(Class.forName("java.util.Date"));
        setField(term1975, term1975.getClass(), "id", term1976);
        setField(term1975, term1975.getClass(), "accountId", term1978);
        setField(term1975, term1975.getClass(), "email", "KoyGrUJeJW");
        setBooleanField(term1975, term1975.getClass(), "enabled", true);
        setLongField(term1993, term1993.getClass(), "fastTime", 1628695316832L);
        setField(term1993, term1993.getClass(), "cdate", null);
        setField(term1975, term1975.getClass(), "created", term1993);
        setLongField(term1995, term1995.getClass(), "fastTime", 1393200035243L);
        setField(term1995, term1995.getClass(), "cdate", null);
        setField(term1975, term1975.getClass(), "updated", term1995);
        term1997 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1997;
        callMethod(klass, "setEnabled", argTypes, term1975, args);
    }

};


