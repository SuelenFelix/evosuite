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

public class FsePaymentRequest_setPaymentType_6233479047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394869;
     Object enum754;

    public FsePaymentRequest_setPaymentType_6233479047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term394918 = new ArrayList();
        ((ArrayList) term394918).add("VcnqcssLhW");
        ((ArrayList) term394918).add("tRFfkVPyod");
        ((ArrayList) term394918).add("mcJDrdzGZc");
        Long term395023 = new Long(576269924637193764L);
        Class<? extends Object> term395226 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term395225 = ((Class) term395226).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term395225).setAccessible(true);
        enum754 = ((Field) term395225).get((Object) null);
        Long term395077 = new Long(489460221587679133L);
        Class<? extends Object> term395654 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term395653 = ((Class) term395654).getDeclaredField((String) "MONTHLY");
        ((Field) term395653).setAccessible(true);
        Object enum755 = ((Field) term395653).get((Object) null);
        term394869 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term394970 = newInstance(Class.forName("java.util.Date"));
        Object term395090 = newInstance(Class.forName("java.util.Date"));
        setField(term394869, term394869.getClass(), "memo", "OeKMJtCDog");
        setField(term394869, term394869.getClass(), "fromClassicAddress", "LTceGGZtni");
        setField(term394869, term394869.getClass(), "fromSigningPublicKey", "caYVRSWaEW");
        setField(term394869, term394869.getClass(), "fromPrivateKey", "FcYQsAjyPy");
        setField(term394869, term394869.getClass(), "toClassicAddresses", term394918);
        setField(term394869, term394869.getClass(), "amount", "YcttkdwDXl");
        setLongField(term394970, term394970.getClass(), "fastTime", 1328158184992L);
        setField(term394970, term394970.getClass(), "cdate", null);
        setField(term394869, term394869.getClass(), "startTime", term394970);
        setField(term394869, term394869.getClass(), "destinationTag", "IZyYESyOBY");
        setField(term394869, term394869.getClass(), "trustlineIssuerClassicAddress", "uBOKncKWnU");
        setField(term394869, term394869.getClass(), "currencyName", "qmcOViLjxg");
        setBooleanField(term394869, term394869.getClass(), "agreeFee", false);
        setField(term394869, term394869.getClass(), "maxXrpFeePerTransaction", "SfdVypszRN");
        setBooleanField(term394869, term394869.getClass(), "globalIdVerified", false);
        setBooleanField(term394869, term394869.getClass(), "useBlacklist", false);
        setField(term394869, term394869.getClass(), "retryOfId", term395023);
        setField(term394869, term394869.getClass(), "paymentType", enum754);
        setField(term394869, term394869.getClass(), "snapshotTrustlineIssuerClassicAddress", "qtLTYGkIKy");
        setField(term394869, term394869.getClass(), "snapshotCurrencyName", "okeTzncAkm");
        setField(term394869, term394869.getClass(), "nftIssuingAddress", "uJZdhmQqly");
        setField(term394869, term394869.getClass(), "nftTaxon", term395077);
        setField(term394869, term394869.getClass(), "frequency", enum755);
        setLongField(term395090, term395090.getClass(), "fastTime", 1609895958190L);
        setField(term395090, term395090.getClass(), "cdate", null);
        setField(term394869, term394869.getClass(), "repeatUntilDate", term395090);
        setField(term394869, term394869.getClass(), "email", "SlaEVblljq");
        setBooleanField(term394869, term394869.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Object[] args = new Object[1];
        args[0] = enum754;
        callMethod(klass, "setPaymentType", argTypes, term394869, args);
    }

};


