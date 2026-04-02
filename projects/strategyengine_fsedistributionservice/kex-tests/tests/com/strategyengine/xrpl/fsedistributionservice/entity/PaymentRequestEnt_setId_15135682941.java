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

public class PaymentRequestEnt_setId_15135682941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175743;
     Object term176048;

    public PaymentRequestEnt_setId_15135682941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term175744 = new Long(-6237686742902369498L);
        Class<? extends Object> term176071 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term176070 = ((Class) term176071).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term176070).setAccessible(true);
        Object enum313 = ((Field) term176070).get((Object) null);
        Class<? extends Object> term176613 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term176612 = ((Class) term176613).getDeclaredField((String) "FLAT");
        ((Field) term176612).setAccessible(true);
        Object enum314 = ((Field) term176612).get((Object) null);
        Boolean term175916 = new Boolean(true);
        Boolean term175918 = new Boolean(false);
        Integer term175920 = new Integer(1072005683);
        Class<? extends Object> term176987 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term176986 = ((Class) term176987).getDeclaredField((String) "GLOBALID");
        ((Field) term176986).setAccessible(true);
        Object enum315 = ((Field) term176986).get((Object) null);
        Long term176006 = new Long(-2286229228641472715L);
        Long term176020 = new Long(7464122056779140588L);
        Boolean term176034 = new Boolean(false);
        term175743 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term175770 = newInstance(Class.forName("java.util.Date"));
        Object term175772 = newInstance(Class.forName("java.util.Date"));
        Object term175774 = newInstance(Class.forName("java.util.Date"));
        setField(term175743, term175743.getClass(), "id", term175744);
        setField(term175743, term175743.getClass(), "environment", "jAxYagPvcV");
        setField(term175743, term175743.getClass(), "populateEnvironment", "ZXLgGUqgyW");
        setLongField(term175770, term175770.getClass(), "fastTime", 1796695552255L);
        setField(term175770, term175770.getClass(), "cdate", null);
        setField(term175743, term175743.getClass(), "createDate", term175770);
        setLongField(term175772, term175772.getClass(), "fastTime", 1358449833783L);
        setField(term175772, term175772.getClass(), "cdate", null);
        setField(term175743, term175743.getClass(), "updateDate", term175772);
        setLongField(term175774, term175774.getClass(), "fastTime", 1399617335309L);
        setField(term175774, term175774.getClass(), "cdate", null);
        setField(term175743, term175743.getClass(), "startTime", term175774);
        setField(term175743, term175743.getClass(), "status", enum313);
        setField(term175743, term175743.getClass(), "fromClassicAddress", "PdeSzTcBgY");
        setField(term175743, term175743.getClass(), "fromSigningPublicKey", "PmSvMYNoIS");
        setField(term175743, term175743.getClass(), "fromPrivateKey", "zejWtMxJdV");
        setField(term175743, term175743.getClass(), "trustlineIssuerClassicAddress", "YUIUZeZiMK");
        setField(term175743, term175743.getClass(), "currencyName", "rrPETbKRef");
        setField(term175743, term175743.getClass(), "snapshotTrustlineIssuerClassicAddress", "viZRlrisPY");
        setField(term175743, term175743.getClass(), "snapshotCurrencyName", "VSfRsPLslq");
        setField(term175743, term175743.getClass(), "currencyNameForProcess", "dwygneuBjP");
        setField(term175743, term175743.getClass(), "amount", "LfKgkzPZpX");
        setField(term175743, term175743.getClass(), "paymentType", enum314);
        setField(term175743, term175743.getClass(), "newTrustlinesOnly", term175916);
        setField(term175743, term175743.getClass(), "useBlacklist", term175918);
        setField(term175743, term175743.getClass(), "maximumTrustlines", term175920);
        setField(term175743, term175743.getClass(), "dropType", enum315);
        setField(term175743, term175743.getClass(), "lockUuid", "belyXxMqFm");
        setField(term175743, term175743.getClass(), "failReason", "LPotuCwkwB");
        setField(term175743, term175743.getClass(), "feesPaid", "zpCKXLOzse");
        setField(term175743, term175743.getClass(), "minBalance", "qhlWSiHAHt");
        setField(term175743, term175743.getClass(), "maxBalance", "XrKIhxpIJD");
        setField(term175743, term175743.getClass(), "maxXrpFeePerTransaction", "RSuRSjiLvm");
        setField(term175743, term175743.getClass(), "retryOfId", term176006);
        setField(term175743, term175743.getClass(), "nftIssuerAddress", "aoeNWgMpNx");
        setField(term175743, term175743.getClass(), "nftTaxon", term176020);
        setField(term175743, term175743.getClass(), "contactEmail", "RQvXfSweVs");
        setField(term175743, term175743.getClass(), "autoApprove", term176034);
        setField(term175743, term175743.getClass(), "memo", "jGxArBjtep");
        term176048 = new Long(6542357174275680335L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term176048;
        callMethod(klass, "setId", argTypes, term175743, args);
    }

};


