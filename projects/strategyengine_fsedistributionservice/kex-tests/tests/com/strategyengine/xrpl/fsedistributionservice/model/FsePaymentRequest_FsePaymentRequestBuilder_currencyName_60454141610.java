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

public class FsePaymentRequest_FsePaymentRequestBuilder_currencyName_60454141610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578666;

    public FsePaymentRequest_FsePaymentRequestBuilder_currencyName_60454141610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term578715 = new ArrayList();
        ((ArrayList) term578715).add("iwCfNJPqoQ");
        ((ArrayList) term578715).add("dFLZhdWnQQ");
        ((ArrayList) term578715).add("iviSqxxKri");
        ((ArrayList) term578715).add("DqctNOpAAG");
        Long term578832 = new Long(-1639226758680988280L);
        Class<? extends Object> term579058 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term579057 = ((Class) term579058).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term579057).setAccessible(true);
        Object enum1090 = ((Field) term579057).get((Object) null);
        Long term578886 = new Long(7775145417632389147L);
        Class<? extends Object> term579486 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term579485 = ((Class) term579486).getDeclaredField((String) "ANNUALLY");
        ((Field) term579485).setAccessible(true);
        Object enum1091 = ((Field) term579485).get((Object) null);
        term578666 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term578779 = newInstance(Class.forName("java.util.Date"));
        Object term578900 = newInstance(Class.forName("java.util.Date"));
        setField(term578666, term578666.getClass(), "memo", "eBoBopUIXv");
        setField(term578666, term578666.getClass(), "fromClassicAddress", "oQrHpsHWfU");
        setField(term578666, term578666.getClass(), "fromSigningPublicKey", "cRIqcVypqV");
        setField(term578666, term578666.getClass(), "fromPrivateKey", "HkjSosreWD");
        setField(term578666, term578666.getClass(), "toClassicAddresses", term578715);
        setField(term578666, term578666.getClass(), "amount", "DueBxOSGin");
        setLongField(term578779, term578779.getClass(), "fastTime", 1695138389542L);
        setField(term578779, term578779.getClass(), "cdate", null);
        setField(term578666, term578666.getClass(), "startTime", term578779);
        setField(term578666, term578666.getClass(), "destinationTag", "yxnzHzIPTj");
        setField(term578666, term578666.getClass(), "trustlineIssuerClassicAddress", "zcGiKFmqHK");
        setField(term578666, term578666.getClass(), "currencyName", "OmdQpmJnZl");
        setBooleanField(term578666, term578666.getClass(), "agreeFee", false);
        setField(term578666, term578666.getClass(), "maxXrpFeePerTransaction", "fETlboOXMD");
        setBooleanField(term578666, term578666.getClass(), "globalIdVerified", true);
        setBooleanField(term578666, term578666.getClass(), "useBlacklist", false);
        setField(term578666, term578666.getClass(), "retryOfId", term578832);
        setField(term578666, term578666.getClass(), "paymentType", enum1090);
        setField(term578666, term578666.getClass(), "snapshotTrustlineIssuerClassicAddress", "VUNSRpHsgz");
        setField(term578666, term578666.getClass(), "snapshotCurrencyName", "THoPgbPYUF");
        setField(term578666, term578666.getClass(), "nftIssuingAddress", "FLJqMgPbQm");
        setField(term578666, term578666.getClass(), "nftTaxon", term578886);
        setField(term578666, term578666.getClass(), "frequency", enum1091);
        setLongField(term578900, term578900.getClass(), "fastTime", 1412047445068L);
        setField(term578900, term578900.getClass(), "cdate", null);
        setField(term578666, term578666.getClass(), "repeatUntilDate", term578900);
        setField(term578666, term578666.getClass(), "email", "npMxjCfNPy");
        setBooleanField(term578666, term578666.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "skQRylzRMg";
        callMethod(klass, "currencyName", argTypes, term578666, args);
    }

};


