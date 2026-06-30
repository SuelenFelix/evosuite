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

public class PaymentRequestEnt_setEnvironment_39782672242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177447;

    public PaymentRequestEnt_setEnvironment_39782672242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term177448 = new Long(206360660645917003L);
        Class<? extends Object> term177800 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term177799 = ((Class) term177800).getDeclaredField((String) "SCHEDULED");
        ((Field) term177799).setAccessible(true);
        Object enum316 = ((Field) term177799).get((Object) null);
        Class<? extends Object> term178309 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term178308 = ((Class) term178309).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term178308).setAccessible(true);
        Object enum317 = ((Field) term178308).get((Object) null);
        Boolean term177617 = new Boolean(true);
        Boolean term177619 = new Boolean(false);
        Integer term177621 = new Integer(1861318859);
        Class<? extends Object> term178707 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term178706 = ((Class) term178707).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term178706).setAccessible(true);
        Object enum318 = ((Field) term178706).get((Object) null);
        Long term177725 = new Long(8680715663951713735L);
        Long term177739 = new Long(-4905558793519537969L);
        Boolean term177753 = new Boolean(true);
        term177447 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term177474 = newInstance(Class.forName("java.util.Date"));
        Object term177476 = newInstance(Class.forName("java.util.Date"));
        Object term177478 = newInstance(Class.forName("java.util.Date"));
        setField(term177447, term177447.getClass(), "id", term177448);
        setField(term177447, term177447.getClass(), "environment", "dUXsPNSUez");
        setField(term177447, term177447.getClass(), "populateEnvironment", "PxGDfPOAFS");
        setLongField(term177474, term177474.getClass(), "fastTime", 1754599586725L);
        setField(term177474, term177474.getClass(), "cdate", null);
        setField(term177447, term177447.getClass(), "createDate", term177474);
        setLongField(term177476, term177476.getClass(), "fastTime", 1470272190930L);
        setField(term177476, term177476.getClass(), "cdate", null);
        setField(term177447, term177447.getClass(), "updateDate", term177476);
        setLongField(term177478, term177478.getClass(), "fastTime", 1722228358179L);
        setField(term177478, term177478.getClass(), "cdate", null);
        setField(term177447, term177447.getClass(), "startTime", term177478);
        setField(term177447, term177447.getClass(), "status", enum316);
        setField(term177447, term177447.getClass(), "fromClassicAddress", "dZVxzYEeZe");
        setField(term177447, term177447.getClass(), "fromSigningPublicKey", "TnCQRmzwPf");
        setField(term177447, term177447.getClass(), "fromPrivateKey", "ZGnUKGTWCn");
        setField(term177447, term177447.getClass(), "trustlineIssuerClassicAddress", "cHRLXsgRzr");
        setField(term177447, term177447.getClass(), "currencyName", "QpqQKmCtoC");
        setField(term177447, term177447.getClass(), "snapshotTrustlineIssuerClassicAddress", "AYRvbRJxWI");
        setField(term177447, term177447.getClass(), "snapshotCurrencyName", "MGNiaVqEDc");
        setField(term177447, term177447.getClass(), "currencyNameForProcess", "qeVNCFrTbT");
        setField(term177447, term177447.getClass(), "amount", "sreEtRBWQl");
        setField(term177447, term177447.getClass(), "paymentType", enum317);
        setField(term177447, term177447.getClass(), "newTrustlinesOnly", term177617);
        setField(term177447, term177447.getClass(), "useBlacklist", term177619);
        setField(term177447, term177447.getClass(), "maximumTrustlines", term177621);
        setField(term177447, term177447.getClass(), "dropType", enum318);
        setField(term177447, term177447.getClass(), "lockUuid", "UKQejaeJWY");
        setField(term177447, term177447.getClass(), "failReason", "lNbVasLAKL");
        setField(term177447, term177447.getClass(), "feesPaid", "wKeyHBCSLZ");
        setField(term177447, term177447.getClass(), "minBalance", "iQCLduwSPi");
        setField(term177447, term177447.getClass(), "maxBalance", "ZcODLNhxqg");
        setField(term177447, term177447.getClass(), "maxXrpFeePerTransaction", "iNtHOROBMq");
        setField(term177447, term177447.getClass(), "retryOfId", term177725);
        setField(term177447, term177447.getClass(), "nftIssuerAddress", "GbvfbbsrOl");
        setField(term177447, term177447.getClass(), "nftTaxon", term177739);
        setField(term177447, term177447.getClass(), "contactEmail", "IIZlqzOmtY");
        setField(term177447, term177447.getClass(), "autoApprove", term177753);
        setField(term177447, term177447.getClass(), "memo", "iRFRSxtnkr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iGWkLjLGBY";
        callMethod(klass, "setEnvironment", argTypes, term177447, args);
    }

};


