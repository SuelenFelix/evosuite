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

public class PaymentRequestEnt_PaymentRequestEntBuilder_nftIssuerAddress_22945894929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97121;

    public PaymentRequestEnt_PaymentRequestEntBuilder_nftIssuerAddress_22945894929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term97122 = new Long(-2136893352275781569L);
        Class<? extends Object> term97465 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term97464 = ((Class) term97465).getDeclaredField((String) "SCHEDULED");
        ((Field) term97464).setAccessible(true);
        Object enum175 = ((Field) term97464).get((Object) null);
        Class<? extends Object> term97974 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term97973 = ((Class) term97974).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term97973).setAccessible(true);
        Object enum176 = ((Field) term97973).get((Object) null);
        Boolean term97291 = new Boolean(true);
        Boolean term97293 = new Boolean(false);
        Integer term97295 = new Integer(1551099402);
        Class<? extends Object> term98372 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term98371 = ((Class) term98372).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term98371).setAccessible(true);
        Object enum177 = ((Field) term98371).get((Object) null);
        Long term97390 = new Long(-9147545274054597570L);
        Long term97404 = new Long(-8398381579707958144L);
        Boolean term97418 = new Boolean(false);
        term97121 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term97148 = newInstance(Class.forName("java.util.Date"));
        Object term97150 = newInstance(Class.forName("java.util.Date"));
        Object term97152 = newInstance(Class.forName("java.util.Date"));
        setField(term97121, term97121.getClass(), "id", term97122);
        setField(term97121, term97121.getClass(), "environment", "eRYlSLwtvV");
        setField(term97121, term97121.getClass(), "populateEnvironment", "duOyJsARTD");
        setLongField(term97148, term97148.getClass(), "fastTime", 1549838758444L);
        setField(term97148, term97148.getClass(), "cdate", null);
        setField(term97121, term97121.getClass(), "createDate", term97148);
        setLongField(term97150, term97150.getClass(), "fastTime", 1889599547447L);
        setField(term97150, term97150.getClass(), "cdate", null);
        setField(term97121, term97121.getClass(), "updateDate", term97150);
        setLongField(term97152, term97152.getClass(), "fastTime", 1511094598673L);
        setField(term97152, term97152.getClass(), "cdate", null);
        setField(term97121, term97121.getClass(), "startTime", term97152);
        setField(term97121, term97121.getClass(), "status", enum175);
        setField(term97121, term97121.getClass(), "fromClassicAddress", "xPnOHsNlyc");
        setField(term97121, term97121.getClass(), "fromSigningPublicKey", "OTSPWPJefj");
        setField(term97121, term97121.getClass(), "fromPrivateKey", "EOTYMqXRmE");
        setField(term97121, term97121.getClass(), "trustlineIssuerClassicAddress", "iTxNduwSjE");
        setField(term97121, term97121.getClass(), "currencyName", "MQUTfIiFnh");
        setField(term97121, term97121.getClass(), "snapshotTrustlineIssuerClassicAddress", "JeyKRznnft");
        setField(term97121, term97121.getClass(), "snapshotCurrencyName", "vQJUCtuYpK");
        setField(term97121, term97121.getClass(), "currencyNameForProcess", "GHtOeztAdz");
        setField(term97121, term97121.getClass(), "amount", "gSAtqakaLY");
        setField(term97121, term97121.getClass(), "paymentType", enum176);
        setField(term97121, term97121.getClass(), "newTrustlinesOnly", term97291);
        setField(term97121, term97121.getClass(), "useBlacklist", term97293);
        setField(term97121, term97121.getClass(), "maximumTrustlines", term97295);
        setField(term97121, term97121.getClass(), "dropType", enum177);
        setField(term97121, term97121.getClass(), "lockUuid", "taPBiMFNEZ");
        setField(term97121, term97121.getClass(), "failReason", "NoAFAfGyYL");
        setField(term97121, term97121.getClass(), "feesPaid", "MFtfkBMyOD");
        setField(term97121, term97121.getClass(), "minBalance", "rdiIyXfRtL");
        setField(term97121, term97121.getClass(), "maxBalance", "douzkltmiI");
        setField(term97121, term97121.getClass(), "maxXrpFeePerTransaction", "MFKjhvLtpe");
        setField(term97121, term97121.getClass(), "retryOfId", term97390);
        setField(term97121, term97121.getClass(), "nftIssuerAddress", "xpbLKEsput");
        setField(term97121, term97121.getClass(), "nftTaxon", term97404);
        setField(term97121, term97121.getClass(), "contactEmail", "urlyLwPBVn");
        setField(term97121, term97121.getClass(), "autoApprove", term97418);
        setField(term97121, term97121.getClass(), "memo", "SPQVzOlOzZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bOUAgAptAI";
        callMethod(klass, "nftIssuerAddress", argTypes, term97121, args);
    }

};


