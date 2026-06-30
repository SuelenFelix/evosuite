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
import java.lang.Object;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;

public class FsePaymentTrustlinesMinTriggeredRequest_hashCode_17489156283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2153;

    public FsePaymentTrustlinesMinTriggeredRequest_hashCode_17489156283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2243 = new Integer(1484323161);
        Double term2245 = new Double(0.28570734989730284);
        Double term2247 = new Double(0.40176586625454525);
        Long term2261 = new Long(-8257434502486459194L);
        Class<? extends Object> term2404 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term2403 = ((Class) term2404).getDeclaredField((String) "FLAT");
        ((Field) term2403).setAccessible(true);
        Object enum4 = ((Field) term2403).get((Object) null);
        Class<? extends Object> term2798 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term2797 = ((Class) term2798).getDeclaredField((String) "WEEKLY");
        ((Field) term2797).setAccessible(true);
        Object enum5 = ((Field) term2797).get((Object) null);
        term2153 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest"));
        Object term2154 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term2295 = newInstance(Class.forName("java.util.Date"));
        Object term2307 = newInstance(Class.forName("java.util.Date"));
        setField(term2154, term2154.getClass(), "memo", "xOEqzGAmDU");
        setField(term2154, term2154.getClass(), "fromClassicAddress", "eZFUvlxvGV");
        setField(term2154, term2154.getClass(), "fromSigningPublicKey", "BYqFIqCKAV");
        setField(term2154, term2154.getClass(), "fromPrivateKey", "vrQLuWIDJX");
        setField(term2154, term2154.getClass(), "trustlineIssuerClassicAddress", "flxyYxBRtu");
        setField(term2154, term2154.getClass(), "currencyName", "OclPbYPkcH");
        setField(term2154, term2154.getClass(), "amount", "IoAlmYsBwc");
        setBooleanField(term2154, term2154.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term2154, term2154.getClass(), "globalIdVerified", true);
        setBooleanField(term2154, term2154.getClass(), "useBlacklist", false);
        setBooleanField(term2154, term2154.getClass(), "agreeFee", true);
        setField(term2154, term2154.getClass(), "maximumTrustlines", term2243);
        setField(term2154, term2154.getClass(), "minBalance", term2245);
        setField(term2154, term2154.getClass(), "maxBalance", term2247);
        setField(term2154, term2154.getClass(), "maxXrpFeePerTransaction", "TEParAifyi");
        setField(term2154, term2154.getClass(), "retryOfId", term2261);
        setField(term2154, term2154.getClass(), "paymentType", enum4);
        setField(term2154, term2154.getClass(), "snapshotTrustlineIssuerClassicAddress", "OWDIEULEFu");
        setField(term2154, term2154.getClass(), "snapshotCurrencyName", "dWRymuLBtr");
        setLongField(term2295, term2295.getClass(), "fastTime", 1442639565302L);
        setField(term2295, term2295.getClass(), "cdate", null);
        setField(term2154, term2154.getClass(), "startTime", term2295);
        setField(term2154, term2154.getClass(), "frequency", enum5);
        setLongField(term2307, term2307.getClass(), "fastTime", 1515890130018L);
        setField(term2307, term2307.getClass(), "cdate", null);
        setField(term2154, term2154.getClass(), "repeatUntilDate", term2307);
        setField(term2154, term2154.getClass(), "email", "AijpHYOFuy");
        setBooleanField(term2154, term2154.getClass(), "autoApprove", false);
        setField(term2153, term2153.getClass(), "trustlinePaymentRequest", term2154);
        setIntField(term2153, term2153.getClass(), "minTrustLinesTriggerValue", 1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2153, args);
    }

};


