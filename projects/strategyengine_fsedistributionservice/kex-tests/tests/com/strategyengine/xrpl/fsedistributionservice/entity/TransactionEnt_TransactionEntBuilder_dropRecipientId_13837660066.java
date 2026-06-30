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

public class TransactionEnt_TransactionEntBuilder_dropRecipientId_13837660066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1463;
     Object term1508;

    public TransactionEnt_TransactionEntBuilder_dropRecipientId_13837660066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1464 = new Long(-6292278961887936280L);
        Long term1504 = new Long(-6645965768855543712L);
        Long term1506 = new Long(4784595517102746672L);
        term1463 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder"));
        Object term1478 = newInstance(Class.forName("java.util.Date"));
        setField(term1463, term1463.getClass(), "id", term1464);
        setField(term1463, term1463.getClass(), "hash", "pCTimMblYc");
        setLongField(term1478, term1478.getClass(), "fastTime", 1725122217647L);
        setField(term1478, term1478.getClass(), "cdate", null);
        setField(term1463, term1463.getClass(), "createDate", term1478);
        setField(term1463, term1463.getClass(), "failReason", "hNxWaHcfhY");
        setField(term1463, term1463.getClass(), "code", "RkybSrpybU");
        setField(term1463, term1463.getClass(), "dropRecipientId", term1504);
        setField(term1463, term1463.getClass(), "dropRequestId", term1506);
        term1508 = new Long(-7612550318181586304L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1508;
        callMethod(klass, "dropRecipientId", argTypes, term1463, args);
    }

};


