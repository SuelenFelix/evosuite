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

public class AirdropStatus_AirdropStatusBuilder_nftTaxon_68648634628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540163;

    public AirdropStatus_AirdropStatusBuilder_nftTaxon_68648634628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term540167 = new Long(-4019650338948804968L);
        Class<? extends Object> term540483 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term540482 = ((Class) term540483).getDeclaredField((String) "QUEUED");
        ((Field) term540482).setAccessible(true);
        Object enum1025 = ((Field) term540482).get((Object) null);
        Object term540166 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term540166, term540166.getClass(), "id", term540167);
        setField(term540166, term540166.getClass(), "responseCode", "");
        setField(term540166, term540166.getClass(), "reason", "");
        setField(term540166, term540166.getClass(), "classicAddress", "");
        setField(term540166, term540166.getClass(), "status", enum1025);
        setField(term540166, term540166.getClass(), "paymentAmount", "");
        setField(term540166, term540166.getClass(), "snapshotBalance", "");
        setField(term540166, term540166.getClass(), "nftOwned", "");
        Long term540178 = new Long(4836157943217062601L);
        Object term540177 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term540177, term540177.getClass(), "id", term540178);
        setField(term540177, term540177.getClass(), "responseCode", "");
        setField(term540177, term540177.getClass(), "reason", "");
        setField(term540177, term540177.getClass(), "classicAddress", "");
        setField(term540177, term540177.getClass(), "status", enum1025);
        setField(term540177, term540177.getClass(), "paymentAmount", "");
        setField(term540177, term540177.getClass(), "snapshotBalance", "");
        setField(term540177, term540177.getClass(), "nftOwned", "");
        Long term540187 = new Long(-9063283724358706942L);
        Class<? extends Object> term540903 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term540902 = ((Class) term540903).getDeclaredField((String) "VERIFIED");
        ((Field) term540902).setAccessible(true);
        Object enum1026 = ((Field) term540902).get((Object) null);
        Object term540186 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term540186, term540186.getClass(), "id", term540187);
        setField(term540186, term540186.getClass(), "responseCode", "");
        setField(term540186, term540186.getClass(), "reason", "");
        setField(term540186, term540186.getClass(), "classicAddress", "");
        setField(term540186, term540186.getClass(), "status", enum1026);
        setField(term540186, term540186.getClass(), "paymentAmount", "");
        setField(term540186, term540186.getClass(), "snapshotBalance", "");
        setField(term540186, term540186.getClass(), "nftOwned", "");
        Long term540198 = new Long(-8579515460152917650L);
        Object term540197 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term540197, term540197.getClass(), "id", term540198);
        setField(term540197, term540197.getClass(), "responseCode", "");
        setField(term540197, term540197.getClass(), "reason", "");
        setField(term540197, term540197.getClass(), "classicAddress", "");
        setField(term540197, term540197.getClass(), "status", enum1025);
        setField(term540197, term540197.getClass(), "paymentAmount", "");
        setField(term540197, term540197.getClass(), "snapshotBalance", "");
        setField(term540197, term540197.getClass(), "nftOwned", "");
        Long term540207 = new Long(-3033236171719733686L);
        Class<? extends Object> term541329 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term541328 = ((Class) term541329).getDeclaredField((String) "QUEUED");
        ((Field) term541328).setAccessible(true);
        Object enum1027 = ((Field) term541328).get((Object) null);
        Object term540206 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term540206, term540206.getClass(), "id", term540207);
        setField(term540206, term540206.getClass(), "responseCode", "");
        setField(term540206, term540206.getClass(), "reason", "");
        setField(term540206, term540206.getClass(), "classicAddress", "");
        setField(term540206, term540206.getClass(), "status", enum1027);
        setField(term540206, term540206.getClass(), "paymentAmount", "");
        setField(term540206, term540206.getClass(), "snapshotBalance", "");
        setField(term540206, term540206.getClass(), "nftOwned", "");
        Long term540218 = new Long(2458513029160061715L);
        Object term540217 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term540217, term540217.getClass(), "id", term540218);
        setField(term540217, term540217.getClass(), "responseCode", "");
        setField(term540217, term540217.getClass(), "reason", "");
        setField(term540217, term540217.getClass(), "classicAddress", "");
        setField(term540217, term540217.getClass(), "status", enum1026);
        setField(term540217, term540217.getClass(), "paymentAmount", "");
        setField(term540217, term540217.getClass(), "snapshotBalance", "");
        setField(term540217, term540217.getClass(), "nftOwned", "");
        ArrayList term540164 = new ArrayList();
        ((ArrayList) term540164).add(term540166);
        ((ArrayList) term540164).add(term540177);
        ((ArrayList) term540164).add(term540186);
        ((ArrayList) term540164).add(term540197);
        ((ArrayList) term540164).add(term540206);
        ((ArrayList) term540164).add(term540217);
        Long term540228 = new Long(8528564099162820842L);
        Class<? extends Object> term541749 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term541748 = ((Class) term541749).getDeclaredField((String) "ANNUALLY");
        ((Field) term541748).setAccessible(true);
        Object enum1028 = ((Field) term541748).get((Object) null);
        Class<? extends Object> term542145 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term542144 = ((Class) term542145).getDeclaredField((String) "SCHEDULED");
        ((Field) term542144).setAccessible(true);
        Object enum1029 = ((Field) term542144).get((Object) null);
        Integer term540325 = new Integer(-376422566);
        Class<? extends Object> term542614 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term542613 = ((Class) term542614).getDeclaredField((String) "TRUSTLINE");
        ((Field) term542613).setAccessible(true);
        Object enum1030 = ((Field) term542613).get((Object) null);
        Long term540376 = new Long(-1931621459457925623L);
        Long term540390 = new Long(-947267660485940099L);
        Class<? extends Object> term543028 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term543027 = ((Class) term543028).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term543027).setAccessible(true);
        Object enum1031 = ((Field) term543027).get((Object) null);
        Class<? extends Object> term543466 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term543465 = ((Class) term543466).getDeclaredField((String) "REJECTED");
        ((Field) term543465).setAccessible(true);
        Object enum1032 = ((Field) term543465).get((Object) null);
        Long term540468 = new Long(-1329447485805427573L);
        term540163 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term540230 = newInstance(Class.forName("java.util.Date"));
        Object term540232 = newInstance(Class.forName("java.util.Date"));
        Object term540234 = newInstance(Class.forName("java.util.Date"));
        Object term540236 = newInstance(Class.forName("java.util.Date"));
        setField(term540163, term540163.getClass(), "results", term540164);
        setField(term540163, term540163.getClass(), "id", term540228);
        setLongField(term540230, term540230.getClass(), "fastTime", 1673271309623L);
        setField(term540230, term540230.getClass(), "cdate", null);
        setField(term540163, term540163.getClass(), "createDate", term540230);
        setLongField(term540232, term540232.getClass(), "fastTime", 1762848107227L);
        setField(term540232, term540232.getClass(), "cdate", null);
        setField(term540163, term540163.getClass(), "updateDate", term540232);
        setLongField(term540234, term540234.getClass(), "fastTime", 1844346672950L);
        setField(term540234, term540234.getClass(), "cdate", null);
        setField(term540163, term540163.getClass(), "startTime", term540234);
        setLongField(term540236, term540236.getClass(), "fastTime", 1861952680676L);
        setField(term540236, term540236.getClass(), "cdate", null);
        setField(term540163, term540163.getClass(), "repeatUntilDate", term540236);
        setField(term540163, term540163.getClass(), "frequency", enum1028);
        setField(term540163, term540163.getClass(), "status", enum1029);
        setField(term540163, term540163.getClass(), "fromClassicAddress", "GjyMraKalr");
        setField(term540163, term540163.getClass(), "trustlineIssuerClassicAddress", "wZnhIfXRJr");
        setField(term540163, term540163.getClass(), "currencyName", "QIILqPYYAT");
        setField(term540163, term540163.getClass(), "currencyNameForProcess", "YxSRUAFNue");
        setField(term540163, term540163.getClass(), "amount", "lbpaurFUWq");
        setBooleanField(term540163, term540163.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term540163, term540163.getClass(), "useBlacklist", true);
        setField(term540163, term540163.getClass(), "maximumTrustlines", term540325);
        setField(term540163, term540163.getClass(), "dropType", enum1030);
        setField(term540163, term540163.getClass(), "failReason", "uQurqKokXn");
        setField(term540163, term540163.getClass(), "minBalance", "GyFudiWgJJ");
        setField(term540163, term540163.getClass(), "maxBalance", "bhNFHDPXAm");
        setField(term540163, term540163.getClass(), "totalBlacklisted", term540376);
        setField(term540163, term540163.getClass(), "maxXrpFeePerTransaction", "CWFDMUsvvv");
        setField(term540163, term540163.getClass(), "totalRecipients", term540390);
        setField(term540163, term540163.getClass(), "paymentType", enum1031);
        setField(term540163, term540163.getClass(), "snapshotTrustlineIssuerClassicAddress", "sbgDLSAIXy");
        setField(term540163, term540163.getClass(), "snapshotCurrencyName", "aVfwRDxQHA");
        setField(term540163, term540163.getClass(), "nftIssuingAddress", "uFkjaLucai");
        setField(term540163, term540163.getClass(), "nftTaxon", "VBgGrYiYVS");
        setField(term540163, term540163.getClass(), "scheduleStatus", enum1032);
        setField(term540163, term540163.getClass(), "fromScheduleId", term540468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MRyukjqCAG";
        callMethod(klass, "nftTaxon", argTypes, term540163, args);
    }

};


