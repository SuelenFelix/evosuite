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

public class FsePaymentResult_setNftOwned_101549894323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326017;

    public FsePaymentResult_setNftOwned_101549894323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term326018 = new Long(-4987344934532917085L);
        Class<? extends Object> term326146 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term326145 = ((Class) term326146).getDeclaredField((String) "SENDING");
        ((Field) term326145).setAccessible(true);
        Object enum657 = ((Field) term326145).get((Object) null);
        term326017 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term326017, term326017.getClass(), "id", term326018);
        setField(term326017, term326017.getClass(), "responseCode", "fhhYQGiExU");
        setField(term326017, term326017.getClass(), "reason", "poqEkIMUQX");
        setField(term326017, term326017.getClass(), "classicAddress", "SLVaFTiZJu");
        setField(term326017, term326017.getClass(), "status", enum657);
        setField(term326017, term326017.getClass(), "paymentAmount", "BFwLWMcFzQ");
        setField(term326017, term326017.getClass(), "snapshotBalance", "ueMjdaYJqr");
        setField(term326017, term326017.getClass(), "nftOwned", "IkmVfYlXcX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WIAcrtkMRk";
        callMethod(klass, "setNftOwned", argTypes, term326017, args);
    }

};


