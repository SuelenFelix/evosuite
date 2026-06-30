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

public class FsePaymentRequest_FsePaymentRequestBuilder_trustlineIssuerClassicAddress_8979936359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577431;

    public FsePaymentRequest_FsePaymentRequestBuilder_trustlineIssuerClassicAddress_8979936359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term577480 = new ArrayList();
        ((ArrayList) term577480).add("paIiUFEXVG");
        ((ArrayList) term577480).add("RhdoUtwGNW");
        ((ArrayList) term577480).add("TdPikAQSWD");
        ((ArrayList) term577480).add("czyIZPfIiS");
        ((ArrayList) term577480).add("WTSBaHJKIf");
        ((ArrayList) term577480).add("RQXVNnHMfw");
        Long term577621 = new Long(192472706552396960L);
        Class<? extends Object> term577856 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term577855 = ((Class) term577856).getDeclaredField((String) "FLAT");
        ((Field) term577855).setAccessible(true);
        Object enum1088 = ((Field) term577855).get((Object) null);
        Long term577667 = new Long(-3992275333926350693L);
        Class<? extends Object> term578260 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term578259 = ((Class) term578260).getDeclaredField((String) "DAILY");
        ((Field) term578259).setAccessible(true);
        Object enum1089 = ((Field) term578259).get((Object) null);
        term577431 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term577568 = newInstance(Class.forName("java.util.Date"));
        Object term577678 = newInstance(Class.forName("java.util.Date"));
        setField(term577431, term577431.getClass(), "memo", "ysYFcjbmKr");
        setField(term577431, term577431.getClass(), "fromClassicAddress", "ENDtqsidqV");
        setField(term577431, term577431.getClass(), "fromSigningPublicKey", "vAYeBSSlRp");
        setField(term577431, term577431.getClass(), "fromPrivateKey", "pvKNUuBUeT");
        setField(term577431, term577431.getClass(), "toClassicAddresses", term577480);
        setField(term577431, term577431.getClass(), "amount", "HEBNhULneC");
        setLongField(term577568, term577568.getClass(), "fastTime", 1262383286093L);
        setField(term577568, term577568.getClass(), "cdate", null);
        setField(term577431, term577431.getClass(), "startTime", term577568);
        setField(term577431, term577431.getClass(), "destinationTag", "PxUDJOUGKY");
        setField(term577431, term577431.getClass(), "trustlineIssuerClassicAddress", "QHNYCCZevd");
        setField(term577431, term577431.getClass(), "currencyName", "jAMvrvDOhP");
        setBooleanField(term577431, term577431.getClass(), "agreeFee", true);
        setField(term577431, term577431.getClass(), "maxXrpFeePerTransaction", "yrDxYzmHMC");
        setBooleanField(term577431, term577431.getClass(), "globalIdVerified", true);
        setBooleanField(term577431, term577431.getClass(), "useBlacklist", true);
        setField(term577431, term577431.getClass(), "retryOfId", term577621);
        setField(term577431, term577431.getClass(), "paymentType", enum1088);
        setField(term577431, term577431.getClass(), "snapshotTrustlineIssuerClassicAddress", "rDpoPFYXSz");
        setField(term577431, term577431.getClass(), "snapshotCurrencyName", "JwCEdzoMPC");
        setField(term577431, term577431.getClass(), "nftIssuingAddress", "genTuEgRsd");
        setField(term577431, term577431.getClass(), "nftTaxon", term577667);
        setField(term577431, term577431.getClass(), "frequency", enum1089);
        setLongField(term577678, term577678.getClass(), "fastTime", 1583863830545L);
        setField(term577678, term577678.getClass(), "cdate", null);
        setField(term577431, term577431.getClass(), "repeatUntilDate", term577678);
        setField(term577431, term577431.getClass(), "email", "XMgPdlQkhy");
        setBooleanField(term577431, term577431.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FagcUlRRig";
        callMethod(klass, "trustlineIssuerClassicAddress", argTypes, term577431, args);
    }

};


