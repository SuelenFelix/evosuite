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

public class TransactionEnt_setDropRecipientId_27831487220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3197;
     Object term3242;

    public TransactionEnt_setDropRecipientId_27831487220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3198 = new Long(-685023850445639859L);
        Long term3238 = new Long(-6950146046121430355L);
        Long term3240 = new Long(1667122142089513324L);
        term3197 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term3212 = newInstance(Class.forName("java.util.Date"));
        setField(term3197, term3197.getClass(), "id", term3198);
        setField(term3197, term3197.getClass(), "hash", "PkWMRdJcBb");
        setLongField(term3212, term3212.getClass(), "fastTime", 1678177615298L);
        setField(term3212, term3212.getClass(), "cdate", null);
        setField(term3197, term3197.getClass(), "createDate", term3212);
        setField(term3197, term3197.getClass(), "failReason", "jSpAteRute");
        setField(term3197, term3197.getClass(), "code", "swZVeJAxjt");
        setField(term3197, term3197.getClass(), "dropRecipientId", term3238);
        setField(term3197, term3197.getClass(), "dropRequestId", term3240);
        term3242 = new Long(-6342139649364011743L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3242;
        callMethod(klass, "setDropRecipientId", argTypes, term3197, args);
    }

};


