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

public class PaymentRequestEnt_PaymentRequestEntBuilder_maximumTrustlines_194132278220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81507;
     Object term81809;

    public PaymentRequestEnt_PaymentRequestEntBuilder_maximumTrustlines_194132278220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term81508 = new Long(-7296330380944173376L);
        Class<? extends Object> term81832 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term81831 = ((Class) term81832).getDeclaredField((String) "REJECTED");
        ((Field) term81831).setAccessible(true);
        Object enum148 = ((Field) term81831).get((Object) null);
        Class<? extends Object> term82338 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term82337 = ((Class) term82338).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term82337).setAccessible(true);
        Object enum149 = ((Field) term82337).get((Object) null);
        Boolean term81676 = new Boolean(false);
        Boolean term81678 = new Boolean(false);
        Integer term81680 = new Integer(1324040357);
        Class<? extends Object> term82736 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term82735 = ((Class) term82736).getDeclaredField((String) "TRUSTLINE");
        ((Field) term82735).setAccessible(true);
        Object enum150 = ((Field) term82735).get((Object) null);
        Long term81767 = new Long(-8890284990655172580L);
        Long term81781 = new Long(-5951743062322506095L);
        Boolean term81795 = new Boolean(false);
        term81507 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term81534 = newInstance(Class.forName("java.util.Date"));
        Object term81536 = newInstance(Class.forName("java.util.Date"));
        Object term81538 = newInstance(Class.forName("java.util.Date"));
        setField(term81507, term81507.getClass(), "id", term81508);
        setField(term81507, term81507.getClass(), "environment", "YupgKTSEiI");
        setField(term81507, term81507.getClass(), "populateEnvironment", "HuOUlaFmvJ");
        setLongField(term81534, term81534.getClass(), "fastTime", 1640050684068L);
        setField(term81534, term81534.getClass(), "cdate", null);
        setField(term81507, term81507.getClass(), "createDate", term81534);
        setLongField(term81536, term81536.getClass(), "fastTime", 1292030471095L);
        setField(term81536, term81536.getClass(), "cdate", null);
        setField(term81507, term81507.getClass(), "updateDate", term81536);
        setLongField(term81538, term81538.getClass(), "fastTime", 1781318379156L);
        setField(term81538, term81538.getClass(), "cdate", null);
        setField(term81507, term81507.getClass(), "startTime", term81538);
        setField(term81507, term81507.getClass(), "status", enum148);
        setField(term81507, term81507.getClass(), "fromClassicAddress", "dWVwcwFGNo");
        setField(term81507, term81507.getClass(), "fromSigningPublicKey", "PNdLRrSAIY");
        setField(term81507, term81507.getClass(), "fromPrivateKey", "nJnRIRiLZK");
        setField(term81507, term81507.getClass(), "trustlineIssuerClassicAddress", "eWnrMSbYbT");
        setField(term81507, term81507.getClass(), "currencyName", "AjoFvDFyCY");
        setField(term81507, term81507.getClass(), "snapshotTrustlineIssuerClassicAddress", "OFTJwdPiTG");
        setField(term81507, term81507.getClass(), "snapshotCurrencyName", "QiUprSEluR");
        setField(term81507, term81507.getClass(), "currencyNameForProcess", "cDOXXottZh");
        setField(term81507, term81507.getClass(), "amount", "rfqJDkDppz");
        setField(term81507, term81507.getClass(), "paymentType", enum149);
        setField(term81507, term81507.getClass(), "newTrustlinesOnly", term81676);
        setField(term81507, term81507.getClass(), "useBlacklist", term81678);
        setField(term81507, term81507.getClass(), "maximumTrustlines", term81680);
        setField(term81507, term81507.getClass(), "dropType", enum150);
        setField(term81507, term81507.getClass(), "lockUuid", "MGorMVGauT");
        setField(term81507, term81507.getClass(), "failReason", "jXKxUGTuEF");
        setField(term81507, term81507.getClass(), "feesPaid", "nDCcyhiTnS");
        setField(term81507, term81507.getClass(), "minBalance", "Bcivwcjece");
        setField(term81507, term81507.getClass(), "maxBalance", "QTefjRuiez");
        setField(term81507, term81507.getClass(), "maxXrpFeePerTransaction", "SQZVNkAVBB");
        setField(term81507, term81507.getClass(), "retryOfId", term81767);
        setField(term81507, term81507.getClass(), "nftIssuerAddress", "mrSAYJlddZ");
        setField(term81507, term81507.getClass(), "nftTaxon", term81781);
        setField(term81507, term81507.getClass(), "contactEmail", "KbwxawvYsw");
        setField(term81507, term81507.getClass(), "autoApprove", term81795);
        setField(term81507, term81507.getClass(), "memo", "gvjdfHNzOa");
        term81809 = new Integer(-1588772968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term81809;
        callMethod(klass, "maximumTrustlines", argTypes, term81507, args);
    }

};


