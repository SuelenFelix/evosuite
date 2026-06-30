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

public class FsePaymentRequest_FsePaymentRequestBuilder_destinationTag_10679102808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576134;

    public FsePaymentRequest_FsePaymentRequestBuilder_destinationTag_10679102808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term576183 = new ArrayList();
        ((ArrayList) term576183).add("wUGJdObirh");
        ((ArrayList) term576183).add("fwRConrHOE");
        ((ArrayList) term576183).add("AXuVUkyDUa");
        ((ArrayList) term576183).add("OqUCbfAuLF");
        ((ArrayList) term576183).add("mAgnHWeTVt");
        ((ArrayList) term576183).add("wMlHXDjHnI");
        ((ArrayList) term576183).add("snXrQUgpsn");
        Long term576336 = new Long(-3301041159581643562L);
        Class<? extends Object> term576591 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term576590 = ((Class) term576591).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term576590).setAccessible(true);
        Object enum1086 = ((Field) term576590).get((Object) null);
        Long term576390 = new Long(-1639557341378935663L);
        Class<? extends Object> term577019 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term577018 = ((Class) term577019).getDeclaredField((String) "MONTHLY");
        ((Field) term577018).setAccessible(true);
        Object enum1087 = ((Field) term577018).get((Object) null);
        term576134 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term576283 = newInstance(Class.forName("java.util.Date"));
        Object term576403 = newInstance(Class.forName("java.util.Date"));
        setField(term576134, term576134.getClass(), "memo", "oiGazRusBr");
        setField(term576134, term576134.getClass(), "fromClassicAddress", "OPiUmYGtvL");
        setField(term576134, term576134.getClass(), "fromSigningPublicKey", "PYXQFMpHgr");
        setField(term576134, term576134.getClass(), "fromPrivateKey", "PxRBsVnNDB");
        setField(term576134, term576134.getClass(), "toClassicAddresses", term576183);
        setField(term576134, term576134.getClass(), "amount", "WUqpvkVxcO");
        setLongField(term576283, term576283.getClass(), "fastTime", 1320371595788L);
        setField(term576283, term576283.getClass(), "cdate", null);
        setField(term576134, term576134.getClass(), "startTime", term576283);
        setField(term576134, term576134.getClass(), "destinationTag", "Exlzbmdcxa");
        setField(term576134, term576134.getClass(), "trustlineIssuerClassicAddress", "YUNVygcAmQ");
        setField(term576134, term576134.getClass(), "currencyName", "kNTcrneNir");
        setBooleanField(term576134, term576134.getClass(), "agreeFee", true);
        setField(term576134, term576134.getClass(), "maxXrpFeePerTransaction", "RiNlMPpFPw");
        setBooleanField(term576134, term576134.getClass(), "globalIdVerified", true);
        setBooleanField(term576134, term576134.getClass(), "useBlacklist", false);
        setField(term576134, term576134.getClass(), "retryOfId", term576336);
        setField(term576134, term576134.getClass(), "paymentType", enum1086);
        setField(term576134, term576134.getClass(), "snapshotTrustlineIssuerClassicAddress", "mJUknTnMoF");
        setField(term576134, term576134.getClass(), "snapshotCurrencyName", "EriFQVVsYo");
        setField(term576134, term576134.getClass(), "nftIssuingAddress", "PDCfhQKGsz");
        setField(term576134, term576134.getClass(), "nftTaxon", term576390);
        setField(term576134, term576134.getClass(), "frequency", enum1087);
        setLongField(term576403, term576403.getClass(), "fastTime", 1470340163345L);
        setField(term576403, term576403.getClass(), "cdate", null);
        setField(term576134, term576134.getClass(), "repeatUntilDate", term576403);
        setField(term576134, term576134.getClass(), "email", "LLOgknEuqU");
        setBooleanField(term576134, term576134.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YPuXXabbQT";
        callMethod(klass, "destinationTag", argTypes, term576134, args);
    }

};


