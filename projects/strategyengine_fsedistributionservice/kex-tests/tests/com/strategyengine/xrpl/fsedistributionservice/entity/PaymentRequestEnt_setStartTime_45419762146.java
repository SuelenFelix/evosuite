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

public class PaymentRequestEnt_setStartTime_45419762146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184375;
     Object term184681;

    public PaymentRequestEnt_setStartTime_45419762146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term184376 = new Long(-143609946830350439L);
        Class<? extends Object> term184704 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term184703 = ((Class) term184704).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term184703).setAccessible(true);
        Object enum328 = ((Field) term184703).get((Object) null);
        Class<? extends Object> term185246 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term185245 = ((Class) term185246).getDeclaredField((String) "FLAT");
        ((Field) term185245).setAccessible(true);
        Object enum329 = ((Field) term185245).get((Object) null);
        Boolean term184548 = new Boolean(false);
        Boolean term184550 = new Boolean(true);
        Integer term184552 = new Integer(-375014958);
        Class<? extends Object> term185620 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term185619 = ((Class) term185620).getDeclaredField((String) "TRUSTLINE");
        ((Field) term185619).setAccessible(true);
        Object enum330 = ((Field) term185619).get((Object) null);
        Long term184639 = new Long(2018084438165711668L);
        Long term184653 = new Long(-8705953038984862378L);
        Boolean term184667 = new Boolean(false);
        term184375 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term184402 = newInstance(Class.forName("java.util.Date"));
        Object term184404 = newInstance(Class.forName("java.util.Date"));
        Object term184406 = newInstance(Class.forName("java.util.Date"));
        setField(term184375, term184375.getClass(), "id", term184376);
        setField(term184375, term184375.getClass(), "environment", "YEcmxINfnL");
        setField(term184375, term184375.getClass(), "populateEnvironment", "EGytMwlDVe");
        setLongField(term184402, term184402.getClass(), "fastTime", 1833571871553L);
        setField(term184402, term184402.getClass(), "cdate", null);
        setField(term184375, term184375.getClass(), "createDate", term184402);
        setLongField(term184404, term184404.getClass(), "fastTime", 1782903633438L);
        setField(term184404, term184404.getClass(), "cdate", null);
        setField(term184375, term184375.getClass(), "updateDate", term184404);
        setLongField(term184406, term184406.getClass(), "fastTime", 1536389765110L);
        setField(term184406, term184406.getClass(), "cdate", null);
        setField(term184375, term184375.getClass(), "startTime", term184406);
        setField(term184375, term184375.getClass(), "status", enum328);
        setField(term184375, term184375.getClass(), "fromClassicAddress", "GFQCmYZmcg");
        setField(term184375, term184375.getClass(), "fromSigningPublicKey", "qPgbFtsgtk");
        setField(term184375, term184375.getClass(), "fromPrivateKey", "nkmiePLZgp");
        setField(term184375, term184375.getClass(), "trustlineIssuerClassicAddress", "VoCvDpwwFr");
        setField(term184375, term184375.getClass(), "currencyName", "zYOmoQqDOd");
        setField(term184375, term184375.getClass(), "snapshotTrustlineIssuerClassicAddress", "kmgEVEqTGa");
        setField(term184375, term184375.getClass(), "snapshotCurrencyName", "qakIqInzyM");
        setField(term184375, term184375.getClass(), "currencyNameForProcess", "EOsBgwlmva");
        setField(term184375, term184375.getClass(), "amount", "qcSJruZuJy");
        setField(term184375, term184375.getClass(), "paymentType", enum329);
        setField(term184375, term184375.getClass(), "newTrustlinesOnly", term184548);
        setField(term184375, term184375.getClass(), "useBlacklist", term184550);
        setField(term184375, term184375.getClass(), "maximumTrustlines", term184552);
        setField(term184375, term184375.getClass(), "dropType", enum330);
        setField(term184375, term184375.getClass(), "lockUuid", "NOSJtfgqAs");
        setField(term184375, term184375.getClass(), "failReason", "SUDRrjpChc");
        setField(term184375, term184375.getClass(), "feesPaid", "pmpprxfFwy");
        setField(term184375, term184375.getClass(), "minBalance", "AQbnQoJwOO");
        setField(term184375, term184375.getClass(), "maxBalance", "NnicBPzNzw");
        setField(term184375, term184375.getClass(), "maxXrpFeePerTransaction", "WADNPbexnT");
        setField(term184375, term184375.getClass(), "retryOfId", term184639);
        setField(term184375, term184375.getClass(), "nftIssuerAddress", "rMbsSfMKvX");
        setField(term184375, term184375.getClass(), "nftTaxon", term184653);
        setField(term184375, term184375.getClass(), "contactEmail", "oCsqRJXMBc");
        setField(term184375, term184375.getClass(), "autoApprove", term184667);
        setField(term184375, term184375.getClass(), "memo", "npPxKNoqdS");
        term184681 = newInstance(Class.forName("java.util.Date"));
        setLongField(term184681, term184681.getClass(), "fastTime", 1462334405893L);
        setField(term184681, term184681.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term184681;
        callMethod(klass, "setStartTime", argTypes, term184375, args);
    }

};


