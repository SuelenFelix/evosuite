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

public class AirdropStatus_AirdropStatusBuilder_totalBlacklisted_8234519321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term514886;
     Object term515174;

    public AirdropStatus_AirdropStatusBuilder_totalBlacklisted_8234519321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term514890 = new Long(5990686118620195001L);
        Class<? extends Object> term515177 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term515176 = ((Class) term515177).getDeclaredField((String) "SENDING");
        ((Field) term515176).setAccessible(true);
        Object enum971 = ((Field) term515176).get((Object) null);
        Object term514889 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term514889, term514889.getClass(), "id", term514890);
        setField(term514889, term514889.getClass(), "responseCode", "");
        setField(term514889, term514889.getClass(), "reason", "");
        setField(term514889, term514889.getClass(), "classicAddress", "");
        setField(term514889, term514889.getClass(), "status", enum971);
        setField(term514889, term514889.getClass(), "paymentAmount", "");
        setField(term514889, term514889.getClass(), "snapshotBalance", "");
        setField(term514889, term514889.getClass(), "nftOwned", "");
        Long term514901 = new Long(268218069036722127L);
        Class<? extends Object> term515600 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term515599 = ((Class) term515600).getDeclaredField((String) "QUEUED");
        ((Field) term515599).setAccessible(true);
        Object enum972 = ((Field) term515599).get((Object) null);
        Object term514900 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term514900, term514900.getClass(), "id", term514901);
        setField(term514900, term514900.getClass(), "responseCode", "");
        setField(term514900, term514900.getClass(), "reason", "");
        setField(term514900, term514900.getClass(), "classicAddress", "");
        setField(term514900, term514900.getClass(), "status", enum972);
        setField(term514900, term514900.getClass(), "paymentAmount", "");
        setField(term514900, term514900.getClass(), "snapshotBalance", "");
        setField(term514900, term514900.getClass(), "nftOwned", "");
        Long term514912 = new Long(-3992663397060695265L);
        Class<? extends Object> term516020 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term516019 = ((Class) term516020).getDeclaredField((String) "QUEUED");
        ((Field) term516019).setAccessible(true);
        Object enum973 = ((Field) term516019).get((Object) null);
        Object term514911 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term514911, term514911.getClass(), "id", term514912);
        setField(term514911, term514911.getClass(), "responseCode", "");
        setField(term514911, term514911.getClass(), "reason", "");
        setField(term514911, term514911.getClass(), "classicAddress", "");
        setField(term514911, term514911.getClass(), "status", enum973);
        setField(term514911, term514911.getClass(), "paymentAmount", "");
        setField(term514911, term514911.getClass(), "snapshotBalance", "");
        setField(term514911, term514911.getClass(), "nftOwned", "");
        Long term514923 = new Long(4987297090886718616L);
        Object term514922 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term514922, term514922.getClass(), "id", term514923);
        setField(term514922, term514922.getClass(), "responseCode", "");
        setField(term514922, term514922.getClass(), "reason", "");
        setField(term514922, term514922.getClass(), "classicAddress", "");
        setField(term514922, term514922.getClass(), "status", enum972);
        setField(term514922, term514922.getClass(), "paymentAmount", "");
        setField(term514922, term514922.getClass(), "snapshotBalance", "");
        setField(term514922, term514922.getClass(), "nftOwned", "");
        Long term514932 = new Long(-2373676985592181240L);
        Object term514931 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term514931, term514931.getClass(), "id", term514932);
        setField(term514931, term514931.getClass(), "responseCode", "");
        setField(term514931, term514931.getClass(), "reason", "");
        setField(term514931, term514931.getClass(), "classicAddress", "");
        setField(term514931, term514931.getClass(), "status", enum971);
        setField(term514931, term514931.getClass(), "paymentAmount", "");
        setField(term514931, term514931.getClass(), "snapshotBalance", "");
        setField(term514931, term514931.getClass(), "nftOwned", "");
        ArrayList term514887 = new ArrayList();
        ((ArrayList) term514887).add(term514889);
        ((ArrayList) term514887).add(term514900);
        ((ArrayList) term514887).add(term514911);
        ((ArrayList) term514887).add(term514922);
        ((ArrayList) term514887).add(term514931);
        Long term514942 = new Long(-259683062954031772L);
        Class<? extends Object> term516440 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term516439 = ((Class) term516440).getDeclaredField((String) "MONTHLY");
        ((Field) term516439).setAccessible(true);
        Object enum974 = ((Field) term516439).get((Object) null);
        Class<? extends Object> term516833 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term516832 = ((Class) term516833).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term516832).setAccessible(true);
        Object enum975 = ((Field) term516832).get((Object) null);
        Integer term515040 = new Integer(-945116798);
        Class<? extends Object> term517308 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term517307 = ((Class) term517308).getDeclaredField((String) "GLOBALID");
        ((Field) term517307).setAccessible(true);
        Object enum976 = ((Field) term517307).get((Object) null);
        Long term515090 = new Long(5446921500259357484L);
        Long term515104 = new Long(-2887572667974552998L);
        Class<? extends Object> term517719 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term517718 = ((Class) term517719).getDeclaredField((String) "FLAT");
        ((Field) term517718).setAccessible(true);
        Object enum977 = ((Field) term517718).get((Object) null);
        Class<? extends Object> term518133 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term518132 = ((Class) term518133).getDeclaredField((String) "ACTIVE");
        ((Field) term518132).setAccessible(true);
        Object enum978 = ((Field) term518132).get((Object) null);
        Long term515172 = new Long(38900113635378049L);
        term514886 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term514944 = newInstance(Class.forName("java.util.Date"));
        Object term514946 = newInstance(Class.forName("java.util.Date"));
        Object term514948 = newInstance(Class.forName("java.util.Date"));
        Object term514950 = newInstance(Class.forName("java.util.Date"));
        setField(term514886, term514886.getClass(), "results", term514887);
        setField(term514886, term514886.getClass(), "id", term514942);
        setLongField(term514944, term514944.getClass(), "fastTime", 1399302979571L);
        setField(term514944, term514944.getClass(), "cdate", null);
        setField(term514886, term514886.getClass(), "createDate", term514944);
        setLongField(term514946, term514946.getClass(), "fastTime", 1730158389728L);
        setField(term514946, term514946.getClass(), "cdate", null);
        setField(term514886, term514886.getClass(), "updateDate", term514946);
        setLongField(term514948, term514948.getClass(), "fastTime", 1427083903522L);
        setField(term514948, term514948.getClass(), "cdate", null);
        setField(term514886, term514886.getClass(), "startTime", term514948);
        setLongField(term514950, term514950.getClass(), "fastTime", 1557305944075L);
        setField(term514950, term514950.getClass(), "cdate", null);
        setField(term514886, term514886.getClass(), "repeatUntilDate", term514950);
        setField(term514886, term514886.getClass(), "frequency", enum974);
        setField(term514886, term514886.getClass(), "status", enum975);
        setField(term514886, term514886.getClass(), "fromClassicAddress", "tsCHeBTsRj");
        setField(term514886, term514886.getClass(), "trustlineIssuerClassicAddress", "TcvdHlKKqR");
        setField(term514886, term514886.getClass(), "currencyName", "MjnlUNAbWN");
        setField(term514886, term514886.getClass(), "currencyNameForProcess", "lpzPSZrJNP");
        setField(term514886, term514886.getClass(), "amount", "IUwWcCDHby");
        setBooleanField(term514886, term514886.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term514886, term514886.getClass(), "useBlacklist", false);
        setField(term514886, term514886.getClass(), "maximumTrustlines", term515040);
        setField(term514886, term514886.getClass(), "dropType", enum976);
        setField(term514886, term514886.getClass(), "failReason", "PxmOkaAbkD");
        setField(term514886, term514886.getClass(), "minBalance", "HydtLkUggc");
        setField(term514886, term514886.getClass(), "maxBalance", "xqFhlNGPNf");
        setField(term514886, term514886.getClass(), "totalBlacklisted", term515090);
        setField(term514886, term514886.getClass(), "maxXrpFeePerTransaction", "inJfaygIHT");
        setField(term514886, term514886.getClass(), "totalRecipients", term515104);
        setField(term514886, term514886.getClass(), "paymentType", enum977);
        setField(term514886, term514886.getClass(), "snapshotTrustlineIssuerClassicAddress", "LSmdmNXNmK");
        setField(term514886, term514886.getClass(), "snapshotCurrencyName", "ouSqIuBxkU");
        setField(term514886, term514886.getClass(), "nftIssuingAddress", "PIskQzLbQC");
        setField(term514886, term514886.getClass(), "nftTaxon", "WCPEcCgFoc");
        setField(term514886, term514886.getClass(), "scheduleStatus", enum978);
        setField(term514886, term514886.getClass(), "fromScheduleId", term515172);
        term515174 = new Long(2167389818358075653L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term515174;
        callMethod(klass, "totalBlacklisted", argTypes, term514886, args);
    }

};


