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

public class FsePaymentRequest_setRetryOfId_9243298146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393636;
     Object term393896;

    public FsePaymentRequest_setRetryOfId_9243298146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term393685 = new ArrayList();
        ((ArrayList) term393685).add("SGjcnoPxHY");
        ((ArrayList) term393685).add("qwnbmJbmgl");
        ((ArrayList) term393685).add("TxkYIXyPTN");
        ((ArrayList) term393685).add("rQdFYJTLhu");
        ((ArrayList) term393685).add("WrebDmBdlU");
        Long term393814 = new Long(-8287703806860141511L);
        Class<? extends Object> term394039 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term394038 = ((Class) term394039).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term394038).setAccessible(true);
        Object enum752 = ((Field) term394038).get((Object) null);
        Long term393868 = new Long(4190829300851698907L);
        Class<? extends Object> term394467 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term394466 = ((Class) term394467).getDeclaredField((String) "MONTHLY");
        ((Field) term394466).setAccessible(true);
        Object enum753 = ((Field) term394466).get((Object) null);
        term393636 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term393761 = newInstance(Class.forName("java.util.Date"));
        Object term393881 = newInstance(Class.forName("java.util.Date"));
        setField(term393636, term393636.getClass(), "memo", "RCugJMrPXR");
        setField(term393636, term393636.getClass(), "fromClassicAddress", "TDXHshmgFm");
        setField(term393636, term393636.getClass(), "fromSigningPublicKey", "JDtnEpsyRr");
        setField(term393636, term393636.getClass(), "fromPrivateKey", "GQgehHZwkd");
        setField(term393636, term393636.getClass(), "toClassicAddresses", term393685);
        setField(term393636, term393636.getClass(), "amount", "PixrEkjduz");
        setLongField(term393761, term393761.getClass(), "fastTime", 1784324334646L);
        setField(term393761, term393761.getClass(), "cdate", null);
        setField(term393636, term393636.getClass(), "startTime", term393761);
        setField(term393636, term393636.getClass(), "destinationTag", "lIOzyKLgmt");
        setField(term393636, term393636.getClass(), "trustlineIssuerClassicAddress", "TGXNQpXBIh");
        setField(term393636, term393636.getClass(), "currencyName", "VdKTKyKcnc");
        setBooleanField(term393636, term393636.getClass(), "agreeFee", true);
        setField(term393636, term393636.getClass(), "maxXrpFeePerTransaction", "zshgXTsVbE");
        setBooleanField(term393636, term393636.getClass(), "globalIdVerified", true);
        setBooleanField(term393636, term393636.getClass(), "useBlacklist", false);
        setField(term393636, term393636.getClass(), "retryOfId", term393814);
        setField(term393636, term393636.getClass(), "paymentType", enum752);
        setField(term393636, term393636.getClass(), "snapshotTrustlineIssuerClassicAddress", "JNCTnqZpIg");
        setField(term393636, term393636.getClass(), "snapshotCurrencyName", "VjuvMQEpZX");
        setField(term393636, term393636.getClass(), "nftIssuingAddress", "nAYdUazkEj");
        setField(term393636, term393636.getClass(), "nftTaxon", term393868);
        setField(term393636, term393636.getClass(), "frequency", enum753);
        setLongField(term393881, term393881.getClass(), "fastTime", 1442670839392L);
        setField(term393881, term393881.getClass(), "cdate", null);
        setField(term393636, term393636.getClass(), "repeatUntilDate", term393881);
        setField(term393636, term393636.getClass(), "email", "VyTYMGcrgM");
        setBooleanField(term393636, term393636.getClass(), "autoApprove", false);
        term393896 = new Long(-1013042203229198032L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term393896;
        callMethod(klass, "setRetryOfId", argTypes, term393636, args);
    }

};


