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

public class BccResource_setAccountId_4755681756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1823;
     Object term1845;

    public BccResource_setAccountId_4755681756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1824 = new Long(2936323121573284007L);
        Long term1826 = new Long(-1154553077993834885L);
        term1823 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource"));
        Object term1841 = newInstance(Class.forName("java.util.Date"));
        Object term1843 = newInstance(Class.forName("java.util.Date"));
        setField(term1823, term1823.getClass(), "id", term1824);
        setField(term1823, term1823.getClass(), "accountId", term1826);
        setField(term1823, term1823.getClass(), "email", "tPlsykYBqO");
        setBooleanField(term1823, term1823.getClass(), "enabled", true);
        setLongField(term1841, term1841.getClass(), "fastTime", 1741444563811L);
        setField(term1841, term1841.getClass(), "cdate", null);
        setField(term1823, term1823.getClass(), "created", term1841);
        setLongField(term1843, term1843.getClass(), "fastTime", 1761994701322L);
        setField(term1843, term1843.getClass(), "cdate", null);
        setField(term1823, term1823.getClass(), "updated", term1843);
        term1845 = new Long(-2850532706972744550L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.BccResource");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1845;
        callMethod(klass, "setAccountId", argTypes, term1823, args);
    }

};


