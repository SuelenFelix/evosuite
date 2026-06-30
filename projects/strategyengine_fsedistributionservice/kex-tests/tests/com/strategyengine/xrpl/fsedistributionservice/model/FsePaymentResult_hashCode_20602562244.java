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

public class FsePaymentResult_hashCode_20602562244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315262;

    public FsePaymentResult_hashCode_20602562244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term315263 = new Long(7921404547326630089L);
        Class<? extends Object> term315378 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term315377 = ((Class) term315378).getDeclaredField((String) "FAILED");
        ((Field) term315377).setAccessible(true);
        Object enum638 = ((Field) term315377).get((Object) null);
        term315262 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term315262, term315262.getClass(), "id", term315263);
        setField(term315262, term315262.getClass(), "responseCode", "tHcDbcviFO");
        setField(term315262, term315262.getClass(), "reason", "cmEWCrpoCO");
        setField(term315262, term315262.getClass(), "classicAddress", "OApdoCtolu");
        setField(term315262, term315262.getClass(), "status", enum638);
        setField(term315262, term315262.getClass(), "paymentAmount", "ONkDXTThKL");
        setField(term315262, term315262.getClass(), "snapshotBalance", "AKbzAaAcmX");
        setField(term315262, term315262.getClass(), "nftOwned", "xiloHjgKux");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term315262, args);
    }

};


