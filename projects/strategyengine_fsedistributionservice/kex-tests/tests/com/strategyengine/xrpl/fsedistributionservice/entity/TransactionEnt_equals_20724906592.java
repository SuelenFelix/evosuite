package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class TransactionEnt_equals_20724906592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1851;
     Object term1896;

    public TransactionEnt_equals_20724906592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1852 = new Long(3892018155439224435L);
        Long term1892 = new Long(5953383087795962419L);
        Long term1894 = new Long(7994303628307559416L);
        term1851 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term1866 = newInstance(Class.forName("java.util.Date"));
        setField(term1851, term1851.getClass(), "id", term1852);
        setField(term1851, term1851.getClass(), "hash", "kuTXqwMtDB");
        setLongField(term1866, term1866.getClass(), "fastTime", 1347400561385L);
        setField(term1866, term1866.getClass(), "cdate", null);
        setField(term1851, term1851.getClass(), "createDate", term1866);
        setField(term1851, term1851.getClass(), "failReason", "Ghbwtircqb");
        setField(term1851, term1851.getClass(), "code", "xrwlQZdwCp");
        setField(term1851, term1851.getClass(), "dropRecipientId", term1892);
        setField(term1851, term1851.getClass(), "dropRequestId", term1894);
        term1896 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1896;
        callMethod(klass, "equals", argTypes, term1851, args);
    }

};


