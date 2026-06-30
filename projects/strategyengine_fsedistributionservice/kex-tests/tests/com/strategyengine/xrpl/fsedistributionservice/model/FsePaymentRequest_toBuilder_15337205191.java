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

public class FsePaymentRequest_toBuilder_15337205191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340331;

    public FsePaymentRequest_toBuilder_15337205191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term340380 = new ArrayList();
        ((ArrayList) term340380).add("sWSwYJRLWw");
        ((ArrayList) term340380).add("hNqPjlwmpW");
        ((ArrayList) term340380).add("LvPdtNhyPi");
        ((ArrayList) term340380).add("LxkkwJYmre");
        ((ArrayList) term340380).add("wpmpEfMgmx");
        Long term340509 = new Long(4618470175243384123L);
        Class<? extends Object> term340722 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term340721 = ((Class) term340722).getDeclaredField((String) "FLAT");
        ((Field) term340721).setAccessible(true);
        Object enum664 = ((Field) term340721).get((Object) null);
        Long term340555 = new Long(1747819662947425876L);
        Class<? extends Object> term341126 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term341125 = ((Class) term341126).getDeclaredField((String) "DAILY");
        ((Field) term341125).setAccessible(true);
        Object enum665 = ((Field) term341125).get((Object) null);
        term340331 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term340456 = newInstance(Class.forName("java.util.Date"));
        Object term340566 = newInstance(Class.forName("java.util.Date"));
        setField(term340331, term340331.getClass(), "memo", "EZqcFiCmkN");
        setField(term340331, term340331.getClass(), "fromClassicAddress", "InPNCZSdaO");
        setField(term340331, term340331.getClass(), "fromSigningPublicKey", "wqoFYDQVFC");
        setField(term340331, term340331.getClass(), "fromPrivateKey", "FVPbcnRWsS");
        setField(term340331, term340331.getClass(), "toClassicAddresses", term340380);
        setField(term340331, term340331.getClass(), "amount", "JNOsqfXWyI");
        setLongField(term340456, term340456.getClass(), "fastTime", 1559974899830L);
        setField(term340456, term340456.getClass(), "cdate", null);
        setField(term340331, term340331.getClass(), "startTime", term340456);
        setField(term340331, term340331.getClass(), "destinationTag", "iTxvNsKnDY");
        setField(term340331, term340331.getClass(), "trustlineIssuerClassicAddress", "MxewnGKZeY");
        setField(term340331, term340331.getClass(), "currencyName", "OGHGtNyNss");
        setBooleanField(term340331, term340331.getClass(), "agreeFee", false);
        setField(term340331, term340331.getClass(), "maxXrpFeePerTransaction", "WuLgcuFENx");
        setBooleanField(term340331, term340331.getClass(), "globalIdVerified", false);
        setBooleanField(term340331, term340331.getClass(), "useBlacklist", true);
        setField(term340331, term340331.getClass(), "retryOfId", term340509);
        setField(term340331, term340331.getClass(), "paymentType", enum664);
        setField(term340331, term340331.getClass(), "snapshotTrustlineIssuerClassicAddress", "EgAGyGbdTa");
        setField(term340331, term340331.getClass(), "snapshotCurrencyName", "kGgCoOSFHh");
        setField(term340331, term340331.getClass(), "nftIssuingAddress", "MiFzlqVhmh");
        setField(term340331, term340331.getClass(), "nftTaxon", term340555);
        setField(term340331, term340331.getClass(), "frequency", enum665);
        setLongField(term340566, term340566.getClass(), "fastTime", 1544984618651L);
        setField(term340566, term340566.getClass(), "cdate", null);
        setField(term340331, term340331.getClass(), "repeatUntilDate", term340566);
        setField(term340331, term340331.getClass(), "email", "dnUqfTzVzI");
        setBooleanField(term340331, term340331.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term340331, args);
    }

};


