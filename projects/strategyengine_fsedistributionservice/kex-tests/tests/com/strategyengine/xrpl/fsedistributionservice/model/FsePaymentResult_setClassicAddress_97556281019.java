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

public class FsePaymentResult_setClassicAddress_97556281019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323241;

    public FsePaymentResult_setClassicAddress_97556281019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term323242 = new Long(1729206737148270563L);
        Class<? extends Object> term323371 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term323370 = ((Class) term323371).getDeclaredField((String) "VERIFIED");
        ((Field) term323370).setAccessible(true);
        Object enum652 = ((Field) term323370).get((Object) null);
        term323241 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term323241, term323241.getClass(), "id", term323242);
        setField(term323241, term323241.getClass(), "responseCode", "aKrsHDKAga");
        setField(term323241, term323241.getClass(), "reason", "rKYDoRiKpS");
        setField(term323241, term323241.getClass(), "classicAddress", "XGYvAaNOfz");
        setField(term323241, term323241.getClass(), "status", enum652);
        setField(term323241, term323241.getClass(), "paymentAmount", "xVIwdmzmFH");
        setField(term323241, term323241.getClass(), "snapshotBalance", "ZUWrlRmxmN");
        setField(term323241, term323241.getClass(), "nftOwned", "GHfTuIOuRe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uTLqPiiyQJ";
        callMethod(klass, "setClassicAddress", argTypes, term323241, args);
    }

};


