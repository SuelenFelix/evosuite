package com.strategyengine.xrpl.fsedistributionservice.service.impl;

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
import static com.strategyengine.xrpl.fsedistributionservice.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;

public class HungPopulatingCheckSchedulerImpl_resubmit_13972341762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10854;

    public HungPopulatingCheckSchedulerImpl_resubmit_13972341762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10855 = new Long(4784595517102746672L);
        Class<? extends Object> term11177 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term11176 = ((Class) term11177).getDeclaredField((String) "SCHEDULED");
        ((Field) term11176).setAccessible(true);
        Object enum18 = ((Field) term11176).get((Object) null);
        Class<? extends Object> term11686 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term11685 = ((Class) term11686).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term11685).setAccessible(true);
        Object enum19 = ((Field) term11685).get((Object) null);
        Boolean term11024 = new Boolean(true);
        Boolean term11026 = new Boolean(true);
        Integer term11028 = new Integer(-1339778481);
        Class<? extends Object> term12084 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term12083 = ((Class) term12084).getDeclaredField((String) "GLOBALID");
        ((Field) term12083).setAccessible(true);
        Object enum20 = ((Field) term12083).get((Object) null);
        Long term11114 = new Long(-7612550318181586304L);
        Long term11128 = new Long(-2170847986967241072L);
        Boolean term11142 = new Boolean(false);
        term10854 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term10881 = newInstance(Class.forName("java.util.Date"));
        Object term10883 = newInstance(Class.forName("java.util.Date"));
        Object term10885 = newInstance(Class.forName("java.util.Date"));
        setField(term10854, term10854.getClass(), "id", term10855);
        setField(term10854, term10854.getClass(), "environment", "lihXWlGDxk");
        setField(term10854, term10854.getClass(), "populateEnvironment", "JmcmxoGhIK");
        setLongField(term10881, term10881.getClass(), "fastTime", 1630952644759L);
        setField(term10881, term10881.getClass(), "cdate", null);
        setField(term10854, term10854.getClass(), "createDate", term10881);
        setLongField(term10883, term10883.getClass(), "fastTime", 1739417792956L);
        setField(term10883, term10883.getClass(), "cdate", null);
        setField(term10854, term10854.getClass(), "updateDate", term10883);
        setLongField(term10885, term10885.getClass(), "fastTime", 1329640267573L);
        setField(term10885, term10885.getClass(), "cdate", null);
        setField(term10854, term10854.getClass(), "startTime", term10885);
        setField(term10854, term10854.getClass(), "status", enum18);
        setField(term10854, term10854.getClass(), "fromClassicAddress", "jXzmYyrnnT");
        setField(term10854, term10854.getClass(), "fromSigningPublicKey", "igCAtimmYB");
        setField(term10854, term10854.getClass(), "fromPrivateKey", "DyiXbeYIaN");
        setField(term10854, term10854.getClass(), "trustlineIssuerClassicAddress", "VGizxZnyHX");
        setField(term10854, term10854.getClass(), "currencyName", "kVEZMHmRtR");
        setField(term10854, term10854.getClass(), "snapshotTrustlineIssuerClassicAddress", "ekxGuOYIwi");
        setField(term10854, term10854.getClass(), "snapshotCurrencyName", "RbVQXSpxXy");
        setField(term10854, term10854.getClass(), "currencyNameForProcess", "YpJbIgJWWv");
        setField(term10854, term10854.getClass(), "amount", "JppkknKVOw");
        setField(term10854, term10854.getClass(), "paymentType", enum19);
        setField(term10854, term10854.getClass(), "newTrustlinesOnly", term11024);
        setField(term10854, term10854.getClass(), "useBlacklist", term11026);
        setField(term10854, term10854.getClass(), "maximumTrustlines", term11028);
        setField(term10854, term10854.getClass(), "dropType", enum20);
        setField(term10854, term10854.getClass(), "lockUuid", "iljANwuEjk");
        setField(term10854, term10854.getClass(), "failReason", "kNqaJKIATy");
        setField(term10854, term10854.getClass(), "feesPaid", "vKQukfbJUd");
        setField(term10854, term10854.getClass(), "minBalance", "lFRJFUMVbx");
        setField(term10854, term10854.getClass(), "maxBalance", "sZdUNdggUW");
        setField(term10854, term10854.getClass(), "maxXrpFeePerTransaction", "OqbwYQfvAe");
        setField(term10854, term10854.getClass(), "retryOfId", term11114);
        setField(term10854, term10854.getClass(), "nftIssuerAddress", "tRxZafjqIx");
        setField(term10854, term10854.getClass(), "nftTaxon", term11128);
        setField(term10854, term10854.getClass(), "contactEmail", "DhjNLmRMCu");
        setField(term10854, term10854.getClass(), "autoApprove", term11142);
        setField(term10854, term10854.getClass(), "memo", "PgPzMSEjjX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.HungPopulatingCheckSchedulerImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Object[] args = new Object[1];
        args[0] = term10854;
        callMethod(klass, "resubmit", argTypes, null, args);
    }

};


