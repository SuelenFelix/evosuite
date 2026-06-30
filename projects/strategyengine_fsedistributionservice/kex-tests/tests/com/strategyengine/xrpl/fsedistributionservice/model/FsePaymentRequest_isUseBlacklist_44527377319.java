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

public class FsePaymentRequest_isUseBlacklist_44527377319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361939;

    public FsePaymentRequest_isUseBlacklist_44527377319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term361988 = new ArrayList();
        ((ArrayList) term361988).add("ODVzituXwb");
        ((ArrayList) term361988).add("FsRdBvMoFL");
        ((ArrayList) term361988).add("LxfyyptgQV");
        Long term362093 = new Long(-5996777564331234572L);
        Class<? extends Object> term362297 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term362296 = ((Class) term362297).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term362296).setAccessible(true);
        Object enum700 = ((Field) term362296).get((Object) null);
        Long term362147 = new Long(-218745825074249415L);
        Class<? extends Object> term362725 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term362724 = ((Class) term362725).getDeclaredField((String) "ANNUALLY");
        ((Field) term362724).setAccessible(true);
        Object enum701 = ((Field) term362724).get((Object) null);
        term361939 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term362040 = newInstance(Class.forName("java.util.Date"));
        Object term362161 = newInstance(Class.forName("java.util.Date"));
        setField(term361939, term361939.getClass(), "memo", "rZkZxvNGiH");
        setField(term361939, term361939.getClass(), "fromClassicAddress", "syxxjJZgxt");
        setField(term361939, term361939.getClass(), "fromSigningPublicKey", "qsDbGHhiYJ");
        setField(term361939, term361939.getClass(), "fromPrivateKey", "xMHAXQoTQL");
        setField(term361939, term361939.getClass(), "toClassicAddresses", term361988);
        setField(term361939, term361939.getClass(), "amount", "HSSChGSfwI");
        setLongField(term362040, term362040.getClass(), "fastTime", 1852023296484L);
        setField(term362040, term362040.getClass(), "cdate", null);
        setField(term361939, term361939.getClass(), "startTime", term362040);
        setField(term361939, term361939.getClass(), "destinationTag", "wqSCneTuDZ");
        setField(term361939, term361939.getClass(), "trustlineIssuerClassicAddress", "IAfjCTUPiV");
        setField(term361939, term361939.getClass(), "currencyName", "BmwytjiuDw");
        setBooleanField(term361939, term361939.getClass(), "agreeFee", true);
        setField(term361939, term361939.getClass(), "maxXrpFeePerTransaction", "tXtEQPpSEE");
        setBooleanField(term361939, term361939.getClass(), "globalIdVerified", false);
        setBooleanField(term361939, term361939.getClass(), "useBlacklist", false);
        setField(term361939, term361939.getClass(), "retryOfId", term362093);
        setField(term361939, term361939.getClass(), "paymentType", enum700);
        setField(term361939, term361939.getClass(), "snapshotTrustlineIssuerClassicAddress", "DzwVEhJZMS");
        setField(term361939, term361939.getClass(), "snapshotCurrencyName", "VGkwPggfzZ");
        setField(term361939, term361939.getClass(), "nftIssuingAddress", "PFgASmmelX");
        setField(term361939, term361939.getClass(), "nftTaxon", term362147);
        setField(term361939, term361939.getClass(), "frequency", enum701);
        setLongField(term362161, term362161.getClass(), "fastTime", 1613844001053L);
        setField(term362161, term362161.getClass(), "cdate", null);
        setField(term361939, term361939.getClass(), "repeatUntilDate", term362161);
        setField(term361939, term361939.getClass(), "email", "hSyCiiwQkz");
        setBooleanField(term361939, term361939.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUseBlacklist", argTypes, term361939, args);
    }

};


