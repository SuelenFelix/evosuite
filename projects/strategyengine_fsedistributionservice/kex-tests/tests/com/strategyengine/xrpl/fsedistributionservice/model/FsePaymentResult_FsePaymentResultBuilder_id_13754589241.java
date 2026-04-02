package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FsePaymentResult_FsePaymentResultBuilder_id_13754589241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11782;
     Object term11867;

    public FsePaymentResult_FsePaymentResultBuilder_id_13754589241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11783 = new Long(-4365849114644724155L);
        Class<? extends Object> term11943 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term11942 = ((Class) term11943).getDeclaredField((String) "QUEUED");
        ((Field) term11942).setAccessible(true);
        Object enum20 = ((Field) term11942).get((Object) null);
        term11782 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder"));
        setField(term11782, term11782.getClass(), "id", term11783);
        setField(term11782, term11782.getClass(), "responseCode", "UKAReurpHG");
        setField(term11782, term11782.getClass(), "reason", "WVRMUmrljA");
        setField(term11782, term11782.getClass(), "classicAddress", "NTlKJDDWlk");
        setField(term11782, term11782.getClass(), "status", enum20);
        setField(term11782, term11782.getClass(), "paymentAmount", "vOuMEpOQAg");
        setField(term11782, term11782.getClass(), "snapshotBalance", "SIODFGaQhr");
        setField(term11782, term11782.getClass(), "nftOwned", "qYzsiuXOgS");
        term11867 = new Long(2486810210675247493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term11867;
        callMethod(klass, "id", argTypes, term11782, args);
    }

};


