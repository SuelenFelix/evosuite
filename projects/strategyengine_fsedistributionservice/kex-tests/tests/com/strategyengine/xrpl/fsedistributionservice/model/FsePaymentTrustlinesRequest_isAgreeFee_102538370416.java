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

public class FsePaymentTrustlinesRequest_isAgreeFee_102538370416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34959;

    public FsePaymentTrustlinesRequest_isAgreeFee_102538370416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term35048 = new Integer(-1530420153);
        Double term35050 = new Double(0.6862221294683138);
        Double term35052 = new Double(0.15917839663695388);
        Long term35066 = new Long(-1468719814009985452L);
        Class<? extends Object> term35208 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term35207 = ((Class) term35208).getDeclaredField((String) "FLAT");
        ((Field) term35207).setAccessible(true);
        Object enum61 = ((Field) term35207).get((Object) null);
        Class<? extends Object> term35602 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term35601 = ((Class) term35602).getDeclaredField((String) "WEEKLY");
        ((Field) term35601).setAccessible(true);
        Object enum62 = ((Field) term35601).get((Object) null);
        term34959 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term35100 = newInstance(Class.forName("java.util.Date"));
        Object term35112 = newInstance(Class.forName("java.util.Date"));
        setField(term34959, term34959.getClass(), "memo", "LrqwfrKKtS");
        setField(term34959, term34959.getClass(), "fromClassicAddress", "ZUdnQXfzCI");
        setField(term34959, term34959.getClass(), "fromSigningPublicKey", "EULDrUNQvw");
        setField(term34959, term34959.getClass(), "fromPrivateKey", "BtvAvsJSei");
        setField(term34959, term34959.getClass(), "trustlineIssuerClassicAddress", "vqnBkkxoIa");
        setField(term34959, term34959.getClass(), "currencyName", "bycpZjxXFn");
        setField(term34959, term34959.getClass(), "amount", "jQWttOAiwL");
        setBooleanField(term34959, term34959.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term34959, term34959.getClass(), "globalIdVerified", true);
        setBooleanField(term34959, term34959.getClass(), "useBlacklist", false);
        setBooleanField(term34959, term34959.getClass(), "agreeFee", false);
        setField(term34959, term34959.getClass(), "maximumTrustlines", term35048);
        setField(term34959, term34959.getClass(), "minBalance", term35050);
        setField(term34959, term34959.getClass(), "maxBalance", term35052);
        setField(term34959, term34959.getClass(), "maxXrpFeePerTransaction", "DzKFxEuEEC");
        setField(term34959, term34959.getClass(), "retryOfId", term35066);
        setField(term34959, term34959.getClass(), "paymentType", enum61);
        setField(term34959, term34959.getClass(), "snapshotTrustlineIssuerClassicAddress", "CAMnvfDLJL");
        setField(term34959, term34959.getClass(), "snapshotCurrencyName", "mfHtgSbdjD");
        setLongField(term35100, term35100.getClass(), "fastTime", 1695425269458L);
        setField(term35100, term35100.getClass(), "cdate", null);
        setField(term34959, term34959.getClass(), "startTime", term35100);
        setField(term34959, term34959.getClass(), "frequency", enum62);
        setLongField(term35112, term35112.getClass(), "fastTime", 1362780563394L);
        setField(term35112, term35112.getClass(), "cdate", null);
        setField(term34959, term34959.getClass(), "repeatUntilDate", term35112);
        setField(term34959, term34959.getClass(), "email", "cmuaUiHMVL");
        setBooleanField(term34959, term34959.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAgreeFee", argTypes, term34959, args);
    }

};


