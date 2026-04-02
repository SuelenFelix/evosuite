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

public class TransactionEnt_setCreateDate_117050169917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2926;
     Object term2971;

    public TransactionEnt_setCreateDate_117050169917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2927 = new Long(-8033714905181142681L);
        Long term2967 = new Long(-9040825890007374809L);
        Long term2969 = new Long(1368340889161782793L);
        term2926 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term2941 = newInstance(Class.forName("java.util.Date"));
        setField(term2926, term2926.getClass(), "id", term2927);
        setField(term2926, term2926.getClass(), "hash", "vQVyKLdtaz");
        setLongField(term2941, term2941.getClass(), "fastTime", 1595517583842L);
        setField(term2941, term2941.getClass(), "cdate", null);
        setField(term2926, term2926.getClass(), "createDate", term2941);
        setField(term2926, term2926.getClass(), "failReason", "OWKQODBLzb");
        setField(term2926, term2926.getClass(), "code", "wGmYcqUkgE");
        setField(term2926, term2926.getClass(), "dropRecipientId", term2967);
        setField(term2926, term2926.getClass(), "dropRequestId", term2969);
        term2971 = newInstance(Class.forName("java.util.Date"));
        setLongField(term2971, term2971.getClass(), "fastTime", 1464421789888L);
        setField(term2971, term2971.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term2971;
        callMethod(klass, "setCreateDate", argTypes, term2926, args);
    }

};


