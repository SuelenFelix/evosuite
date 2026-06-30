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

public class FsePaymentResult_toString_15494965345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315827;

    public FsePaymentResult_toString_15494965345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term315828 = new Long(2155219577693802424L);
        Class<? extends Object> term315943 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term315942 = ((Class) term315943).getDeclaredField((String) "FAILED");
        ((Field) term315942).setAccessible(true);
        Object enum639 = ((Field) term315942).get((Object) null);
        term315827 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term315827, term315827.getClass(), "id", term315828);
        setField(term315827, term315827.getClass(), "responseCode", "Pmajvqueiq");
        setField(term315827, term315827.getClass(), "reason", "VjCLvZgmuN");
        setField(term315827, term315827.getClass(), "classicAddress", "tQCalivCMp");
        setField(term315827, term315827.getClass(), "status", enum639);
        setField(term315827, term315827.getClass(), "paymentAmount", "fEiosUzVPM");
        setField(term315827, term315827.getClass(), "snapshotBalance", "USPyxkJGgn");
        setField(term315827, term315827.getClass(), "nftOwned", "VniuLGKjLe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term315827, args);
    }

};


