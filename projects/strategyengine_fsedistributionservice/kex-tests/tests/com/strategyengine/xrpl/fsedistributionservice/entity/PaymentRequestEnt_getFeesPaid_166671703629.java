package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;

public class PaymentRequestEnt_getFeesPaid_166671703629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157254;

    public PaymentRequestEnt_getFeesPaid_166671703629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term157255 = new Long(-3565554762799701668L);
        Class<? extends Object> term157568 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term157567 = ((Class) term157568).getDeclaredField((String) "COMPLETE");
        ((Field) term157567).setAccessible(true);
        Object enum280 = ((Field) term157567).get((Object) null);
        Class<? extends Object> term158074 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term158073 = ((Class) term158074).getDeclaredField((String) "FLAT");
        ((Field) term158073).setAccessible(true);
        Object enum281 = ((Field) term158073).get((Object) null);
        Boolean term157415 = new Boolean(false);
        Boolean term157417 = new Boolean(true);
        Integer term157419 = new Integer(-341962980);
        Class<? extends Object> term158448 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term158447 = ((Class) term158448).getDeclaredField((String) "GLOBALID");
        ((Field) term158447).setAccessible(true);
        Object enum282 = ((Field) term158447).get((Object) null);
        Long term157505 = new Long(-6837989212848250735L);
        Long term157519 = new Long(-4231979631084175364L);
        Boolean term157533 = new Boolean(true);
        term157254 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term157281 = newInstance(Class.forName("java.util.Date"));
        Object term157283 = newInstance(Class.forName("java.util.Date"));
        Object term157285 = newInstance(Class.forName("java.util.Date"));
        setField(term157254, term157254.getClass(), "id", term157255);
        setField(term157254, term157254.getClass(), "environment", "RgqpoBknjN");
        setField(term157254, term157254.getClass(), "populateEnvironment", "nUDhadopHE");
        setLongField(term157281, term157281.getClass(), "fastTime", 1529171654860L);
        setField(term157281, term157281.getClass(), "cdate", null);
        setField(term157254, term157254.getClass(), "createDate", term157281);
        setLongField(term157283, term157283.getClass(), "fastTime", 1839714137646L);
        setField(term157283, term157283.getClass(), "cdate", null);
        setField(term157254, term157254.getClass(), "updateDate", term157283);
        setLongField(term157285, term157285.getClass(), "fastTime", 1620297238542L);
        setField(term157285, term157285.getClass(), "cdate", null);
        setField(term157254, term157254.getClass(), "startTime", term157285);
        setField(term157254, term157254.getClass(), "status", enum280);
        setField(term157254, term157254.getClass(), "fromClassicAddress", "vLrTnQTIPg");
        setField(term157254, term157254.getClass(), "fromSigningPublicKey", "GsXvLZCFtf");
        setField(term157254, term157254.getClass(), "fromPrivateKey", "JqSCTBGSUs");
        setField(term157254, term157254.getClass(), "trustlineIssuerClassicAddress", "bZrrPiMnsr");
        setField(term157254, term157254.getClass(), "currencyName", "IeromvfDmz");
        setField(term157254, term157254.getClass(), "snapshotTrustlineIssuerClassicAddress", "xJLHPTRSqe");
        setField(term157254, term157254.getClass(), "snapshotCurrencyName", "OIFZYdbUZz");
        setField(term157254, term157254.getClass(), "currencyNameForProcess", "FPablxseTr");
        setField(term157254, term157254.getClass(), "amount", "wNndrIQDbr");
        setField(term157254, term157254.getClass(), "paymentType", enum281);
        setField(term157254, term157254.getClass(), "newTrustlinesOnly", term157415);
        setField(term157254, term157254.getClass(), "useBlacklist", term157417);
        setField(term157254, term157254.getClass(), "maximumTrustlines", term157419);
        setField(term157254, term157254.getClass(), "dropType", enum282);
        setField(term157254, term157254.getClass(), "lockUuid", "JiSIFtJnYv");
        setField(term157254, term157254.getClass(), "failReason", "wxAHQRVgKc");
        setField(term157254, term157254.getClass(), "feesPaid", "bYsZEHeoeV");
        setField(term157254, term157254.getClass(), "minBalance", "IwvwrQylib");
        setField(term157254, term157254.getClass(), "maxBalance", "ZWJgSttNjg");
        setField(term157254, term157254.getClass(), "maxXrpFeePerTransaction", "LQTIjJLkXH");
        setField(term157254, term157254.getClass(), "retryOfId", term157505);
        setField(term157254, term157254.getClass(), "nftIssuerAddress", "RvkBwedFKx");
        setField(term157254, term157254.getClass(), "nftTaxon", term157519);
        setField(term157254, term157254.getClass(), "contactEmail", "DYzWJljbaE");
        setField(term157254, term157254.getClass(), "autoApprove", term157533);
        setField(term157254, term157254.getClass(), "memo", "idwbHVHUcz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFeesPaid", argTypes, term157254, args);
    }

};


