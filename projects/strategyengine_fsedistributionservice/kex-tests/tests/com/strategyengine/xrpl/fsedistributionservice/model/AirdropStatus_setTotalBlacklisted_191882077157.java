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

public class AirdropStatus_setTotalBlacklisted_191882077157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277189;
     Object term277463;

    public AirdropStatus_setTotalBlacklisted_191882077157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term277193 = new Long(-5157976075409724332L);
        Class<? extends Object> term277466 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term277465 = ((Class) term277466).getDeclaredField((String) "FAILED");
        ((Field) term277465).setAccessible(true);
        Object enum557 = ((Field) term277465).get((Object) null);
        Object term277192 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term277192, term277192.getClass(), "id", term277193);
        setField(term277192, term277192.getClass(), "responseCode", "");
        setField(term277192, term277192.getClass(), "reason", "");
        setField(term277192, term277192.getClass(), "classicAddress", "");
        setField(term277192, term277192.getClass(), "status", enum557);
        setField(term277192, term277192.getClass(), "paymentAmount", "");
        setField(term277192, term277192.getClass(), "snapshotBalance", "");
        setField(term277192, term277192.getClass(), "nftOwned", "");
        Long term277204 = new Long(5638814204437933939L);
        Class<? extends Object> term277886 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term277885 = ((Class) term277886).getDeclaredField((String) "SENDING");
        ((Field) term277885).setAccessible(true);
        Object enum558 = ((Field) term277885).get((Object) null);
        Object term277203 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term277203, term277203.getClass(), "id", term277204);
        setField(term277203, term277203.getClass(), "responseCode", "");
        setField(term277203, term277203.getClass(), "reason", "");
        setField(term277203, term277203.getClass(), "classicAddress", "");
        setField(term277203, term277203.getClass(), "status", enum558);
        setField(term277203, term277203.getClass(), "paymentAmount", "");
        setField(term277203, term277203.getClass(), "snapshotBalance", "");
        setField(term277203, term277203.getClass(), "nftOwned", "");
        Long term277215 = new Long(-5717327658642389548L);
        Class<? extends Object> term278309 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term278308 = ((Class) term278309).getDeclaredField((String) "FAILED");
        ((Field) term278308).setAccessible(true);
        Object enum559 = ((Field) term278308).get((Object) null);
        Object term277214 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term277214, term277214.getClass(), "id", term277215);
        setField(term277214, term277214.getClass(), "responseCode", "");
        setField(term277214, term277214.getClass(), "reason", "");
        setField(term277214, term277214.getClass(), "classicAddress", "");
        setField(term277214, term277214.getClass(), "status", enum559);
        setField(term277214, term277214.getClass(), "paymentAmount", "");
        setField(term277214, term277214.getClass(), "snapshotBalance", "");
        setField(term277214, term277214.getClass(), "nftOwned", "");
        ArrayList term277190 = new ArrayList();
        ((ArrayList) term277190).add(term277192);
        ((ArrayList) term277190).add(term277203);
        ((ArrayList) term277190).add(term277214);
        Long term277227 = new Long(8495724482241106293L);
        Class<? extends Object> term278729 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term278728 = ((Class) term278729).getDeclaredField((String) "DAILY");
        ((Field) term278728).setAccessible(true);
        Object enum560 = ((Field) term278728).get((Object) null);
        Class<? extends Object> term279116 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term279115 = ((Class) term279116).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term279115).setAccessible(true);
        Object enum561 = ((Field) term279115).get((Object) null);
        Integer term277326 = new Integer(1555897383);
        Class<? extends Object> term279600 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term279599 = ((Class) term279600).getDeclaredField((String) "TRUSTLINE");
        ((Field) term279599).setAccessible(true);
        Object enum562 = ((Field) term279599).get((Object) null);
        Long term277377 = new Long(-4318584834500248968L);
        Long term277391 = new Long(-7839957570751440706L);
        Class<? extends Object> term280014 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term280013 = ((Class) term280014).getDeclaredField((String) "FLAT");
        ((Field) term280013).setAccessible(true);
        Object enum563 = ((Field) term280013).get((Object) null);
        Class<? extends Object> term280428 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term280427 = ((Class) term280428).getDeclaredField((String) "COMPLETE");
        ((Field) term280427).setAccessible(true);
        Object enum564 = ((Field) term280427).get((Object) null);
        Long term277461 = new Long(-4944032768681866361L);
        term277189 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term277229 = newInstance(Class.forName("java.util.Date"));
        Object term277231 = newInstance(Class.forName("java.util.Date"));
        Object term277233 = newInstance(Class.forName("java.util.Date"));
        Object term277235 = newInstance(Class.forName("java.util.Date"));
        setField(term277189, term277189.getClass(), "results", term277190);
        setField(term277189, term277189.getClass(), "id", term277227);
        setLongField(term277229, term277229.getClass(), "fastTime", 1269375390033L);
        setField(term277229, term277229.getClass(), "cdate", null);
        setField(term277189, term277189.getClass(), "createDate", term277229);
        setLongField(term277231, term277231.getClass(), "fastTime", 1559323908807L);
        setField(term277231, term277231.getClass(), "cdate", null);
        setField(term277189, term277189.getClass(), "updateDate", term277231);
        setLongField(term277233, term277233.getClass(), "fastTime", 1725624001523L);
        setField(term277233, term277233.getClass(), "cdate", null);
        setField(term277189, term277189.getClass(), "startTime", term277233);
        setLongField(term277235, term277235.getClass(), "fastTime", 1411294411258L);
        setField(term277235, term277235.getClass(), "cdate", null);
        setField(term277189, term277189.getClass(), "repeatUntilDate", term277235);
        setField(term277189, term277189.getClass(), "frequency", enum560);
        setField(term277189, term277189.getClass(), "status", enum561);
        setField(term277189, term277189.getClass(), "fromClassicAddress", "eMJZEUCuiE");
        setField(term277189, term277189.getClass(), "trustlineIssuerClassicAddress", "psNXkIHjLW");
        setField(term277189, term277189.getClass(), "currencyName", "DeWUQxbivp");
        setField(term277189, term277189.getClass(), "currencyNameForProcess", "PcRiAbKXvK");
        setField(term277189, term277189.getClass(), "amount", "EhjpwiDlaG");
        setBooleanField(term277189, term277189.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term277189, term277189.getClass(), "useBlacklist", true);
        setField(term277189, term277189.getClass(), "maximumTrustlines", term277326);
        setField(term277189, term277189.getClass(), "dropType", enum562);
        setField(term277189, term277189.getClass(), "failReason", "HowhKdqLBn");
        setField(term277189, term277189.getClass(), "minBalance", "FXwdarPRcu");
        setField(term277189, term277189.getClass(), "maxBalance", "HzWNDDgUtc");
        setField(term277189, term277189.getClass(), "totalBlacklisted", term277377);
        setField(term277189, term277189.getClass(), "maxXrpFeePerTransaction", "umqvxozDpq");
        setField(term277189, term277189.getClass(), "totalRecipients", term277391);
        setField(term277189, term277189.getClass(), "paymentType", enum563);
        setField(term277189, term277189.getClass(), "snapshotTrustlineIssuerClassicAddress", "HieTCBVeDD");
        setField(term277189, term277189.getClass(), "snapshotCurrencyName", "cTSwYlchXv");
        setField(term277189, term277189.getClass(), "nftIssuingAddress", "QbalcMEEdv");
        setField(term277189, term277189.getClass(), "nftTaxon", "xiYIPdzlXo");
        setField(term277189, term277189.getClass(), "scheduleStatus", enum564);
        setField(term277189, term277189.getClass(), "fromScheduleId", term277461);
        term277463 = new Long(-6657309314982735134L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term277463;
        callMethod(klass, "setTotalBlacklisted", argTypes, term277189, args);
    }

};


