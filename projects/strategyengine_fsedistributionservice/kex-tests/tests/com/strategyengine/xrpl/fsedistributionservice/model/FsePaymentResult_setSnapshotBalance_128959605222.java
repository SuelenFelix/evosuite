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

public class FsePaymentResult_setSnapshotBalance_128959605222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325430;

    public FsePaymentResult_setSnapshotBalance_128959605222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term325431 = new Long(-205762347192500511L);
        Class<? extends Object> term325558 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term325557 = ((Class) term325558).getDeclaredField((String) "FAILED");
        ((Field) term325557).setAccessible(true);
        Object enum656 = ((Field) term325557).get((Object) null);
        term325430 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term325430, term325430.getClass(), "id", term325431);
        setField(term325430, term325430.getClass(), "responseCode", "hQkaYinNHN");
        setField(term325430, term325430.getClass(), "reason", "tinrcZBfby");
        setField(term325430, term325430.getClass(), "classicAddress", "fHZvVFVpCX");
        setField(term325430, term325430.getClass(), "status", enum656);
        setField(term325430, term325430.getClass(), "paymentAmount", "laRdIPzkwz");
        setField(term325430, term325430.getClass(), "snapshotBalance", "siIcTJzSGr");
        setField(term325430, term325430.getClass(), "nftOwned", "IyfKbexwMT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rqqFczqbjO";
        callMethod(klass, "setSnapshotBalance", argTypes, term325430, args);
    }

};


