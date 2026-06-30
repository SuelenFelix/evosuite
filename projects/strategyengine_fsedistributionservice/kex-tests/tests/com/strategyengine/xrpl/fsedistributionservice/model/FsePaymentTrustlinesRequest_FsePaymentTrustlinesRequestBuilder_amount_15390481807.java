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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_amount_15390481807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421288;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_amount_15390481807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term421377 = new Integer(-426764678);
        Double term421379 = new Double(0.841460835734741);
        Double term421381 = new Double(0.7859316615744082);
        Long term421395 = new Long(-5957491491329394218L);
        Class<? extends Object> term421548 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term421547 = ((Class) term421548).getDeclaredField((String) "FLAT");
        ((Field) term421547).setAccessible(true);
        Object enum785 = ((Field) term421547).get((Object) null);
        Class<? extends Object> term421942 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term421941 = ((Class) term421942).getDeclaredField((String) "DAILY");
        ((Field) term421941).setAccessible(true);
        Object enum786 = ((Field) term421941).get((Object) null);
        term421288 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term421429 = newInstance(Class.forName("java.util.Date"));
        Object term421440 = newInstance(Class.forName("java.util.Date"));
        setField(term421288, term421288.getClass(), "memo", "LaQWJGJelM");
        setField(term421288, term421288.getClass(), "fromClassicAddress", "EfMijZOCRw");
        setField(term421288, term421288.getClass(), "fromSigningPublicKey", "azWfFmeoGN");
        setField(term421288, term421288.getClass(), "fromPrivateKey", "HbjtWUINNo");
        setField(term421288, term421288.getClass(), "trustlineIssuerClassicAddress", "HjDczmXwVK");
        setField(term421288, term421288.getClass(), "currencyName", "bPkkpAUHEa");
        setField(term421288, term421288.getClass(), "amount", "cUKOSJBBAw");
        setBooleanField(term421288, term421288.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term421288, term421288.getClass(), "globalIdVerified", false);
        setBooleanField(term421288, term421288.getClass(), "useBlacklist", true);
        setBooleanField(term421288, term421288.getClass(), "agreeFee", true);
        setField(term421288, term421288.getClass(), "maximumTrustlines", term421377);
        setField(term421288, term421288.getClass(), "minBalance", term421379);
        setField(term421288, term421288.getClass(), "maxBalance", term421381);
        setField(term421288, term421288.getClass(), "maxXrpFeePerTransaction", "NFAztRXNmN");
        setField(term421288, term421288.getClass(), "retryOfId", term421395);
        setField(term421288, term421288.getClass(), "paymentType", enum785);
        setField(term421288, term421288.getClass(), "snapshotTrustlineIssuerClassicAddress", "cOIEJbLIQI");
        setField(term421288, term421288.getClass(), "snapshotCurrencyName", "TvYrMVmZHT");
        setLongField(term421429, term421429.getClass(), "fastTime", 1337630653071L);
        setField(term421429, term421429.getClass(), "cdate", null);
        setField(term421288, term421288.getClass(), "startTime", term421429);
        setField(term421288, term421288.getClass(), "frequency", enum786);
        setLongField(term421440, term421440.getClass(), "fastTime", 1430357223378L);
        setField(term421440, term421440.getClass(), "cdate", null);
        setField(term421288, term421288.getClass(), "repeatUntilDate", term421440);
        setField(term421288, term421288.getClass(), "email", "LpFLzVObNe");
        setBooleanField(term421288, term421288.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xSaAaiACTx";
        callMethod(klass, "amount", argTypes, term421288, args);
    }

};


