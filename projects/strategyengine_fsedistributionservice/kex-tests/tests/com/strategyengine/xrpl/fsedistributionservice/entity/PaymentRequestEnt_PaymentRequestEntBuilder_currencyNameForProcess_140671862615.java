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

public class PaymentRequestEnt_PaymentRequestEntBuilder_currencyNameForProcess_140671862615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72909;

    public PaymentRequestEnt_PaymentRequestEntBuilder_currencyNameForProcess_140671862615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term72910 = new Long(7998051124369147543L);
        Class<? extends Object> term73238 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term73237 = ((Class) term73238).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term73237).setAccessible(true);
        Object enum133 = ((Field) term73237).get((Object) null);
        Class<? extends Object> term73753 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term73752 = ((Class) term73753).getDeclaredField((String) "FLAT");
        ((Field) term73752).setAccessible(true);
        Object enum134 = ((Field) term73752).get((Object) null);
        Boolean term73073 = new Boolean(true);
        Boolean term73075 = new Boolean(true);
        Integer term73077 = new Integer(1596070772);
        Class<? extends Object> term74127 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term74126 = ((Class) term74127).getDeclaredField((String) "GLOBALID");
        ((Field) term74126).setAccessible(true);
        Object enum135 = ((Field) term74126).get((Object) null);
        Long term73163 = new Long(-1481367303699139651L);
        Long term73177 = new Long(-7709317346333670618L);
        Boolean term73191 = new Boolean(false);
        term72909 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term72936 = newInstance(Class.forName("java.util.Date"));
        Object term72938 = newInstance(Class.forName("java.util.Date"));
        Object term72940 = newInstance(Class.forName("java.util.Date"));
        setField(term72909, term72909.getClass(), "id", term72910);
        setField(term72909, term72909.getClass(), "environment", "LuWMOXdAPA");
        setField(term72909, term72909.getClass(), "populateEnvironment", "blSffTnsOv");
        setLongField(term72936, term72936.getClass(), "fastTime", 1373124461341L);
        setField(term72936, term72936.getClass(), "cdate", null);
        setField(term72909, term72909.getClass(), "createDate", term72936);
        setLongField(term72938, term72938.getClass(), "fastTime", 1838972963174L);
        setField(term72938, term72938.getClass(), "cdate", null);
        setField(term72909, term72909.getClass(), "updateDate", term72938);
        setLongField(term72940, term72940.getClass(), "fastTime", 1498477973553L);
        setField(term72940, term72940.getClass(), "cdate", null);
        setField(term72909, term72909.getClass(), "startTime", term72940);
        setField(term72909, term72909.getClass(), "status", enum133);
        setField(term72909, term72909.getClass(), "fromClassicAddress", "qbUMcIvEXH");
        setField(term72909, term72909.getClass(), "fromSigningPublicKey", "TVxGTjeDcu");
        setField(term72909, term72909.getClass(), "fromPrivateKey", "ABPtcyCzkR");
        setField(term72909, term72909.getClass(), "trustlineIssuerClassicAddress", "QgHhxMyKvr");
        setField(term72909, term72909.getClass(), "currencyName", "VGiXZZTWRO");
        setField(term72909, term72909.getClass(), "snapshotTrustlineIssuerClassicAddress", "MlPtwXnJOJ");
        setField(term72909, term72909.getClass(), "snapshotCurrencyName", "DbfiyFeaTe");
        setField(term72909, term72909.getClass(), "currencyNameForProcess", "dQxXGBtDLZ");
        setField(term72909, term72909.getClass(), "amount", "EgSgEFIyyN");
        setField(term72909, term72909.getClass(), "paymentType", enum134);
        setField(term72909, term72909.getClass(), "newTrustlinesOnly", term73073);
        setField(term72909, term72909.getClass(), "useBlacklist", term73075);
        setField(term72909, term72909.getClass(), "maximumTrustlines", term73077);
        setField(term72909, term72909.getClass(), "dropType", enum135);
        setField(term72909, term72909.getClass(), "lockUuid", "iAOFcXaLSf");
        setField(term72909, term72909.getClass(), "failReason", "EHoNUaeyvT");
        setField(term72909, term72909.getClass(), "feesPaid", "ZwKmasCVIy");
        setField(term72909, term72909.getClass(), "minBalance", "pxokrVaeMd");
        setField(term72909, term72909.getClass(), "maxBalance", "ujxmmZZcbT");
        setField(term72909, term72909.getClass(), "maxXrpFeePerTransaction", "BOvgwHfoHQ");
        setField(term72909, term72909.getClass(), "retryOfId", term73163);
        setField(term72909, term72909.getClass(), "nftIssuerAddress", "hPpFNeDBIb");
        setField(term72909, term72909.getClass(), "nftTaxon", term73177);
        setField(term72909, term72909.getClass(), "contactEmail", "DNOtiLPAIY");
        setField(term72909, term72909.getClass(), "autoApprove", term73191);
        setField(term72909, term72909.getClass(), "memo", "FnEkAHBfyV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VfmNFpEuax";
        callMethod(klass, "currencyNameForProcess", argTypes, term72909, args);
    }

};


