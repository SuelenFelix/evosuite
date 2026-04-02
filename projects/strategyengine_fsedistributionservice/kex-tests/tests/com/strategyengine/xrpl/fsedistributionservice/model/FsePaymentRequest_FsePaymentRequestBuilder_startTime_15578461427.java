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

public class FsePaymentRequest_FsePaymentRequestBuilder_startTime_15578461427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term575051;
     Object term575241;

    public FsePaymentRequest_FsePaymentRequestBuilder_startTime_15578461427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term575100 = new ArrayList();
        Long term575169 = new Long(-2749182704506228402L);
        Class<? extends Object> term575334 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term575333 = ((Class) term575334).getDeclaredField((String) "FLAT");
        ((Field) term575333).setAccessible(true);
        Object enum1084 = ((Field) term575333).get((Object) null);
        Long term575215 = new Long(6600785663926369589L);
        Class<? extends Object> term575738 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term575737 = ((Class) term575738).getDeclaredField((String) "DAILY");
        ((Field) term575737).setAccessible(true);
        Object enum1085 = ((Field) term575737).get((Object) null);
        term575051 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term575116 = newInstance(Class.forName("java.util.Date"));
        Object term575226 = newInstance(Class.forName("java.util.Date"));
        setField(term575051, term575051.getClass(), "memo", "hcCiadryUN");
        setField(term575051, term575051.getClass(), "fromClassicAddress", "xHANisEhHP");
        setField(term575051, term575051.getClass(), "fromSigningPublicKey", "jlmmzUmQxH");
        setField(term575051, term575051.getClass(), "fromPrivateKey", "RuYeeRfuJU");
        setField(term575051, term575051.getClass(), "toClassicAddresses", term575100);
        setField(term575051, term575051.getClass(), "amount", "prwDXCPkFo");
        setLongField(term575116, term575116.getClass(), "fastTime", 1555819422891L);
        setField(term575116, term575116.getClass(), "cdate", null);
        setField(term575051, term575051.getClass(), "startTime", term575116);
        setField(term575051, term575051.getClass(), "destinationTag", "gXdJSyNntC");
        setField(term575051, term575051.getClass(), "trustlineIssuerClassicAddress", "oovEoPNoDL");
        setField(term575051, term575051.getClass(), "currencyName", "oflVrdmLzV");
        setBooleanField(term575051, term575051.getClass(), "agreeFee", false);
        setField(term575051, term575051.getClass(), "maxXrpFeePerTransaction", "RrqOknhAbQ");
        setBooleanField(term575051, term575051.getClass(), "globalIdVerified", false);
        setBooleanField(term575051, term575051.getClass(), "useBlacklist", true);
        setField(term575051, term575051.getClass(), "retryOfId", term575169);
        setField(term575051, term575051.getClass(), "paymentType", enum1084);
        setField(term575051, term575051.getClass(), "snapshotTrustlineIssuerClassicAddress", "JgwCJZKOrP");
        setField(term575051, term575051.getClass(), "snapshotCurrencyName", "HrQeKGmoKp");
        setField(term575051, term575051.getClass(), "nftIssuingAddress", "xEsTyydekp");
        setField(term575051, term575051.getClass(), "nftTaxon", term575215);
        setField(term575051, term575051.getClass(), "frequency", enum1085);
        setLongField(term575226, term575226.getClass(), "fastTime", 1834645040401L);
        setField(term575226, term575226.getClass(), "cdate", null);
        setField(term575051, term575051.getClass(), "repeatUntilDate", term575226);
        setField(term575051, term575051.getClass(), "email", "ZjkBEbQCcc");
        setBooleanField(term575051, term575051.getClass(), "autoApprove", true);
        term575241 = newInstance(Class.forName("java.util.Date"));
        setLongField(term575241, term575241.getClass(), "fastTime", 1264398832741L);
        setField(term575241, term575241.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term575241;
        callMethod(klass, "startTime", argTypes, term575051, args);
    }

};


