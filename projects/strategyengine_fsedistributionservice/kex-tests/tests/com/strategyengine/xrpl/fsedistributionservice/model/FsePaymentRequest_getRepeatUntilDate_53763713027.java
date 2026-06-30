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

public class FsePaymentRequest_getRepeatUntilDate_53763713027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371775;

    public FsePaymentRequest_getRepeatUntilDate_53763713027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term371824 = new ArrayList();
        ((ArrayList) term371824).add("lAkfwyrdJh");
        ((ArrayList) term371824).add("RwVzJMayYn");
        ((ArrayList) term371824).add("QneDLFoKDs");
        ((ArrayList) term371824).add("ZFvSWqDErD");
        ((ArrayList) term371824).add("ZOIsEkkYcg");
        Long term371953 = new Long(-8370506620911901379L);
        Class<? extends Object> term372177 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term372176 = ((Class) term372177).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term372176).setAccessible(true);
        Object enum716 = ((Field) term372176).get((Object) null);
        Long term372007 = new Long(-7185067999629587082L);
        Class<? extends Object> term372605 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term372604 = ((Class) term372605).getDeclaredField((String) "ANNUALLY");
        ((Field) term372604).setAccessible(true);
        Object enum717 = ((Field) term372604).get((Object) null);
        term371775 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term371900 = newInstance(Class.forName("java.util.Date"));
        Object term372021 = newInstance(Class.forName("java.util.Date"));
        setField(term371775, term371775.getClass(), "memo", "ddCKOtvsQp");
        setField(term371775, term371775.getClass(), "fromClassicAddress", "UBkzzMavEW");
        setField(term371775, term371775.getClass(), "fromSigningPublicKey", "jObyDgxBpp");
        setField(term371775, term371775.getClass(), "fromPrivateKey", "MsYMjAnASM");
        setField(term371775, term371775.getClass(), "toClassicAddresses", term371824);
        setField(term371775, term371775.getClass(), "amount", "uVZNGWujSB");
        setLongField(term371900, term371900.getClass(), "fastTime", 1629430114393L);
        setField(term371900, term371900.getClass(), "cdate", null);
        setField(term371775, term371775.getClass(), "startTime", term371900);
        setField(term371775, term371775.getClass(), "destinationTag", "aSeKrqRjrc");
        setField(term371775, term371775.getClass(), "trustlineIssuerClassicAddress", "boIyFGzYdI");
        setField(term371775, term371775.getClass(), "currencyName", "yTrhnMjhqm");
        setBooleanField(term371775, term371775.getClass(), "agreeFee", false);
        setField(term371775, term371775.getClass(), "maxXrpFeePerTransaction", "EMzeudToqI");
        setBooleanField(term371775, term371775.getClass(), "globalIdVerified", true);
        setBooleanField(term371775, term371775.getClass(), "useBlacklist", false);
        setField(term371775, term371775.getClass(), "retryOfId", term371953);
        setField(term371775, term371775.getClass(), "paymentType", enum716);
        setField(term371775, term371775.getClass(), "snapshotTrustlineIssuerClassicAddress", "GSzyRhhzzM");
        setField(term371775, term371775.getClass(), "snapshotCurrencyName", "mSOhoJEHnr");
        setField(term371775, term371775.getClass(), "nftIssuingAddress", "dWXHGHNUNn");
        setField(term371775, term371775.getClass(), "nftTaxon", term372007);
        setField(term371775, term371775.getClass(), "frequency", enum717);
        setLongField(term372021, term372021.getClass(), "fastTime", 1429040909981L);
        setField(term372021, term372021.getClass(), "cdate", null);
        setField(term371775, term371775.getClass(), "repeatUntilDate", term372021);
        setField(term371775, term371775.getClass(), "email", "zXgcLGETIq");
        setBooleanField(term371775, term371775.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRepeatUntilDate", argTypes, term371775, args);
    }

};


