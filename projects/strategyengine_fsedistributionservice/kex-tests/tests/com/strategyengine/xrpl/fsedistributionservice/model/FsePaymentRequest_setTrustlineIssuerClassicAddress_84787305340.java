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

public class FsePaymentRequest_setTrustlineIssuerClassicAddress_84787305340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386572;

    public FsePaymentRequest_setTrustlineIssuerClassicAddress_84787305340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term386621 = new ArrayList();
        ((ArrayList) term386621).add("vTMJdYrXUJ");
        ((ArrayList) term386621).add("vVbSRADXpc");
        ((ArrayList) term386621).add("WpmNATXFgJ");
        ((ArrayList) term386621).add("iVyIjcuuMq");
        ((ArrayList) term386621).add("chRvdrzGHA");
        ((ArrayList) term386621).add("fFKbgbAoRN");
        Long term386762 = new Long(-2171686672543976361L);
        Class<? extends Object> term386998 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term386997 = ((Class) term386998).getDeclaredField((String) "FLAT");
        ((Field) term386997).setAccessible(true);
        Object enum740 = ((Field) term386997).get((Object) null);
        Long term386808 = new Long(1122196220816602891L);
        Class<? extends Object> term387402 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term387401 = ((Class) term387402).getDeclaredField((String) "WEEKLY");
        ((Field) term387401).setAccessible(true);
        Object enum741 = ((Field) term387401).get((Object) null);
        term386572 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term386709 = newInstance(Class.forName("java.util.Date"));
        Object term386820 = newInstance(Class.forName("java.util.Date"));
        setField(term386572, term386572.getClass(), "memo", "KmeTSoiLRD");
        setField(term386572, term386572.getClass(), "fromClassicAddress", "MSIEshhzHU");
        setField(term386572, term386572.getClass(), "fromSigningPublicKey", "ZccndtPqcy");
        setField(term386572, term386572.getClass(), "fromPrivateKey", "cRznRdugDW");
        setField(term386572, term386572.getClass(), "toClassicAddresses", term386621);
        setField(term386572, term386572.getClass(), "amount", "bvOUtmPAVd");
        setLongField(term386709, term386709.getClass(), "fastTime", 1701563051207L);
        setField(term386709, term386709.getClass(), "cdate", null);
        setField(term386572, term386572.getClass(), "startTime", term386709);
        setField(term386572, term386572.getClass(), "destinationTag", "stNPwaLCkm");
        setField(term386572, term386572.getClass(), "trustlineIssuerClassicAddress", "qoqYRoXwDw");
        setField(term386572, term386572.getClass(), "currencyName", "nxIphOkSDI");
        setBooleanField(term386572, term386572.getClass(), "agreeFee", true);
        setField(term386572, term386572.getClass(), "maxXrpFeePerTransaction", "GCQxTTEWts");
        setBooleanField(term386572, term386572.getClass(), "globalIdVerified", false);
        setBooleanField(term386572, term386572.getClass(), "useBlacklist", true);
        setField(term386572, term386572.getClass(), "retryOfId", term386762);
        setField(term386572, term386572.getClass(), "paymentType", enum740);
        setField(term386572, term386572.getClass(), "snapshotTrustlineIssuerClassicAddress", "xUiroWeOcE");
        setField(term386572, term386572.getClass(), "snapshotCurrencyName", "aBXTrvOsDW");
        setField(term386572, term386572.getClass(), "nftIssuingAddress", "EUToKuexOA");
        setField(term386572, term386572.getClass(), "nftTaxon", term386808);
        setField(term386572, term386572.getClass(), "frequency", enum741);
        setLongField(term386820, term386820.getClass(), "fastTime", 1679080645197L);
        setField(term386820, term386820.getClass(), "cdate", null);
        setField(term386572, term386572.getClass(), "repeatUntilDate", term386820);
        setField(term386572, term386572.getClass(), "email", "mYuAJWhFzG");
        setBooleanField(term386572, term386572.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BXvuwhgbIH";
        callMethod(klass, "setTrustlineIssuerClassicAddress", argTypes, term386572, args);
    }

};


