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

public class FsePaymentResult_FsePaymentResultBuilder_classicAddress_15048142384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13574;

    public FsePaymentResult_FsePaymentResultBuilder_classicAddress_15048142384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13575 = new Long(-4502405999831680926L);
        Class<? extends Object> term13702 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term13701 = ((Class) term13702).getDeclaredField((String) "QUEUED");
        ((Field) term13701).setAccessible(true);
        Object enum23 = ((Field) term13701).get((Object) null);
        term13574 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder"));
        setField(term13574, term13574.getClass(), "id", term13575);
        setField(term13574, term13574.getClass(), "responseCode", "onQLVONGuf");
        setField(term13574, term13574.getClass(), "reason", "SOrEHbcbmn");
        setField(term13574, term13574.getClass(), "classicAddress", "bnsyeQXFdu");
        setField(term13574, term13574.getClass(), "status", enum23);
        setField(term13574, term13574.getClass(), "paymentAmount", "BwtdjiefJn");
        setField(term13574, term13574.getClass(), "snapshotBalance", "jDmhBrIoDa");
        setField(term13574, term13574.getClass(), "nftOwned", "SPtPatHeOm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ywmcuThdfL";
        callMethod(klass, "classicAddress", argTypes, term13574, args);
    }

};


