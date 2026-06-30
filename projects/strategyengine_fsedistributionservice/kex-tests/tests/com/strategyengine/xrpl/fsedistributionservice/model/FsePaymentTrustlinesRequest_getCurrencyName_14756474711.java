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

public class FsePaymentTrustlinesRequest_getCurrencyName_14756474711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29553;

    public FsePaymentTrustlinesRequest_getCurrencyName_14756474711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29642 = new Integer(-1179120542);
        Double term29644 = new Double(0.22651340641904605);
        Double term29646 = new Double(0.8878841294187743);
        Long term29660 = new Long(-5788180182343976541L);
        Class<? extends Object> term29812 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term29811 = ((Class) term29812).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term29811).setAccessible(true);
        Object enum51 = ((Field) term29811).get((Object) null);
        Class<? extends Object> term30230 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term30229 = ((Class) term30230).getDeclaredField((String) "ANNUALLY");
        ((Field) term30229).setAccessible(true);
        Object enum52 = ((Field) term30229).get((Object) null);
        term29553 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term29702 = newInstance(Class.forName("java.util.Date"));
        Object term29716 = newInstance(Class.forName("java.util.Date"));
        setField(term29553, term29553.getClass(), "memo", "pXxkiXgQnq");
        setField(term29553, term29553.getClass(), "fromClassicAddress", "tKmrUDURku");
        setField(term29553, term29553.getClass(), "fromSigningPublicKey", "JeZbrwZmsP");
        setField(term29553, term29553.getClass(), "fromPrivateKey", "bxyfeicqrK");
        setField(term29553, term29553.getClass(), "trustlineIssuerClassicAddress", "vBnWPlsZMk");
        setField(term29553, term29553.getClass(), "currencyName", "fIZsWucfXz");
        setField(term29553, term29553.getClass(), "amount", "IApvtmfhnq");
        setBooleanField(term29553, term29553.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term29553, term29553.getClass(), "globalIdVerified", true);
        setBooleanField(term29553, term29553.getClass(), "useBlacklist", false);
        setBooleanField(term29553, term29553.getClass(), "agreeFee", false);
        setField(term29553, term29553.getClass(), "maximumTrustlines", term29642);
        setField(term29553, term29553.getClass(), "minBalance", term29644);
        setField(term29553, term29553.getClass(), "maxBalance", term29646);
        setField(term29553, term29553.getClass(), "maxXrpFeePerTransaction", "VSaNnhMpRc");
        setField(term29553, term29553.getClass(), "retryOfId", term29660);
        setField(term29553, term29553.getClass(), "paymentType", enum51);
        setField(term29553, term29553.getClass(), "snapshotTrustlineIssuerClassicAddress", "QNjNTLlUaV");
        setField(term29553, term29553.getClass(), "snapshotCurrencyName", "hIYsRyOZxk");
        setLongField(term29702, term29702.getClass(), "fastTime", 1405279189488L);
        setField(term29702, term29702.getClass(), "cdate", null);
        setField(term29553, term29553.getClass(), "startTime", term29702);
        setField(term29553, term29553.getClass(), "frequency", enum52);
        setLongField(term29716, term29716.getClass(), "fastTime", 1822704644050L);
        setField(term29716, term29716.getClass(), "cdate", null);
        setField(term29553, term29553.getClass(), "repeatUntilDate", term29716);
        setField(term29553, term29553.getClass(), "email", "RjNoEywJbC");
        setBooleanField(term29553, term29553.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrencyName", argTypes, term29553, args);
    }

};


