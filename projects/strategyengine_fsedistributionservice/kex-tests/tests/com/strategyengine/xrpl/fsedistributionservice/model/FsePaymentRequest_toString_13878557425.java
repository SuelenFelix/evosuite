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

public class FsePaymentRequest_toString_13878557425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344899;

    public FsePaymentRequest_toString_13878557425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term344948 = new ArrayList();
        Long term345017 = new Long(732331270654896650L);
        Class<? extends Object> term345190 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term345189 = ((Class) term345190).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term345189).setAccessible(true);
        Object enum672 = ((Field) term345189).get((Object) null);
        Long term345071 = new Long(8578289401978257809L);
        Class<? extends Object> term345618 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term345617 = ((Class) term345618).getDeclaredField((String) "MONTHLY");
        ((Field) term345617).setAccessible(true);
        Object enum673 = ((Field) term345617).get((Object) null);
        term344899 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term344964 = newInstance(Class.forName("java.util.Date"));
        Object term345084 = newInstance(Class.forName("java.util.Date"));
        setField(term344899, term344899.getClass(), "memo", "mBJiiQCxaL");
        setField(term344899, term344899.getClass(), "fromClassicAddress", "DsIfGQndOB");
        setField(term344899, term344899.getClass(), "fromSigningPublicKey", "bKVDCtrRgI");
        setField(term344899, term344899.getClass(), "fromPrivateKey", "ZbxzwEYXdm");
        setField(term344899, term344899.getClass(), "toClassicAddresses", term344948);
        setField(term344899, term344899.getClass(), "amount", "kJPYWHclZM");
        setLongField(term344964, term344964.getClass(), "fastTime", 1425762525389L);
        setField(term344964, term344964.getClass(), "cdate", null);
        setField(term344899, term344899.getClass(), "startTime", term344964);
        setField(term344899, term344899.getClass(), "destinationTag", "azYtVoulhq");
        setField(term344899, term344899.getClass(), "trustlineIssuerClassicAddress", "kVLqWlFysu");
        setField(term344899, term344899.getClass(), "currencyName", "cHmwpyPdAp");
        setBooleanField(term344899, term344899.getClass(), "agreeFee", true);
        setField(term344899, term344899.getClass(), "maxXrpFeePerTransaction", "oNFTwxUIzz");
        setBooleanField(term344899, term344899.getClass(), "globalIdVerified", false);
        setBooleanField(term344899, term344899.getClass(), "useBlacklist", false);
        setField(term344899, term344899.getClass(), "retryOfId", term345017);
        setField(term344899, term344899.getClass(), "paymentType", enum672);
        setField(term344899, term344899.getClass(), "snapshotTrustlineIssuerClassicAddress", "VGsYNwQhEZ");
        setField(term344899, term344899.getClass(), "snapshotCurrencyName", "SsgaArGuEz");
        setField(term344899, term344899.getClass(), "nftIssuingAddress", "dHsWwhojpf");
        setField(term344899, term344899.getClass(), "nftTaxon", term345071);
        setField(term344899, term344899.getClass(), "frequency", enum673);
        setLongField(term345084, term345084.getClass(), "fastTime", 1483432592773L);
        setField(term345084, term345084.getClass(), "cdate", null);
        setField(term344899, term344899.getClass(), "repeatUntilDate", term345084);
        setField(term344899, term344899.getClass(), "email", "ncpWpGyCgp");
        setBooleanField(term344899, term344899.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term344899, args);
    }

};


