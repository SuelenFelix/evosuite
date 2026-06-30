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

public class FsePaymentResult_FsePaymentResultBuilder_reason_16372952643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12983;

    public FsePaymentResult_FsePaymentResultBuilder_reason_16372952643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12984 = new Long(-7672528020740371001L);
        Class<? extends Object> term13112 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term13111 = ((Class) term13112).getDeclaredField((String) "SENDING");
        ((Field) term13111).setAccessible(true);
        Object enum22 = ((Field) term13111).get((Object) null);
        term12983 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder"));
        setField(term12983, term12983.getClass(), "id", term12984);
        setField(term12983, term12983.getClass(), "responseCode", "ypEdrstygY");
        setField(term12983, term12983.getClass(), "reason", "sNQFlATEeQ");
        setField(term12983, term12983.getClass(), "classicAddress", "ZKMLioamsY");
        setField(term12983, term12983.getClass(), "status", enum22);
        setField(term12983, term12983.getClass(), "paymentAmount", "WVbxuoDBcn");
        setField(term12983, term12983.getClass(), "snapshotBalance", "pvDEABOxLt");
        setField(term12983, term12983.getClass(), "nftOwned", "beAMpkroCQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uSUvKAyuvd";
        callMethod(klass, "reason", argTypes, term12983, args);
    }

};


