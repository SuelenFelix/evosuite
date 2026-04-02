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

public class PaymentRequestEnt_getCurrencyName_159297202317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136782;

    public PaymentRequestEnt_getCurrencyName_159297202317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term136783 = new Long(-8211859616692114655L);
        Class<? extends Object> term137125 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term137124 = ((Class) term137125).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term137124).setAccessible(true);
        Object enum244 = ((Field) term137124).get((Object) null);
        Class<? extends Object> term137640 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term137639 = ((Class) term137640).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term137639).setAccessible(true);
        Object enum245 = ((Field) term137639).get((Object) null);
        Boolean term136954 = new Boolean(false);
        Boolean term136956 = new Boolean(true);
        Integer term136958 = new Integer(-894662986);
        Class<? extends Object> term138038 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term138037 = ((Class) term138038).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term138037).setAccessible(true);
        Object enum246 = ((Field) term138037).get((Object) null);
        Long term137062 = new Long(7487838449539103993L);
        Long term137076 = new Long(7010148136855890340L);
        Boolean term137090 = new Boolean(false);
        term136782 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term136809 = newInstance(Class.forName("java.util.Date"));
        Object term136811 = newInstance(Class.forName("java.util.Date"));
        Object term136813 = newInstance(Class.forName("java.util.Date"));
        setField(term136782, term136782.getClass(), "id", term136783);
        setField(term136782, term136782.getClass(), "environment", "XQiKmsCacK");
        setField(term136782, term136782.getClass(), "populateEnvironment", "cTCixEbHYT");
        setLongField(term136809, term136809.getClass(), "fastTime", 1355447674618L);
        setField(term136809, term136809.getClass(), "cdate", null);
        setField(term136782, term136782.getClass(), "createDate", term136809);
        setLongField(term136811, term136811.getClass(), "fastTime", 1489372405062L);
        setField(term136811, term136811.getClass(), "cdate", null);
        setField(term136782, term136782.getClass(), "updateDate", term136811);
        setLongField(term136813, term136813.getClass(), "fastTime", 1267335801008L);
        setField(term136813, term136813.getClass(), "cdate", null);
        setField(term136782, term136782.getClass(), "startTime", term136813);
        setField(term136782, term136782.getClass(), "status", enum244);
        setField(term136782, term136782.getClass(), "fromClassicAddress", "bqKksqtAdT");
        setField(term136782, term136782.getClass(), "fromSigningPublicKey", "jAIAdEmULK");
        setField(term136782, term136782.getClass(), "fromPrivateKey", "EuAshkmbna");
        setField(term136782, term136782.getClass(), "trustlineIssuerClassicAddress", "JwQlbBbGJR");
        setField(term136782, term136782.getClass(), "currencyName", "HdWLwfVsAM");
        setField(term136782, term136782.getClass(), "snapshotTrustlineIssuerClassicAddress", "SxeKEdHXSl");
        setField(term136782, term136782.getClass(), "snapshotCurrencyName", "BCAlJpNjIX");
        setField(term136782, term136782.getClass(), "currencyNameForProcess", "PKClfBAwUr");
        setField(term136782, term136782.getClass(), "amount", "JqbKrmVEMy");
        setField(term136782, term136782.getClass(), "paymentType", enum245);
        setField(term136782, term136782.getClass(), "newTrustlinesOnly", term136954);
        setField(term136782, term136782.getClass(), "useBlacklist", term136956);
        setField(term136782, term136782.getClass(), "maximumTrustlines", term136958);
        setField(term136782, term136782.getClass(), "dropType", enum246);
        setField(term136782, term136782.getClass(), "lockUuid", "VygCEWaefB");
        setField(term136782, term136782.getClass(), "failReason", "PqhYfEyDDA");
        setField(term136782, term136782.getClass(), "feesPaid", "fSLHLeuNoa");
        setField(term136782, term136782.getClass(), "minBalance", "IwgPFurObw");
        setField(term136782, term136782.getClass(), "maxBalance", "WLaHlrYQyz");
        setField(term136782, term136782.getClass(), "maxXrpFeePerTransaction", "CaeIUTuUFo");
        setField(term136782, term136782.getClass(), "retryOfId", term137062);
        setField(term136782, term136782.getClass(), "nftIssuerAddress", "rzoDGjHkzG");
        setField(term136782, term136782.getClass(), "nftTaxon", term137076);
        setField(term136782, term136782.getClass(), "contactEmail", "NsphHxYiuC");
        setField(term136782, term136782.getClass(), "autoApprove", term137090);
        setField(term136782, term136782.getClass(), "memo", "XYJztkznbY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrencyName", argTypes, term136782, args);
    }

};


