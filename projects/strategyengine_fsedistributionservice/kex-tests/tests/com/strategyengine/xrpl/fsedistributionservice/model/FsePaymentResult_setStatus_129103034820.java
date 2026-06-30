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

public class FsePaymentResult_setStatus_129103034820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323836;
     Object enum654;

    public FsePaymentResult_setStatus_129103034820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term323837 = new Long(-932981811228171529L);
        Class<? extends Object> term323963 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term323962 = ((Class) term323963).getDeclaredField((String) "SENDING");
        ((Field) term323962).setAccessible(true);
        Object enum653 = ((Field) term323962).get((Object) null);
        term323836 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term323836, term323836.getClass(), "id", term323837);
        setField(term323836, term323836.getClass(), "responseCode", "ZpBdJcjcRV");
        setField(term323836, term323836.getClass(), "reason", "WmcYBwydRb");
        setField(term323836, term323836.getClass(), "classicAddress", "rUMOOZJWlQ");
        setField(term323836, term323836.getClass(), "status", enum653);
        setField(term323836, term323836.getClass(), "paymentAmount", "STLaUnCnfE");
        setField(term323836, term323836.getClass(), "snapshotBalance", "LgOnJRfkhr");
        setField(term323836, term323836.getClass(), "nftOwned", "ZmarCjgmcB");
        Class<? extends Object> term324416 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term324415 = ((Class) term324416).getDeclaredField((String) "QUEUED");
        ((Field) term324415).setAccessible(true);
        enum654 = ((Field) term324415).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Object[] args = new Object[1];
        args[0] = enum654;
        callMethod(klass, "setStatus", argTypes, term323836, args);
    }

};


