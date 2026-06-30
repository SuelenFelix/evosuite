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

public class FsePaymentResult_getSnapshotBalance_168180100412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319786;

    public FsePaymentResult_getSnapshotBalance_168180100412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term319787 = new Long(2014229530618878786L);
        Class<? extends Object> term319904 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term319903 = ((Class) term319904).getDeclaredField((String) "VERIFIED");
        ((Field) term319903).setAccessible(true);
        Object enum646 = ((Field) term319903).get((Object) null);
        term319786 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term319786, term319786.getClass(), "id", term319787);
        setField(term319786, term319786.getClass(), "responseCode", "DiLoLWWibV");
        setField(term319786, term319786.getClass(), "reason", "jLARiCBiTZ");
        setField(term319786, term319786.getClass(), "classicAddress", "qgloCkfuKr");
        setField(term319786, term319786.getClass(), "status", enum646);
        setField(term319786, term319786.getClass(), "paymentAmount", "KKIqUqWzEr");
        setField(term319786, term319786.getClass(), "snapshotBalance", "ERiiSXCvBM");
        setField(term319786, term319786.getClass(), "nftOwned", "RgePgJxaiq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSnapshotBalance", argTypes, term319786, args);
    }

};


