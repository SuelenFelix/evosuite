package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;

public class PaymentRequestEnt_setMinBalance_205051743765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218056;

    public PaymentRequestEnt_setMinBalance_205051743765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term218057 = new Long(-8985577692063635272L);
        Class<? extends Object> term218408 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term218407 = ((Class) term218408).getDeclaredField((String) "COMPLETE");
        ((Field) term218407).setAccessible(true);
        Object enum387 = ((Field) term218407).get((Object) null);
        Class<? extends Object> term218914 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term218913 = ((Class) term218914).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term218913).setAccessible(true);
        Object enum388 = ((Field) term218913).get((Object) null);
        Boolean term218225 = new Boolean(false);
        Boolean term218227 = new Boolean(true);
        Integer term218229 = new Integer(1555897383);
        Class<? extends Object> term219312 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term219311 = ((Class) term219312).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term219311).setAccessible(true);
        Object enum389 = ((Field) term219311).get((Object) null);
        Long term218333 = new Long(6545086285386938562L);
        Long term218347 = new Long(3951346165629352117L);
        Boolean term218361 = new Boolean(true);
        term218056 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term218083 = newInstance(Class.forName("java.util.Date"));
        Object term218085 = newInstance(Class.forName("java.util.Date"));
        Object term218087 = newInstance(Class.forName("java.util.Date"));
        setField(term218056, term218056.getClass(), "id", term218057);
        setField(term218056, term218056.getClass(), "environment", "EPkEFVlZrY");
        setField(term218056, term218056.getClass(), "populateEnvironment", "jySnpYEVPv");
        setLongField(term218083, term218083.getClass(), "fastTime", 1680045479564L);
        setField(term218083, term218083.getClass(), "cdate", null);
        setField(term218056, term218056.getClass(), "createDate", term218083);
        setLongField(term218085, term218085.getClass(), "fastTime", 1815243878528L);
        setField(term218085, term218085.getClass(), "cdate", null);
        setField(term218056, term218056.getClass(), "updateDate", term218085);
        setLongField(term218087, term218087.getClass(), "fastTime", 1517698380660L);
        setField(term218087, term218087.getClass(), "cdate", null);
        setField(term218056, term218056.getClass(), "startTime", term218087);
        setField(term218056, term218056.getClass(), "status", enum387);
        setField(term218056, term218056.getClass(), "fromClassicAddress", "VdHqujFzSo");
        setField(term218056, term218056.getClass(), "fromSigningPublicKey", "cZbOKEdKPs");
        setField(term218056, term218056.getClass(), "fromPrivateKey", "nvXqvMSAjc");
        setField(term218056, term218056.getClass(), "trustlineIssuerClassicAddress", "agbhgbQisl");
        setField(term218056, term218056.getClass(), "currencyName", "EZvlAVCXCm");
        setField(term218056, term218056.getClass(), "snapshotTrustlineIssuerClassicAddress", "axtbmWOSRY");
        setField(term218056, term218056.getClass(), "snapshotCurrencyName", "TLlyjzxJUz");
        setField(term218056, term218056.getClass(), "currencyNameForProcess", "YclIWGPKZY");
        setField(term218056, term218056.getClass(), "amount", "gChBjLUhbg");
        setField(term218056, term218056.getClass(), "paymentType", enum388);
        setField(term218056, term218056.getClass(), "newTrustlinesOnly", term218225);
        setField(term218056, term218056.getClass(), "useBlacklist", term218227);
        setField(term218056, term218056.getClass(), "maximumTrustlines", term218229);
        setField(term218056, term218056.getClass(), "dropType", enum389);
        setField(term218056, term218056.getClass(), "lockUuid", "enWkULOykY");
        setField(term218056, term218056.getClass(), "failReason", "BPdcafiAQX");
        setField(term218056, term218056.getClass(), "feesPaid", "GvmOxwMrOk");
        setField(term218056, term218056.getClass(), "minBalance", "WXUKmhwFsK");
        setField(term218056, term218056.getClass(), "maxBalance", "OcfokBTzZZ");
        setField(term218056, term218056.getClass(), "maxXrpFeePerTransaction", "zeBhlhyhkL");
        setField(term218056, term218056.getClass(), "retryOfId", term218333);
        setField(term218056, term218056.getClass(), "nftIssuerAddress", "PxinRhWgwT");
        setField(term218056, term218056.getClass(), "nftTaxon", term218347);
        setField(term218056, term218056.getClass(), "contactEmail", "pZcEKUNIXL");
        setField(term218056, term218056.getClass(), "autoApprove", term218361);
        setField(term218056, term218056.getClass(), "memo", "QbRtvZIDtW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fbsmDvjMqr";
        callMethod(klass, "setMinBalance", argTypes, term218056, args);
    }

};


