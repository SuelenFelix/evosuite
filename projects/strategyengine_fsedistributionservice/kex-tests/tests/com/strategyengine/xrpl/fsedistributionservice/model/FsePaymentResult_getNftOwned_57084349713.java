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

public class FsePaymentResult_getNftOwned_57084349713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320359;

    public FsePaymentResult_getNftOwned_57084349713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term320360 = new Long(-3684549603148553700L);
        Class<? extends Object> term320476 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term320475 = ((Class) term320476).getDeclaredField((String) "SENDING");
        ((Field) term320475).setAccessible(true);
        Object enum647 = ((Field) term320475).get((Object) null);
        term320359 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term320359, term320359.getClass(), "id", term320360);
        setField(term320359, term320359.getClass(), "responseCode", "wbdTRzpToE");
        setField(term320359, term320359.getClass(), "reason", "hYyOXAATCh");
        setField(term320359, term320359.getClass(), "classicAddress", "UbvbXQRnLW");
        setField(term320359, term320359.getClass(), "status", enum647);
        setField(term320359, term320359.getClass(), "paymentAmount", "CkIbQCWOgW");
        setField(term320359, term320359.getClass(), "snapshotBalance", "JWaRuPqymE");
        setField(term320359, term320359.getClass(), "nftOwned", "nTasTwGyTu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNftOwned", argTypes, term320359, args);
    }

};


