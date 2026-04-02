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

public class PaymentRequestEnt_setNewTrustlinesOnly_16317620558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205555;
     Object term205877;

    public PaymentRequestEnt_setNewTrustlinesOnly_16317620558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term205556 = new Long(9192899183781208922L);
        Class<? extends Object> term205900 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term205899 = ((Class) term205900).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term205899).setAccessible(true);
        Object enum365 = ((Field) term205899).get((Object) null);
        Class<? extends Object> term206442 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term206441 = ((Class) term206442).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term206441).setAccessible(true);
        Object enum366 = ((Field) term206441).get((Object) null);
        Boolean term205736 = new Boolean(false);
        Boolean term205738 = new Boolean(false);
        Integer term205740 = new Integer(-2015048153);
        Class<? extends Object> term206840 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term206839 = ((Class) term206840).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term206839).setAccessible(true);
        Object enum367 = ((Field) term206839).get((Object) null);
        Long term205835 = new Long(-7705159544905337794L);
        Long term205849 = new Long(678465732474023847L);
        Boolean term205863 = new Boolean(false);
        term205555 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term205582 = newInstance(Class.forName("java.util.Date"));
        Object term205584 = newInstance(Class.forName("java.util.Date"));
        Object term205586 = newInstance(Class.forName("java.util.Date"));
        setField(term205555, term205555.getClass(), "id", term205556);
        setField(term205555, term205555.getClass(), "environment", "bMQUwQqyMc");
        setField(term205555, term205555.getClass(), "populateEnvironment", "CVaGhXmAUN");
        setLongField(term205582, term205582.getClass(), "fastTime", 1872938547611L);
        setField(term205582, term205582.getClass(), "cdate", null);
        setField(term205555, term205555.getClass(), "createDate", term205582);
        setLongField(term205584, term205584.getClass(), "fastTime", 1541908359382L);
        setField(term205584, term205584.getClass(), "cdate", null);
        setField(term205555, term205555.getClass(), "updateDate", term205584);
        setLongField(term205586, term205586.getClass(), "fastTime", 1326226162791L);
        setField(term205586, term205586.getClass(), "cdate", null);
        setField(term205555, term205555.getClass(), "startTime", term205586);
        setField(term205555, term205555.getClass(), "status", enum365);
        setField(term205555, term205555.getClass(), "fromClassicAddress", "KnclcuNYRb");
        setField(term205555, term205555.getClass(), "fromSigningPublicKey", "UDZJbJPmCC");
        setField(term205555, term205555.getClass(), "fromPrivateKey", "oVkgUUfHis");
        setField(term205555, term205555.getClass(), "trustlineIssuerClassicAddress", "hoCKQzIOhx");
        setField(term205555, term205555.getClass(), "currencyName", "znUxTdEvUD");
        setField(term205555, term205555.getClass(), "snapshotTrustlineIssuerClassicAddress", "PvtJhtGffh");
        setField(term205555, term205555.getClass(), "snapshotCurrencyName", "KReGJTSQuY");
        setField(term205555, term205555.getClass(), "currencyNameForProcess", "hqZmoXoMuS");
        setField(term205555, term205555.getClass(), "amount", "PUPJWadLXP");
        setField(term205555, term205555.getClass(), "paymentType", enum366);
        setField(term205555, term205555.getClass(), "newTrustlinesOnly", term205736);
        setField(term205555, term205555.getClass(), "useBlacklist", term205738);
        setField(term205555, term205555.getClass(), "maximumTrustlines", term205740);
        setField(term205555, term205555.getClass(), "dropType", enum367);
        setField(term205555, term205555.getClass(), "lockUuid", "TBNsemBBKA");
        setField(term205555, term205555.getClass(), "failReason", "DpNDxwXKkX");
        setField(term205555, term205555.getClass(), "feesPaid", "uxoFwkPfXf");
        setField(term205555, term205555.getClass(), "minBalance", "OoVnZTvxUt");
        setField(term205555, term205555.getClass(), "maxBalance", "MnqnyndkhF");
        setField(term205555, term205555.getClass(), "maxXrpFeePerTransaction", "MZzoPKpFlh");
        setField(term205555, term205555.getClass(), "retryOfId", term205835);
        setField(term205555, term205555.getClass(), "nftIssuerAddress", "skVZETaBKX");
        setField(term205555, term205555.getClass(), "nftTaxon", term205849);
        setField(term205555, term205555.getClass(), "contactEmail", "jcJNIBACPb");
        setField(term205555, term205555.getClass(), "autoApprove", term205863);
        setField(term205555, term205555.getClass(), "memo", "mPQmjoknqi");
        term205877 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term205877;
        callMethod(klass, "setNewTrustlinesOnly", argTypes, term205555, args);
    }

};


