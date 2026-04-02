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

public class FsePaymentResult_getResponseCode_8836360507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316957;

    public FsePaymentResult_getResponseCode_8836360507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term316958 = new Long(593230449611047187L);
        Class<? extends Object> term317073 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term317072 = ((Class) term317073).getDeclaredField((String) "FAILED");
        ((Field) term317072).setAccessible(true);
        Object enum641 = ((Field) term317072).get((Object) null);
        term316957 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term316957, term316957.getClass(), "id", term316958);
        setField(term316957, term316957.getClass(), "responseCode", "IVqaVowLVl");
        setField(term316957, term316957.getClass(), "reason", "wsWWrTxdcC");
        setField(term316957, term316957.getClass(), "classicAddress", "UPDwVukZbZ");
        setField(term316957, term316957.getClass(), "status", enum641);
        setField(term316957, term316957.getClass(), "paymentAmount", "nFQQbKAYNp");
        setField(term316957, term316957.getClass(), "snapshotBalance", "VQkWATPAEW");
        setField(term316957, term316957.getClass(), "nftOwned", "giGfkdhPAE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResponseCode", argTypes, term316957, args);
    }

};


