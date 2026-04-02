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

public class PaymentRequestEnt_getTrustlineIssuerClassicAddress_54649685416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135112;

    public PaymentRequestEnt_getTrustlineIssuerClassicAddress_54649685416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term135113 = new Long(-4058686252500969842L);
        Class<? extends Object> term135430 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term135429 = ((Class) term135430).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term135429).setAccessible(true);
        Object enum241 = ((Field) term135429).get((Object) null);
        Class<? extends Object> term135945 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term135944 = ((Class) term135945).getDeclaredField((String) "FLAT");
        ((Field) term135944).setAccessible(true);
        Object enum242 = ((Field) term135944).get((Object) null);
        Boolean term135276 = new Boolean(true);
        Boolean term135278 = new Boolean(false);
        Integer term135280 = new Integer(-1263114719);
        Class<? extends Object> term136319 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term136318 = ((Class) term136319).getDeclaredField((String) "TRUSTLINE");
        ((Field) term136318).setAccessible(true);
        Object enum243 = ((Field) term136318).get((Object) null);
        Long term135367 = new Long(6077991958696417121L);
        Long term135381 = new Long(-5004803270846838598L);
        Boolean term135395 = new Boolean(false);
        term135112 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term135139 = newInstance(Class.forName("java.util.Date"));
        Object term135141 = newInstance(Class.forName("java.util.Date"));
        Object term135143 = newInstance(Class.forName("java.util.Date"));
        setField(term135112, term135112.getClass(), "id", term135113);
        setField(term135112, term135112.getClass(), "environment", "WzGudiEARD");
        setField(term135112, term135112.getClass(), "populateEnvironment", "IoefPqGtaj");
        setLongField(term135139, term135139.getClass(), "fastTime", 1410841891353L);
        setField(term135139, term135139.getClass(), "cdate", null);
        setField(term135112, term135112.getClass(), "createDate", term135139);
        setLongField(term135141, term135141.getClass(), "fastTime", 1692566077511L);
        setField(term135141, term135141.getClass(), "cdate", null);
        setField(term135112, term135112.getClass(), "updateDate", term135141);
        setLongField(term135143, term135143.getClass(), "fastTime", 1424565173631L);
        setField(term135143, term135143.getClass(), "cdate", null);
        setField(term135112, term135112.getClass(), "startTime", term135143);
        setField(term135112, term135112.getClass(), "status", enum241);
        setField(term135112, term135112.getClass(), "fromClassicAddress", "YMmtjELJuB");
        setField(term135112, term135112.getClass(), "fromSigningPublicKey", "FzyIShiOmb");
        setField(term135112, term135112.getClass(), "fromPrivateKey", "PEUfeJaZTk");
        setField(term135112, term135112.getClass(), "trustlineIssuerClassicAddress", "AIvyeIdskz");
        setField(term135112, term135112.getClass(), "currencyName", "iSQqMWMRlU");
        setField(term135112, term135112.getClass(), "snapshotTrustlineIssuerClassicAddress", "djWEnlbOXu");
        setField(term135112, term135112.getClass(), "snapshotCurrencyName", "MvDMzQBWME");
        setField(term135112, term135112.getClass(), "currencyNameForProcess", "sZyAwmdGVS");
        setField(term135112, term135112.getClass(), "amount", "VoKhXiLAaW");
        setField(term135112, term135112.getClass(), "paymentType", enum242);
        setField(term135112, term135112.getClass(), "newTrustlinesOnly", term135276);
        setField(term135112, term135112.getClass(), "useBlacklist", term135278);
        setField(term135112, term135112.getClass(), "maximumTrustlines", term135280);
        setField(term135112, term135112.getClass(), "dropType", enum243);
        setField(term135112, term135112.getClass(), "lockUuid", "CaalXzRXQI");
        setField(term135112, term135112.getClass(), "failReason", "eRBnKPjyVg");
        setField(term135112, term135112.getClass(), "feesPaid", "svPqsHBvrm");
        setField(term135112, term135112.getClass(), "minBalance", "sRzUJLYMmB");
        setField(term135112, term135112.getClass(), "maxBalance", "XxILklSDwz");
        setField(term135112, term135112.getClass(), "maxXrpFeePerTransaction", "TLjhFZbwKO");
        setField(term135112, term135112.getClass(), "retryOfId", term135367);
        setField(term135112, term135112.getClass(), "nftIssuerAddress", "nxEbLIApFc");
        setField(term135112, term135112.getClass(), "nftTaxon", term135381);
        setField(term135112, term135112.getClass(), "contactEmail", "zzsdNZhejE");
        setField(term135112, term135112.getClass(), "autoApprove", term135395);
        setField(term135112, term135112.getClass(), "memo", "ILoodMZrgR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrustlineIssuerClassicAddress", argTypes, term135112, args);
    }

};


