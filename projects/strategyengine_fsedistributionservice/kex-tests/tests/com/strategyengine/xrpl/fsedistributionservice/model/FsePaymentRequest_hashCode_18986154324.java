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

public class FsePaymentRequest_hashCode_18986154324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343818;

    public FsePaymentRequest_hashCode_18986154324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term343867 = new ArrayList();
        Long term343936 = new Long(4331712795558033930L);
        Class<? extends Object> term344099 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term344098 = ((Class) term344099).getDeclaredField((String) "FLAT");
        ((Field) term344098).setAccessible(true);
        Object enum670 = ((Field) term344098).get((Object) null);
        Long term343982 = new Long(8180021874498524998L);
        Class<? extends Object> term344503 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term344502 = ((Class) term344503).getDeclaredField((String) "DAILY");
        ((Field) term344502).setAccessible(true);
        Object enum671 = ((Field) term344502).get((Object) null);
        term343818 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term343883 = newInstance(Class.forName("java.util.Date"));
        Object term343993 = newInstance(Class.forName("java.util.Date"));
        setField(term343818, term343818.getClass(), "memo", "YZyWVYutLo");
        setField(term343818, term343818.getClass(), "fromClassicAddress", "pMmBjkkFKu");
        setField(term343818, term343818.getClass(), "fromSigningPublicKey", "QMFqneinXp");
        setField(term343818, term343818.getClass(), "fromPrivateKey", "UlPbzrpQIx");
        setField(term343818, term343818.getClass(), "toClassicAddresses", term343867);
        setField(term343818, term343818.getClass(), "amount", "FMZNzLOxGT");
        setLongField(term343883, term343883.getClass(), "fastTime", 1417943521310L);
        setField(term343883, term343883.getClass(), "cdate", null);
        setField(term343818, term343818.getClass(), "startTime", term343883);
        setField(term343818, term343818.getClass(), "destinationTag", "bIZUmZXLHa");
        setField(term343818, term343818.getClass(), "trustlineIssuerClassicAddress", "TEwHZNjLIs");
        setField(term343818, term343818.getClass(), "currencyName", "kRMGFXXrsP");
        setBooleanField(term343818, term343818.getClass(), "agreeFee", false);
        setField(term343818, term343818.getClass(), "maxXrpFeePerTransaction", "FuwXaCGDKr");
        setBooleanField(term343818, term343818.getClass(), "globalIdVerified", true);
        setBooleanField(term343818, term343818.getClass(), "useBlacklist", true);
        setField(term343818, term343818.getClass(), "retryOfId", term343936);
        setField(term343818, term343818.getClass(), "paymentType", enum670);
        setField(term343818, term343818.getClass(), "snapshotTrustlineIssuerClassicAddress", "nYbOYHyjHP");
        setField(term343818, term343818.getClass(), "snapshotCurrencyName", "ANCcbJNtSR");
        setField(term343818, term343818.getClass(), "nftIssuingAddress", "EXhULLeGjO");
        setField(term343818, term343818.getClass(), "nftTaxon", term343982);
        setField(term343818, term343818.getClass(), "frequency", enum671);
        setLongField(term343993, term343993.getClass(), "fastTime", 1842605815206L);
        setField(term343993, term343993.getClass(), "cdate", null);
        setField(term343818, term343818.getClass(), "repeatUntilDate", term343993);
        setField(term343818, term343818.getClass(), "email", "ipiLtEOSGh");
        setBooleanField(term343818, term343818.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term343818, args);
    }

};


