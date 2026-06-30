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
import java.lang.Boolean;

public class FsePaymentTrustlinesRequest_setAgreeFee_66587967442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61769;
     Object term61937;

    public FsePaymentTrustlinesRequest_setAgreeFee_66587967442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term61858 = new Integer(97029295);
        Double term61860 = new Double(0.7171972879282721);
        Double term61862 = new Double(0.9006361024877096);
        Long term61876 = new Long(5510783420697225605L);
        Class<? extends Object> term62020 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term62019 = ((Class) term62020).getDeclaredField((String) "FLAT");
        ((Field) term62019).setAccessible(true);
        Object enum111 = ((Field) term62019).get((Object) null);
        Class<? extends Object> term62414 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term62413 = ((Class) term62414).getDeclaredField((String) "WEEKLY");
        ((Field) term62413).setAccessible(true);
        Object enum112 = ((Field) term62413).get((Object) null);
        term61769 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term61910 = newInstance(Class.forName("java.util.Date"));
        Object term61922 = newInstance(Class.forName("java.util.Date"));
        setField(term61769, term61769.getClass(), "memo", "QTefjRuiez");
        setField(term61769, term61769.getClass(), "fromClassicAddress", "SQZVNkAVBB");
        setField(term61769, term61769.getClass(), "fromSigningPublicKey", "mrSAYJlddZ");
        setField(term61769, term61769.getClass(), "fromPrivateKey", "KbwxawvYsw");
        setField(term61769, term61769.getClass(), "trustlineIssuerClassicAddress", "gvjdfHNzOa");
        setField(term61769, term61769.getClass(), "currencyName", "HqitWglYWX");
        setField(term61769, term61769.getClass(), "amount", "pOuFRlHmbK");
        setBooleanField(term61769, term61769.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term61769, term61769.getClass(), "globalIdVerified", true);
        setBooleanField(term61769, term61769.getClass(), "useBlacklist", true);
        setBooleanField(term61769, term61769.getClass(), "agreeFee", true);
        setField(term61769, term61769.getClass(), "maximumTrustlines", term61858);
        setField(term61769, term61769.getClass(), "minBalance", term61860);
        setField(term61769, term61769.getClass(), "maxBalance", term61862);
        setField(term61769, term61769.getClass(), "maxXrpFeePerTransaction", "WrzdBkinqV");
        setField(term61769, term61769.getClass(), "retryOfId", term61876);
        setField(term61769, term61769.getClass(), "paymentType", enum111);
        setField(term61769, term61769.getClass(), "snapshotTrustlineIssuerClassicAddress", "vydWXHfFTw");
        setField(term61769, term61769.getClass(), "snapshotCurrencyName", "DRhkpDneCC");
        setLongField(term61910, term61910.getClass(), "fastTime", 1714975302670L);
        setField(term61910, term61910.getClass(), "cdate", null);
        setField(term61769, term61769.getClass(), "startTime", term61910);
        setField(term61769, term61769.getClass(), "frequency", enum112);
        setLongField(term61922, term61922.getClass(), "fastTime", 1830753077357L);
        setField(term61922, term61922.getClass(), "cdate", null);
        setField(term61769, term61769.getClass(), "repeatUntilDate", term61922);
        setField(term61769, term61769.getClass(), "email", "vuIJRrypuA");
        setBooleanField(term61769, term61769.getClass(), "autoApprove", false);
        term61937 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term61937;
        callMethod(klass, "setAgreeFee", argTypes, term61769, args);
    }

};


