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

public class FsePaymentRequest_FsePaymentRequestBuilder_email_176478938423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594917;

    public FsePaymentRequest_FsePaymentRequestBuilder_email_176478938423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term594966 = new ArrayList();
        ((ArrayList) term594966).add("VKPVssVIga");
        ((ArrayList) term594966).add("iskHdVFxha");
        ((ArrayList) term594966).add("eWaksCBVal");
        ((ArrayList) term594966).add("EoJdXAfClg");
        Long term595083 = new Long(4080207137910567677L);
        Class<? extends Object> term595299 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term595298 = ((Class) term595299).getDeclaredField((String) "FLAT");
        ((Field) term595298).setAccessible(true);
        Object enum1117 = ((Field) term595298).get((Object) null);
        Long term595129 = new Long(-4510075168255947133L);
        Class<? extends Object> term595703 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term595702 = ((Class) term595703).getDeclaredField((String) "WEEKLY");
        ((Field) term595702).setAccessible(true);
        Object enum1118 = ((Field) term595702).get((Object) null);
        term594917 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term595030 = newInstance(Class.forName("java.util.Date"));
        Object term595141 = newInstance(Class.forName("java.util.Date"));
        setField(term594917, term594917.getClass(), "memo", "gdTreEAwDY");
        setField(term594917, term594917.getClass(), "fromClassicAddress", "JEuvsJnhAW");
        setField(term594917, term594917.getClass(), "fromSigningPublicKey", "qrIWqPjdov");
        setField(term594917, term594917.getClass(), "fromPrivateKey", "chPkouOrOD");
        setField(term594917, term594917.getClass(), "toClassicAddresses", term594966);
        setField(term594917, term594917.getClass(), "amount", "WazOABAwle");
        setLongField(term595030, term595030.getClass(), "fastTime", 1826373647031L);
        setField(term595030, term595030.getClass(), "cdate", null);
        setField(term594917, term594917.getClass(), "startTime", term595030);
        setField(term594917, term594917.getClass(), "destinationTag", "OQYRpobHXe");
        setField(term594917, term594917.getClass(), "trustlineIssuerClassicAddress", "jcUOVEvSEy");
        setField(term594917, term594917.getClass(), "currencyName", "RvzDiamKiS");
        setBooleanField(term594917, term594917.getClass(), "agreeFee", false);
        setField(term594917, term594917.getClass(), "maxXrpFeePerTransaction", "hFfCZPaDUh");
        setBooleanField(term594917, term594917.getClass(), "globalIdVerified", true);
        setBooleanField(term594917, term594917.getClass(), "useBlacklist", true);
        setField(term594917, term594917.getClass(), "retryOfId", term595083);
        setField(term594917, term594917.getClass(), "paymentType", enum1117);
        setField(term594917, term594917.getClass(), "snapshotTrustlineIssuerClassicAddress", "sroouWPwJV");
        setField(term594917, term594917.getClass(), "snapshotCurrencyName", "WDAdIiHeDJ");
        setField(term594917, term594917.getClass(), "nftIssuingAddress", "eQGvbQZIRc");
        setField(term594917, term594917.getClass(), "nftTaxon", term595129);
        setField(term594917, term594917.getClass(), "frequency", enum1118);
        setLongField(term595141, term595141.getClass(), "fastTime", 1727692077070L);
        setField(term595141, term595141.getClass(), "cdate", null);
        setField(term594917, term594917.getClass(), "repeatUntilDate", term595141);
        setField(term594917, term594917.getClass(), "email", "zWuKRjEfdp");
        setBooleanField(term594917, term594917.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zPSdflqnmk";
        callMethod(klass, "email", argTypes, term594917, args);
    }

};


