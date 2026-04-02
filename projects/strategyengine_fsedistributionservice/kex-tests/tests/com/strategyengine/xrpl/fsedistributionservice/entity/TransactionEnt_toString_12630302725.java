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

public class TransactionEnt_toString_12630302725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2078;

    public TransactionEnt_toString_12630302725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2079 = new Long(305759998609888272L);
        Long term2119 = new Long(-8654565919063661957L);
        Long term2121 = new Long(-5248475803419977214L);
        term2078 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term2093 = newInstance(Class.forName("java.util.Date"));
        setField(term2078, term2078.getClass(), "id", term2079);
        setField(term2078, term2078.getClass(), "hash", "hxCBltsObl");
        setLongField(term2093, term2093.getClass(), "fastTime", 1739417792956L);
        setField(term2093, term2093.getClass(), "cdate", null);
        setField(term2078, term2078.getClass(), "createDate", term2093);
        setField(term2078, term2078.getClass(), "failReason", "BndsHwAFMv");
        setField(term2078, term2078.getClass(), "code", "GzFkzHGYFt");
        setField(term2078, term2078.getClass(), "dropRecipientId", term2119);
        setField(term2078, term2078.getClass(), "dropRequestId", term2121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2078, args);
    }

};


