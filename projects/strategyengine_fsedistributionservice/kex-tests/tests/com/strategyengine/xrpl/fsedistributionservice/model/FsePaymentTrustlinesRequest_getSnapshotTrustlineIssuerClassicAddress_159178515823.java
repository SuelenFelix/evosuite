package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FsePaymentTrustlinesRequest_getSnapshotTrustlineIssuerClassicAddress_159178515823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42397;

    public FsePaymentTrustlinesRequest_getSnapshotTrustlineIssuerClassicAddress_159178515823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term42486 = new Integer(-157887805);
        Double term42488 = new Double(0.11179067076100713);
        Double term42490 = new Double(0.5306473989087822);
        Long term42504 = new Long(2443640364875054177L);
        Class<? extends Object> term42656 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term42655 = ((Class) term42656).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term42655).setAccessible(true);
        Object enum75 = ((Field) term42655).get((Object) null);
        Class<? extends Object> term43074 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term43073 = ((Class) term43074).getDeclaredField((String) "ANNUALLY");
        ((Field) term43073).setAccessible(true);
        Object enum76 = ((Field) term43073).get((Object) null);
        term42397 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term42546 = newInstance(Class.forName("java.util.Date"));
        Object term42560 = newInstance(Class.forName("java.util.Date"));
        setField(term42397, term42397.getClass(), "memo", "ZbHJVEqcoa");
        setField(term42397, term42397.getClass(), "fromClassicAddress", "awDQVEVIKi");
        setField(term42397, term42397.getClass(), "fromSigningPublicKey", "HJwNgUzZZR");
        setField(term42397, term42397.getClass(), "fromPrivateKey", "FvUCZgTXhq");
        setField(term42397, term42397.getClass(), "trustlineIssuerClassicAddress", "wWWidPCHzx");
        setField(term42397, term42397.getClass(), "currencyName", "OwPIiBRuKK");
        setField(term42397, term42397.getClass(), "amount", "sgfGySMODT");
        setBooleanField(term42397, term42397.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term42397, term42397.getClass(), "globalIdVerified", true);
        setBooleanField(term42397, term42397.getClass(), "useBlacklist", false);
        setBooleanField(term42397, term42397.getClass(), "agreeFee", false);
        setField(term42397, term42397.getClass(), "maximumTrustlines", term42486);
        setField(term42397, term42397.getClass(), "minBalance", term42488);
        setField(term42397, term42397.getClass(), "maxBalance", term42490);
        setField(term42397, term42397.getClass(), "maxXrpFeePerTransaction", "ndAITnOsny");
        setField(term42397, term42397.getClass(), "retryOfId", term42504);
        setField(term42397, term42397.getClass(), "paymentType", enum75);
        setField(term42397, term42397.getClass(), "snapshotTrustlineIssuerClassicAddress", "CVZnTiJucs");
        setField(term42397, term42397.getClass(), "snapshotCurrencyName", "ecHEQufXoq");
        setLongField(term42546, term42546.getClass(), "fastTime", 1332871705432L);
        setField(term42546, term42546.getClass(), "cdate", null);
        setField(term42397, term42397.getClass(), "startTime", term42546);
        setField(term42397, term42397.getClass(), "frequency", enum76);
        setLongField(term42560, term42560.getClass(), "fastTime", 1597233967116L);
        setField(term42560, term42560.getClass(), "cdate", null);
        setField(term42397, term42397.getClass(), "repeatUntilDate", term42560);
        setField(term42397, term42397.getClass(), "email", "btBLMvHzJg");
        setBooleanField(term42397, term42397.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSnapshotTrustlineIssuerClassicAddress", argTypes, term42397, args);
    }

};


