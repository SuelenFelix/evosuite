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

public class AirdropStatus_setCreateDate_120644071339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215457;
     Object term215766;

    public AirdropStatus_setCreateDate_120644071339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term215461 = new Long(7656211287234019484L);
        Class<? extends Object> term215769 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term215768 = ((Class) term215769).getDeclaredField((String) "SENDING");
        ((Field) term215768).setAccessible(true);
        Object enum425 = ((Field) term215768).get((Object) null);
        Object term215460 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term215460, term215460.getClass(), "id", term215461);
        setField(term215460, term215460.getClass(), "responseCode", "");
        setField(term215460, term215460.getClass(), "reason", "");
        setField(term215460, term215460.getClass(), "classicAddress", "");
        setField(term215460, term215460.getClass(), "status", enum425);
        setField(term215460, term215460.getClass(), "paymentAmount", "");
        setField(term215460, term215460.getClass(), "snapshotBalance", "");
        setField(term215460, term215460.getClass(), "nftOwned", "");
        Long term215472 = new Long(-872579514000598474L);
        Class<? extends Object> term216192 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term216191 = ((Class) term216192).getDeclaredField((String) "VERIFIED");
        ((Field) term216191).setAccessible(true);
        Object enum426 = ((Field) term216191).get((Object) null);
        Object term215471 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term215471, term215471.getClass(), "id", term215472);
        setField(term215471, term215471.getClass(), "responseCode", "");
        setField(term215471, term215471.getClass(), "reason", "");
        setField(term215471, term215471.getClass(), "classicAddress", "");
        setField(term215471, term215471.getClass(), "status", enum426);
        setField(term215471, term215471.getClass(), "paymentAmount", "");
        setField(term215471, term215471.getClass(), "snapshotBalance", "");
        setField(term215471, term215471.getClass(), "nftOwned", "");
        Long term215483 = new Long(5097769785635819744L);
        Object term215482 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term215482, term215482.getClass(), "id", term215483);
        setField(term215482, term215482.getClass(), "responseCode", "");
        setField(term215482, term215482.getClass(), "reason", "");
        setField(term215482, term215482.getClass(), "classicAddress", "");
        setField(term215482, term215482.getClass(), "status", enum425);
        setField(term215482, term215482.getClass(), "paymentAmount", "");
        setField(term215482, term215482.getClass(), "snapshotBalance", "");
        setField(term215482, term215482.getClass(), "nftOwned", "");
        Long term215492 = new Long(9192899183781208922L);
        Class<? extends Object> term216618 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term216617 = ((Class) term216618).getDeclaredField((String) "FAILED");
        ((Field) term216617).setAccessible(true);
        Object enum427 = ((Field) term216617).get((Object) null);
        Object term215491 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term215491, term215491.getClass(), "id", term215492);
        setField(term215491, term215491.getClass(), "responseCode", "");
        setField(term215491, term215491.getClass(), "reason", "");
        setField(term215491, term215491.getClass(), "classicAddress", "");
        setField(term215491, term215491.getClass(), "status", enum427);
        setField(term215491, term215491.getClass(), "paymentAmount", "");
        setField(term215491, term215491.getClass(), "snapshotBalance", "");
        setField(term215491, term215491.getClass(), "nftOwned", "");
        Long term215503 = new Long(-7705159544905337794L);
        Class<? extends Object> term217038 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term217037 = ((Class) term217038).getDeclaredField((String) "VERIFIED");
        ((Field) term217037).setAccessible(true);
        Object enum428 = ((Field) term217037).get((Object) null);
        Object term215502 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term215502, term215502.getClass(), "id", term215503);
        setField(term215502, term215502.getClass(), "responseCode", "");
        setField(term215502, term215502.getClass(), "reason", "");
        setField(term215502, term215502.getClass(), "classicAddress", "");
        setField(term215502, term215502.getClass(), "status", enum428);
        setField(term215502, term215502.getClass(), "paymentAmount", "");
        setField(term215502, term215502.getClass(), "snapshotBalance", "");
        setField(term215502, term215502.getClass(), "nftOwned", "");
        Long term215514 = new Long(678465732474023847L);
        Object term215513 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term215513, term215513.getClass(), "id", term215514);
        setField(term215513, term215513.getClass(), "responseCode", "");
        setField(term215513, term215513.getClass(), "reason", "");
        setField(term215513, term215513.getClass(), "classicAddress", "");
        setField(term215513, term215513.getClass(), "status", enum428);
        setField(term215513, term215513.getClass(), "paymentAmount", "");
        setField(term215513, term215513.getClass(), "snapshotBalance", "");
        setField(term215513, term215513.getClass(), "nftOwned", "");
        ArrayList term215458 = new ArrayList();
        ((ArrayList) term215458).add(term215460);
        ((ArrayList) term215458).add(term215471);
        ((ArrayList) term215458).add(term215482);
        ((ArrayList) term215458).add(term215491);
        ((ArrayList) term215458).add(term215502);
        ((ArrayList) term215458).add(term215513);
        Long term215524 = new Long(2551047634163864862L);
        Class<? extends Object> term217464 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term217463 = ((Class) term217464).getDeclaredField((String) "DAILY");
        ((Field) term217463).setAccessible(true);
        Object enum429 = ((Field) term217463).get((Object) null);
        Class<? extends Object> term217851 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term217850 = ((Class) term217851).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term217850).setAccessible(true);
        Object enum430 = ((Field) term217850).get((Object) null);
        Integer term215623 = new Integer(1107176718);
        Class<? extends Object> term218335 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term218334 = ((Class) term218335).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term218334).setAccessible(true);
        Object enum431 = ((Field) term218334).get((Object) null);
        Long term215682 = new Long(-6656996002079682356L);
        Long term215696 = new Long(2166921473521388808L);
        Class<? extends Object> term218773 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term218772 = ((Class) term218773).getDeclaredField((String) "FLAT");
        ((Field) term218772).setAccessible(true);
        Object enum432 = ((Field) term218772).get((Object) null);
        Class<? extends Object> term219187 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term219186 = ((Class) term219187).getDeclaredField((String) "ACTIVE");
        ((Field) term219186).setAccessible(true);
        Object enum433 = ((Field) term219186).get((Object) null);
        Long term215764 = new Long(1964822153944985001L);
        term215457 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term215526 = newInstance(Class.forName("java.util.Date"));
        Object term215528 = newInstance(Class.forName("java.util.Date"));
        Object term215530 = newInstance(Class.forName("java.util.Date"));
        Object term215532 = newInstance(Class.forName("java.util.Date"));
        setField(term215457, term215457.getClass(), "results", term215458);
        setField(term215457, term215457.getClass(), "id", term215524);
        setLongField(term215526, term215526.getClass(), "fastTime", 1754599586725L);
        setField(term215526, term215526.getClass(), "cdate", null);
        setField(term215457, term215457.getClass(), "createDate", term215526);
        setLongField(term215528, term215528.getClass(), "fastTime", 1470272190930L);
        setField(term215528, term215528.getClass(), "cdate", null);
        setField(term215457, term215457.getClass(), "updateDate", term215528);
        setLongField(term215530, term215530.getClass(), "fastTime", 1722228358179L);
        setField(term215530, term215530.getClass(), "cdate", null);
        setField(term215457, term215457.getClass(), "startTime", term215530);
        setLongField(term215532, term215532.getClass(), "fastTime", 1612499514810L);
        setField(term215532, term215532.getClass(), "cdate", null);
        setField(term215457, term215457.getClass(), "repeatUntilDate", term215532);
        setField(term215457, term215457.getClass(), "frequency", enum429);
        setField(term215457, term215457.getClass(), "status", enum430);
        setField(term215457, term215457.getClass(), "fromClassicAddress", "cVeaNxcyvs");
        setField(term215457, term215457.getClass(), "trustlineIssuerClassicAddress", "fIMpTnCtOM");
        setField(term215457, term215457.getClass(), "currencyName", "zsVQmqfyvx");
        setField(term215457, term215457.getClass(), "currencyNameForProcess", "DKFEMZUVhd");
        setField(term215457, term215457.getClass(), "amount", "xhjqWwsjmc");
        setBooleanField(term215457, term215457.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term215457, term215457.getClass(), "useBlacklist", false);
        setField(term215457, term215457.getClass(), "maximumTrustlines", term215623);
        setField(term215457, term215457.getClass(), "dropType", enum431);
        setField(term215457, term215457.getClass(), "failReason", "GmFORCKDuz");
        setField(term215457, term215457.getClass(), "minBalance", "uiZFXEVOdS");
        setField(term215457, term215457.getClass(), "maxBalance", "kLUzmGfJsV");
        setField(term215457, term215457.getClass(), "totalBlacklisted", term215682);
        setField(term215457, term215457.getClass(), "maxXrpFeePerTransaction", "NtSnrngAmM");
        setField(term215457, term215457.getClass(), "totalRecipients", term215696);
        setField(term215457, term215457.getClass(), "paymentType", enum432);
        setField(term215457, term215457.getClass(), "snapshotTrustlineIssuerClassicAddress", "OYnrHBNcZV");
        setField(term215457, term215457.getClass(), "snapshotCurrencyName", "pwkepWBxgL");
        setField(term215457, term215457.getClass(), "nftIssuingAddress", "RDXQLsyKOu");
        setField(term215457, term215457.getClass(), "nftTaxon", "ZnIRhQxVXw");
        setField(term215457, term215457.getClass(), "scheduleStatus", enum433);
        setField(term215457, term215457.getClass(), "fromScheduleId", term215764);
        term215766 = newInstance(Class.forName("java.util.Date"));
        setLongField(term215766, term215766.getClass(), "fastTime", 1518509835152L);
        setField(term215766, term215766.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term215766;
        callMethod(klass, "setCreateDate", argTypes, term215457, args);
    }

};


