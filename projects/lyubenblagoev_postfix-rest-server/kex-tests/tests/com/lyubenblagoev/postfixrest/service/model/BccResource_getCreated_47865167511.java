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

public class BccResource_getCreated_47865167511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2009;

    public BccResource_getCreated_47865167511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2010 = new Long(2443640364875054177L);
        Long term2012 = new Long(-1610676979013636850L);
        term2009 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource"));
        Object term2027 = newInstance(Class.forName("java.util.Date"));
        Object term2029 = newInstance(Class.forName("java.util.Date"));
        setField(term2009, term2009.getClass(), "id", term2010);
        setField(term2009, term2009.getClass(), "accountId", term2012);
        setField(term2009, term2009.getClass(), "email", "HqBOwkVqjD");
        setBooleanField(term2009, term2009.getClass(), "enabled", true);
        setLongField(term2027, term2027.getClass(), "fastTime", 1762147441299L);
        setField(term2027, term2027.getClass(), "cdate", null);
        setField(term2009, term2009.getClass(), "created", term2027);
        setLongField(term2029, term2029.getClass(), "fastTime", 1395479491666L);
        setField(term2029, term2029.getClass(), "cdate", null);
        setField(term2009, term2009.getClass(), "updated", term2029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreated", argTypes, term2009, args);
    }

};


