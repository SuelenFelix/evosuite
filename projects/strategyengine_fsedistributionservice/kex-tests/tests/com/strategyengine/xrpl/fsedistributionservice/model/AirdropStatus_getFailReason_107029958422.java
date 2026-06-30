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

public class AirdropStatus_getFailReason_107029958422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162332;

    public AirdropStatus_getFailReason_107029958422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term162336 = new Long(7006402814669334483L);
        Class<? extends Object> term162639 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term162638 = ((Class) term162639).getDeclaredField((String) "QUEUED");
        ((Field) term162638).setAccessible(true);
        Object enum312 = ((Field) term162638).get((Object) null);
        Object term162335 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term162335, term162335.getClass(), "id", term162336);
        setField(term162335, term162335.getClass(), "responseCode", "");
        setField(term162335, term162335.getClass(), "reason", "");
        setField(term162335, term162335.getClass(), "classicAddress", "");
        setField(term162335, term162335.getClass(), "status", enum312);
        setField(term162335, term162335.getClass(), "paymentAmount", "");
        setField(term162335, term162335.getClass(), "snapshotBalance", "");
        setField(term162335, term162335.getClass(), "nftOwned", "");
        Long term162347 = new Long(-4003544865306793676L);
        Object term162346 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term162346, term162346.getClass(), "id", term162347);
        setField(term162346, term162346.getClass(), "responseCode", "");
        setField(term162346, term162346.getClass(), "reason", "");
        setField(term162346, term162346.getClass(), "classicAddress", "");
        setField(term162346, term162346.getClass(), "status", enum312);
        setField(term162346, term162346.getClass(), "paymentAmount", "");
        setField(term162346, term162346.getClass(), "snapshotBalance", "");
        setField(term162346, term162346.getClass(), "nftOwned", "");
        Long term162356 = new Long(-769824408235898287L);
        Class<? extends Object> term163059 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term163058 = ((Class) term163059).getDeclaredField((String) "QUEUED");
        ((Field) term163058).setAccessible(true);
        Object enum313 = ((Field) term163058).get((Object) null);
        Object term162355 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term162355, term162355.getClass(), "id", term162356);
        setField(term162355, term162355.getClass(), "responseCode", "");
        setField(term162355, term162355.getClass(), "reason", "");
        setField(term162355, term162355.getClass(), "classicAddress", "");
        setField(term162355, term162355.getClass(), "status", enum313);
        setField(term162355, term162355.getClass(), "paymentAmount", "");
        setField(term162355, term162355.getClass(), "snapshotBalance", "");
        setField(term162355, term162355.getClass(), "nftOwned", "");
        Long term162367 = new Long(-2828343143039517941L);
        Object term162366 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term162366, term162366.getClass(), "id", term162367);
        setField(term162366, term162366.getClass(), "responseCode", "");
        setField(term162366, term162366.getClass(), "reason", "");
        setField(term162366, term162366.getClass(), "classicAddress", "");
        setField(term162366, term162366.getClass(), "status", enum312);
        setField(term162366, term162366.getClass(), "paymentAmount", "");
        setField(term162366, term162366.getClass(), "snapshotBalance", "");
        setField(term162366, term162366.getClass(), "nftOwned", "");
        Long term162376 = new Long(2809748481176687920L);
        Object term162375 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term162375, term162375.getClass(), "id", term162376);
        setField(term162375, term162375.getClass(), "responseCode", "");
        setField(term162375, term162375.getClass(), "reason", "");
        setField(term162375, term162375.getClass(), "classicAddress", "");
        setField(term162375, term162375.getClass(), "status", enum313);
        setField(term162375, term162375.getClass(), "paymentAmount", "");
        setField(term162375, term162375.getClass(), "snapshotBalance", "");
        setField(term162375, term162375.getClass(), "nftOwned", "");
        ArrayList term162333 = new ArrayList();
        ((ArrayList) term162333).add(term162335);
        ((ArrayList) term162333).add(term162346);
        ((ArrayList) term162333).add(term162355);
        ((ArrayList) term162333).add(term162366);
        ((ArrayList) term162333).add(term162375);
        Long term162386 = new Long(4012955251407483889L);
        Class<? extends Object> term163479 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term163478 = ((Class) term163479).getDeclaredField((String) "MONTHLY");
        ((Field) term163478).setAccessible(true);
        Object enum314 = ((Field) term163478).get((Object) null);
        Class<? extends Object> term163872 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term163871 = ((Class) term163872).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term163871).setAccessible(true);
        Object enum315 = ((Field) term163871).get((Object) null);
        Integer term162487 = new Integer(1532716628);
        Class<? extends Object> term164356 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term164355 = ((Class) term164356).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term164355).setAccessible(true);
        Object enum316 = ((Field) term164355).get((Object) null);
        Long term162546 = new Long(-4058686252500969842L);
        Long term162560 = new Long(6077991958696417121L);
        Class<? extends Object> term164794 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term164793 = ((Class) term164794).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term164793).setAccessible(true);
        Object enum317 = ((Field) term164793).get((Object) null);
        Class<? extends Object> term165232 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term165231 = ((Class) term165232).getDeclaredField((String) "ACTIVE");
        ((Field) term165231).setAccessible(true);
        Object enum318 = ((Field) term165231).get((Object) null);
        Long term162636 = new Long(-5004803270846838598L);
        term162332 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term162388 = newInstance(Class.forName("java.util.Date"));
        Object term162390 = newInstance(Class.forName("java.util.Date"));
        Object term162392 = newInstance(Class.forName("java.util.Date"));
        Object term162394 = newInstance(Class.forName("java.util.Date"));
        setField(term162332, term162332.getClass(), "results", term162333);
        setField(term162332, term162332.getClass(), "id", term162386);
        setLongField(term162388, term162388.getClass(), "fastTime", 1818363160308L);
        setField(term162388, term162388.getClass(), "cdate", null);
        setField(term162332, term162332.getClass(), "createDate", term162388);
        setLongField(term162390, term162390.getClass(), "fastTime", 1417168464539L);
        setField(term162390, term162390.getClass(), "cdate", null);
        setField(term162332, term162332.getClass(), "updateDate", term162390);
        setLongField(term162392, term162392.getClass(), "fastTime", 1783094578974L);
        setField(term162392, term162392.getClass(), "cdate", null);
        setField(term162332, term162332.getClass(), "startTime", term162392);
        setLongField(term162394, term162394.getClass(), "fastTime", 1853629046308L);
        setField(term162394, term162394.getClass(), "cdate", null);
        setField(term162332, term162332.getClass(), "repeatUntilDate", term162394);
        setField(term162332, term162332.getClass(), "frequency", enum314);
        setField(term162332, term162332.getClass(), "status", enum315);
        setField(term162332, term162332.getClass(), "fromClassicAddress", "uleoYrEbgk");
        setField(term162332, term162332.getClass(), "trustlineIssuerClassicAddress", "JINAWGBEol");
        setField(term162332, term162332.getClass(), "currencyName", "HZRzxVDGhV");
        setField(term162332, term162332.getClass(), "currencyNameForProcess", "wOWOSBOjln");
        setField(term162332, term162332.getClass(), "amount", "iVXUeGctUB");
        setBooleanField(term162332, term162332.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term162332, term162332.getClass(), "useBlacklist", true);
        setField(term162332, term162332.getClass(), "maximumTrustlines", term162487);
        setField(term162332, term162332.getClass(), "dropType", enum316);
        setField(term162332, term162332.getClass(), "failReason", "bmLiVLNmZC");
        setField(term162332, term162332.getClass(), "minBalance", "ORExcUfatr");
        setField(term162332, term162332.getClass(), "maxBalance", "cUonKmQWCB");
        setField(term162332, term162332.getClass(), "totalBlacklisted", term162546);
        setField(term162332, term162332.getClass(), "maxXrpFeePerTransaction", "CvbqWuRute");
        setField(term162332, term162332.getClass(), "totalRecipients", term162560);
        setField(term162332, term162332.getClass(), "paymentType", enum317);
        setField(term162332, term162332.getClass(), "snapshotTrustlineIssuerClassicAddress", "yuvBFZQJBJ");
        setField(term162332, term162332.getClass(), "snapshotCurrencyName", "prymoiXBsv");
        setField(term162332, term162332.getClass(), "nftIssuingAddress", "XVkgypnsVx");
        setField(term162332, term162332.getClass(), "nftTaxon", "TwXzbEYFtG");
        setField(term162332, term162332.getClass(), "scheduleStatus", enum318);
        setField(term162332, term162332.getClass(), "fromScheduleId", term162636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFailReason", argTypes, term162332, args);
    }

};


