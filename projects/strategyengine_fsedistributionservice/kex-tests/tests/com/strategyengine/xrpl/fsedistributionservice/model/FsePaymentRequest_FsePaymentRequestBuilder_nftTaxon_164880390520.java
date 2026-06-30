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

public class FsePaymentRequest_FsePaymentRequestBuilder_nftTaxon_164880390520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590948;
     Object term591158;

    public FsePaymentRequest_FsePaymentRequestBuilder_nftTaxon_164880390520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term590997 = new ArrayList();
        ((ArrayList) term590997).add("JHBwnopNQH");
        Long term591078 = new Long(3827525335107462030L);
        Class<? extends Object> term591261 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term591260 = ((Class) term591261).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term591260).setAccessible(true);
        Object enum1110 = ((Field) term591260).get((Object) null);
        Long term591132 = new Long(-6895327543559831172L);
        Class<? extends Object> term591689 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term591688 = ((Class) term591689).getDeclaredField((String) "DAILY");
        ((Field) term591688).setAccessible(true);
        Object enum1111 = ((Field) term591688).get((Object) null);
        term590948 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term591025 = newInstance(Class.forName("java.util.Date"));
        Object term591143 = newInstance(Class.forName("java.util.Date"));
        setField(term590948, term590948.getClass(), "memo", "pmzpdxYYOU");
        setField(term590948, term590948.getClass(), "fromClassicAddress", "eJfrlkUQVR");
        setField(term590948, term590948.getClass(), "fromSigningPublicKey", "WKzneVTyGD");
        setField(term590948, term590948.getClass(), "fromPrivateKey", "AplzVucnst");
        setField(term590948, term590948.getClass(), "toClassicAddresses", term590997);
        setField(term590948, term590948.getClass(), "amount", "ErpzGWArqi");
        setLongField(term591025, term591025.getClass(), "fastTime", 1688288149236L);
        setField(term591025, term591025.getClass(), "cdate", null);
        setField(term590948, term590948.getClass(), "startTime", term591025);
        setField(term590948, term590948.getClass(), "destinationTag", "QyJzVdCezt");
        setField(term590948, term590948.getClass(), "trustlineIssuerClassicAddress", "HKOxwCgErb");
        setField(term590948, term590948.getClass(), "currencyName", "rFFShpdqSC");
        setBooleanField(term590948, term590948.getClass(), "agreeFee", false);
        setField(term590948, term590948.getClass(), "maxXrpFeePerTransaction", "zEVAHUMUrR");
        setBooleanField(term590948, term590948.getClass(), "globalIdVerified", true);
        setBooleanField(term590948, term590948.getClass(), "useBlacklist", true);
        setField(term590948, term590948.getClass(), "retryOfId", term591078);
        setField(term590948, term590948.getClass(), "paymentType", enum1110);
        setField(term590948, term590948.getClass(), "snapshotTrustlineIssuerClassicAddress", "KireOddAuf");
        setField(term590948, term590948.getClass(), "snapshotCurrencyName", "ZAmXAZjSoT");
        setField(term590948, term590948.getClass(), "nftIssuingAddress", "FMjzxMmDXl");
        setField(term590948, term590948.getClass(), "nftTaxon", term591132);
        setField(term590948, term590948.getClass(), "frequency", enum1111);
        setLongField(term591143, term591143.getClass(), "fastTime", 1885982455319L);
        setField(term591143, term591143.getClass(), "cdate", null);
        setField(term590948, term590948.getClass(), "repeatUntilDate", term591143);
        setField(term590948, term590948.getClass(), "email", "YqccKZsgWh");
        setBooleanField(term590948, term590948.getClass(), "autoApprove", true);
        term591158 = new Long(475216242691154379L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term591158;
        callMethod(klass, "nftTaxon", argTypes, term590948, args);
    }

};


