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

public class AirdropStatus_AirdropStatusBuilder_failReason_26224099018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term504438;

    public AirdropStatus_AirdropStatusBuilder_failReason_26224099018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term504442 = new Long(8588047499427599529L);
        Class<? extends Object> term504774 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term504773 = ((Class) term504774).getDeclaredField((String) "SENDING");
        ((Field) term504773).setAccessible(true);
        Object enum949 = ((Field) term504773).get((Object) null);
        Object term504441 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term504441, term504441.getClass(), "id", term504442);
        setField(term504441, term504441.getClass(), "responseCode", "");
        setField(term504441, term504441.getClass(), "reason", "");
        setField(term504441, term504441.getClass(), "classicAddress", "");
        setField(term504441, term504441.getClass(), "status", enum949);
        setField(term504441, term504441.getClass(), "paymentAmount", "");
        setField(term504441, term504441.getClass(), "snapshotBalance", "");
        setField(term504441, term504441.getClass(), "nftOwned", "");
        Long term504453 = new Long(6126964308136745488L);
        Object term504452 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term504452, term504452.getClass(), "id", term504453);
        setField(term504452, term504452.getClass(), "responseCode", "");
        setField(term504452, term504452.getClass(), "reason", "");
        setField(term504452, term504452.getClass(), "classicAddress", "");
        setField(term504452, term504452.getClass(), "status", enum949);
        setField(term504452, term504452.getClass(), "paymentAmount", "");
        setField(term504452, term504452.getClass(), "snapshotBalance", "");
        setField(term504452, term504452.getClass(), "nftOwned", "");
        Long term504462 = new Long(-8307140005890062599L);
        Class<? extends Object> term505197 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term505196 = ((Class) term505197).getDeclaredField((String) "VERIFIED");
        ((Field) term505196).setAccessible(true);
        Object enum950 = ((Field) term505196).get((Object) null);
        Object term504461 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term504461, term504461.getClass(), "id", term504462);
        setField(term504461, term504461.getClass(), "responseCode", "");
        setField(term504461, term504461.getClass(), "reason", "");
        setField(term504461, term504461.getClass(), "classicAddress", "");
        setField(term504461, term504461.getClass(), "status", enum950);
        setField(term504461, term504461.getClass(), "paymentAmount", "");
        setField(term504461, term504461.getClass(), "snapshotBalance", "");
        setField(term504461, term504461.getClass(), "nftOwned", "");
        Long term504473 = new Long(195324792518519601L);
        Class<? extends Object> term505623 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term505622 = ((Class) term505623).getDeclaredField((String) "VERIFIED");
        ((Field) term505622).setAccessible(true);
        Object enum951 = ((Field) term505622).get((Object) null);
        Object term504472 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term504472, term504472.getClass(), "id", term504473);
        setField(term504472, term504472.getClass(), "responseCode", "");
        setField(term504472, term504472.getClass(), "reason", "");
        setField(term504472, term504472.getClass(), "classicAddress", "");
        setField(term504472, term504472.getClass(), "status", enum951);
        setField(term504472, term504472.getClass(), "paymentAmount", "");
        setField(term504472, term504472.getClass(), "snapshotBalance", "");
        setField(term504472, term504472.getClass(), "nftOwned", "");
        Long term504484 = new Long(8741861751389973987L);
        Class<? extends Object> term506049 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term506048 = ((Class) term506049).getDeclaredField((String) "VERIFIED");
        ((Field) term506048).setAccessible(true);
        Object enum952 = ((Field) term506048).get((Object) null);
        Object term504483 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term504483, term504483.getClass(), "id", term504484);
        setField(term504483, term504483.getClass(), "responseCode", "");
        setField(term504483, term504483.getClass(), "reason", "");
        setField(term504483, term504483.getClass(), "classicAddress", "");
        setField(term504483, term504483.getClass(), "status", enum952);
        setField(term504483, term504483.getClass(), "paymentAmount", "");
        setField(term504483, term504483.getClass(), "snapshotBalance", "");
        setField(term504483, term504483.getClass(), "nftOwned", "");
        Long term504495 = new Long(-6267867662540638557L);
        Object term504494 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term504494, term504494.getClass(), "id", term504495);
        setField(term504494, term504494.getClass(), "responseCode", "");
        setField(term504494, term504494.getClass(), "reason", "");
        setField(term504494, term504494.getClass(), "classicAddress", "");
        setField(term504494, term504494.getClass(), "status", enum951);
        setField(term504494, term504494.getClass(), "paymentAmount", "");
        setField(term504494, term504494.getClass(), "snapshotBalance", "");
        setField(term504494, term504494.getClass(), "nftOwned", "");
        ArrayList term504439 = new ArrayList();
        ((ArrayList) term504439).add(term504441);
        ((ArrayList) term504439).add(term504452);
        ((ArrayList) term504439).add(term504461);
        ((ArrayList) term504439).add(term504472);
        ((ArrayList) term504439).add(term504483);
        ((ArrayList) term504439).add(term504494);
        Long term504505 = new Long(7789239238809338335L);
        Class<? extends Object> term506475 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term506474 = ((Class) term506475).getDeclaredField((String) "ANNUALLY");
        ((Field) term506474).setAccessible(true);
        Object enum953 = ((Field) term506474).get((Object) null);
        Class<? extends Object> term506871 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term506870 = ((Class) term506871).getDeclaredField((String) "COMPLETE");
        ((Field) term506870).setAccessible(true);
        Object enum954 = ((Field) term506870).get((Object) null);
        Integer term504601 = new Integer(34470066);
        Class<? extends Object> term507337 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term507336 = ((Class) term507337).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term507336).setAccessible(true);
        Object enum955 = ((Field) term507336).get((Object) null);
        Long term504669 = new Long(7148416754314775058L);
        Long term504683 = new Long(-5511482978305240721L);
        Class<? extends Object> term507802 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term507801 = ((Class) term507802).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term507801).setAccessible(true);
        Object enum956 = ((Field) term507801).get((Object) null);
        Class<? extends Object> term508240 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term508239 = ((Class) term508240).getDeclaredField((String) "ACTIVE");
        ((Field) term508239).setAccessible(true);
        Object enum957 = ((Field) term508239).get((Object) null);
        Long term504759 = new Long(7004919285972689886L);
        term504438 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term504507 = newInstance(Class.forName("java.util.Date"));
        Object term504509 = newInstance(Class.forName("java.util.Date"));
        Object term504511 = newInstance(Class.forName("java.util.Date"));
        Object term504513 = newInstance(Class.forName("java.util.Date"));
        setField(term504438, term504438.getClass(), "results", term504439);
        setField(term504438, term504438.getClass(), "id", term504505);
        setLongField(term504507, term504507.getClass(), "fastTime", 1821294143814L);
        setField(term504507, term504507.getClass(), "cdate", null);
        setField(term504438, term504438.getClass(), "createDate", term504507);
        setLongField(term504509, term504509.getClass(), "fastTime", 1489209832550L);
        setField(term504509, term504509.getClass(), "cdate", null);
        setField(term504438, term504438.getClass(), "updateDate", term504509);
        setLongField(term504511, term504511.getClass(), "fastTime", 1833133725157L);
        setField(term504511, term504511.getClass(), "cdate", null);
        setField(term504438, term504438.getClass(), "startTime", term504511);
        setLongField(term504513, term504513.getClass(), "fastTime", 1748885553131L);
        setField(term504513, term504513.getClass(), "cdate", null);
        setField(term504438, term504438.getClass(), "repeatUntilDate", term504513);
        setField(term504438, term504438.getClass(), "frequency", enum953);
        setField(term504438, term504438.getClass(), "status", enum954);
        setField(term504438, term504438.getClass(), "fromClassicAddress", "PlFyzwhLog");
        setField(term504438, term504438.getClass(), "trustlineIssuerClassicAddress", "pixIdqENqS");
        setField(term504438, term504438.getClass(), "currencyName", "GrgTbicTvb");
        setField(term504438, term504438.getClass(), "currencyNameForProcess", "PUZSAFeEKV");
        setField(term504438, term504438.getClass(), "amount", "SxDxsgRQrT");
        setBooleanField(term504438, term504438.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term504438, term504438.getClass(), "useBlacklist", false);
        setField(term504438, term504438.getClass(), "maximumTrustlines", term504601);
        setField(term504438, term504438.getClass(), "dropType", enum955);
        setField(term504438, term504438.getClass(), "failReason", "pLlOWMrJcg");
        setField(term504438, term504438.getClass(), "minBalance", "sCfJJislWL");
        setField(term504438, term504438.getClass(), "maxBalance", "yBWLVacoFx");
        setField(term504438, term504438.getClass(), "totalBlacklisted", term504669);
        setField(term504438, term504438.getClass(), "maxXrpFeePerTransaction", "dHSfngZIJP");
        setField(term504438, term504438.getClass(), "totalRecipients", term504683);
        setField(term504438, term504438.getClass(), "paymentType", enum956);
        setField(term504438, term504438.getClass(), "snapshotTrustlineIssuerClassicAddress", "CJAtcuTGHa");
        setField(term504438, term504438.getClass(), "snapshotCurrencyName", "iHNeGutoBe");
        setField(term504438, term504438.getClass(), "nftIssuingAddress", "AUYkRCDvFL");
        setField(term504438, term504438.getClass(), "nftTaxon", "kkEjADnYLO");
        setField(term504438, term504438.getClass(), "scheduleStatus", enum957);
        setField(term504438, term504438.getClass(), "fromScheduleId", term504759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TsbsGtwNGu";
        callMethod(klass, "failReason", argTypes, term504438, args);
    }

};


