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

public class PaymentRequestEnt_toString_1572459035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116318;

    public PaymentRequestEnt_toString_1572459035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term116319 = new Long(2274723545906746965L);
        Class<? extends Object> term116633 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term116632 = ((Class) term116633).getDeclaredField((String) "SCHEDULED");
        ((Field) term116632).setAccessible(true);
        Object enum208 = ((Field) term116632).get((Object) null);
        Class<? extends Object> term117142 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term117141 = ((Class) term117142).getDeclaredField((String) "FLAT");
        ((Field) term117141).setAccessible(true);
        Object enum209 = ((Field) term117141).get((Object) null);
        Boolean term116480 = new Boolean(false);
        Boolean term116482 = new Boolean(false);
        Integer term116484 = new Integer(-1547384488);
        Class<? extends Object> term117516 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term117515 = ((Class) term117516).getDeclaredField((String) "GLOBALID");
        ((Field) term117515).setAccessible(true);
        Object enum210 = ((Field) term117515).get((Object) null);
        Long term116570 = new Long(1353683663053784647L);
        Long term116584 = new Long(-1465819833800717311L);
        Boolean term116598 = new Boolean(false);
        term116318 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term116345 = newInstance(Class.forName("java.util.Date"));
        Object term116347 = newInstance(Class.forName("java.util.Date"));
        Object term116349 = newInstance(Class.forName("java.util.Date"));
        setField(term116318, term116318.getClass(), "id", term116319);
        setField(term116318, term116318.getClass(), "environment", "EBSKhqDdUW");
        setField(term116318, term116318.getClass(), "populateEnvironment", "LvLbdICdfA");
        setLongField(term116345, term116345.getClass(), "fastTime", 1629693899295L);
        setField(term116345, term116345.getClass(), "cdate", null);
        setField(term116318, term116318.getClass(), "createDate", term116345);
        setLongField(term116347, term116347.getClass(), "fastTime", 1826251741593L);
        setField(term116347, term116347.getClass(), "cdate", null);
        setField(term116318, term116318.getClass(), "updateDate", term116347);
        setLongField(term116349, term116349.getClass(), "fastTime", 1422779118265L);
        setField(term116349, term116349.getClass(), "cdate", null);
        setField(term116318, term116318.getClass(), "startTime", term116349);
        setField(term116318, term116318.getClass(), "status", enum208);
        setField(term116318, term116318.getClass(), "fromClassicAddress", "rtifrlITwl");
        setField(term116318, term116318.getClass(), "fromSigningPublicKey", "yGWXZDjnPS");
        setField(term116318, term116318.getClass(), "fromPrivateKey", "vZucxbGVyo");
        setField(term116318, term116318.getClass(), "trustlineIssuerClassicAddress", "ZZoLNbeORl");
        setField(term116318, term116318.getClass(), "currencyName", "XjIOUIzJUP");
        setField(term116318, term116318.getClass(), "snapshotTrustlineIssuerClassicAddress", "iGTpXnnTqB");
        setField(term116318, term116318.getClass(), "snapshotCurrencyName", "XgJzBOYfQB");
        setField(term116318, term116318.getClass(), "currencyNameForProcess", "GAPGgDekVG");
        setField(term116318, term116318.getClass(), "amount", "WmTogHwGLE");
        setField(term116318, term116318.getClass(), "paymentType", enum209);
        setField(term116318, term116318.getClass(), "newTrustlinesOnly", term116480);
        setField(term116318, term116318.getClass(), "useBlacklist", term116482);
        setField(term116318, term116318.getClass(), "maximumTrustlines", term116484);
        setField(term116318, term116318.getClass(), "dropType", enum210);
        setField(term116318, term116318.getClass(), "lockUuid", "qYOIXsGycY");
        setField(term116318, term116318.getClass(), "failReason", "sJNXNshRLe");
        setField(term116318, term116318.getClass(), "feesPaid", "AYnbmgRCKr");
        setField(term116318, term116318.getClass(), "minBalance", "iQRfDlaoYD");
        setField(term116318, term116318.getClass(), "maxBalance", "kpcyrjDQzN");
        setField(term116318, term116318.getClass(), "maxXrpFeePerTransaction", "IyukykAHLQ");
        setField(term116318, term116318.getClass(), "retryOfId", term116570);
        setField(term116318, term116318.getClass(), "nftIssuerAddress", "CwZcgFJqMh");
        setField(term116318, term116318.getClass(), "nftTaxon", term116584);
        setField(term116318, term116318.getClass(), "contactEmail", "RldCZqgRbO");
        setField(term116318, term116318.getClass(), "autoApprove", term116598);
        setField(term116318, term116318.getClass(), "memo", "LOVugCAgJs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term116318, args);
    }

};


