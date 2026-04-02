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

public class FsePaymentRequest_getSnapshotCurrencyName_69468804023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366871;

    public FsePaymentRequest_getSnapshotCurrencyName_69468804023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term366920 = new ArrayList();
        ((ArrayList) term366920).add("uOHvCJYPTG");
        ((ArrayList) term366920).add("IimwlXiyhC");
        ((ArrayList) term366920).add("cLFbviuWen");
        ((ArrayList) term366920).add("rKrakRVVmh");
        ((ArrayList) term366920).add("aUMRfSqoGb");
        Long term367049 = new Long(-4845114630136242760L);
        Class<? extends Object> term367272 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term367271 = ((Class) term367272).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term367271).setAccessible(true);
        Object enum708 = ((Field) term367271).get((Object) null);
        Long term367103 = new Long(-1224346442914356241L);
        Class<? extends Object> term367700 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term367699 = ((Class) term367700).getDeclaredField((String) "MONTHLY");
        ((Field) term367699).setAccessible(true);
        Object enum709 = ((Field) term367699).get((Object) null);
        term366871 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term366996 = newInstance(Class.forName("java.util.Date"));
        Object term367116 = newInstance(Class.forName("java.util.Date"));
        setField(term366871, term366871.getClass(), "memo", "zqDSyUKoPF");
        setField(term366871, term366871.getClass(), "fromClassicAddress", "gQkofIQlsj");
        setField(term366871, term366871.getClass(), "fromSigningPublicKey", "mXgXrambAc");
        setField(term366871, term366871.getClass(), "fromPrivateKey", "UlUhWNmCda");
        setField(term366871, term366871.getClass(), "toClassicAddresses", term366920);
        setField(term366871, term366871.getClass(), "amount", "VSThdiTljf");
        setLongField(term366996, term366996.getClass(), "fastTime", 1592630701241L);
        setField(term366996, term366996.getClass(), "cdate", null);
        setField(term366871, term366871.getClass(), "startTime", term366996);
        setField(term366871, term366871.getClass(), "destinationTag", "ZaRASloEFw");
        setField(term366871, term366871.getClass(), "trustlineIssuerClassicAddress", "oGYdkSuAyc");
        setField(term366871, term366871.getClass(), "currencyName", "exGygfXarC");
        setBooleanField(term366871, term366871.getClass(), "agreeFee", true);
        setField(term366871, term366871.getClass(), "maxXrpFeePerTransaction", "uScAgvbMiS");
        setBooleanField(term366871, term366871.getClass(), "globalIdVerified", false);
        setBooleanField(term366871, term366871.getClass(), "useBlacklist", false);
        setField(term366871, term366871.getClass(), "retryOfId", term367049);
        setField(term366871, term366871.getClass(), "paymentType", enum708);
        setField(term366871, term366871.getClass(), "snapshotTrustlineIssuerClassicAddress", "FHcxNfrPHq");
        setField(term366871, term366871.getClass(), "snapshotCurrencyName", "cjtsTbsYoC");
        setField(term366871, term366871.getClass(), "nftIssuingAddress", "VtSabsmozV");
        setField(term366871, term366871.getClass(), "nftTaxon", term367103);
        setField(term366871, term366871.getClass(), "frequency", enum709);
        setLongField(term367116, term367116.getClass(), "fastTime", 1392689921510L);
        setField(term367116, term367116.getClass(), "cdate", null);
        setField(term366871, term366871.getClass(), "repeatUntilDate", term367116);
        setField(term366871, term366871.getClass(), "email", "bCGOIIJoRc");
        setBooleanField(term366871, term366871.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSnapshotCurrencyName", argTypes, term366871, args);
    }

};


