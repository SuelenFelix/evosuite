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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;

public class FsePaymentRequest_isAgreeFee_27907467116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358296;

    public FsePaymentRequest_isAgreeFee_27907467116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term358345 = new ArrayList();
        ((ArrayList) term358345).add("JPwJuSAFMV");
        ((ArrayList) term358345).add("rgJInRfHvu");
        ((ArrayList) term358345).add("BXyMmaBwrc");
        ((ArrayList) term358345).add("vEnSsMXyFp");
        ((ArrayList) term358345).add("kZgDFRIXuo");
        ((ArrayList) term358345).add("BQpqygpzrr");
        ((ArrayList) term358345).add("ZIlXJENLoo");
        Long term358498 = new Long(-7231877484121205165L);
        Class<? extends Object> term358732 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term358731 = ((Class) term358732).getDeclaredField((String) "FLAT");
        ((Field) term358731).setAccessible(true);
        Object enum694 = ((Field) term358731).get((Object) null);
        Long term358544 = new Long(3571859690258686344L);
        Class<? extends Object> term359136 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term359135 = ((Class) term359136).getDeclaredField((String) "WEEKLY");
        ((Field) term359135).setAccessible(true);
        Object enum695 = ((Field) term359135).get((Object) null);
        term358296 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term358445 = newInstance(Class.forName("java.util.Date"));
        Object term358556 = newInstance(Class.forName("java.util.Date"));
        setField(term358296, term358296.getClass(), "memo", "LEJkuksMgd");
        setField(term358296, term358296.getClass(), "fromClassicAddress", "dFfluQzBHo");
        setField(term358296, term358296.getClass(), "fromSigningPublicKey", "rGynvvclsd");
        setField(term358296, term358296.getClass(), "fromPrivateKey", "ymfafvBtWk");
        setField(term358296, term358296.getClass(), "toClassicAddresses", term358345);
        setField(term358296, term358296.getClass(), "amount", "exMpvwLuJn");
        setLongField(term358445, term358445.getClass(), "fastTime", 1711962944595L);
        setField(term358445, term358445.getClass(), "cdate", null);
        setField(term358296, term358296.getClass(), "startTime", term358445);
        setField(term358296, term358296.getClass(), "destinationTag", "mwlQNSbpmu");
        setField(term358296, term358296.getClass(), "trustlineIssuerClassicAddress", "EpUvGZYxqd");
        setField(term358296, term358296.getClass(), "currencyName", "qmpBfrEkWf");
        setBooleanField(term358296, term358296.getClass(), "agreeFee", false);
        setField(term358296, term358296.getClass(), "maxXrpFeePerTransaction", "bUeNsGDmSt");
        setBooleanField(term358296, term358296.getClass(), "globalIdVerified", true);
        setBooleanField(term358296, term358296.getClass(), "useBlacklist", true);
        setField(term358296, term358296.getClass(), "retryOfId", term358498);
        setField(term358296, term358296.getClass(), "paymentType", enum694);
        setField(term358296, term358296.getClass(), "snapshotTrustlineIssuerClassicAddress", "JhtGqHtiGD");
        setField(term358296, term358296.getClass(), "snapshotCurrencyName", "MvFuIySpGS");
        setField(term358296, term358296.getClass(), "nftIssuingAddress", "srIGzXCBof");
        setField(term358296, term358296.getClass(), "nftTaxon", term358544);
        setField(term358296, term358296.getClass(), "frequency", enum695);
        setLongField(term358556, term358556.getClass(), "fastTime", 1327636883373L);
        setField(term358556, term358556.getClass(), "cdate", null);
        setField(term358296, term358296.getClass(), "repeatUntilDate", term358556);
        setField(term358296, term358296.getClass(), "email", "ifBiFZQlWC");
        setBooleanField(term358296, term358296.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAgreeFee", argTypes, term358296, args);
    }

};


