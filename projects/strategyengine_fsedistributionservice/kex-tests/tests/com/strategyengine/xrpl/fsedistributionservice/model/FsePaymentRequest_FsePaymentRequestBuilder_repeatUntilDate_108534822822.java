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

public class FsePaymentRequest_FsePaymentRequestBuilder_repeatUntilDate_108534822822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term593812;
     Object term594014;

    public FsePaymentRequest_FsePaymentRequestBuilder_repeatUntilDate_108534822822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term593861 = new ArrayList();
        ((ArrayList) term593861).add("eDVTORBely");
        Long term593942 = new Long(2739809214146796829L);
        Class<? extends Object> term594117 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term594116 = ((Class) term594117).getDeclaredField((String) "FLAT");
        ((Field) term594116).setAccessible(true);
        Object enum1115 = ((Field) term594116).get((Object) null);
        Long term593988 = new Long(-7518786238963096989L);
        Class<? extends Object> term594521 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term594520 = ((Class) term594521).getDeclaredField((String) "DAILY");
        ((Field) term594520).setAccessible(true);
        Object enum1116 = ((Field) term594520).get((Object) null);
        term593812 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term593889 = newInstance(Class.forName("java.util.Date"));
        Object term593999 = newInstance(Class.forName("java.util.Date"));
        setField(term593812, term593812.getClass(), "memo", "zVemyNDAME");
        setField(term593812, term593812.getClass(), "fromClassicAddress", "wTfSVITNMz");
        setField(term593812, term593812.getClass(), "fromSigningPublicKey", "pNYXsbHfzE");
        setField(term593812, term593812.getClass(), "fromPrivateKey", "DWQRVUVtua");
        setField(term593812, term593812.getClass(), "toClassicAddresses", term593861);
        setField(term593812, term593812.getClass(), "amount", "AoncmgwbVO");
        setLongField(term593889, term593889.getClass(), "fastTime", 1551351002610L);
        setField(term593889, term593889.getClass(), "cdate", null);
        setField(term593812, term593812.getClass(), "startTime", term593889);
        setField(term593812, term593812.getClass(), "destinationTag", "RDNNYsIlUn");
        setField(term593812, term593812.getClass(), "trustlineIssuerClassicAddress", "bLadkkAEee");
        setField(term593812, term593812.getClass(), "currencyName", "wYWbALYzmk");
        setBooleanField(term593812, term593812.getClass(), "agreeFee", false);
        setField(term593812, term593812.getClass(), "maxXrpFeePerTransaction", "OlbnRaLyPO");
        setBooleanField(term593812, term593812.getClass(), "globalIdVerified", false);
        setBooleanField(term593812, term593812.getClass(), "useBlacklist", false);
        setField(term593812, term593812.getClass(), "retryOfId", term593942);
        setField(term593812, term593812.getClass(), "paymentType", enum1115);
        setField(term593812, term593812.getClass(), "snapshotTrustlineIssuerClassicAddress", "goQZKOBhTr");
        setField(term593812, term593812.getClass(), "snapshotCurrencyName", "eaDGkLMDMl");
        setField(term593812, term593812.getClass(), "nftIssuingAddress", "dfvKtdkmjZ");
        setField(term593812, term593812.getClass(), "nftTaxon", term593988);
        setField(term593812, term593812.getClass(), "frequency", enum1116);
        setLongField(term593999, term593999.getClass(), "fastTime", 1486535653047L);
        setField(term593999, term593999.getClass(), "cdate", null);
        setField(term593812, term593812.getClass(), "repeatUntilDate", term593999);
        setField(term593812, term593812.getClass(), "email", "XOFlovlfIj");
        setBooleanField(term593812, term593812.getClass(), "autoApprove", false);
        term594014 = newInstance(Class.forName("java.util.Date"));
        setLongField(term594014, term594014.getClass(), "fastTime", 1797208409759L);
        setField(term594014, term594014.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term594014;
        callMethod(klass, "repeatUntilDate", argTypes, term593812, args);
    }

};


