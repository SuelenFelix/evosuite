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

public class FsePaymentResult_setId_155538560816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321492;
     Object term321577;

    public FsePaymentResult_setId_155538560816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term321493 = new Long(7429946509853918683L);
        Class<? extends Object> term321610 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term321609 = ((Class) term321610).getDeclaredField((String) "FAILED");
        ((Field) term321609).setAccessible(true);
        Object enum649 = ((Field) term321609).get((Object) null);
        term321492 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term321492, term321492.getClass(), "id", term321493);
        setField(term321492, term321492.getClass(), "responseCode", "qOEJpzrzgF");
        setField(term321492, term321492.getClass(), "reason", "ExvDwmtNdV");
        setField(term321492, term321492.getClass(), "classicAddress", "MmhamxEBqw");
        setField(term321492, term321492.getClass(), "status", enum649);
        setField(term321492, term321492.getClass(), "paymentAmount", "heEXeIaieQ");
        setField(term321492, term321492.getClass(), "snapshotBalance", "MhsNUxKgPP");
        setField(term321492, term321492.getClass(), "nftOwned", "cGLyrLlynk");
        term321577 = new Long(-7148236042086608592L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term321577;
        callMethod(klass, "setId", argTypes, term321492, args);
    }

};


