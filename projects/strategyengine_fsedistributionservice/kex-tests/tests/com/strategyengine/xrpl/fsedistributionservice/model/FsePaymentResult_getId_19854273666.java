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

public class FsePaymentResult_getId_19854273666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316392;

    public FsePaymentResult_getId_19854273666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term316393 = new Long(-4033544645261759750L);
        Class<? extends Object> term316508 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term316507 = ((Class) term316508).getDeclaredField((String) "FAILED");
        ((Field) term316507).setAccessible(true);
        Object enum640 = ((Field) term316507).get((Object) null);
        term316392 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term316392, term316392.getClass(), "id", term316393);
        setField(term316392, term316392.getClass(), "responseCode", "nuzwgdczLX");
        setField(term316392, term316392.getClass(), "reason", "FdFPAsGWZj");
        setField(term316392, term316392.getClass(), "classicAddress", "sqctDxfcQV");
        setField(term316392, term316392.getClass(), "status", enum640);
        setField(term316392, term316392.getClass(), "paymentAmount", "KHXlwfHOLE");
        setField(term316392, term316392.getClass(), "snapshotBalance", "oxoYdAYVkI");
        setField(term316392, term316392.getClass(), "nftOwned", "jUYVgbuaNi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term316392, args);
    }

};


