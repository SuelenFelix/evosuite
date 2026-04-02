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

public class FsePaymentRequest_getStartTime_92208423612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353228;

    public FsePaymentRequest_getStartTime_92208423612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term353277 = new ArrayList();
        ((ArrayList) term353277).add("jxYdHQIzGX");
        ((ArrayList) term353277).add("HssYapPrku");
        ((ArrayList) term353277).add("uCJgNuTyXJ");
        ((ArrayList) term353277).add("lvNIpJwxZN");
        ((ArrayList) term353277).add("PBhLfTBDYV");
        ((ArrayList) term353277).add("XytZhvbNhJ");
        ((ArrayList) term353277).add("uXNiWLqeqi");
        ((ArrayList) term353277).add("QdTVFoDIfL");
        Long term353442 = new Long(-3646702249834556847L);
        Class<? extends Object> term353695 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term353694 = ((Class) term353695).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term353694).setAccessible(true);
        Object enum686 = ((Field) term353694).get((Object) null);
        Long term353496 = new Long(2701558556303760915L);
        Class<? extends Object> term354123 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term354122 = ((Class) term354123).getDeclaredField((String) "MONTHLY");
        ((Field) term354122).setAccessible(true);
        Object enum687 = ((Field) term354122).get((Object) null);
        term353228 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term353389 = newInstance(Class.forName("java.util.Date"));
        Object term353509 = newInstance(Class.forName("java.util.Date"));
        setField(term353228, term353228.getClass(), "memo", "UmMnaPSYjS");
        setField(term353228, term353228.getClass(), "fromClassicAddress", "rmLHKlxVqw");
        setField(term353228, term353228.getClass(), "fromSigningPublicKey", "yZfyPXcJOi");
        setField(term353228, term353228.getClass(), "fromPrivateKey", "uJETMGzmLt");
        setField(term353228, term353228.getClass(), "toClassicAddresses", term353277);
        setField(term353228, term353228.getClass(), "amount", "ZpcJeaRhme");
        setLongField(term353389, term353389.getClass(), "fastTime", 1387558856564L);
        setField(term353389, term353389.getClass(), "cdate", null);
        setField(term353228, term353228.getClass(), "startTime", term353389);
        setField(term353228, term353228.getClass(), "destinationTag", "zphIWxYZHs");
        setField(term353228, term353228.getClass(), "trustlineIssuerClassicAddress", "bsWvGNdrlb");
        setField(term353228, term353228.getClass(), "currencyName", "NSZXXjtJqP");
        setBooleanField(term353228, term353228.getClass(), "agreeFee", true);
        setField(term353228, term353228.getClass(), "maxXrpFeePerTransaction", "NePUHNBAQj");
        setBooleanField(term353228, term353228.getClass(), "globalIdVerified", false);
        setBooleanField(term353228, term353228.getClass(), "useBlacklist", false);
        setField(term353228, term353228.getClass(), "retryOfId", term353442);
        setField(term353228, term353228.getClass(), "paymentType", enum686);
        setField(term353228, term353228.getClass(), "snapshotTrustlineIssuerClassicAddress", "RTdavSXhbU");
        setField(term353228, term353228.getClass(), "snapshotCurrencyName", "lWOzGDoEPL");
        setField(term353228, term353228.getClass(), "nftIssuingAddress", "XBigbAoUWc");
        setField(term353228, term353228.getClass(), "nftTaxon", term353496);
        setField(term353228, term353228.getClass(), "frequency", enum687);
        setLongField(term353509, term353509.getClass(), "fastTime", 1612520677766L);
        setField(term353509, term353509.getClass(), "cdate", null);
        setField(term353228, term353228.getClass(), "repeatUntilDate", term353509);
        setField(term353228, term353228.getClass(), "email", "upfjMgOnUP");
        setBooleanField(term353228, term353228.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartTime", argTypes, term353228, args);
    }

};


