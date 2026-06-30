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
import java.util.LinkedList;

public class FsePaymentRequest_FsePaymentRequestBuilder_toClassicAddresses_6534965625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572582;
     Object term572782;

    public FsePaymentRequest_FsePaymentRequestBuilder_toClassicAddresses_6534965625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term572631 = new ArrayList();
        Long term572700 = new Long(-3355803345734534021L);
        Class<? extends Object> term572876 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term572875 = ((Class) term572876).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term572875).setAccessible(true);
        Object enum1080 = ((Field) term572875).get((Object) null);
        Long term572754 = new Long(5579342693904906403L);
        Class<? extends Object> term573304 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term573303 = ((Class) term573304).getDeclaredField((String) "MONTHLY");
        ((Field) term573303).setAccessible(true);
        Object enum1081 = ((Field) term573303).get((Object) null);
        term572582 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term572647 = newInstance(Class.forName("java.util.Date"));
        Object term572767 = newInstance(Class.forName("java.util.Date"));
        setField(term572582, term572582.getClass(), "memo", "yZrxnnzSIY");
        setField(term572582, term572582.getClass(), "fromClassicAddress", "EIuiJILbFJ");
        setField(term572582, term572582.getClass(), "fromSigningPublicKey", "gmnZmbmANj");
        setField(term572582, term572582.getClass(), "fromPrivateKey", "ugFTLYkUZt");
        setField(term572582, term572582.getClass(), "toClassicAddresses", term572631);
        setField(term572582, term572582.getClass(), "amount", "WHRCJzYcUs");
        setLongField(term572647, term572647.getClass(), "fastTime", 1857225848202L);
        setField(term572647, term572647.getClass(), "cdate", null);
        setField(term572582, term572582.getClass(), "startTime", term572647);
        setField(term572582, term572582.getClass(), "destinationTag", "eSqgLQrNqK");
        setField(term572582, term572582.getClass(), "trustlineIssuerClassicAddress", "wOeEJTeZMX");
        setField(term572582, term572582.getClass(), "currencyName", "AcApCVcwZJ");
        setBooleanField(term572582, term572582.getClass(), "agreeFee", true);
        setField(term572582, term572582.getClass(), "maxXrpFeePerTransaction", "GAfAdudsTc");
        setBooleanField(term572582, term572582.getClass(), "globalIdVerified", true);
        setBooleanField(term572582, term572582.getClass(), "useBlacklist", true);
        setField(term572582, term572582.getClass(), "retryOfId", term572700);
        setField(term572582, term572582.getClass(), "paymentType", enum1080);
        setField(term572582, term572582.getClass(), "snapshotTrustlineIssuerClassicAddress", "vTQRVHEEmB");
        setField(term572582, term572582.getClass(), "snapshotCurrencyName", "vJrTjupsCk");
        setField(term572582, term572582.getClass(), "nftIssuingAddress", "guXghgolSm");
        setField(term572582, term572582.getClass(), "nftTaxon", term572754);
        setField(term572582, term572582.getClass(), "frequency", enum1081);
        setLongField(term572767, term572767.getClass(), "fastTime", 1410523566669L);
        setField(term572767, term572767.getClass(), "cdate", null);
        setField(term572582, term572582.getClass(), "repeatUntilDate", term572767);
        setField(term572582, term572582.getClass(), "email", "SMGxdSkULI");
        setBooleanField(term572582, term572582.getClass(), "autoApprove", true);
        term572782 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term572782;
        callMethod(klass, "toClassicAddresses", argTypes, term572582, args);
    }

};


