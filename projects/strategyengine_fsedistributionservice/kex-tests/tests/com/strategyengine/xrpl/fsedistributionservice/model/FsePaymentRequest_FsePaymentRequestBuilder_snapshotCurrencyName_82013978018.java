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

public class FsePaymentRequest_FsePaymentRequestBuilder_snapshotCurrencyName_82013978018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term588488;

    public FsePaymentRequest_FsePaymentRequestBuilder_snapshotCurrencyName_82013978018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term588537 = new ArrayList();
        ((ArrayList) term588537).add("trzXXmqsss");
        ((ArrayList) term588537).add("HWcsZwHzBJ");
        ((ArrayList) term588537).add("IXfEZVfVbn");
        ((ArrayList) term588537).add("ibOPAeVaEy");
        ((ArrayList) term588537).add("UQFCGhBwRP");
        ((ArrayList) term588537).add("IKUCiyluwb");
        ((ArrayList) term588537).add("OIVvPvythq");
        ((ArrayList) term588537).add("OIRXQPPjVx");
        Long term588702 = new Long(802806007271882853L);
        Class<? extends Object> term588968 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term588967 = ((Class) term588968).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term588967).setAccessible(true);
        Object enum1106 = ((Field) term588967).get((Object) null);
        Long term588756 = new Long(-687030958964015701L);
        Class<? extends Object> term589396 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term589395 = ((Class) term589396).getDeclaredField((String) "ANNUALLY");
        ((Field) term589395).setAccessible(true);
        Object enum1107 = ((Field) term589395).get((Object) null);
        term588488 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term588649 = newInstance(Class.forName("java.util.Date"));
        Object term588770 = newInstance(Class.forName("java.util.Date"));
        setField(term588488, term588488.getClass(), "memo", "aLuLvKQrgt");
        setField(term588488, term588488.getClass(), "fromClassicAddress", "qAoVvEtxnE");
        setField(term588488, term588488.getClass(), "fromSigningPublicKey", "rXhHWXIrYT");
        setField(term588488, term588488.getClass(), "fromPrivateKey", "xScYUuGKsX");
        setField(term588488, term588488.getClass(), "toClassicAddresses", term588537);
        setField(term588488, term588488.getClass(), "amount", "SxVFmiOidb");
        setLongField(term588649, term588649.getClass(), "fastTime", 1781949627132L);
        setField(term588649, term588649.getClass(), "cdate", null);
        setField(term588488, term588488.getClass(), "startTime", term588649);
        setField(term588488, term588488.getClass(), "destinationTag", "BsiZGiodQR");
        setField(term588488, term588488.getClass(), "trustlineIssuerClassicAddress", "oJyzXrwmfx");
        setField(term588488, term588488.getClass(), "currencyName", "RsEXdKLcXN");
        setBooleanField(term588488, term588488.getClass(), "agreeFee", true);
        setField(term588488, term588488.getClass(), "maxXrpFeePerTransaction", "zoOFEvSdRU");
        setBooleanField(term588488, term588488.getClass(), "globalIdVerified", false);
        setBooleanField(term588488, term588488.getClass(), "useBlacklist", false);
        setField(term588488, term588488.getClass(), "retryOfId", term588702);
        setField(term588488, term588488.getClass(), "paymentType", enum1106);
        setField(term588488, term588488.getClass(), "snapshotTrustlineIssuerClassicAddress", "WtywQPTOaF");
        setField(term588488, term588488.getClass(), "snapshotCurrencyName", "MZMkZoDeKG");
        setField(term588488, term588488.getClass(), "nftIssuingAddress", "JWhhCdUerg");
        setField(term588488, term588488.getClass(), "nftTaxon", term588756);
        setField(term588488, term588488.getClass(), "frequency", enum1107);
        setLongField(term588770, term588770.getClass(), "fastTime", 1512061126045L);
        setField(term588770, term588770.getClass(), "cdate", null);
        setField(term588488, term588488.getClass(), "repeatUntilDate", term588770);
        setField(term588488, term588488.getClass(), "email", "DrlBWOScgm");
        setBooleanField(term588488, term588488.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dOAfAvZzvo";
        callMethod(klass, "snapshotCurrencyName", argTypes, term588488, args);
    }

};


