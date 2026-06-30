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

public class FsePaymentResult_FsePaymentResultBuilder_toString_145746037410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17494;

    public FsePaymentResult_FsePaymentResultBuilder_toString_145746037410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17495 = new Long(-6823727938421990489L);
        Class<? extends Object> term17611 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term17610 = ((Class) term17611).getDeclaredField((String) "SENDING");
        ((Field) term17610).setAccessible(true);
        Object enum30 = ((Field) term17610).get((Object) null);
        term17494 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder"));
        setField(term17494, term17494.getClass(), "id", term17495);
        setField(term17494, term17494.getClass(), "responseCode", "ZfBIVGBQOE");
        setField(term17494, term17494.getClass(), "reason", "QSrDQfEsTR");
        setField(term17494, term17494.getClass(), "classicAddress", "PsqusYmejD");
        setField(term17494, term17494.getClass(), "status", enum30);
        setField(term17494, term17494.getClass(), "paymentAmount", "NTWMiBEaDF");
        setField(term17494, term17494.getClass(), "snapshotBalance", "SPBstwKFVr");
        setField(term17494, term17494.getClass(), "nftOwned", "WxYUTuqmIq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17494, args);
    }

};


