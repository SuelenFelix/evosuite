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

public class PaymentRequestEnt_setUpdateDate_156916339345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182639;
     Object term182952;

    public PaymentRequestEnt_setUpdateDate_156916339345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term182640 = new Long(-5714578622746827780L);
        Class<? extends Object> term182975 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term182974 = ((Class) term182975).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term182974).setAccessible(true);
        Object enum325 = ((Field) term182974).get((Object) null);
        Class<? extends Object> term183490 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term183489 = ((Class) term183490).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term183489).setAccessible(true);
        Object enum326 = ((Field) term183489).get((Object) null);
        Boolean term182811 = new Boolean(true);
        Boolean term182813 = new Boolean(true);
        Integer term182815 = new Integer(53410913);
        Class<? extends Object> term183888 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term183887 = ((Class) term183888).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term183887).setAccessible(true);
        Object enum327 = ((Field) term183887).get((Object) null);
        Long term182910 = new Long(8918129626022907229L);
        Long term182924 = new Long(6269054578518955349L);
        Boolean term182938 = new Boolean(false);
        term182639 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term182666 = newInstance(Class.forName("java.util.Date"));
        Object term182668 = newInstance(Class.forName("java.util.Date"));
        Object term182670 = newInstance(Class.forName("java.util.Date"));
        setField(term182639, term182639.getClass(), "id", term182640);
        setField(term182639, term182639.getClass(), "environment", "WJosrfBMfA");
        setField(term182639, term182639.getClass(), "populateEnvironment", "ttlGywalKc");
        setLongField(term182666, term182666.getClass(), "fastTime", 1585793301413L);
        setField(term182666, term182666.getClass(), "cdate", null);
        setField(term182639, term182639.getClass(), "createDate", term182666);
        setLongField(term182668, term182668.getClass(), "fastTime", 1368490169744L);
        setField(term182668, term182668.getClass(), "cdate", null);
        setField(term182639, term182639.getClass(), "updateDate", term182668);
        setLongField(term182670, term182670.getClass(), "fastTime", 1288081804912L);
        setField(term182670, term182670.getClass(), "cdate", null);
        setField(term182639, term182639.getClass(), "startTime", term182670);
        setField(term182639, term182639.getClass(), "status", enum325);
        setField(term182639, term182639.getClass(), "fromClassicAddress", "rQFBspqBzf");
        setField(term182639, term182639.getClass(), "fromSigningPublicKey", "FmWhAOGAMI");
        setField(term182639, term182639.getClass(), "fromPrivateKey", "GdjCkRsIrS");
        setField(term182639, term182639.getClass(), "trustlineIssuerClassicAddress", "MJNyYzLhkh");
        setField(term182639, term182639.getClass(), "currencyName", "DEugGJIaYt");
        setField(term182639, term182639.getClass(), "snapshotTrustlineIssuerClassicAddress", "lzZIObOJmC");
        setField(term182639, term182639.getClass(), "snapshotCurrencyName", "RFmGKwvSgz");
        setField(term182639, term182639.getClass(), "currencyNameForProcess", "EUEUhZglna");
        setField(term182639, term182639.getClass(), "amount", "znDPtjpZrG");
        setField(term182639, term182639.getClass(), "paymentType", enum326);
        setField(term182639, term182639.getClass(), "newTrustlinesOnly", term182811);
        setField(term182639, term182639.getClass(), "useBlacklist", term182813);
        setField(term182639, term182639.getClass(), "maximumTrustlines", term182815);
        setField(term182639, term182639.getClass(), "dropType", enum327);
        setField(term182639, term182639.getClass(), "lockUuid", "uodLjxczjr");
        setField(term182639, term182639.getClass(), "failReason", "HJLVBQAtGs");
        setField(term182639, term182639.getClass(), "feesPaid", "dxAxECMYEm");
        setField(term182639, term182639.getClass(), "minBalance", "ylGHeywyhx");
        setField(term182639, term182639.getClass(), "maxBalance", "SqMpUczXhg");
        setField(term182639, term182639.getClass(), "maxXrpFeePerTransaction", "voDQuoTpgt");
        setField(term182639, term182639.getClass(), "retryOfId", term182910);
        setField(term182639, term182639.getClass(), "nftIssuerAddress", "wgwSIKAsrj");
        setField(term182639, term182639.getClass(), "nftTaxon", term182924);
        setField(term182639, term182639.getClass(), "contactEmail", "aGJCHRHyCe");
        setField(term182639, term182639.getClass(), "autoApprove", term182938);
        setField(term182639, term182639.getClass(), "memo", "WingwhSgfc");
        term182952 = newInstance(Class.forName("java.util.Date"));
        setLongField(term182952, term182952.getClass(), "fastTime", 1386992702859L);
        setField(term182952, term182952.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term182952;
        callMethod(klass, "setUpdateDate", argTypes, term182639, args);
    }

};


