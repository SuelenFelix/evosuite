package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;

public class PaymentRequestEnt_PaymentRequestEntBuilder_startTime_6239493746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57183;
     Object term57505;

    public PaymentRequestEnt_PaymentRequestEntBuilder_startTime_6239493746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term57184 = new Long(5315236285592892506L);
        Class<? extends Object> term57528 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term57527 = ((Class) term57528).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term57527).setAccessible(true);
        Object enum106 = ((Field) term57527).get((Object) null);
        Class<? extends Object> term58070 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term58069 = ((Class) term58070).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term58069).setAccessible(true);
        Object enum107 = ((Field) term58069).get((Object) null);
        Boolean term57364 = new Boolean(false);
        Boolean term57366 = new Boolean(true);
        Integer term57368 = new Integer(454281060);
        Class<? extends Object> term58468 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term58467 = ((Class) term58468).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term58467).setAccessible(true);
        Object enum108 = ((Field) term58467).get((Object) null);
        Long term57463 = new Long(-6969704322644192945L);
        Long term57477 = new Long(-6685235643232255177L);
        Boolean term57491 = new Boolean(true);
        term57183 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term57210 = newInstance(Class.forName("java.util.Date"));
        Object term57212 = newInstance(Class.forName("java.util.Date"));
        Object term57214 = newInstance(Class.forName("java.util.Date"));
        setField(term57183, term57183.getClass(), "id", term57184);
        setField(term57183, term57183.getClass(), "environment", "FiYYLuailz");
        setField(term57183, term57183.getClass(), "populateEnvironment", "XebAeSnCKZ");
        setLongField(term57210, term57210.getClass(), "fastTime", 1643347136541L);
        setField(term57210, term57210.getClass(), "cdate", null);
        setField(term57183, term57183.getClass(), "createDate", term57210);
        setLongField(term57212, term57212.getClass(), "fastTime", 1565587796123L);
        setField(term57212, term57212.getClass(), "cdate", null);
        setField(term57183, term57183.getClass(), "updateDate", term57212);
        setLongField(term57214, term57214.getClass(), "fastTime", 1577273399172L);
        setField(term57214, term57214.getClass(), "cdate", null);
        setField(term57183, term57183.getClass(), "startTime", term57214);
        setField(term57183, term57183.getClass(), "status", enum106);
        setField(term57183, term57183.getClass(), "fromClassicAddress", "GeddnXjHGy");
        setField(term57183, term57183.getClass(), "fromSigningPublicKey", "vLTbaoAxBm");
        setField(term57183, term57183.getClass(), "fromPrivateKey", "BXTjEyEZxD");
        setField(term57183, term57183.getClass(), "trustlineIssuerClassicAddress", "oKhVzOKUFW");
        setField(term57183, term57183.getClass(), "currencyName", "mNHyqmOAFy");
        setField(term57183, term57183.getClass(), "snapshotTrustlineIssuerClassicAddress", "UxgSdhxPCH");
        setField(term57183, term57183.getClass(), "snapshotCurrencyName", "DAujxZPHJC");
        setField(term57183, term57183.getClass(), "currencyNameForProcess", "IlBhdrCvHq");
        setField(term57183, term57183.getClass(), "amount", "OirVUQhauU");
        setField(term57183, term57183.getClass(), "paymentType", enum107);
        setField(term57183, term57183.getClass(), "newTrustlinesOnly", term57364);
        setField(term57183, term57183.getClass(), "useBlacklist", term57366);
        setField(term57183, term57183.getClass(), "maximumTrustlines", term57368);
        setField(term57183, term57183.getClass(), "dropType", enum108);
        setField(term57183, term57183.getClass(), "lockUuid", "GLbyDfbNZI");
        setField(term57183, term57183.getClass(), "failReason", "oNLcCYDAsO");
        setField(term57183, term57183.getClass(), "feesPaid", "CNqMxLvtcJ");
        setField(term57183, term57183.getClass(), "minBalance", "ktbqerIaKW");
        setField(term57183, term57183.getClass(), "maxBalance", "VoghngXfsK");
        setField(term57183, term57183.getClass(), "maxXrpFeePerTransaction", "GbahCBMvct");
        setField(term57183, term57183.getClass(), "retryOfId", term57463);
        setField(term57183, term57183.getClass(), "nftIssuerAddress", "iiHBhsNFgk");
        setField(term57183, term57183.getClass(), "nftTaxon", term57477);
        setField(term57183, term57183.getClass(), "contactEmail", "HknsTajwxJ");
        setField(term57183, term57183.getClass(), "autoApprove", term57491);
        setField(term57183, term57183.getClass(), "memo", "XtiurrVYKw");
        term57505 = newInstance(Class.forName("java.util.Date"));
        setLongField(term57505, term57505.getClass(), "fastTime", 1406013163547L);
        setField(term57505, term57505.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term57505;
        callMethod(klass, "startTime", argTypes, term57183, args);
    }

};


