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
import java.lang.String;
import java.lang.Integer;

public class DropRecipientEnt_getId_5938428446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25311;

    public DropRecipientEnt_getId_5938428446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25312 = new Long(4502292577098212311L);
        Class<? extends Object> term25417 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term25416 = ((Class) term25417).getDeclaredField((String) "VERIFIED");
        ((Field) term25416).setAccessible(true);
        Object enum51 = ((Field) term25416).get((Object) null);
        Integer term25366 = new Integer(-616727354);
        Long term25368 = new Long(-3730936709704460408L);
        term25311 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term25326 = newInstance(Class.forName("java.util.Date"));
        Object term25328 = newInstance(Class.forName("java.util.Date"));
        setField(term25311, term25311.getClass(), "id", term25312);
        setField(term25311, term25311.getClass(), "address", "UfQtPRyWRC");
        setLongField(term25326, term25326.getClass(), "fastTime", 1335389252058L);
        setField(term25326, term25326.getClass(), "cdate", null);
        setField(term25311, term25311.getClass(), "createDate", term25326);
        setLongField(term25328, term25328.getClass(), "fastTime", 1616833468678L);
        setField(term25328, term25328.getClass(), "cdate", null);
        setField(term25311, term25311.getClass(), "updateDate", term25328);
        setField(term25311, term25311.getClass(), "status", enum51);
        setField(term25311, term25311.getClass(), "failReason", "FPvxVzzSvD");
        setField(term25311, term25311.getClass(), "code", "WHcwFgsGFC");
        setField(term25311, term25311.getClass(), "retryAttempt", term25366);
        setField(term25311, term25311.getClass(), "dropRequestId", term25368);
        setField(term25311, term25311.getClass(), "snapshotBalance", "HzqpegHiRq");
        setField(term25311, term25311.getClass(), "payAmount", "jwsfVjMoJT");
        setField(term25311, term25311.getClass(), "ownedNftId", "ZfdXfCCFDf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term25311, args);
    }

};


