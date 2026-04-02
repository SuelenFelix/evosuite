package com.strategyengine.xrpl.fsedistributionservice.service.impl;

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
import static com.strategyengine.xrpl.fsedistributionservice.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;

public class AirDropSchedulerImpl_runSchedule_5830106553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16934;
     Object term16978;

    public AirDropSchedulerImpl_runSchedule_5830106553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16935 = new Long(-1468719814009985452L);
        Class<? extends Object> term17293 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term17292 = ((Class) term17293).getDeclaredField((String) "MONTHLY");
        ((Field) term17292).setAccessible(true);
        Object enum29 = ((Field) term17292).get((Object) null);
        Class<? extends Object> term17696 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term17695 = ((Class) term17696).getDeclaredField((String) "REJECTED");
        ((Field) term17695).setAccessible(true);
        Object enum30 = ((Field) term17695).get((Object) null);
        Long term16976 = new Long(-7738503207562305297L);
        term16934 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term16948 = newInstance(Class.forName("java.util.Date"));
        Object term16950 = newInstance(Class.forName("java.util.Date"));
        setField(term16934, term16934.getClass(), "id", term16935);
        setField(term16934, term16934.getClass(), "frequency", enum29);
        setLongField(term16948, term16948.getClass(), "fastTime", 1311560117361L);
        setField(term16948, term16948.getClass(), "cdate", null);
        setField(term16934, term16934.getClass(), "repeatUntilDate", term16948);
        setLongField(term16950, term16950.getClass(), "fastTime", 1595517583842L);
        setField(term16950, term16950.getClass(), "cdate", null);
        setField(term16934, term16934.getClass(), "createDate", term16950);
        setField(term16934, term16934.getClass(), "lockUuid", "ShIELyuULw");
        setField(term16934, term16934.getClass(), "dropScheduleStatus", enum30);
        setField(term16934, term16934.getClass(), "dropRequestId", term16976);
        Long term16979 = new Long(3825396310311739952L);
        Class<? extends Object> term18137 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term18136 = ((Class) term18137).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term18136).setAccessible(true);
        Object enum31 = ((Field) term18136).get((Object) null);
        Class<? extends Object> term18679 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term18678 = ((Class) term18679).getDeclaredField((String) "FLAT");
        ((Field) term18678).setAccessible(true);
        Object enum32 = ((Field) term18678).get((Object) null);
        Boolean term17151 = new Boolean(false);
        Boolean term17153 = new Boolean(true);
        Integer term17155 = new Integer(1134449235);
        Class<? extends Object> term19053 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term19052 = ((Class) term19053).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term19052).setAccessible(true);
        Object enum33 = ((Field) term19052).get((Object) null);
        Long term17250 = new Long(-3838084482494604218L);
        Long term17264 = new Long(3892018155439224435L);
        Boolean term17278 = new Boolean(true);
        term16978 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term17005 = newInstance(Class.forName("java.util.Date"));
        Object term17007 = newInstance(Class.forName("java.util.Date"));
        Object term17009 = newInstance(Class.forName("java.util.Date"));
        setField(term16978, term16978.getClass(), "id", term16979);
        setField(term16978, term16978.getClass(), "environment", "IpQuOGMgmj");
        setField(term16978, term16978.getClass(), "populateEnvironment", "pJbnHTYrxn");
        setLongField(term17005, term17005.getClass(), "fastTime", 1464421789888L);
        setField(term17005, term17005.getClass(), "cdate", null);
        setField(term16978, term16978.getClass(), "createDate", term17005);
        setLongField(term17007, term17007.getClass(), "fastTime", 1405279189488L);
        setField(term17007, term17007.getClass(), "cdate", null);
        setField(term16978, term16978.getClass(), "updateDate", term17007);
        setLongField(term17009, term17009.getClass(), "fastTime", 1822704644050L);
        setField(term17009, term17009.getClass(), "cdate", null);
        setField(term16978, term16978.getClass(), "startTime", term17009);
        setField(term16978, term16978.getClass(), "status", enum31);
        setField(term16978, term16978.getClass(), "fromClassicAddress", "iIRsCSYqXH");
        setField(term16978, term16978.getClass(), "fromSigningPublicKey", "nghfqDXyCG");
        setField(term16978, term16978.getClass(), "fromPrivateKey", "WBAOTqErtm");
        setField(term16978, term16978.getClass(), "trustlineIssuerClassicAddress", "PqtVXXZMqK");
        setField(term16978, term16978.getClass(), "currencyName", "rYbtIDVdnd");
        setField(term16978, term16978.getClass(), "snapshotTrustlineIssuerClassicAddress", "UKAReurpHG");
        setField(term16978, term16978.getClass(), "snapshotCurrencyName", "WVRMUmrljA");
        setField(term16978, term16978.getClass(), "currencyNameForProcess", "NTlKJDDWlk");
        setField(term16978, term16978.getClass(), "amount", "vOuMEpOQAg");
        setField(term16978, term16978.getClass(), "paymentType", enum32);
        setField(term16978, term16978.getClass(), "newTrustlinesOnly", term17151);
        setField(term16978, term16978.getClass(), "useBlacklist", term17153);
        setField(term16978, term16978.getClass(), "maximumTrustlines", term17155);
        setField(term16978, term16978.getClass(), "dropType", enum33);
        setField(term16978, term16978.getClass(), "lockUuid", "SIODFGaQhr");
        setField(term16978, term16978.getClass(), "failReason", "qYzsiuXOgS");
        setField(term16978, term16978.getClass(), "feesPaid", "bxrCBbrrct");
        setField(term16978, term16978.getClass(), "minBalance", "CKWpJaaaxX");
        setField(term16978, term16978.getClass(), "maxBalance", "UBRmXJmfrt");
        setField(term16978, term16978.getClass(), "maxXrpFeePerTransaction", "WZzvmIHhzZ");
        setField(term16978, term16978.getClass(), "retryOfId", term17250);
        setField(term16978, term16978.getClass(), "nftIssuerAddress", "doQLHkjpNm");
        setField(term16978, term16978.getClass(), "nftTaxon", term17264);
        setField(term16978, term16978.getClass(), "contactEmail", "lCyLIcSuom");
        setField(term16978, term16978.getClass(), "autoApprove", term17278);
        setField(term16978, term16978.getClass(), "memo", "CGOpQSZZwI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.AirDropSchedulerImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        argTypes[1] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Object[] args = new Object[2];
        args[0] = term16934;
        args[1] = term16978;
        callMethod(klass, "runSchedule", argTypes, null, args);
    }

};


