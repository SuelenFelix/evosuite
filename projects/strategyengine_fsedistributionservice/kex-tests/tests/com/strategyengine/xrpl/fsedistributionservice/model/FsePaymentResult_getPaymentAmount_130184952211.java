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

public class FsePaymentResult_getPaymentAmount_130184952211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319217;

    public FsePaymentResult_getPaymentAmount_130184952211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term319218 = new Long(-6339531459447942677L);
        Class<? extends Object> term319334 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term319333 = ((Class) term319334).getDeclaredField((String) "SENDING");
        ((Field) term319333).setAccessible(true);
        Object enum645 = ((Field) term319333).get((Object) null);
        term319217 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term319217, term319217.getClass(), "id", term319218);
        setField(term319217, term319217.getClass(), "responseCode", "WUwUHGneAq");
        setField(term319217, term319217.getClass(), "reason", "zlVKedpZvy");
        setField(term319217, term319217.getClass(), "classicAddress", "PEUAKKJLwI");
        setField(term319217, term319217.getClass(), "status", enum645);
        setField(term319217, term319217.getClass(), "paymentAmount", "cYvFrvYBOd");
        setField(term319217, term319217.getClass(), "snapshotBalance", "WfCGsRvHTg");
        setField(term319217, term319217.getClass(), "nftOwned", "jsThoorJsk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPaymentAmount", argTypes, term319217, args);
    }

};


