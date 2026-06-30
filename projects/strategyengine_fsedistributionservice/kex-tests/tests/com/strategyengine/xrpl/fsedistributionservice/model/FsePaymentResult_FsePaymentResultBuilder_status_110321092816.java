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

public class FsePaymentResult_FsePaymentResultBuilder_status_110321092816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18067;

    public FsePaymentResult_FsePaymentResultBuilder_status_110321092816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18067 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder"));
        setField(term18067, term18067.getClass(), "id", null);
        setField(term18067, term18067.getClass(), "responseCode", null);
        setField(term18067, term18067.getClass(), "reason", null);
        setField(term18067, term18067.getClass(), "classicAddress", null);
        setField(term18067, term18067.getClass(), "status", null);
        setField(term18067, term18067.getClass(), "paymentAmount", null);
        setField(term18067, term18067.getClass(), "snapshotBalance", null);
        setField(term18067, term18067.getClass(), "nftOwned", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "status", argTypes, term18067, args);
    }

};


