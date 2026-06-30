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

public class FsePaymentResult_getReason_9995776368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317522;

    public FsePaymentResult_getReason_9995776368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term317523 = new Long(-3355167737637002830L);
        Class<? extends Object> term317638 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term317637 = ((Class) term317638).getDeclaredField((String) "FAILED");
        ((Field) term317637).setAccessible(true);
        Object enum642 = ((Field) term317637).get((Object) null);
        term317522 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term317522, term317522.getClass(), "id", term317523);
        setField(term317522, term317522.getClass(), "responseCode", "wNfBmUuDuP");
        setField(term317522, term317522.getClass(), "reason", "lNTNKavUNL");
        setField(term317522, term317522.getClass(), "classicAddress", "BXfmFjgpOy");
        setField(term317522, term317522.getClass(), "status", enum642);
        setField(term317522, term317522.getClass(), "paymentAmount", "JCeHaSFOWK");
        setField(term317522, term317522.getClass(), "snapshotBalance", "PNtiQWTZzA");
        setField(term317522, term317522.getClass(), "nftOwned", "raishRurKx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReason", argTypes, term317522, args);
    }

};


