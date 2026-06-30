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

public class FsePaymentResult_setResponseCode_11070477417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322059;

    public FsePaymentResult_setResponseCode_11070477417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term322060 = new Long(7716258711075652753L);
        Class<? extends Object> term322187 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term322186 = ((Class) term322187).getDeclaredField((String) "QUEUED");
        ((Field) term322186).setAccessible(true);
        Object enum650 = ((Field) term322186).get((Object) null);
        term322059 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term322059, term322059.getClass(), "id", term322060);
        setField(term322059, term322059.getClass(), "responseCode", "mMpSzaWkTz");
        setField(term322059, term322059.getClass(), "reason", "leDgyXJudi");
        setField(term322059, term322059.getClass(), "classicAddress", "YgSDrWcUog");
        setField(term322059, term322059.getClass(), "status", enum650);
        setField(term322059, term322059.getClass(), "paymentAmount", "GnJMoyfrTK");
        setField(term322059, term322059.getClass(), "snapshotBalance", "sDreXejQef");
        setField(term322059, term322059.getClass(), "nftOwned", "hKwivnVeCZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fvxDfGibVS";
        callMethod(klass, "setResponseCode", argTypes, term322059, args);
    }

};


