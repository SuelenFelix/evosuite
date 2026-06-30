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
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FsePaymentTrustlinesRequest_getFromPrivateKey_20864635639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27473;

    public FsePaymentTrustlinesRequest_getFromPrivateKey_20864635639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27562 = new Integer(-244121226);
        Double term27564 = new Double(0.3587267442738795);
        Double term27566 = new Double(0.07802449704920456);
        Long term27580 = new Long(-4443169559037975007L);
        Class<? extends Object> term27722 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term27721 = ((Class) term27722).getDeclaredField((String) "FLAT");
        ((Field) term27721).setAccessible(true);
        Object enum47 = ((Field) term27721).get((Object) null);
        Class<? extends Object> term28116 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term28115 = ((Class) term28116).getDeclaredField((String) "WEEKLY");
        ((Field) term28115).setAccessible(true);
        Object enum48 = ((Field) term28115).get((Object) null);
        term27473 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term27614 = newInstance(Class.forName("java.util.Date"));
        Object term27626 = newInstance(Class.forName("java.util.Date"));
        setField(term27473, term27473.getClass(), "memo", "nxSTJflLQy");
        setField(term27473, term27473.getClass(), "fromClassicAddress", "FlHzxEfFzI");
        setField(term27473, term27473.getClass(), "fromSigningPublicKey", "aSATgQUpoe");
        setField(term27473, term27473.getClass(), "fromPrivateKey", "VkPSXewZfB");
        setField(term27473, term27473.getClass(), "trustlineIssuerClassicAddress", "ubodzJoMGW");
        setField(term27473, term27473.getClass(), "currencyName", "weddIktxOA");
        setField(term27473, term27473.getClass(), "amount", "uSlMeISsDD");
        setBooleanField(term27473, term27473.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term27473, term27473.getClass(), "globalIdVerified", true);
        setBooleanField(term27473, term27473.getClass(), "useBlacklist", true);
        setBooleanField(term27473, term27473.getClass(), "agreeFee", true);
        setField(term27473, term27473.getClass(), "maximumTrustlines", term27562);
        setField(term27473, term27473.getClass(), "minBalance", term27564);
        setField(term27473, term27473.getClass(), "maxBalance", term27566);
        setField(term27473, term27473.getClass(), "maxXrpFeePerTransaction", "WdCiTDUKqn");
        setField(term27473, term27473.getClass(), "retryOfId", term27580);
        setField(term27473, term27473.getClass(), "paymentType", enum47);
        setField(term27473, term27473.getClass(), "snapshotTrustlineIssuerClassicAddress", "PSizQDoxxe");
        setField(term27473, term27473.getClass(), "snapshotCurrencyName", "mKaHyMybrK");
        setLongField(term27614, term27614.getClass(), "fastTime", 1488725902101L);
        setField(term27614, term27614.getClass(), "cdate", null);
        setField(term27473, term27473.getClass(), "startTime", term27614);
        setField(term27473, term27473.getClass(), "frequency", enum48);
        setLongField(term27626, term27626.getClass(), "fastTime", 1311560117361L);
        setField(term27626, term27626.getClass(), "cdate", null);
        setField(term27473, term27473.getClass(), "repeatUntilDate", term27626);
        setField(term27473, term27473.getClass(), "email", "AyrEXuGrEj");
        setBooleanField(term27473, term27473.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromPrivateKey", argTypes, term27473, args);
    }

};


