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
import java.lang.Boolean;

public class FsePaymentRequest_setGlobalIdVerified_70698746744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391404;
     Object term391617;

    public FsePaymentRequest_setGlobalIdVerified_70698746744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term391453 = new ArrayList();
        ((ArrayList) term391453).add("pobSTDlmPu");
        Long term391534 = new Long(-671374290989371865L);
        Class<? extends Object> term391720 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term391719 = ((Class) term391720).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term391719).setAccessible(true);
        Object enum748 = ((Field) term391719).get((Object) null);
        Long term391588 = new Long(-344973543098043088L);
        Class<? extends Object> term392148 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term392147 = ((Class) term392148).getDeclaredField((String) "ANNUALLY");
        ((Field) term392147).setAccessible(true);
        Object enum749 = ((Field) term392147).get((Object) null);
        term391404 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term391481 = newInstance(Class.forName("java.util.Date"));
        Object term391602 = newInstance(Class.forName("java.util.Date"));
        setField(term391404, term391404.getClass(), "memo", "oVIuDTSJcv");
        setField(term391404, term391404.getClass(), "fromClassicAddress", "ReCwraTBQl");
        setField(term391404, term391404.getClass(), "fromSigningPublicKey", "CDYTunEQdj");
        setField(term391404, term391404.getClass(), "fromPrivateKey", "PQcGVyAIda");
        setField(term391404, term391404.getClass(), "toClassicAddresses", term391453);
        setField(term391404, term391404.getClass(), "amount", "WRULWkXFGh");
        setLongField(term391481, term391481.getClass(), "fastTime", 1625224075532L);
        setField(term391481, term391481.getClass(), "cdate", null);
        setField(term391404, term391404.getClass(), "startTime", term391481);
        setField(term391404, term391404.getClass(), "destinationTag", "IwTUeBbyTY");
        setField(term391404, term391404.getClass(), "trustlineIssuerClassicAddress", "CXCVrIiZYr");
        setField(term391404, term391404.getClass(), "currencyName", "wwoCovcSVQ");
        setBooleanField(term391404, term391404.getClass(), "agreeFee", true);
        setField(term391404, term391404.getClass(), "maxXrpFeePerTransaction", "dcLAJDPSlV");
        setBooleanField(term391404, term391404.getClass(), "globalIdVerified", false);
        setBooleanField(term391404, term391404.getClass(), "useBlacklist", true);
        setField(term391404, term391404.getClass(), "retryOfId", term391534);
        setField(term391404, term391404.getClass(), "paymentType", enum748);
        setField(term391404, term391404.getClass(), "snapshotTrustlineIssuerClassicAddress", "quGlCgteaW");
        setField(term391404, term391404.getClass(), "snapshotCurrencyName", "aJxuYQLBUn");
        setField(term391404, term391404.getClass(), "nftIssuingAddress", "kJPJWltdOi");
        setField(term391404, term391404.getClass(), "nftTaxon", term391588);
        setField(term391404, term391404.getClass(), "frequency", enum749);
        setLongField(term391602, term391602.getClass(), "fastTime", 1724307613032L);
        setField(term391602, term391602.getClass(), "cdate", null);
        setField(term391404, term391404.getClass(), "repeatUntilDate", term391602);
        setField(term391404, term391404.getClass(), "email", "cAaDaqijoU");
        setBooleanField(term391404, term391404.getClass(), "autoApprove", false);
        term391617 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term391617;
        callMethod(klass, "setGlobalIdVerified", argTypes, term391404, args);
    }

};


