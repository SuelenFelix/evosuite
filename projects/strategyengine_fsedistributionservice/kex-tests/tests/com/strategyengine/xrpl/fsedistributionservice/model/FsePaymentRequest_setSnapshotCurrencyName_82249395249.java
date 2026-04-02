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

public class FsePaymentRequest_setSnapshotCurrencyName_82249395249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397343;

    public FsePaymentRequest_setSnapshotCurrencyName_82249395249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term397392 = new ArrayList();
        ((ArrayList) term397392).add("nQDlUMxGwc");
        ((ArrayList) term397392).add("adgVBSiHOd");
        ((ArrayList) term397392).add("SSEKRIzBwD");
        ((ArrayList) term397392).add("iSuupCvDam");
        ((ArrayList) term397392).add("zPtmrCAbir");
        ((ArrayList) term397392).add("FaTbxTPeSR");
        Long term397533 = new Long(3378211908158042365L);
        Class<? extends Object> term397776 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term397775 = ((Class) term397776).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term397775).setAccessible(true);
        Object enum758 = ((Field) term397775).get((Object) null);
        Long term397587 = new Long(3218173944566395082L);
        Class<? extends Object> term398204 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term398203 = ((Class) term398204).getDeclaredField((String) "DAILY");
        ((Field) term398203).setAccessible(true);
        Object enum759 = ((Field) term398203).get((Object) null);
        term397343 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term397480 = newInstance(Class.forName("java.util.Date"));
        Object term397598 = newInstance(Class.forName("java.util.Date"));
        setField(term397343, term397343.getClass(), "memo", "EGsujTXNCu");
        setField(term397343, term397343.getClass(), "fromClassicAddress", "pfrtjBCFrk");
        setField(term397343, term397343.getClass(), "fromSigningPublicKey", "sFgyedFOUM");
        setField(term397343, term397343.getClass(), "fromPrivateKey", "baBRmilHAC");
        setField(term397343, term397343.getClass(), "toClassicAddresses", term397392);
        setField(term397343, term397343.getClass(), "amount", "HKRRRQtvMb");
        setLongField(term397480, term397480.getClass(), "fastTime", 1364225729610L);
        setField(term397480, term397480.getClass(), "cdate", null);
        setField(term397343, term397343.getClass(), "startTime", term397480);
        setField(term397343, term397343.getClass(), "destinationTag", "wuZEtbkYrI");
        setField(term397343, term397343.getClass(), "trustlineIssuerClassicAddress", "gElIMGFvDS");
        setField(term397343, term397343.getClass(), "currencyName", "oIvcBKuKqH");
        setBooleanField(term397343, term397343.getClass(), "agreeFee", false);
        setField(term397343, term397343.getClass(), "maxXrpFeePerTransaction", "yDkikWBBIM");
        setBooleanField(term397343, term397343.getClass(), "globalIdVerified", false);
        setBooleanField(term397343, term397343.getClass(), "useBlacklist", false);
        setField(term397343, term397343.getClass(), "retryOfId", term397533);
        setField(term397343, term397343.getClass(), "paymentType", enum758);
        setField(term397343, term397343.getClass(), "snapshotTrustlineIssuerClassicAddress", "xLTcGnxYWE");
        setField(term397343, term397343.getClass(), "snapshotCurrencyName", "hmYaQPeKbh");
        setField(term397343, term397343.getClass(), "nftIssuingAddress", "VrqXOdDIyj");
        setField(term397343, term397343.getClass(), "nftTaxon", term397587);
        setField(term397343, term397343.getClass(), "frequency", enum759);
        setLongField(term397598, term397598.getClass(), "fastTime", 1430073629860L);
        setField(term397598, term397598.getClass(), "cdate", null);
        setField(term397343, term397343.getClass(), "repeatUntilDate", term397598);
        setField(term397343, term397343.getClass(), "email", "WNySrtxINV");
        setBooleanField(term397343, term397343.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OfmZCJNUTR";
        callMethod(klass, "setSnapshotCurrencyName", argTypes, term397343, args);
    }

};


