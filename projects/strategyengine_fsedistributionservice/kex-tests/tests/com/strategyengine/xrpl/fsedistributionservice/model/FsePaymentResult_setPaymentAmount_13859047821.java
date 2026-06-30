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

public class FsePaymentResult_setPaymentAmount_13859047821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324835;

    public FsePaymentResult_setPaymentAmount_13859047821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term324836 = new Long(5817794709356277010L);
        Class<? extends Object> term324965 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term324964 = ((Class) term324965).getDeclaredField((String) "VERIFIED");
        ((Field) term324964).setAccessible(true);
        Object enum655 = ((Field) term324964).get((Object) null);
        term324835 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term324835, term324835.getClass(), "id", term324836);
        setField(term324835, term324835.getClass(), "responseCode", "zxUAROPAUu");
        setField(term324835, term324835.getClass(), "reason", "AkiPuZHqLZ");
        setField(term324835, term324835.getClass(), "classicAddress", "TtnjCbAnFU");
        setField(term324835, term324835.getClass(), "status", enum655);
        setField(term324835, term324835.getClass(), "paymentAmount", "SDOcDCgFQu");
        setField(term324835, term324835.getClass(), "snapshotBalance", "EcAlwSDsSg");
        setField(term324835, term324835.getClass(), "nftOwned", "GTUBaGksNm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ToitdBqCUa";
        callMethod(klass, "setPaymentAmount", argTypes, term324835, args);
    }

};


