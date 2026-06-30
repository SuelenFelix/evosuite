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

public class FsePaymentTrustlinesRequest_getMaximumTrustlines_208553182517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36001;

    public FsePaymentTrustlinesRequest_getMaximumTrustlines_208553182517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term36090 = new Integer(-469968304);
        Double term36092 = new Double(0.9374115574082594);
        Double term36094 = new Double(0.8454723071922143);
        Long term36108 = new Long(-7738503207562305297L);
        Class<? extends Object> term36249 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term36248 = ((Class) term36249).getDeclaredField((String) "FLAT");
        ((Field) term36248).setAccessible(true);
        Object enum63 = ((Field) term36248).get((Object) null);
        Class<? extends Object> term36643 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term36642 = ((Class) term36643).getDeclaredField((String) "DAILY");
        ((Field) term36642).setAccessible(true);
        Object enum64 = ((Field) term36642).get((Object) null);
        term36001 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term36142 = newInstance(Class.forName("java.util.Date"));
        Object term36153 = newInstance(Class.forName("java.util.Date"));
        setField(term36001, term36001.getClass(), "memo", "xjoSGPWUgu");
        setField(term36001, term36001.getClass(), "fromClassicAddress", "uzmqjnOUXu");
        setField(term36001, term36001.getClass(), "fromSigningPublicKey", "xeyjTOCOJb");
        setField(term36001, term36001.getClass(), "fromPrivateKey", "DGRqjjdhzy");
        setField(term36001, term36001.getClass(), "trustlineIssuerClassicAddress", "lQFkjJUPAR");
        setField(term36001, term36001.getClass(), "currencyName", "BsuVlGUUjV");
        setField(term36001, term36001.getClass(), "amount", "bHHjfDCntT");
        setBooleanField(term36001, term36001.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term36001, term36001.getClass(), "globalIdVerified", false);
        setBooleanField(term36001, term36001.getClass(), "useBlacklist", false);
        setBooleanField(term36001, term36001.getClass(), "agreeFee", true);
        setField(term36001, term36001.getClass(), "maximumTrustlines", term36090);
        setField(term36001, term36001.getClass(), "minBalance", term36092);
        setField(term36001, term36001.getClass(), "maxBalance", term36094);
        setField(term36001, term36001.getClass(), "maxXrpFeePerTransaction", "sEphiduvkv");
        setField(term36001, term36001.getClass(), "retryOfId", term36108);
        setField(term36001, term36001.getClass(), "paymentType", enum63);
        setField(term36001, term36001.getClass(), "snapshotTrustlineIssuerClassicAddress", "PbLgCSAHce");
        setField(term36001, term36001.getClass(), "snapshotCurrencyName", "NWldOLAbqk");
        setLongField(term36142, term36142.getClass(), "fastTime", 1853963979281L);
        setField(term36142, term36142.getClass(), "cdate", null);
        setField(term36001, term36001.getClass(), "startTime", term36142);
        setField(term36001, term36001.getClass(), "frequency", enum64);
        setLongField(term36153, term36153.getClass(), "fastTime", 1795936337628L);
        setField(term36153, term36153.getClass(), "cdate", null);
        setField(term36001, term36001.getClass(), "repeatUntilDate", term36153);
        setField(term36001, term36001.getClass(), "email", "qnYaYSpDwO");
        setBooleanField(term36001, term36001.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaximumTrustlines", argTypes, term36001, args);
    }

};


