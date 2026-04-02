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

public class FsePaymentRequest_getTrustlineIssuerClassicAddress_209159849914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355782;

    public FsePaymentRequest_getTrustlineIssuerClassicAddress_209159849914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term355831 = new ArrayList();
        ((ArrayList) term355831).add("HMBJcDndyB");
        ((ArrayList) term355831).add("RtVzHDrrjO");
        ((ArrayList) term355831).add("fdbVEWBAEN");
        ((ArrayList) term355831).add("FDVpQPnYQq");
        ((ArrayList) term355831).add("LxfTRMmGto");
        ((ArrayList) term355831).add("HuJkboXrCO");
        ((ArrayList) term355831).add("RJAyzmKzwh");
        Long term355984 = new Long(-2356977949142999853L);
        Class<? extends Object> term356217 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term356216 = ((Class) term356217).getDeclaredField((String) "FLAT");
        ((Field) term356216).setAccessible(true);
        Object enum690 = ((Field) term356216).get((Object) null);
        Long term356030 = new Long(3410627884495049043L);
        Class<? extends Object> term356621 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term356620 = ((Class) term356621).getDeclaredField((String) "DAILY");
        ((Field) term356620).setAccessible(true);
        Object enum691 = ((Field) term356620).get((Object) null);
        term355782 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term355931 = newInstance(Class.forName("java.util.Date"));
        Object term356041 = newInstance(Class.forName("java.util.Date"));
        setField(term355782, term355782.getClass(), "memo", "PXbTEdLdxv");
        setField(term355782, term355782.getClass(), "fromClassicAddress", "sAQnfpCFaF");
        setField(term355782, term355782.getClass(), "fromSigningPublicKey", "SDTnklEgzd");
        setField(term355782, term355782.getClass(), "fromPrivateKey", "fxTJBYpJaC");
        setField(term355782, term355782.getClass(), "toClassicAddresses", term355831);
        setField(term355782, term355782.getClass(), "amount", "iNCbdkYTDl");
        setLongField(term355931, term355931.getClass(), "fastTime", 1399392665119L);
        setField(term355931, term355931.getClass(), "cdate", null);
        setField(term355782, term355782.getClass(), "startTime", term355931);
        setField(term355782, term355782.getClass(), "destinationTag", "SiUnHhtIma");
        setField(term355782, term355782.getClass(), "trustlineIssuerClassicAddress", "NsYgklKfzx");
        setField(term355782, term355782.getClass(), "currencyName", "pHObueqsTM");
        setBooleanField(term355782, term355782.getClass(), "agreeFee", false);
        setField(term355782, term355782.getClass(), "maxXrpFeePerTransaction", "SuIvJHXNjM");
        setBooleanField(term355782, term355782.getClass(), "globalIdVerified", false);
        setBooleanField(term355782, term355782.getClass(), "useBlacklist", true);
        setField(term355782, term355782.getClass(), "retryOfId", term355984);
        setField(term355782, term355782.getClass(), "paymentType", enum690);
        setField(term355782, term355782.getClass(), "snapshotTrustlineIssuerClassicAddress", "VuWKhMTuCU");
        setField(term355782, term355782.getClass(), "snapshotCurrencyName", "yQMOLysaDu");
        setField(term355782, term355782.getClass(), "nftIssuingAddress", "LfzDNXLOPk");
        setField(term355782, term355782.getClass(), "nftTaxon", term356030);
        setField(term355782, term355782.getClass(), "frequency", enum691);
        setLongField(term356041, term356041.getClass(), "fastTime", 1677431024970L);
        setField(term356041, term356041.getClass(), "cdate", null);
        setField(term355782, term355782.getClass(), "repeatUntilDate", term356041);
        setField(term355782, term355782.getClass(), "email", "QwuwAVnPfr");
        setBooleanField(term355782, term355782.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrustlineIssuerClassicAddress", argTypes, term355782, args);
    }

};


