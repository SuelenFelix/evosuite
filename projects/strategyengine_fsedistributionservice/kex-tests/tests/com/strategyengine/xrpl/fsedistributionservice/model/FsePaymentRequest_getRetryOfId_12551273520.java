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

public class FsePaymentRequest_getRetryOfId_12551273520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363130;

    public FsePaymentRequest_getRetryOfId_12551273520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term363179 = new ArrayList();
        ((ArrayList) term363179).add("ZJDDVrpWKQ");
        ((ArrayList) term363179).add("OujZcbIAvX");
        ((ArrayList) term363179).add("putgxqKzNb");
        ((ArrayList) term363179).add("eYvQfPfILC");
        ((ArrayList) term363179).add("xpTFhKPifw");
        ((ArrayList) term363179).add("rTWxqzcgFU");
        ((ArrayList) term363179).add("sCeWhCgsvx");
        ((ArrayList) term363179).add("nVVpGoWnZd");
        ((ArrayList) term363179).add("EEEzvJXKOf");
        Long term363356 = new Long(-4912367223635767530L);
        Class<? extends Object> term363619 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term363618 = ((Class) term363619).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term363618).setAccessible(true);
        Object enum702 = ((Field) term363618).get((Object) null);
        Long term363410 = new Long(5307759455220911721L);
        Class<? extends Object> term364047 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term364046 = ((Class) term364047).getDeclaredField((String) "MONTHLY");
        ((Field) term364046).setAccessible(true);
        Object enum703 = ((Field) term364046).get((Object) null);
        term363130 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term363303 = newInstance(Class.forName("java.util.Date"));
        Object term363423 = newInstance(Class.forName("java.util.Date"));
        setField(term363130, term363130.getClass(), "memo", "fkEwbIayDt");
        setField(term363130, term363130.getClass(), "fromClassicAddress", "vltEBcsvel");
        setField(term363130, term363130.getClass(), "fromSigningPublicKey", "hoJeCkpqsd");
        setField(term363130, term363130.getClass(), "fromPrivateKey", "gRpupkcTcW");
        setField(term363130, term363130.getClass(), "toClassicAddresses", term363179);
        setField(term363130, term363130.getClass(), "amount", "ruYuUKeyoL");
        setLongField(term363303, term363303.getClass(), "fastTime", 1737400295143L);
        setField(term363303, term363303.getClass(), "cdate", null);
        setField(term363130, term363130.getClass(), "startTime", term363303);
        setField(term363130, term363130.getClass(), "destinationTag", "qZySZAtlWw");
        setField(term363130, term363130.getClass(), "trustlineIssuerClassicAddress", "XDftcuEVIB");
        setField(term363130, term363130.getClass(), "currencyName", "icQsCgiPfd");
        setBooleanField(term363130, term363130.getClass(), "agreeFee", false);
        setField(term363130, term363130.getClass(), "maxXrpFeePerTransaction", "PVyTkZKjNq");
        setBooleanField(term363130, term363130.getClass(), "globalIdVerified", false);
        setBooleanField(term363130, term363130.getClass(), "useBlacklist", false);
        setField(term363130, term363130.getClass(), "retryOfId", term363356);
        setField(term363130, term363130.getClass(), "paymentType", enum702);
        setField(term363130, term363130.getClass(), "snapshotTrustlineIssuerClassicAddress", "RNUULrdSpr");
        setField(term363130, term363130.getClass(), "snapshotCurrencyName", "OBtSUjwRLK");
        setField(term363130, term363130.getClass(), "nftIssuingAddress", "QbLHBJXaMu");
        setField(term363130, term363130.getClass(), "nftTaxon", term363410);
        setField(term363130, term363130.getClass(), "frequency", enum703);
        setLongField(term363423, term363423.getClass(), "fastTime", 1504042626647L);
        setField(term363423, term363423.getClass(), "cdate", null);
        setField(term363130, term363130.getClass(), "repeatUntilDate", term363423);
        setField(term363130, term363130.getClass(), "email", "OYMmpMJVgl");
        setBooleanField(term363130, term363130.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRetryOfId", argTypes, term363130, args);
    }

};


