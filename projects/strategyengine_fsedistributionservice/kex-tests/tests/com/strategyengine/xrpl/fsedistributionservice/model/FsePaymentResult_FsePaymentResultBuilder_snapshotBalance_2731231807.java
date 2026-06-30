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

public class FsePaymentResult_FsePaymentResultBuilder_snapshotBalance_2731231807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15751;

    public FsePaymentResult_FsePaymentResultBuilder_snapshotBalance_2731231807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15752 = new Long(6855071767938501807L);
        Class<? extends Object> term15879 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term15878 = ((Class) term15879).getDeclaredField((String) "FAILED");
        ((Field) term15878).setAccessible(true);
        Object enum27 = ((Field) term15878).get((Object) null);
        term15751 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder"));
        setField(term15751, term15751.getClass(), "id", term15752);
        setField(term15751, term15751.getClass(), "responseCode", "tsTGdgQYUL");
        setField(term15751, term15751.getClass(), "reason", "TtGbVmKcnX");
        setField(term15751, term15751.getClass(), "classicAddress", "GJVkUrCVdD");
        setField(term15751, term15751.getClass(), "status", enum27);
        setField(term15751, term15751.getClass(), "paymentAmount", "zNdorvdUgu");
        setField(term15751, term15751.getClass(), "snapshotBalance", "oPxuZbkYio");
        setField(term15751, term15751.getClass(), "nftOwned", "vKitydDVnM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "urCiQnUFBM";
        callMethod(klass, "snapshotBalance", argTypes, term15751, args);
    }

};


