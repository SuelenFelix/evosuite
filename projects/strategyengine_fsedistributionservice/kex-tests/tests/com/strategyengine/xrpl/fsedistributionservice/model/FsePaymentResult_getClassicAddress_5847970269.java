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

public class FsePaymentResult_getClassicAddress_5847970269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318087;

    public FsePaymentResult_getClassicAddress_5847970269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term318088 = new Long(-8854988339892073229L);
        Class<? extends Object> term318203 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term318202 = ((Class) term318203).getDeclaredField((String) "QUEUED");
        ((Field) term318202).setAccessible(true);
        Object enum643 = ((Field) term318202).get((Object) null);
        term318087 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term318087, term318087.getClass(), "id", term318088);
        setField(term318087, term318087.getClass(), "responseCode", "PpeSAmBPlT");
        setField(term318087, term318087.getClass(), "reason", "XmRRZpyFKp");
        setField(term318087, term318087.getClass(), "classicAddress", "QXOnXJGHZk");
        setField(term318087, term318087.getClass(), "status", enum643);
        setField(term318087, term318087.getClass(), "paymentAmount", "tckSURIPmO");
        setField(term318087, term318087.getClass(), "snapshotBalance", "GZSnqwBCPQ");
        setField(term318087, term318087.getClass(), "nftOwned", "zxdSWLKWYw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClassicAddress", argTypes, term318087, args);
    }

};


