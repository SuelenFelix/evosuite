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

public class DomainServiceImpl_save_17975789552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2193;

    public DomainServiceImpl_save_17975789552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2194 = new Long(-5248475803419977214L);
        Boolean term2200 = new Boolean(true);
        term2193 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource"));
        Object term2196 = newInstance(Class.forName("java.util.Date"));
        Object term2198 = newInstance(Class.forName("java.util.Date"));
        setField(term2193, term2193.getClass(), "id", term2194);
        setLongField(term2196, term2196.getClass(), "fastTime", 1272776321768L);
        setField(term2196, term2196.getClass(), "cdate", null);
        setField(term2193, term2193.getClass(), "created", term2196);
        setLongField(term2198, term2198.getClass(), "fastTime", 1597352397295L);
        setField(term2198, term2198.getClass(), "cdate", null);
        setField(term2193, term2193.getClass(), "updated", term2198);
        setField(term2193, term2193.getClass(), "enabled", term2200);
        setField(term2193, term2193.getClass(), "name", "wGmYcqUkgE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.DomainServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.lyubenblagoev.postfixrest.service.model.DomainResource");
        Object[] args = new Object[1];
        args[0] = term2193;
        callMethod(klass, "save", argTypes, null, args);
    }

};


