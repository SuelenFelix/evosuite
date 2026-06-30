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

public class PaymentRequestEnt_setMemo_40594746973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231908;

    public PaymentRequestEnt_setMemo_40594746973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term231909 = new Long(7199459243454109261L);
        Class<? extends Object> term232254 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term232253 = ((Class) term232254).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term232253).setAccessible(true);
        Object enum411 = ((Field) term232253).get((Object) null);
        Class<? extends Object> term232769 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term232768 = ((Class) term232769).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term232768).setAccessible(true);
        Object enum412 = ((Field) term232768).get((Object) null);
        Boolean term232080 = new Boolean(false);
        Boolean term232082 = new Boolean(true);
        Integer term232084 = new Integer(2098647989);
        Class<? extends Object> term233167 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term233166 = ((Class) term233167).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term233166).setAccessible(true);
        Object enum413 = ((Field) term233166).get((Object) null);
        Long term232179 = new Long(-1009485425289165749L);
        Long term232193 = new Long(-5044181804110715069L);
        Boolean term232207 = new Boolean(true);
        term231908 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term231935 = newInstance(Class.forName("java.util.Date"));
        Object term231937 = newInstance(Class.forName("java.util.Date"));
        Object term231939 = newInstance(Class.forName("java.util.Date"));
        setField(term231908, term231908.getClass(), "id", term231909);
        setField(term231908, term231908.getClass(), "environment", "BGDjrSZTJY");
        setField(term231908, term231908.getClass(), "populateEnvironment", "VUVCEVItic");
        setLongField(term231935, term231935.getClass(), "fastTime", 1881323766574L);
        setField(term231935, term231935.getClass(), "cdate", null);
        setField(term231908, term231908.getClass(), "createDate", term231935);
        setLongField(term231937, term231937.getClass(), "fastTime", 1689304894254L);
        setField(term231937, term231937.getClass(), "cdate", null);
        setField(term231908, term231908.getClass(), "updateDate", term231937);
        setLongField(term231939, term231939.getClass(), "fastTime", 1315360243001L);
        setField(term231939, term231939.getClass(), "cdate", null);
        setField(term231908, term231908.getClass(), "startTime", term231939);
        setField(term231908, term231908.getClass(), "status", enum411);
        setField(term231908, term231908.getClass(), "fromClassicAddress", "tloEDDASGy");
        setField(term231908, term231908.getClass(), "fromSigningPublicKey", "CQMdMBIICe");
        setField(term231908, term231908.getClass(), "fromPrivateKey", "rbJaIkrSnM");
        setField(term231908, term231908.getClass(), "trustlineIssuerClassicAddress", "EAKcPFEKbX");
        setField(term231908, term231908.getClass(), "currencyName", "uPdAMNFhdG");
        setField(term231908, term231908.getClass(), "snapshotTrustlineIssuerClassicAddress", "VjXPlvOnMK");
        setField(term231908, term231908.getClass(), "snapshotCurrencyName", "VVfwcKWfYk");
        setField(term231908, term231908.getClass(), "currencyNameForProcess", "tsYXZxQtLG");
        setField(term231908, term231908.getClass(), "amount", "JUAWRJdehl");
        setField(term231908, term231908.getClass(), "paymentType", enum412);
        setField(term231908, term231908.getClass(), "newTrustlinesOnly", term232080);
        setField(term231908, term231908.getClass(), "useBlacklist", term232082);
        setField(term231908, term231908.getClass(), "maximumTrustlines", term232084);
        setField(term231908, term231908.getClass(), "dropType", enum413);
        setField(term231908, term231908.getClass(), "lockUuid", "fFslDwqqzQ");
        setField(term231908, term231908.getClass(), "failReason", "oyTybTkTFd");
        setField(term231908, term231908.getClass(), "feesPaid", "NNjMZLPIcc");
        setField(term231908, term231908.getClass(), "minBalance", "fAcvTHLHOa");
        setField(term231908, term231908.getClass(), "maxBalance", "QavvcNVesW");
        setField(term231908, term231908.getClass(), "maxXrpFeePerTransaction", "JmFxhkDeIA");
        setField(term231908, term231908.getClass(), "retryOfId", term232179);
        setField(term231908, term231908.getClass(), "nftIssuerAddress", "XcJqDBnnMZ");
        setField(term231908, term231908.getClass(), "nftTaxon", term232193);
        setField(term231908, term231908.getClass(), "contactEmail", "SchXFoqYFy");
        setField(term231908, term231908.getClass(), "autoApprove", term232207);
        setField(term231908, term231908.getClass(), "memo", "MnHKbTZBTr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xCNDHQZBKx";
        callMethod(klass, "setMemo", argTypes, term231908, args);
    }

};


