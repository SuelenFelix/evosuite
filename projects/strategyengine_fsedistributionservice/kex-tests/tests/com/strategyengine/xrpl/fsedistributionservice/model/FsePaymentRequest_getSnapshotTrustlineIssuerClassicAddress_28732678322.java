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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;

public class FsePaymentRequest_getSnapshotTrustlineIssuerClassicAddress_28732678322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365640;

    public FsePaymentRequest_getSnapshotTrustlineIssuerClassicAddress_28732678322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term365689 = new ArrayList();
        ((ArrayList) term365689).add("yaNWgtVtAg");
        ((ArrayList) term365689).add("BbNOrjlUDe");
        ((ArrayList) term365689).add("tHYPJBuwZT");
        ((ArrayList) term365689).add("bvJdvzzEbX");
        ((ArrayList) term365689).add("qkbheFUdro");
        Long term365818 = new Long(-2813353909483819403L);
        Class<? extends Object> term366041 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term366040 = ((Class) term366041).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term366040).setAccessible(true);
        Object enum706 = ((Field) term366040).get((Object) null);
        Long term365872 = new Long(-1960938531726773973L);
        Class<? extends Object> term366469 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term366468 = ((Class) term366469).getDeclaredField((String) "MONTHLY");
        ((Field) term366468).setAccessible(true);
        Object enum707 = ((Field) term366468).get((Object) null);
        term365640 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term365765 = newInstance(Class.forName("java.util.Date"));
        Object term365885 = newInstance(Class.forName("java.util.Date"));
        setField(term365640, term365640.getClass(), "memo", "orSUlVDZoM");
        setField(term365640, term365640.getClass(), "fromClassicAddress", "UwuTUXfZlO");
        setField(term365640, term365640.getClass(), "fromSigningPublicKey", "BuECvnjNNp");
        setField(term365640, term365640.getClass(), "fromPrivateKey", "BjCrVrqCvg");
        setField(term365640, term365640.getClass(), "toClassicAddresses", term365689);
        setField(term365640, term365640.getClass(), "amount", "adnAJZpEzc");
        setLongField(term365765, term365765.getClass(), "fastTime", 1374832698949L);
        setField(term365765, term365765.getClass(), "cdate", null);
        setField(term365640, term365640.getClass(), "startTime", term365765);
        setField(term365640, term365640.getClass(), "destinationTag", "ghmRSHgYWE");
        setField(term365640, term365640.getClass(), "trustlineIssuerClassicAddress", "ldISIooOeQ");
        setField(term365640, term365640.getClass(), "currencyName", "gnoGEIFddy");
        setBooleanField(term365640, term365640.getClass(), "agreeFee", false);
        setField(term365640, term365640.getClass(), "maxXrpFeePerTransaction", "BfiOcqELWK");
        setBooleanField(term365640, term365640.getClass(), "globalIdVerified", false);
        setBooleanField(term365640, term365640.getClass(), "useBlacklist", false);
        setField(term365640, term365640.getClass(), "retryOfId", term365818);
        setField(term365640, term365640.getClass(), "paymentType", enum706);
        setField(term365640, term365640.getClass(), "snapshotTrustlineIssuerClassicAddress", "YFDokxIEPp");
        setField(term365640, term365640.getClass(), "snapshotCurrencyName", "GVhcHUODnf");
        setField(term365640, term365640.getClass(), "nftIssuingAddress", "qbgUPrqzVf");
        setField(term365640, term365640.getClass(), "nftTaxon", term365872);
        setField(term365640, term365640.getClass(), "frequency", enum707);
        setLongField(term365885, term365885.getClass(), "fastTime", 1595858433477L);
        setField(term365885, term365885.getClass(), "cdate", null);
        setField(term365640, term365640.getClass(), "repeatUntilDate", term365885);
        setField(term365640, term365640.getClass(), "email", "umsvuHPNzY");
        setBooleanField(term365640, term365640.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSnapshotTrustlineIssuerClassicAddress", argTypes, term365640, args);
    }

};


