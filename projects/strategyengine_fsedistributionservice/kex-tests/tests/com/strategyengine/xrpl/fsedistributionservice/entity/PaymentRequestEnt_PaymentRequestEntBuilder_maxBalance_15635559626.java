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

public class PaymentRequestEnt_PaymentRequestEntBuilder_maxBalance_15635559626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91941;

    public PaymentRequestEnt_PaymentRequestEntBuilder_maxBalance_15635559626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term91942 = new Long(-7632759764262745126L);
        Class<? extends Object> term92280 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term92279 = ((Class) term92280).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term92279).setAccessible(true);
        Object enum166 = ((Field) term92279).get((Object) null);
        Class<? extends Object> term92822 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term92821 = ((Class) term92822).getDeclaredField((String) "FLAT");
        ((Field) term92821).setAccessible(true);
        Object enum167 = ((Field) term92821).get((Object) null);
        Boolean term92114 = new Boolean(false);
        Boolean term92116 = new Boolean(false);
        Integer term92118 = new Integer(1540719661);
        Class<? extends Object> term93196 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term93195 = ((Class) term93196).getDeclaredField((String) "TRUSTLINE");
        ((Field) term93195).setAccessible(true);
        Object enum168 = ((Field) term93195).get((Object) null);
        Long term92205 = new Long(3746481521207337771L);
        Long term92219 = new Long(4341016500855678917L);
        Boolean term92233 = new Boolean(true);
        term91941 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term91968 = newInstance(Class.forName("java.util.Date"));
        Object term91970 = newInstance(Class.forName("java.util.Date"));
        Object term91972 = newInstance(Class.forName("java.util.Date"));
        setField(term91941, term91941.getClass(), "id", term91942);
        setField(term91941, term91941.getClass(), "environment", "fOuOhBpldm");
        setField(term91941, term91941.getClass(), "populateEnvironment", "qQQRKGPyIM");
        setLongField(term91968, term91968.getClass(), "fastTime", 1401543935023L);
        setField(term91968, term91968.getClass(), "cdate", null);
        setField(term91941, term91941.getClass(), "createDate", term91968);
        setLongField(term91970, term91970.getClass(), "fastTime", 1439706159917L);
        setField(term91970, term91970.getClass(), "cdate", null);
        setField(term91941, term91941.getClass(), "updateDate", term91970);
        setLongField(term91972, term91972.getClass(), "fastTime", 1293737598443L);
        setField(term91972, term91972.getClass(), "cdate", null);
        setField(term91941, term91941.getClass(), "startTime", term91972);
        setField(term91941, term91941.getClass(), "status", enum166);
        setField(term91941, term91941.getClass(), "fromClassicAddress", "lzcwhvjdFg");
        setField(term91941, term91941.getClass(), "fromSigningPublicKey", "dfzWTjcjnI");
        setField(term91941, term91941.getClass(), "fromPrivateKey", "bsnZXGEvFv");
        setField(term91941, term91941.getClass(), "trustlineIssuerClassicAddress", "osFrHWYeRy");
        setField(term91941, term91941.getClass(), "currencyName", "scpIQUfPKw");
        setField(term91941, term91941.getClass(), "snapshotTrustlineIssuerClassicAddress", "QKYBpCjuYt");
        setField(term91941, term91941.getClass(), "snapshotCurrencyName", "vjiRfoGdkl");
        setField(term91941, term91941.getClass(), "currencyNameForProcess", "TwaxeSHvnR");
        setField(term91941, term91941.getClass(), "amount", "paPzDETzIq");
        setField(term91941, term91941.getClass(), "paymentType", enum167);
        setField(term91941, term91941.getClass(), "newTrustlinesOnly", term92114);
        setField(term91941, term91941.getClass(), "useBlacklist", term92116);
        setField(term91941, term91941.getClass(), "maximumTrustlines", term92118);
        setField(term91941, term91941.getClass(), "dropType", enum168);
        setField(term91941, term91941.getClass(), "lockUuid", "fufeuGfwpN");
        setField(term91941, term91941.getClass(), "failReason", "XJbkXbljvz");
        setField(term91941, term91941.getClass(), "feesPaid", "fuvdkDwBeH");
        setField(term91941, term91941.getClass(), "minBalance", "NTefzwLPhx");
        setField(term91941, term91941.getClass(), "maxBalance", "dirFuhqyNu");
        setField(term91941, term91941.getClass(), "maxXrpFeePerTransaction", "YVLRenzuoR");
        setField(term91941, term91941.getClass(), "retryOfId", term92205);
        setField(term91941, term91941.getClass(), "nftIssuerAddress", "JukEMhPWql");
        setField(term91941, term91941.getClass(), "nftTaxon", term92219);
        setField(term91941, term91941.getClass(), "contactEmail", "ZdNcodHERG");
        setField(term91941, term91941.getClass(), "autoApprove", term92233);
        setField(term91941, term91941.getClass(), "memo", "CLHomjAqIM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mzCFLzFuSj";
        callMethod(klass, "maxBalance", argTypes, term91941, args);
    }

};


