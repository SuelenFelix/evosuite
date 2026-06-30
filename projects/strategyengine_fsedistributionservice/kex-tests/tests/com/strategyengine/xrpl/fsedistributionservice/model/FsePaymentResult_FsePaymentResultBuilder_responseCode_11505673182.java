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

public class FsePaymentResult_FsePaymentResultBuilder_responseCode_11505673182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12392;

    public FsePaymentResult_FsePaymentResultBuilder_responseCode_11505673182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12393 = new Long(7009926388951271268L);
        Class<? extends Object> term12521 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term12520 = ((Class) term12521).getDeclaredField((String) "SENDING");
        ((Field) term12520).setAccessible(true);
        Object enum21 = ((Field) term12520).get((Object) null);
        term12392 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder"));
        setField(term12392, term12392.getClass(), "id", term12393);
        setField(term12392, term12392.getClass(), "responseCode", "bxrCBbrrct");
        setField(term12392, term12392.getClass(), "reason", "CKWpJaaaxX");
        setField(term12392, term12392.getClass(), "classicAddress", "UBRmXJmfrt");
        setField(term12392, term12392.getClass(), "status", enum21);
        setField(term12392, term12392.getClass(), "paymentAmount", "WZzvmIHhzZ");
        setField(term12392, term12392.getClass(), "snapshotBalance", "doQLHkjpNm");
        setField(term12392, term12392.getClass(), "nftOwned", "lCyLIcSuom");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult$FsePaymentResultBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CGOpQSZZwI";
        callMethod(klass, "responseCode", argTypes, term12392, args);
    }

};


