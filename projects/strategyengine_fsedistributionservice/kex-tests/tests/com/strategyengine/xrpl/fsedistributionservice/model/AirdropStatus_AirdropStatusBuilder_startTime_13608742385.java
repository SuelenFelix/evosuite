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

public class AirdropStatus_AirdropStatusBuilder_startTime_13608742385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461090;
     Object term461357;

    public AirdropStatus_AirdropStatusBuilder_startTime_13608742385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term461094 = new Long(-5898738968422709494L);
        Class<? extends Object> term461360 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term461359 = ((Class) term461360).getDeclaredField((String) "SENDING");
        ((Field) term461359).setAccessible(true);
        Object enum856 = ((Field) term461359).get((Object) null);
        Object term461093 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term461093, term461093.getClass(), "id", term461094);
        setField(term461093, term461093.getClass(), "responseCode", "");
        setField(term461093, term461093.getClass(), "reason", "");
        setField(term461093, term461093.getClass(), "classicAddress", "");
        setField(term461093, term461093.getClass(), "status", enum856);
        setField(term461093, term461093.getClass(), "paymentAmount", "");
        setField(term461093, term461093.getClass(), "snapshotBalance", "");
        setField(term461093, term461093.getClass(), "nftOwned", "");
        Long term461105 = new Long(1222571199408067081L);
        Class<? extends Object> term461783 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term461782 = ((Class) term461783).getDeclaredField((String) "SENDING");
        ((Field) term461782).setAccessible(true);
        Object enum857 = ((Field) term461782).get((Object) null);
        Object term461104 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term461104, term461104.getClass(), "id", term461105);
        setField(term461104, term461104.getClass(), "responseCode", "");
        setField(term461104, term461104.getClass(), "reason", "");
        setField(term461104, term461104.getClass(), "classicAddress", "");
        setField(term461104, term461104.getClass(), "status", enum857);
        setField(term461104, term461104.getClass(), "paymentAmount", "");
        setField(term461104, term461104.getClass(), "snapshotBalance", "");
        setField(term461104, term461104.getClass(), "nftOwned", "");
        ArrayList term461091 = new ArrayList();
        ((ArrayList) term461091).add(term461093);
        ((ArrayList) term461091).add(term461104);
        Long term461117 = new Long(-3672309483214533219L);
        Class<? extends Object> term462206 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term462205 = ((Class) term462206).getDeclaredField((String) "MONTHLY");
        ((Field) term462205).setAccessible(true);
        Object enum858 = ((Field) term462205).get((Object) null);
        Class<? extends Object> term462599 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term462598 = ((Class) term462599).getDeclaredField((String) "REJECTED");
        ((Field) term462598).setAccessible(true);
        Object enum859 = ((Field) term462598).get((Object) null);
        Integer term461212 = new Integer(1460722225);
        Class<? extends Object> term463065 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term463064 = ((Class) term463065).getDeclaredField((String) "TRUSTLINE");
        ((Field) term463064).setAccessible(true);
        Object enum860 = ((Field) term463064).get((Object) null);
        Long term461263 = new Long(-2448708288718122671L);
        Long term461277 = new Long(7391856662550454315L);
        Class<? extends Object> term463479 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term463478 = ((Class) term463479).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term463478).setAccessible(true);
        Object enum861 = ((Field) term463478).get((Object) null);
        Class<? extends Object> term463917 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term463916 = ((Class) term463917).getDeclaredField((String) "COMPLETE");
        ((Field) term463916).setAccessible(true);
        Object enum862 = ((Field) term463916).get((Object) null);
        Long term461355 = new Long(-6573442531269156325L);
        term461090 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term461119 = newInstance(Class.forName("java.util.Date"));
        Object term461121 = newInstance(Class.forName("java.util.Date"));
        Object term461123 = newInstance(Class.forName("java.util.Date"));
        Object term461125 = newInstance(Class.forName("java.util.Date"));
        setField(term461090, term461090.getClass(), "results", term461091);
        setField(term461090, term461090.getClass(), "id", term461117);
        setLongField(term461119, term461119.getClass(), "fastTime", 1636747965167L);
        setField(term461119, term461119.getClass(), "cdate", null);
        setField(term461090, term461090.getClass(), "createDate", term461119);
        setLongField(term461121, term461121.getClass(), "fastTime", 1299938593104L);
        setField(term461121, term461121.getClass(), "cdate", null);
        setField(term461090, term461090.getClass(), "updateDate", term461121);
        setLongField(term461123, term461123.getClass(), "fastTime", 1446773387071L);
        setField(term461123, term461123.getClass(), "cdate", null);
        setField(term461090, term461090.getClass(), "startTime", term461123);
        setLongField(term461125, term461125.getClass(), "fastTime", 1512588487715L);
        setField(term461125, term461125.getClass(), "cdate", null);
        setField(term461090, term461090.getClass(), "repeatUntilDate", term461125);
        setField(term461090, term461090.getClass(), "frequency", enum858);
        setField(term461090, term461090.getClass(), "status", enum859);
        setField(term461090, term461090.getClass(), "fromClassicAddress", "kZuCVafpBC");
        setField(term461090, term461090.getClass(), "trustlineIssuerClassicAddress", "tuuGLQHGpJ");
        setField(term461090, term461090.getClass(), "currencyName", "rFjmvrGmka");
        setField(term461090, term461090.getClass(), "currencyNameForProcess", "RijAbGfWJJ");
        setField(term461090, term461090.getClass(), "amount", "BFhXRjyNcR");
        setBooleanField(term461090, term461090.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term461090, term461090.getClass(), "useBlacklist", true);
        setField(term461090, term461090.getClass(), "maximumTrustlines", term461212);
        setField(term461090, term461090.getClass(), "dropType", enum860);
        setField(term461090, term461090.getClass(), "failReason", "CbegedoDMX");
        setField(term461090, term461090.getClass(), "minBalance", "QaUSMtBYEg");
        setField(term461090, term461090.getClass(), "maxBalance", "mhHbJIyDIB");
        setField(term461090, term461090.getClass(), "totalBlacklisted", term461263);
        setField(term461090, term461090.getClass(), "maxXrpFeePerTransaction", "ZItlvaBFFD");
        setField(term461090, term461090.getClass(), "totalRecipients", term461277);
        setField(term461090, term461090.getClass(), "paymentType", enum861);
        setField(term461090, term461090.getClass(), "snapshotTrustlineIssuerClassicAddress", "oRinHImOGE");
        setField(term461090, term461090.getClass(), "snapshotCurrencyName", "JfZLvvSNPi");
        setField(term461090, term461090.getClass(), "nftIssuingAddress", "iCNRyVJwAS");
        setField(term461090, term461090.getClass(), "nftTaxon", "unLxzAzMJt");
        setField(term461090, term461090.getClass(), "scheduleStatus", enum862);
        setField(term461090, term461090.getClass(), "fromScheduleId", term461355);
        term461357 = newInstance(Class.forName("java.util.Date"));
        setLongField(term461357, term461357.getClass(), "fastTime", 1357335128523L);
        setField(term461357, term461357.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term461357;
        callMethod(klass, "startTime", argTypes, term461090, args);
    }

};


