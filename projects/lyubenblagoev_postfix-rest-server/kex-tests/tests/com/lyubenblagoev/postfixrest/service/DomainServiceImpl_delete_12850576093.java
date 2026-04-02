package com.lyubenblagoev.postfixrest.service;

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
import static com.lyubenblagoev.postfixrest.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Boolean;

public class DomainServiceImpl_delete_12850576093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2224;

    public DomainServiceImpl_delete_12850576093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2225 = new Long(-6723783499250797216L);
        Boolean term2231 = new Boolean(false);
        term2224 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource"));
        Object term2227 = newInstance(Class.forName("java.util.Date"));
        Object term2229 = newInstance(Class.forName("java.util.Date"));
        setField(term2224, term2224.getClass(), "id", term2225);
        setLongField(term2227, term2227.getClass(), "fastTime", 1713891155263L);
        setField(term2227, term2227.getClass(), "cdate", null);
        setField(term2224, term2224.getClass(), "created", term2227);
        setLongField(term2229, term2229.getClass(), "fastTime", 1663413767651L);
        setField(term2229, term2229.getClass(), "cdate", null);
        setField(term2224, term2224.getClass(), "updated", term2229);
        setField(term2224, term2224.getClass(), "enabled", term2231);
        setField(term2224, term2224.getClass(), "name", "idgaQsnJpQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.DomainServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource");
        Object[] args = new Object[1];
        args[0] = term2224;
        callMethod(klass, "delete", argTypes, null, args);
    }

};


