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

public class AirdropStatus_getSnapshotTrustlineIssuerClassicAddress_208052619729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184434;

    public AirdropStatus_getSnapshotTrustlineIssuerClassicAddress_208052619729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term184438 = new Long(1133267598258375793L);
        Class<? extends Object> term184709 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term184708 = ((Class) term184709).getDeclaredField((String) "SENDING");
        ((Field) term184708).setAccessible(true);
        Object enum359 = ((Field) term184708).get((Object) null);
        Object term184437 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term184437, term184437.getClass(), "id", term184438);
        setField(term184437, term184437.getClass(), "responseCode", "");
        setField(term184437, term184437.getClass(), "reason", "");
        setField(term184437, term184437.getClass(), "classicAddress", "");
        setField(term184437, term184437.getClass(), "status", enum359);
        setField(term184437, term184437.getClass(), "paymentAmount", "");
        setField(term184437, term184437.getClass(), "snapshotBalance", "");
        setField(term184437, term184437.getClass(), "nftOwned", "");
        ArrayList term184435 = new ArrayList();
        ((ArrayList) term184435).add(term184437);
        Long term184450 = new Long(2990264647913003810L);
        Class<? extends Object> term185132 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term185131 = ((Class) term185132).getDeclaredField((String) "ANNUALLY");
        ((Field) term185131).setAccessible(true);
        Object enum360 = ((Field) term185131).get((Object) null);
        Class<? extends Object> term185528 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term185527 = ((Class) term185528).getDeclaredField((String) "REJECTED");
        ((Field) term185527).setAccessible(true);
        Object enum361 = ((Field) term185527).get((Object) null);
        Integer term184546 = new Integer(906181092);
        Class<? extends Object> term185994 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term185993 = ((Class) term185994).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term185993).setAccessible(true);
        Object enum362 = ((Field) term185993).get((Object) null);
        Long term184614 = new Long(-2195794659127490022L);
        Long term184628 = new Long(6142089107139955834L);
        Class<? extends Object> term186459 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term186458 = ((Class) term186459).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term186458).setAccessible(true);
        Object enum363 = ((Field) term186458).get((Object) null);
        Class<? extends Object> term186897 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term186896 = ((Class) term186897).getDeclaredField((String) "COMPLETE");
        ((Field) term186896).setAccessible(true);
        Object enum364 = ((Field) term186896).get((Object) null);
        Long term184706 = new Long(-7506365302323354325L);
        term184434 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term184452 = newInstance(Class.forName("java.util.Date"));
        Object term184454 = newInstance(Class.forName("java.util.Date"));
        Object term184456 = newInstance(Class.forName("java.util.Date"));
        Object term184458 = newInstance(Class.forName("java.util.Date"));
        setField(term184434, term184434.getClass(), "results", term184435);
        setField(term184434, term184434.getClass(), "id", term184450);
        setLongField(term184452, term184452.getClass(), "fastTime", 1529171654860L);
        setField(term184452, term184452.getClass(), "cdate", null);
        setField(term184434, term184434.getClass(), "createDate", term184452);
        setLongField(term184454, term184454.getClass(), "fastTime", 1839714137646L);
        setField(term184454, term184454.getClass(), "cdate", null);
        setField(term184434, term184434.getClass(), "updateDate", term184454);
        setLongField(term184456, term184456.getClass(), "fastTime", 1620297238542L);
        setField(term184456, term184456.getClass(), "cdate", null);
        setField(term184434, term184434.getClass(), "startTime", term184456);
        setLongField(term184458, term184458.getClass(), "fastTime", 1340144055808L);
        setField(term184458, term184458.getClass(), "cdate", null);
        setField(term184434, term184434.getClass(), "repeatUntilDate", term184458);
        setField(term184434, term184434.getClass(), "frequency", enum360);
        setField(term184434, term184434.getClass(), "status", enum361);
        setField(term184434, term184434.getClass(), "fromClassicAddress", "PzNtQwCbTD");
        setField(term184434, term184434.getClass(), "trustlineIssuerClassicAddress", "wQAefimNLh");
        setField(term184434, term184434.getClass(), "currencyName", "NDFbtxRRgi");
        setField(term184434, term184434.getClass(), "currencyNameForProcess", "vasBXGWtux");
        setField(term184434, term184434.getClass(), "amount", "UfUIICYJWk");
        setBooleanField(term184434, term184434.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term184434, term184434.getClass(), "useBlacklist", false);
        setField(term184434, term184434.getClass(), "maximumTrustlines", term184546);
        setField(term184434, term184434.getClass(), "dropType", enum362);
        setField(term184434, term184434.getClass(), "failReason", "vuGxdvURpp");
        setField(term184434, term184434.getClass(), "minBalance", "zUgAERZZFZ");
        setField(term184434, term184434.getClass(), "maxBalance", "QhkdVFKaoy");
        setField(term184434, term184434.getClass(), "totalBlacklisted", term184614);
        setField(term184434, term184434.getClass(), "maxXrpFeePerTransaction", "WCQDPwVjsS");
        setField(term184434, term184434.getClass(), "totalRecipients", term184628);
        setField(term184434, term184434.getClass(), "paymentType", enum363);
        setField(term184434, term184434.getClass(), "snapshotTrustlineIssuerClassicAddress", "XkZOYFvTGI");
        setField(term184434, term184434.getClass(), "snapshotCurrencyName", "NifhlBZIDF");
        setField(term184434, term184434.getClass(), "nftIssuingAddress", "vKEgtSbaYp");
        setField(term184434, term184434.getClass(), "nftTaxon", "FnjEwOlAkC");
        setField(term184434, term184434.getClass(), "scheduleStatus", enum364);
        setField(term184434, term184434.getClass(), "fromScheduleId", term184706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSnapshotTrustlineIssuerClassicAddress", argTypes, term184434, args);
    }

};


