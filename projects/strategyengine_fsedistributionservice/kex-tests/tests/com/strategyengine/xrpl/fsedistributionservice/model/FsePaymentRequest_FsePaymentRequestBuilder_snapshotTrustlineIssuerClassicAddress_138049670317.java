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

public class FsePaymentRequest_FsePaymentRequestBuilder_snapshotTrustlineIssuerClassicAddress_138049670317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term587177;

    public FsePaymentRequest_FsePaymentRequestBuilder_snapshotTrustlineIssuerClassicAddress_138049670317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term587226 = new ArrayList();
        ((ArrayList) term587226).add("LntssJRTBe");
        ((ArrayList) term587226).add("mniTAjwteh");
        ((ArrayList) term587226).add("lTLrjyvTTD");
        ((ArrayList) term587226).add("gOCHuwsUsW");
        ((ArrayList) term587226).add("RIjCVNuoXk");
        ((ArrayList) term587226).add("zDrkgSuEFM");
        ((ArrayList) term587226).add("bxHnHpzJtk");
        ((ArrayList) term587226).add("FmIJzXarSb");
        Long term587391 = new Long(8084091396945491294L);
        Class<? extends Object> term587654 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term587653 = ((Class) term587654).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term587653).setAccessible(true);
        Object enum1104 = ((Field) term587653).get((Object) null);
        Long term587445 = new Long(-4010221274821200437L);
        Class<? extends Object> term588082 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term588081 = ((Class) term588082).getDeclaredField((String) "DAILY");
        ((Field) term588081).setAccessible(true);
        Object enum1105 = ((Field) term588081).get((Object) null);
        term587177 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term587338 = newInstance(Class.forName("java.util.Date"));
        Object term587456 = newInstance(Class.forName("java.util.Date"));
        setField(term587177, term587177.getClass(), "memo", "iRcITsMQmk");
        setField(term587177, term587177.getClass(), "fromClassicAddress", "KNlBfmVqJG");
        setField(term587177, term587177.getClass(), "fromSigningPublicKey", "UEwBYiCmKK");
        setField(term587177, term587177.getClass(), "fromPrivateKey", "EbRWmGnzKZ");
        setField(term587177, term587177.getClass(), "toClassicAddresses", term587226);
        setField(term587177, term587177.getClass(), "amount", "wSRrIxGcDh");
        setLongField(term587338, term587338.getClass(), "fastTime", 1646029420567L);
        setField(term587338, term587338.getClass(), "cdate", null);
        setField(term587177, term587177.getClass(), "startTime", term587338);
        setField(term587177, term587177.getClass(), "destinationTag", "dpLvGtQJDa");
        setField(term587177, term587177.getClass(), "trustlineIssuerClassicAddress", "DCsMDVAdSD");
        setField(term587177, term587177.getClass(), "currencyName", "xppszvcBqu");
        setBooleanField(term587177, term587177.getClass(), "agreeFee", true);
        setField(term587177, term587177.getClass(), "maxXrpFeePerTransaction", "RoHOfvejXK");
        setBooleanField(term587177, term587177.getClass(), "globalIdVerified", true);
        setBooleanField(term587177, term587177.getClass(), "useBlacklist", false);
        setField(term587177, term587177.getClass(), "retryOfId", term587391);
        setField(term587177, term587177.getClass(), "paymentType", enum1104);
        setField(term587177, term587177.getClass(), "snapshotTrustlineIssuerClassicAddress", "BpWvAHSzgp");
        setField(term587177, term587177.getClass(), "snapshotCurrencyName", "AjaATujJwK");
        setField(term587177, term587177.getClass(), "nftIssuingAddress", "qHFDnDYniJ");
        setField(term587177, term587177.getClass(), "nftTaxon", term587445);
        setField(term587177, term587177.getClass(), "frequency", enum1105);
        setLongField(term587456, term587456.getClass(), "fastTime", 1384525329702L);
        setField(term587456, term587456.getClass(), "cdate", null);
        setField(term587177, term587177.getClass(), "repeatUntilDate", term587456);
        setField(term587177, term587177.getClass(), "email", "MgbYXBxThg");
        setBooleanField(term587177, term587177.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wHcRCOxDfS";
        callMethod(klass, "snapshotTrustlineIssuerClassicAddress", argTypes, term587177, args);
    }

};


