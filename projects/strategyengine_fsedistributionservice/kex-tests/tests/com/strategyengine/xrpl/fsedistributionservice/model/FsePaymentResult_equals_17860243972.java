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

public class FsePaymentResult_equals_17860243972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314130;
     Object term314215;

    public FsePaymentResult_equals_17860243972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term314131 = new Long(6604328992663797314L);
        Class<? extends Object> term314247 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term314246 = ((Class) term314247).getDeclaredField((String) "QUEUED");
        ((Field) term314246).setAccessible(true);
        Object enum636 = ((Field) term314246).get((Object) null);
        term314130 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term314130, term314130.getClass(), "id", term314131);
        setField(term314130, term314130.getClass(), "responseCode", "qKKlbLWTDU");
        setField(term314130, term314130.getClass(), "reason", "vtiTWIgEVa");
        setField(term314130, term314130.getClass(), "classicAddress", "eLERRBMHza");
        setField(term314130, term314130.getClass(), "status", enum636);
        setField(term314130, term314130.getClass(), "paymentAmount", "nNDwdMSbzC");
        setField(term314130, term314130.getClass(), "snapshotBalance", "cIeVoTDYCV");
        setField(term314130, term314130.getClass(), "nftOwned", "zHjWGfGucL");
        term314215 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term314215;
        callMethod(klass, "equals", argTypes, term314130, args);
    }

};


