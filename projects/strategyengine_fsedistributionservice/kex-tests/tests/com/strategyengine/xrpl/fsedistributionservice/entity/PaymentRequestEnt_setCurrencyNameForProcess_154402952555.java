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

public class PaymentRequestEnt_setCurrencyNameForProcess_154402952555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200277;

    public PaymentRequestEnt_setCurrencyNameForProcess_154402952555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term200278 = new Long(-7840999196900383276L);
        Class<? extends Object> term200618 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term200617 = ((Class) term200618).getDeclaredField((String) "QUEUED");
        ((Field) term200617).setAccessible(true);
        Object enum356 = ((Field) term200617).get((Object) null);
        Class<? extends Object> term201118 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term201117 = ((Class) term201118).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term201117).setAccessible(true);
        Object enum357 = ((Field) term201117).get((Object) null);
        Boolean term200444 = new Boolean(false);
        Boolean term200446 = new Boolean(true);
        Integer term200448 = new Integer(-1963464809);
        Class<? extends Object> term201516 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term201515 = ((Class) term201516).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term201515).setAccessible(true);
        Object enum358 = ((Field) term201515).get((Object) null);
        Long term200543 = new Long(1528628920302068646L);
        Long term200557 = new Long(3161040540173678206L);
        Boolean term200571 = new Boolean(true);
        term200277 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term200304 = newInstance(Class.forName("java.util.Date"));
        Object term200306 = newInstance(Class.forName("java.util.Date"));
        Object term200308 = newInstance(Class.forName("java.util.Date"));
        setField(term200277, term200277.getClass(), "id", term200278);
        setField(term200277, term200277.getClass(), "environment", "yNogNNecFu");
        setField(term200277, term200277.getClass(), "populateEnvironment", "tcaaotqgDF");
        setLongField(term200304, term200304.getClass(), "fastTime", 1318227522669L);
        setField(term200304, term200304.getClass(), "cdate", null);
        setField(term200277, term200277.getClass(), "createDate", term200304);
        setLongField(term200306, term200306.getClass(), "fastTime", 1803998261031L);
        setField(term200306, term200306.getClass(), "cdate", null);
        setField(term200277, term200277.getClass(), "updateDate", term200306);
        setLongField(term200308, term200308.getClass(), "fastTime", 1301089343556L);
        setField(term200308, term200308.getClass(), "cdate", null);
        setField(term200277, term200277.getClass(), "startTime", term200308);
        setField(term200277, term200277.getClass(), "status", enum356);
        setField(term200277, term200277.getClass(), "fromClassicAddress", "bXInWdOeyi");
        setField(term200277, term200277.getClass(), "fromSigningPublicKey", "HdwopulXkf");
        setField(term200277, term200277.getClass(), "fromPrivateKey", "FuCKfgAhpC");
        setField(term200277, term200277.getClass(), "trustlineIssuerClassicAddress", "gqMysJhxfA");
        setField(term200277, term200277.getClass(), "currencyName", "HtLEppUqzI");
        setField(term200277, term200277.getClass(), "snapshotTrustlineIssuerClassicAddress", "bVlRrMQeRY");
        setField(term200277, term200277.getClass(), "snapshotCurrencyName", "SXaXhlzAIB");
        setField(term200277, term200277.getClass(), "currencyNameForProcess", "UPVTXSXUNh");
        setField(term200277, term200277.getClass(), "amount", "cjCXbXuiFn");
        setField(term200277, term200277.getClass(), "paymentType", enum357);
        setField(term200277, term200277.getClass(), "newTrustlinesOnly", term200444);
        setField(term200277, term200277.getClass(), "useBlacklist", term200446);
        setField(term200277, term200277.getClass(), "maximumTrustlines", term200448);
        setField(term200277, term200277.getClass(), "dropType", enum358);
        setField(term200277, term200277.getClass(), "lockUuid", "fhdhDeWdoi");
        setField(term200277, term200277.getClass(), "failReason", "FqrcltWSUd");
        setField(term200277, term200277.getClass(), "feesPaid", "kAbILlhsZw");
        setField(term200277, term200277.getClass(), "minBalance", "QsIOCSpRow");
        setField(term200277, term200277.getClass(), "maxBalance", "gcFzvYOUch");
        setField(term200277, term200277.getClass(), "maxXrpFeePerTransaction", "NnFSMXLOUA");
        setField(term200277, term200277.getClass(), "retryOfId", term200543);
        setField(term200277, term200277.getClass(), "nftIssuerAddress", "bacruLIvDW");
        setField(term200277, term200277.getClass(), "nftTaxon", term200557);
        setField(term200277, term200277.getClass(), "contactEmail", "ydbVEuslYx");
        setField(term200277, term200277.getClass(), "autoApprove", term200571);
        setField(term200277, term200277.getClass(), "memo", "DKWEhukBpG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YaowqyqxBH";
        callMethod(klass, "setCurrencyNameForProcess", argTypes, term200277, args);
    }

};


