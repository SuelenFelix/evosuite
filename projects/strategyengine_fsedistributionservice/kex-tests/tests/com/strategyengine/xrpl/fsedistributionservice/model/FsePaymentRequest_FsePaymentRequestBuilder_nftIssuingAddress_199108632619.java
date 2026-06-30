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

public class FsePaymentRequest_FsePaymentRequestBuilder_nftIssuingAddress_199108632619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589811;

    public FsePaymentRequest_FsePaymentRequestBuilder_nftIssuingAddress_199108632619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term589860 = new ArrayList();
        ((ArrayList) term589860).add("ABHmWCUreJ");
        Long term589941 = new Long(-6658692066502742692L);
        Class<? extends Object> term590129 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term590128 = ((Class) term590129).getDeclaredField((String) "FLAT");
        ((Field) term590128).setAccessible(true);
        Object enum1108 = ((Field) term590128).get((Object) null);
        Long term589987 = new Long(7505187196596103566L);
        Class<? extends Object> term590533 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term590532 = ((Class) term590533).getDeclaredField((String) "ANNUALLY");
        ((Field) term590532).setAccessible(true);
        Object enum1109 = ((Field) term590532).get((Object) null);
        term589811 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term589888 = newInstance(Class.forName("java.util.Date"));
        Object term590001 = newInstance(Class.forName("java.util.Date"));
        setField(term589811, term589811.getClass(), "memo", "FEfDieFUtF");
        setField(term589811, term589811.getClass(), "fromClassicAddress", "OvdIsypBPN");
        setField(term589811, term589811.getClass(), "fromSigningPublicKey", "NJNxLsnXOW");
        setField(term589811, term589811.getClass(), "fromPrivateKey", "GwcBHiivYy");
        setField(term589811, term589811.getClass(), "toClassicAddresses", term589860);
        setField(term589811, term589811.getClass(), "amount", "uvkCPATnTh");
        setLongField(term589888, term589888.getClass(), "fastTime", 1694242276408L);
        setField(term589888, term589888.getClass(), "cdate", null);
        setField(term589811, term589811.getClass(), "startTime", term589888);
        setField(term589811, term589811.getClass(), "destinationTag", "ZggbZCwwZM");
        setField(term589811, term589811.getClass(), "trustlineIssuerClassicAddress", "GodVKYIlYA");
        setField(term589811, term589811.getClass(), "currencyName", "eLhOBIiBWR");
        setBooleanField(term589811, term589811.getClass(), "agreeFee", false);
        setField(term589811, term589811.getClass(), "maxXrpFeePerTransaction", "CpvhjniKFZ");
        setBooleanField(term589811, term589811.getClass(), "globalIdVerified", true);
        setBooleanField(term589811, term589811.getClass(), "useBlacklist", true);
        setField(term589811, term589811.getClass(), "retryOfId", term589941);
        setField(term589811, term589811.getClass(), "paymentType", enum1108);
        setField(term589811, term589811.getClass(), "snapshotTrustlineIssuerClassicAddress", "nantHBTafl");
        setField(term589811, term589811.getClass(), "snapshotCurrencyName", "IplLGmulHb");
        setField(term589811, term589811.getClass(), "nftIssuingAddress", "IOOirhBOLW");
        setField(term589811, term589811.getClass(), "nftTaxon", term589987);
        setField(term589811, term589811.getClass(), "frequency", enum1109);
        setLongField(term590001, term590001.getClass(), "fastTime", 1368131286404L);
        setField(term590001, term590001.getClass(), "cdate", null);
        setField(term589811, term589811.getClass(), "repeatUntilDate", term590001);
        setField(term589811, term589811.getClass(), "email", "bpwHwZXzto");
        setBooleanField(term589811, term589811.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hBdHvULiAU";
        callMethod(klass, "nftIssuingAddress", argTypes, term589811, args);
    }

};


