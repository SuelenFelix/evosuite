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

public class FsePaymentResult_FsePaymentResultBuilder_nftOwned_3096192378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16338;

    public FsePaymentResult_FsePaymentResultBuilder_nftOwned_3096192378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16339 = new Long(-5892135042702373494L);
        Class<? extends Object> term16467 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term16466 = ((Class) term16467).getDeclaredField((String) "SENDING");
        ((Field) term16466).setAccessible(true);
        Object enum28 = ((Field) term16466).get((Object) null);
        term16338 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder"));
        setField(term16338, term16338.getClass(), "id", term16339);
        setField(term16338, term16338.getClass(), "responseCode", "EKjQdtKxAM");
        setField(term16338, term16338.getClass(), "reason", "TXZAIPQJHt");
        setField(term16338, term16338.getClass(), "classicAddress", "DIbeDHICho");
        setField(term16338, term16338.getClass(), "status", enum28);
        setField(term16338, term16338.getClass(), "paymentAmount", "dJGPlmSRnz");
        setField(term16338, term16338.getClass(), "snapshotBalance", "DPskuFUobI");
        setField(term16338, term16338.getClass(), "nftOwned", "wBGfLpNNiZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yUGCjlqgJE";
        callMethod(klass, "nftOwned", argTypes, term16338, args);
    }

};


