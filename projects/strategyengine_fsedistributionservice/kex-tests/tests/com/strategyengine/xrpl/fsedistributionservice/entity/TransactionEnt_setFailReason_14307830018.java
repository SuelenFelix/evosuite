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

public class TransactionEnt_setFailReason_14307830018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3003;

    public TransactionEnt_setFailReason_14307830018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3004 = new Long(-5786861555969446503L);
        Long term3044 = new Long(2354625302846375590L);
        Long term3046 = new Long(7276637106827860087L);
        term3003 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term3018 = newInstance(Class.forName("java.util.Date"));
        setField(term3003, term3003.getClass(), "id", term3004);
        setField(term3003, term3003.getClass(), "hash", "idgaQsnJpQ");
        setLongField(term3018, term3018.getClass(), "fastTime", 1405279189488L);
        setField(term3018, term3018.getClass(), "cdate", null);
        setField(term3003, term3003.getClass(), "createDate", term3018);
        setField(term3003, term3003.getClass(), "failReason", "VgZnGoIFwQ");
        setField(term3003, term3003.getClass(), "code", "jUbSRrkrYZ");
        setField(term3003, term3003.getClass(), "dropRecipientId", term3044);
        setField(term3003, term3003.getClass(), "dropRequestId", term3046);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bWWfajKbEX";
        callMethod(klass, "setFailReason", argTypes, term3003, args);
    }

};


