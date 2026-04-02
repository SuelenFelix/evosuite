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
import java.lang.Integer;

public class AirdropStatus_AirdropStatusBuilder_build_114253505531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551260;

    public AirdropStatus_AirdropStatusBuilder_build_114253505531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term551264 = new Long(-5478680438603251116L);
        Class<? extends Object> term551535 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term551534 = ((Class) term551535).getDeclaredField((String) "QUEUED");
        ((Field) term551534).setAccessible(true);
        Object enum1049 = ((Field) term551534).get((Object) null);
        Object term551263 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term551263, term551263.getClass(), "id", term551264);
        setField(term551263, term551263.getClass(), "responseCode", "");
        setField(term551263, term551263.getClass(), "reason", "");
        setField(term551263, term551263.getClass(), "classicAddress", "");
        setField(term551263, term551263.getClass(), "status", enum1049);
        setField(term551263, term551263.getClass(), "paymentAmount", "");
        setField(term551263, term551263.getClass(), "snapshotBalance", "");
        setField(term551263, term551263.getClass(), "nftOwned", "");
        ArrayList term551261 = new ArrayList();
        ((ArrayList) term551261).add(term551263);
        Long term551276 = new Long(3362279702053141081L);
        Class<? extends Object> term551955 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term551954 = ((Class) term551955).getDeclaredField((String) "ANNUALLY");
        ((Field) term551954).setAccessible(true);
        Object enum1050 = ((Field) term551954).get((Object) null);
        Class<? extends Object> term552351 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term552350 = ((Class) term552351).getDeclaredField((String) "COMPLETE");
        ((Field) term552350).setAccessible(true);
        Object enum1051 = ((Field) term552350).get((Object) null);
        Integer term551372 = new Integer(2009020256);
        Class<? extends Object> term552817 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term552816 = ((Class) term552817).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term552816).setAccessible(true);
        Object enum1052 = ((Field) term552816).get((Object) null);
        Long term551440 = new Long(-58248142535266417L);
        Long term551454 = new Long(370832762515262203L);
        Class<? extends Object> term553282 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term553281 = ((Class) term553282).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term553281).setAccessible(true);
        Object enum1053 = ((Field) term553281).get((Object) null);
        Class<? extends Object> term553720 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term553719 = ((Class) term553720).getDeclaredField((String) "REJECTED");
        ((Field) term553719).setAccessible(true);
        Object enum1054 = ((Field) term553719).get((Object) null);
        Long term551532 = new Long(6931806194311088657L);
        term551260 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term551278 = newInstance(Class.forName("java.util.Date"));
        Object term551280 = newInstance(Class.forName("java.util.Date"));
        Object term551282 = newInstance(Class.forName("java.util.Date"));
        Object term551284 = newInstance(Class.forName("java.util.Date"));
        setField(term551260, term551260.getClass(), "results", term551261);
        setField(term551260, term551260.getClass(), "id", term551276);
        setLongField(term551278, term551278.getClass(), "fastTime", 1403738771775L);
        setField(term551278, term551278.getClass(), "cdate", null);
        setField(term551260, term551260.getClass(), "createDate", term551278);
        setLongField(term551280, term551280.getClass(), "fastTime", 1748634744287L);
        setField(term551280, term551280.getClass(), "cdate", null);
        setField(term551260, term551260.getClass(), "updateDate", term551280);
        setLongField(term551282, term551282.getClass(), "fastTime", 1571669251381L);
        setField(term551282, term551282.getClass(), "cdate", null);
        setField(term551260, term551260.getClass(), "startTime", term551282);
        setLongField(term551284, term551284.getClass(), "fastTime", 1308252636284L);
        setField(term551284, term551284.getClass(), "cdate", null);
        setField(term551260, term551260.getClass(), "repeatUntilDate", term551284);
        setField(term551260, term551260.getClass(), "frequency", enum1050);
        setField(term551260, term551260.getClass(), "status", enum1051);
        setField(term551260, term551260.getClass(), "fromClassicAddress", "spXHUvRLTA");
        setField(term551260, term551260.getClass(), "trustlineIssuerClassicAddress", "wYKOwifIEg");
        setField(term551260, term551260.getClass(), "currencyName", "CmnJlLSyYb");
        setField(term551260, term551260.getClass(), "currencyNameForProcess", "XWfTNLgUUn");
        setField(term551260, term551260.getClass(), "amount", "gsUmKVKOac");
        setBooleanField(term551260, term551260.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term551260, term551260.getClass(), "useBlacklist", false);
        setField(term551260, term551260.getClass(), "maximumTrustlines", term551372);
        setField(term551260, term551260.getClass(), "dropType", enum1052);
        setField(term551260, term551260.getClass(), "failReason", "TXxuyKOVBs");
        setField(term551260, term551260.getClass(), "minBalance", "ZdokwWCVab");
        setField(term551260, term551260.getClass(), "maxBalance", "kHaNkhgOjo");
        setField(term551260, term551260.getClass(), "totalBlacklisted", term551440);
        setField(term551260, term551260.getClass(), "maxXrpFeePerTransaction", "nWDCnQtxKC");
        setField(term551260, term551260.getClass(), "totalRecipients", term551454);
        setField(term551260, term551260.getClass(), "paymentType", enum1053);
        setField(term551260, term551260.getClass(), "snapshotTrustlineIssuerClassicAddress", "uBqCFlJFKn");
        setField(term551260, term551260.getClass(), "snapshotCurrencyName", "CdWGcgAUBN");
        setField(term551260, term551260.getClass(), "nftIssuingAddress", "yShXFHBMjq");
        setField(term551260, term551260.getClass(), "nftTaxon", "PvSoEnEttM");
        setField(term551260, term551260.getClass(), "scheduleStatus", enum1054);
        setField(term551260, term551260.getClass(), "fromScheduleId", term551532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term551260, args);
    }

};


