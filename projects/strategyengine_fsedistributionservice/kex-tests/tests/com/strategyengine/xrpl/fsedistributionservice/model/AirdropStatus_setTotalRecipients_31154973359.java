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

public class AirdropStatus_setTotalRecipients_31154973359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284098;
     Object term284404;

    public AirdropStatus_setTotalRecipients_31154973359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term284102 = new Long(-927624000067769617L);
        Class<? extends Object> term284407 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term284406 = ((Class) term284407).getDeclaredField((String) "SENDING");
        ((Field) term284406).setAccessible(true);
        Object enum572 = ((Field) term284406).get((Object) null);
        Object term284101 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term284101, term284101.getClass(), "id", term284102);
        setField(term284101, term284101.getClass(), "responseCode", "");
        setField(term284101, term284101.getClass(), "reason", "");
        setField(term284101, term284101.getClass(), "classicAddress", "");
        setField(term284101, term284101.getClass(), "status", enum572);
        setField(term284101, term284101.getClass(), "paymentAmount", "");
        setField(term284101, term284101.getClass(), "snapshotBalance", "");
        setField(term284101, term284101.getClass(), "nftOwned", "");
        Long term284113 = new Long(2978561187278004830L);
        Object term284112 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term284112, term284112.getClass(), "id", term284113);
        setField(term284112, term284112.getClass(), "responseCode", "");
        setField(term284112, term284112.getClass(), "reason", "");
        setField(term284112, term284112.getClass(), "classicAddress", "");
        setField(term284112, term284112.getClass(), "status", enum572);
        setField(term284112, term284112.getClass(), "paymentAmount", "");
        setField(term284112, term284112.getClass(), "snapshotBalance", "");
        setField(term284112, term284112.getClass(), "nftOwned", "");
        Long term284122 = new Long(4903104596895674146L);
        Class<? extends Object> term284830 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term284829 = ((Class) term284830).getDeclaredField((String) "VERIFIED");
        ((Field) term284829).setAccessible(true);
        Object enum573 = ((Field) term284829).get((Object) null);
        Object term284121 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term284121, term284121.getClass(), "id", term284122);
        setField(term284121, term284121.getClass(), "responseCode", "");
        setField(term284121, term284121.getClass(), "reason", "");
        setField(term284121, term284121.getClass(), "classicAddress", "");
        setField(term284121, term284121.getClass(), "status", enum573);
        setField(term284121, term284121.getClass(), "paymentAmount", "");
        setField(term284121, term284121.getClass(), "snapshotBalance", "");
        setField(term284121, term284121.getClass(), "nftOwned", "");
        Long term284133 = new Long(3410093279424884335L);
        Object term284132 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term284132, term284132.getClass(), "id", term284133);
        setField(term284132, term284132.getClass(), "responseCode", "");
        setField(term284132, term284132.getClass(), "reason", "");
        setField(term284132, term284132.getClass(), "classicAddress", "");
        setField(term284132, term284132.getClass(), "status", enum573);
        setField(term284132, term284132.getClass(), "paymentAmount", "");
        setField(term284132, term284132.getClass(), "snapshotBalance", "");
        setField(term284132, term284132.getClass(), "nftOwned", "");
        Long term284142 = new Long(-8848853088235282046L);
        Class<? extends Object> term285256 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term285255 = ((Class) term285256).getDeclaredField((String) "QUEUED");
        ((Field) term285255).setAccessible(true);
        Object enum574 = ((Field) term285255).get((Object) null);
        Object term284141 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term284141, term284141.getClass(), "id", term284142);
        setField(term284141, term284141.getClass(), "responseCode", "");
        setField(term284141, term284141.getClass(), "reason", "");
        setField(term284141, term284141.getClass(), "classicAddress", "");
        setField(term284141, term284141.getClass(), "status", enum574);
        setField(term284141, term284141.getClass(), "paymentAmount", "");
        setField(term284141, term284141.getClass(), "snapshotBalance", "");
        setField(term284141, term284141.getClass(), "nftOwned", "");
        Long term284153 = new Long(5646422912118770408L);
        Object term284152 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term284152, term284152.getClass(), "id", term284153);
        setField(term284152, term284152.getClass(), "responseCode", "");
        setField(term284152, term284152.getClass(), "reason", "");
        setField(term284152, term284152.getClass(), "classicAddress", "");
        setField(term284152, term284152.getClass(), "status", enum573);
        setField(term284152, term284152.getClass(), "paymentAmount", "");
        setField(term284152, term284152.getClass(), "snapshotBalance", "");
        setField(term284152, term284152.getClass(), "nftOwned", "");
        ArrayList term284099 = new ArrayList();
        ((ArrayList) term284099).add(term284101);
        ((ArrayList) term284099).add(term284112);
        ((ArrayList) term284099).add(term284121);
        ((ArrayList) term284099).add(term284132);
        ((ArrayList) term284099).add(term284141);
        ((ArrayList) term284099).add(term284152);
        Long term284163 = new Long(1370021222113276207L);
        Class<? extends Object> term285676 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term285675 = ((Class) term285676).getDeclaredField((String) "WEEKLY");
        ((Field) term285675).setAccessible(true);
        Object enum575 = ((Field) term285675).get((Object) null);
        Class<? extends Object> term286066 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term286065 = ((Class) term286066).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term286065).setAccessible(true);
        Object enum576 = ((Field) term286065).get((Object) null);
        Integer term284269 = new Integer(158873461);
        Class<? extends Object> term286568 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term286567 = ((Class) term286568).getDeclaredField((String) "TRUSTLINE");
        ((Field) term286567).setAccessible(true);
        Object enum577 = ((Field) term286567).get((Object) null);
        Long term284320 = new Long(2671083699707412572L);
        Long term284334 = new Long(8940743873279878610L);
        Class<? extends Object> term286982 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term286981 = ((Class) term286982).getDeclaredField((String) "FLAT");
        ((Field) term286981).setAccessible(true);
        Object enum578 = ((Field) term286981).get((Object) null);
        Class<? extends Object> term287396 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term287395 = ((Class) term287396).getDeclaredField((String) "ACTIVE");
        ((Field) term287395).setAccessible(true);
        Object enum579 = ((Field) term287395).get((Object) null);
        Long term284402 = new Long(-1865007698397606253L);
        term284098 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term284165 = newInstance(Class.forName("java.util.Date"));
        Object term284167 = newInstance(Class.forName("java.util.Date"));
        Object term284169 = newInstance(Class.forName("java.util.Date"));
        Object term284171 = newInstance(Class.forName("java.util.Date"));
        setField(term284098, term284098.getClass(), "results", term284099);
        setField(term284098, term284098.getClass(), "id", term284163);
        setLongField(term284165, term284165.getClass(), "fastTime", 1393425811985L);
        setField(term284165, term284165.getClass(), "cdate", null);
        setField(term284098, term284098.getClass(), "createDate", term284165);
        setLongField(term284167, term284167.getClass(), "fastTime", 1697943529518L);
        setField(term284167, term284167.getClass(), "cdate", null);
        setField(term284098, term284098.getClass(), "updateDate", term284167);
        setLongField(term284169, term284169.getClass(), "fastTime", 1567446981028L);
        setField(term284169, term284169.getClass(), "cdate", null);
        setField(term284098, term284098.getClass(), "startTime", term284169);
        setLongField(term284171, term284171.getClass(), "fastTime", 1476809363689L);
        setField(term284171, term284171.getClass(), "cdate", null);
        setField(term284098, term284098.getClass(), "repeatUntilDate", term284171);
        setField(term284098, term284098.getClass(), "frequency", enum575);
        setField(term284098, term284098.getClass(), "status", enum576);
        setField(term284098, term284098.getClass(), "fromClassicAddress", "ujCcQbAWoz");
        setField(term284098, term284098.getClass(), "trustlineIssuerClassicAddress", "gJKBShUpxP");
        setField(term284098, term284098.getClass(), "currencyName", "AgLTAjLwXk");
        setField(term284098, term284098.getClass(), "currencyNameForProcess", "INoAjOhMEq");
        setField(term284098, term284098.getClass(), "amount", "HGacYAJJio");
        setBooleanField(term284098, term284098.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term284098, term284098.getClass(), "useBlacklist", true);
        setField(term284098, term284098.getClass(), "maximumTrustlines", term284269);
        setField(term284098, term284098.getClass(), "dropType", enum577);
        setField(term284098, term284098.getClass(), "failReason", "iUabaxtEPQ");
        setField(term284098, term284098.getClass(), "minBalance", "BeULrSYHKm");
        setField(term284098, term284098.getClass(), "maxBalance", "nseWRZaaYe");
        setField(term284098, term284098.getClass(), "totalBlacklisted", term284320);
        setField(term284098, term284098.getClass(), "maxXrpFeePerTransaction", "mCxcdmaOlh");
        setField(term284098, term284098.getClass(), "totalRecipients", term284334);
        setField(term284098, term284098.getClass(), "paymentType", enum578);
        setField(term284098, term284098.getClass(), "snapshotTrustlineIssuerClassicAddress", "LjgkHxxdOu");
        setField(term284098, term284098.getClass(), "snapshotCurrencyName", "AHOCvVqPAa");
        setField(term284098, term284098.getClass(), "nftIssuingAddress", "PEALeSdAvS");
        setField(term284098, term284098.getClass(), "nftTaxon", "oryVZfLyAF");
        setField(term284098, term284098.getClass(), "scheduleStatus", enum579);
        setField(term284098, term284098.getClass(), "fromScheduleId", term284402);
        term284404 = new Long(2355652609935652353L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term284404;
        callMethod(klass, "setTotalRecipients", argTypes, term284098, args);
    }

};


