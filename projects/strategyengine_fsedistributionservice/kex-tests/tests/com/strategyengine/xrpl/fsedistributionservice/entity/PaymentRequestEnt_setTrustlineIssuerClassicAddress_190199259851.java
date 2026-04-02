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

public class PaymentRequestEnt_setTrustlineIssuerClassicAddress_190199259851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193449;

    public PaymentRequestEnt_setTrustlineIssuerClassicAddress_190199259851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term193450 = new Long(-3048863932438585863L);
        Class<? extends Object> term193776 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term193775 = ((Class) term193776).getDeclaredField((String) "SCHEDULED");
        ((Field) term193775).setAccessible(true);
        Object enum344 = ((Field) term193775).get((Object) null);
        Class<? extends Object> term194285 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term194284 = ((Class) term194285).getDeclaredField((String) "FLAT");
        ((Field) term194284).setAccessible(true);
        Object enum345 = ((Field) term194284).get((Object) null);
        Boolean term193611 = new Boolean(true);
        Boolean term193613 = new Boolean(true);
        Integer term193615 = new Integer(538259104);
        Class<? extends Object> term194659 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term194658 = ((Class) term194659).getDeclaredField((String) "GLOBALID");
        ((Field) term194658).setAccessible(true);
        Object enum346 = ((Field) term194658).get((Object) null);
        Long term193701 = new Long(-7155106718297861156L);
        Long term193715 = new Long(-4191270658895729623L);
        Boolean term193729 = new Boolean(false);
        term193449 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term193476 = newInstance(Class.forName("java.util.Date"));
        Object term193478 = newInstance(Class.forName("java.util.Date"));
        Object term193480 = newInstance(Class.forName("java.util.Date"));
        setField(term193449, term193449.getClass(), "id", term193450);
        setField(term193449, term193449.getClass(), "environment", "FivesaUeHG");
        setField(term193449, term193449.getClass(), "populateEnvironment", "TnpXhZmCRY");
        setLongField(term193476, term193476.getClass(), "fastTime", 1526147148954L);
        setField(term193476, term193476.getClass(), "cdate", null);
        setField(term193449, term193449.getClass(), "createDate", term193476);
        setLongField(term193478, term193478.getClass(), "fastTime", 1268663155151L);
        setField(term193478, term193478.getClass(), "cdate", null);
        setField(term193449, term193449.getClass(), "updateDate", term193478);
        setLongField(term193480, term193480.getClass(), "fastTime", 1402468572849L);
        setField(term193480, term193480.getClass(), "cdate", null);
        setField(term193449, term193449.getClass(), "startTime", term193480);
        setField(term193449, term193449.getClass(), "status", enum344);
        setField(term193449, term193449.getClass(), "fromClassicAddress", "ECVAXFhrTP");
        setField(term193449, term193449.getClass(), "fromSigningPublicKey", "ypytdNbrBc");
        setField(term193449, term193449.getClass(), "fromPrivateKey", "XvrJCOSYei");
        setField(term193449, term193449.getClass(), "trustlineIssuerClassicAddress", "QdRcxOxNSl");
        setField(term193449, term193449.getClass(), "currencyName", "lvdsucnNvR");
        setField(term193449, term193449.getClass(), "snapshotTrustlineIssuerClassicAddress", "mSjSKfeMUn");
        setField(term193449, term193449.getClass(), "snapshotCurrencyName", "nVXCBYnEcg");
        setField(term193449, term193449.getClass(), "currencyNameForProcess", "fcLnKXxzfM");
        setField(term193449, term193449.getClass(), "amount", "FtyaWnfsgn");
        setField(term193449, term193449.getClass(), "paymentType", enum345);
        setField(term193449, term193449.getClass(), "newTrustlinesOnly", term193611);
        setField(term193449, term193449.getClass(), "useBlacklist", term193613);
        setField(term193449, term193449.getClass(), "maximumTrustlines", term193615);
        setField(term193449, term193449.getClass(), "dropType", enum346);
        setField(term193449, term193449.getClass(), "lockUuid", "qphbpPdwrD");
        setField(term193449, term193449.getClass(), "failReason", "xHdHafzFSM");
        setField(term193449, term193449.getClass(), "feesPaid", "fAsiOEKVaH");
        setField(term193449, term193449.getClass(), "minBalance", "EltrILhEwT");
        setField(term193449, term193449.getClass(), "maxBalance", "wCcSeUJzhg");
        setField(term193449, term193449.getClass(), "maxXrpFeePerTransaction", "HlVHAsOBmJ");
        setField(term193449, term193449.getClass(), "retryOfId", term193701);
        setField(term193449, term193449.getClass(), "nftIssuerAddress", "nyThJEXHhd");
        setField(term193449, term193449.getClass(), "nftTaxon", term193715);
        setField(term193449, term193449.getClass(), "contactEmail", "TRfRRMMCZw");
        setField(term193449, term193449.getClass(), "autoApprove", term193729);
        setField(term193449, term193449.getClass(), "memo", "rwbfUcOMVc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ljTkNgJRUl";
        callMethod(klass, "setTrustlineIssuerClassicAddress", argTypes, term193449, args);
    }

};


