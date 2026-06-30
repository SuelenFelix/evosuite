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

public class FsePaymentResult_getStatus_28000715210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318652;

    public FsePaymentResult_getStatus_28000715210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term318653 = new Long(2769081086274438111L);
        Class<? extends Object> term318768 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term318767 = ((Class) term318768).getDeclaredField((String) "FAILED");
        ((Field) term318767).setAccessible(true);
        Object enum644 = ((Field) term318767).get((Object) null);
        term318652 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term318652, term318652.getClass(), "id", term318653);
        setField(term318652, term318652.getClass(), "responseCode", "VurQtsudbR");
        setField(term318652, term318652.getClass(), "reason", "KdIGyBXZVB");
        setField(term318652, term318652.getClass(), "classicAddress", "eKvGCdbyoP");
        setField(term318652, term318652.getClass(), "status", enum644);
        setField(term318652, term318652.getClass(), "paymentAmount", "MgMUmPLywB");
        setField(term318652, term318652.getClass(), "snapshotBalance", "pNJhowQpXJ");
        setField(term318652, term318652.getClass(), "nftOwned", "gyfupqhzxo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term318652, args);
    }

};


