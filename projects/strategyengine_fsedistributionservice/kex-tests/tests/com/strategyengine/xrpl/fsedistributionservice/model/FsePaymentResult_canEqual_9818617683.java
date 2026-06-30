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

public class FsePaymentResult_canEqual_9818617683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314696;
     Object term314781;

    public FsePaymentResult_canEqual_9818617683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term314697 = new Long(-5133307284441518726L);
        Class<? extends Object> term314813 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term314812 = ((Class) term314813).getDeclaredField((String) "QUEUED");
        ((Field) term314812).setAccessible(true);
        Object enum637 = ((Field) term314812).get((Object) null);
        term314696 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term314696, term314696.getClass(), "id", term314697);
        setField(term314696, term314696.getClass(), "responseCode", "BrQDOXlSKX");
        setField(term314696, term314696.getClass(), "reason", "rqZXFCcyZu");
        setField(term314696, term314696.getClass(), "classicAddress", "rGcDZdOanr");
        setField(term314696, term314696.getClass(), "status", enum637);
        setField(term314696, term314696.getClass(), "paymentAmount", "qlnQoljKQM");
        setField(term314696, term314696.getClass(), "snapshotBalance", "RMEDwLGQoG");
        setField(term314696, term314696.getClass(), "nftOwned", "wZEFxRSqVY");
        term314781 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term314781;
        callMethod(klass, "canEqual", argTypes, term314696, args);
    }

};


