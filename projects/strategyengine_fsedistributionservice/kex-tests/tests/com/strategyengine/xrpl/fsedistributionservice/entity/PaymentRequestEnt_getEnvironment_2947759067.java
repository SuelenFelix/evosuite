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

public class PaymentRequestEnt_getEnvironment_2947759067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119634;

    public PaymentRequestEnt_getEnvironment_2947759067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term119635 = new Long(-2691996476200751382L);
        Class<? extends Object> term119966 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term119965 = ((Class) term119966).getDeclaredField((String) "SCHEDULED");
        ((Field) term119965).setAccessible(true);
        Object enum214 = ((Field) term119965).get((Object) null);
        Class<? extends Object> term120475 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term120474 = ((Class) term120475).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term120474).setAccessible(true);
        Object enum215 = ((Field) term120474).get((Object) null);
        Boolean term119804 = new Boolean(true);
        Boolean term119806 = new Boolean(false);
        Integer term119808 = new Integer(1114000454);
        Class<? extends Object> term120873 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term120872 = ((Class) term120873).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term120872).setAccessible(true);
        Object enum216 = ((Field) term120872).get((Object) null);
        Long term119903 = new Long(-3806202176947356197L);
        Long term119917 = new Long(-5534222035915952617L);
        Boolean term119931 = new Boolean(false);
        term119634 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term119661 = newInstance(Class.forName("java.util.Date"));
        Object term119663 = newInstance(Class.forName("java.util.Date"));
        Object term119665 = newInstance(Class.forName("java.util.Date"));
        setField(term119634, term119634.getClass(), "id", term119635);
        setField(term119634, term119634.getClass(), "environment", "fvoyRbZTsm");
        setField(term119634, term119634.getClass(), "populateEnvironment", "iOCnOQXWTl");
        setLongField(term119661, term119661.getClass(), "fastTime", 1789681710192L);
        setField(term119661, term119661.getClass(), "cdate", null);
        setField(term119634, term119634.getClass(), "createDate", term119661);
        setLongField(term119663, term119663.getClass(), "fastTime", 1786374298622L);
        setField(term119663, term119663.getClass(), "cdate", null);
        setField(term119634, term119634.getClass(), "updateDate", term119663);
        setLongField(term119665, term119665.getClass(), "fastTime", 1710602340656L);
        setField(term119665, term119665.getClass(), "cdate", null);
        setField(term119634, term119634.getClass(), "startTime", term119665);
        setField(term119634, term119634.getClass(), "status", enum214);
        setField(term119634, term119634.getClass(), "fromClassicAddress", "ARnOWpgtAg");
        setField(term119634, term119634.getClass(), "fromSigningPublicKey", "MRrYxZoJBW");
        setField(term119634, term119634.getClass(), "fromPrivateKey", "fheZXFNQZh");
        setField(term119634, term119634.getClass(), "trustlineIssuerClassicAddress", "YxHVWlebna");
        setField(term119634, term119634.getClass(), "currencyName", "IEmAQCkrPE");
        setField(term119634, term119634.getClass(), "snapshotTrustlineIssuerClassicAddress", "lqFGhtlNRM");
        setField(term119634, term119634.getClass(), "snapshotCurrencyName", "GLxLHUsuLw");
        setField(term119634, term119634.getClass(), "currencyNameForProcess", "HuKdqrrxIm");
        setField(term119634, term119634.getClass(), "amount", "yJKKddLqMb");
        setField(term119634, term119634.getClass(), "paymentType", enum215);
        setField(term119634, term119634.getClass(), "newTrustlinesOnly", term119804);
        setField(term119634, term119634.getClass(), "useBlacklist", term119806);
        setField(term119634, term119634.getClass(), "maximumTrustlines", term119808);
        setField(term119634, term119634.getClass(), "dropType", enum216);
        setField(term119634, term119634.getClass(), "lockUuid", "LWEYaXeKBe");
        setField(term119634, term119634.getClass(), "failReason", "cNoFvpHBHw");
        setField(term119634, term119634.getClass(), "feesPaid", "DoSWbCtsBg");
        setField(term119634, term119634.getClass(), "minBalance", "NrXtkbXwDc");
        setField(term119634, term119634.getClass(), "maxBalance", "EUapSrAmOe");
        setField(term119634, term119634.getClass(), "maxXrpFeePerTransaction", "dUHylIprea");
        setField(term119634, term119634.getClass(), "retryOfId", term119903);
        setField(term119634, term119634.getClass(), "nftIssuerAddress", "FKDqHRpMcc");
        setField(term119634, term119634.getClass(), "nftTaxon", term119917);
        setField(term119634, term119634.getClass(), "contactEmail", "mIRMQIxHUD");
        setField(term119634, term119634.getClass(), "autoApprove", term119931);
        setField(term119634, term119634.getClass(), "memo", "FbBMtntDbw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnvironment", argTypes, term119634, args);
    }

};


