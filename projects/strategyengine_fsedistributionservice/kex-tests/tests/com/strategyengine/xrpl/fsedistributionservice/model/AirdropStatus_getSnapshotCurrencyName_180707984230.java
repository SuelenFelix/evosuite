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

public class AirdropStatus_getSnapshotCurrencyName_180707984230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187317;

    public AirdropStatus_getSnapshotCurrencyName_180707984230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term187321 = new Long(-4693900822622913579L);
        Class<? extends Object> term187624 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term187623 = ((Class) term187624).getDeclaredField((String) "FAILED");
        ((Field) term187623).setAccessible(true);
        Object enum365 = ((Field) term187623).get((Object) null);
        Object term187320 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term187320, term187320.getClass(), "id", term187321);
        setField(term187320, term187320.getClass(), "responseCode", "");
        setField(term187320, term187320.getClass(), "reason", "");
        setField(term187320, term187320.getClass(), "classicAddress", "");
        setField(term187320, term187320.getClass(), "status", enum365);
        setField(term187320, term187320.getClass(), "paymentAmount", "");
        setField(term187320, term187320.getClass(), "snapshotBalance", "");
        setField(term187320, term187320.getClass(), "nftOwned", "");
        Long term187332 = new Long(-997945615782059734L);
        Class<? extends Object> term188044 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term188043 = ((Class) term188044).getDeclaredField((String) "QUEUED");
        ((Field) term188043).setAccessible(true);
        Object enum366 = ((Field) term188043).get((Object) null);
        Object term187331 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term187331, term187331.getClass(), "id", term187332);
        setField(term187331, term187331.getClass(), "responseCode", "");
        setField(term187331, term187331.getClass(), "reason", "");
        setField(term187331, term187331.getClass(), "classicAddress", "");
        setField(term187331, term187331.getClass(), "status", enum366);
        setField(term187331, term187331.getClass(), "paymentAmount", "");
        setField(term187331, term187331.getClass(), "snapshotBalance", "");
        setField(term187331, term187331.getClass(), "nftOwned", "");
        Long term187343 = new Long(-599981502351912419L);
        Class<? extends Object> term188464 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term188463 = ((Class) term188464).getDeclaredField((String) "QUEUED");
        ((Field) term188463).setAccessible(true);
        Object enum367 = ((Field) term188463).get((Object) null);
        Object term187342 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term187342, term187342.getClass(), "id", term187343);
        setField(term187342, term187342.getClass(), "responseCode", "");
        setField(term187342, term187342.getClass(), "reason", "");
        setField(term187342, term187342.getClass(), "classicAddress", "");
        setField(term187342, term187342.getClass(), "status", enum367);
        setField(term187342, term187342.getClass(), "paymentAmount", "");
        setField(term187342, term187342.getClass(), "snapshotBalance", "");
        setField(term187342, term187342.getClass(), "nftOwned", "");
        Long term187354 = new Long(8171709541116491249L);
        Object term187353 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term187353, term187353.getClass(), "id", term187354);
        setField(term187353, term187353.getClass(), "responseCode", "");
        setField(term187353, term187353.getClass(), "reason", "");
        setField(term187353, term187353.getClass(), "classicAddress", "");
        setField(term187353, term187353.getClass(), "status", enum367);
        setField(term187353, term187353.getClass(), "paymentAmount", "");
        setField(term187353, term187353.getClass(), "snapshotBalance", "");
        setField(term187353, term187353.getClass(), "nftOwned", "");
        Long term187363 = new Long(1867943942587005261L);
        Class<? extends Object> term188884 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term188883 = ((Class) term188884).getDeclaredField((String) "QUEUED");
        ((Field) term188883).setAccessible(true);
        Object enum368 = ((Field) term188883).get((Object) null);
        Object term187362 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term187362, term187362.getClass(), "id", term187363);
        setField(term187362, term187362.getClass(), "responseCode", "");
        setField(term187362, term187362.getClass(), "reason", "");
        setField(term187362, term187362.getClass(), "classicAddress", "");
        setField(term187362, term187362.getClass(), "status", enum368);
        setField(term187362, term187362.getClass(), "paymentAmount", "");
        setField(term187362, term187362.getClass(), "snapshotBalance", "");
        setField(term187362, term187362.getClass(), "nftOwned", "");
        Long term187374 = new Long(-9168517519350392654L);
        Object term187373 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term187373, term187373.getClass(), "id", term187374);
        setField(term187373, term187373.getClass(), "responseCode", "");
        setField(term187373, term187373.getClass(), "reason", "");
        setField(term187373, term187373.getClass(), "classicAddress", "");
        setField(term187373, term187373.getClass(), "status", enum365);
        setField(term187373, term187373.getClass(), "paymentAmount", "");
        setField(term187373, term187373.getClass(), "snapshotBalance", "");
        setField(term187373, term187373.getClass(), "nftOwned", "");
        ArrayList term187318 = new ArrayList();
        ((ArrayList) term187318).add(term187320);
        ((ArrayList) term187318).add(term187331);
        ((ArrayList) term187318).add(term187342);
        ((ArrayList) term187318).add(term187353);
        ((ArrayList) term187318).add(term187362);
        ((ArrayList) term187318).add(term187373);
        Long term187384 = new Long(4828755228445882127L);
        Class<? extends Object> term189304 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term189303 = ((Class) term189304).getDeclaredField((String) "DAILY");
        ((Field) term189303).setAccessible(true);
        Object enum369 = ((Field) term189303).get((Object) null);
        Class<? extends Object> term189691 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term189690 = ((Class) term189691).getDeclaredField((String) "SCHEDULED");
        ((Field) term189690).setAccessible(true);
        Object enum370 = ((Field) term189690).get((Object) null);
        Integer term187478 = new Integer(1045657203);
        Class<? extends Object> term190160 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term190159 = ((Class) term190160).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term190159).setAccessible(true);
        Object enum371 = ((Field) term190159).get((Object) null);
        Long term187537 = new Long(970120292495348028L);
        Long term187551 = new Long(77619432202128806L);
        Class<? extends Object> term190598 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term190597 = ((Class) term190598).getDeclaredField((String) "FLAT");
        ((Field) term190597).setAccessible(true);
        Object enum372 = ((Field) term190597).get((Object) null);
        Class<? extends Object> term191012 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term191011 = ((Class) term191012).getDeclaredField((String) "REJECTED");
        ((Field) term191011).setAccessible(true);
        Object enum373 = ((Field) term191011).get((Object) null);
        Long term187621 = new Long(-1647156882669215876L);
        term187317 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term187386 = newInstance(Class.forName("java.util.Date"));
        Object term187388 = newInstance(Class.forName("java.util.Date"));
        Object term187390 = newInstance(Class.forName("java.util.Date"));
        Object term187392 = newInstance(Class.forName("java.util.Date"));
        setField(term187317, term187317.getClass(), "results", term187318);
        setField(term187317, term187317.getClass(), "id", term187384);
        setLongField(term187386, term187386.getClass(), "fastTime", 1308630841700L);
        setField(term187386, term187386.getClass(), "cdate", null);
        setField(term187317, term187317.getClass(), "createDate", term187386);
        setLongField(term187388, term187388.getClass(), "fastTime", 1843314041460L);
        setField(term187388, term187388.getClass(), "cdate", null);
        setField(term187317, term187317.getClass(), "updateDate", term187388);
        setLongField(term187390, term187390.getClass(), "fastTime", 1609257574825L);
        setField(term187390, term187390.getClass(), "cdate", null);
        setField(term187317, term187317.getClass(), "startTime", term187390);
        setLongField(term187392, term187392.getClass(), "fastTime", 1596067505466L);
        setField(term187392, term187392.getClass(), "cdate", null);
        setField(term187317, term187317.getClass(), "repeatUntilDate", term187392);
        setField(term187317, term187317.getClass(), "frequency", enum369);
        setField(term187317, term187317.getClass(), "status", enum370);
        setField(term187317, term187317.getClass(), "fromClassicAddress", "PTMnmtfPDP");
        setField(term187317, term187317.getClass(), "trustlineIssuerClassicAddress", "POLJqDqHhk");
        setField(term187317, term187317.getClass(), "currencyName", "eXlhmImRUd");
        setField(term187317, term187317.getClass(), "currencyNameForProcess", "pNjJQBsfBv");
        setField(term187317, term187317.getClass(), "amount", "AeoFWTVnXE");
        setBooleanField(term187317, term187317.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term187317, term187317.getClass(), "useBlacklist", false);
        setField(term187317, term187317.getClass(), "maximumTrustlines", term187478);
        setField(term187317, term187317.getClass(), "dropType", enum371);
        setField(term187317, term187317.getClass(), "failReason", "KNodpPTOen");
        setField(term187317, term187317.getClass(), "minBalance", "HLdVSdPKUm");
        setField(term187317, term187317.getClass(), "maxBalance", "cKqYMrtneQ");
        setField(term187317, term187317.getClass(), "totalBlacklisted", term187537);
        setField(term187317, term187317.getClass(), "maxXrpFeePerTransaction", "CgvYDHvQnF");
        setField(term187317, term187317.getClass(), "totalRecipients", term187551);
        setField(term187317, term187317.getClass(), "paymentType", enum372);
        setField(term187317, term187317.getClass(), "snapshotTrustlineIssuerClassicAddress", "wzvrwvpSgi");
        setField(term187317, term187317.getClass(), "snapshotCurrencyName", "qwrZBRPuHr");
        setField(term187317, term187317.getClass(), "nftIssuingAddress", "ZlmkgzeZIu");
        setField(term187317, term187317.getClass(), "nftTaxon", "SFuBQQfwki");
        setField(term187317, term187317.getClass(), "scheduleStatus", enum373);
        setField(term187317, term187317.getClass(), "fromScheduleId", term187621);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSnapshotCurrencyName", argTypes, term187317, args);
    }

};


