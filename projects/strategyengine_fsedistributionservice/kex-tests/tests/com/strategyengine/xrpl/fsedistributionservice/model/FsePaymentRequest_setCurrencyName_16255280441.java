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

public class FsePaymentRequest_setCurrencyName_16255280441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387811;

    public FsePaymentRequest_setCurrencyName_16255280441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term387860 = new ArrayList();
        ((ArrayList) term387860).add("QILsXlghVH");
        ((ArrayList) term387860).add("ZwsOKRbvqL");
        ((ArrayList) term387860).add("ibDeOdRRgF");
        ((ArrayList) term387860).add("GZHQxpfdwW");
        ((ArrayList) term387860).add("KydKnxKwCI");
        ((ArrayList) term387860).add("pLrznbdlTH");
        ((ArrayList) term387860).add("vhcRHSsYXX");
        ((ArrayList) term387860).add("BkCNDLLIHK");
        Long term388025 = new Long(1006339275456792418L);
        Class<? extends Object> term388280 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term388279 = ((Class) term388280).getDeclaredField((String) "FLAT");
        ((Field) term388279).setAccessible(true);
        Object enum742 = ((Field) term388279).get((Object) null);
        Long term388071 = new Long(7170045607484390400L);
        Class<? extends Object> term388684 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term388683 = ((Class) term388684).getDeclaredField((String) "DAILY");
        ((Field) term388683).setAccessible(true);
        Object enum743 = ((Field) term388683).get((Object) null);
        term387811 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term387972 = newInstance(Class.forName("java.util.Date"));
        Object term388082 = newInstance(Class.forName("java.util.Date"));
        setField(term387811, term387811.getClass(), "memo", "KrVIKgzory");
        setField(term387811, term387811.getClass(), "fromClassicAddress", "qbjbrJOfMv");
        setField(term387811, term387811.getClass(), "fromSigningPublicKey", "pSbFsaLGKa");
        setField(term387811, term387811.getClass(), "fromPrivateKey", "BEGlTJryje");
        setField(term387811, term387811.getClass(), "toClassicAddresses", term387860);
        setField(term387811, term387811.getClass(), "amount", "cgWCmtFNJm");
        setLongField(term387972, term387972.getClass(), "fastTime", 1550008999864L);
        setField(term387972, term387972.getClass(), "cdate", null);
        setField(term387811, term387811.getClass(), "startTime", term387972);
        setField(term387811, term387811.getClass(), "destinationTag", "WIsbZqIWhg");
        setField(term387811, term387811.getClass(), "trustlineIssuerClassicAddress", "yYeRbmHOzO");
        setField(term387811, term387811.getClass(), "currencyName", "QWidkErWlO");
        setBooleanField(term387811, term387811.getClass(), "agreeFee", false);
        setField(term387811, term387811.getClass(), "maxXrpFeePerTransaction", "RxhCxLcgzV");
        setBooleanField(term387811, term387811.getClass(), "globalIdVerified", false);
        setBooleanField(term387811, term387811.getClass(), "useBlacklist", true);
        setField(term387811, term387811.getClass(), "retryOfId", term388025);
        setField(term387811, term387811.getClass(), "paymentType", enum742);
        setField(term387811, term387811.getClass(), "snapshotTrustlineIssuerClassicAddress", "EaqEGPjbqc");
        setField(term387811, term387811.getClass(), "snapshotCurrencyName", "IMHaqqAGpx");
        setField(term387811, term387811.getClass(), "nftIssuingAddress", "PeSINYIETy");
        setField(term387811, term387811.getClass(), "nftTaxon", term388071);
        setField(term387811, term387811.getClass(), "frequency", enum743);
        setLongField(term388082, term388082.getClass(), "fastTime", 1716987585436L);
        setField(term388082, term388082.getClass(), "cdate", null);
        setField(term387811, term387811.getClass(), "repeatUntilDate", term388082);
        setField(term387811, term387811.getClass(), "email", "KBvcQOXstq");
        setBooleanField(term387811, term387811.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nbGeKYlTwW";
        callMethod(klass, "setCurrencyName", argTypes, term387811, args);
    }

};


