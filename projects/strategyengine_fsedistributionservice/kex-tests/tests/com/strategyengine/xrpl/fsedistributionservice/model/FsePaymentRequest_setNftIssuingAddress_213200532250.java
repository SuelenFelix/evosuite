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

public class FsePaymentRequest_setNftIssuingAddress_213200532250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398610;

    public FsePaymentRequest_setNftIssuingAddress_213200532250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term398659 = new ArrayList();
        ((ArrayList) term398659).add("FJgDzlzGWb");
        ((ArrayList) term398659).add("HEhtTqNguT");
        ((ArrayList) term398659).add("yiVUZbRRMJ");
        Long term398764 = new Long(-3694649475237271412L);
        Class<? extends Object> term398971 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term398970 = ((Class) term398971).getDeclaredField((String) "FLAT");
        ((Field) term398970).setAccessible(true);
        Object enum760 = ((Field) term398970).get((Object) null);
        Long term398810 = new Long(5323722289713523213L);
        Class<? extends Object> term399375 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term399374 = ((Class) term399375).getDeclaredField((String) "MONTHLY");
        ((Field) term399374).setAccessible(true);
        Object enum761 = ((Field) term399374).get((Object) null);
        term398610 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term398711 = newInstance(Class.forName("java.util.Date"));
        Object term398823 = newInstance(Class.forName("java.util.Date"));
        setField(term398610, term398610.getClass(), "memo", "LjwtsxSxqY");
        setField(term398610, term398610.getClass(), "fromClassicAddress", "jhEIZGcFpp");
        setField(term398610, term398610.getClass(), "fromSigningPublicKey", "hAbDUnTjjJ");
        setField(term398610, term398610.getClass(), "fromPrivateKey", "KXTZTXzufA");
        setField(term398610, term398610.getClass(), "toClassicAddresses", term398659);
        setField(term398610, term398610.getClass(), "amount", "fLEHiGuHVs");
        setLongField(term398711, term398711.getClass(), "fastTime", 1378990523372L);
        setField(term398711, term398711.getClass(), "cdate", null);
        setField(term398610, term398610.getClass(), "startTime", term398711);
        setField(term398610, term398610.getClass(), "destinationTag", "aDqRYtnuEX");
        setField(term398610, term398610.getClass(), "trustlineIssuerClassicAddress", "zdxbtfvlKR");
        setField(term398610, term398610.getClass(), "currencyName", "jjRBUiEJTO");
        setBooleanField(term398610, term398610.getClass(), "agreeFee", true);
        setField(term398610, term398610.getClass(), "maxXrpFeePerTransaction", "FOKonOfMjU");
        setBooleanField(term398610, term398610.getClass(), "globalIdVerified", true);
        setBooleanField(term398610, term398610.getClass(), "useBlacklist", false);
        setField(term398610, term398610.getClass(), "retryOfId", term398764);
        setField(term398610, term398610.getClass(), "paymentType", enum760);
        setField(term398610, term398610.getClass(), "snapshotTrustlineIssuerClassicAddress", "lWbiRqiFLY");
        setField(term398610, term398610.getClass(), "snapshotCurrencyName", "fZjjEMXeXg");
        setField(term398610, term398610.getClass(), "nftIssuingAddress", "HbwtoQBNKx");
        setField(term398610, term398610.getClass(), "nftTaxon", term398810);
        setField(term398610, term398610.getClass(), "frequency", enum761);
        setLongField(term398823, term398823.getClass(), "fastTime", 1590704906023L);
        setField(term398823, term398823.getClass(), "cdate", null);
        setField(term398610, term398610.getClass(), "repeatUntilDate", term398823);
        setField(term398610, term398610.getClass(), "email", "vAQgOxaqVS");
        setBooleanField(term398610, term398610.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HObMxrmeDP";
        callMethod(klass, "setNftIssuingAddress", argTypes, term398610, args);
    }

};


