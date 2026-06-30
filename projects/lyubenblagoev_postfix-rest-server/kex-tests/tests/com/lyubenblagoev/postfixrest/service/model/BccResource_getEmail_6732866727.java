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

public class BccResource_getEmail_6732866727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1857;

    public BccResource_getEmail_6732866727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1858 = new Long(-2644215923136513282L);
        Long term1860 = new Long(-1468719814009985452L);
        term1857 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource"));
        Object term1875 = newInstance(Class.forName("java.util.Date"));
        Object term1877 = newInstance(Class.forName("java.util.Date"));
        setField(term1857, term1857.getClass(), "id", term1858);
        setField(term1857, term1857.getClass(), "accountId", term1860);
        setField(term1857, term1857.getClass(), "email", "bLPjGVBhlX");
        setBooleanField(term1857, term1857.getClass(), "enabled", false);
        setLongField(term1875, term1875.getClass(), "fastTime", 1695425269458L);
        setField(term1875, term1875.getClass(), "cdate", null);
        setField(term1857, term1857.getClass(), "created", term1875);
        setLongField(term1877, term1877.getClass(), "fastTime", 1362780563394L);
        setField(term1877, term1877.getClass(), "cdate", null);
        setField(term1857, term1857.getClass(), "updated", term1877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term1857, args);
    }

};


