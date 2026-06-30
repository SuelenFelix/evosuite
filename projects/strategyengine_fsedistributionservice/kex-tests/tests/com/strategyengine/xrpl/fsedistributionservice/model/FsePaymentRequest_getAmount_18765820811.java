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

public class FsePaymentRequest_getAmount_18765820811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352055;

    public FsePaymentRequest_getAmount_18765820811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term352104 = new ArrayList();
        ((ArrayList) term352104).add("JwZLjiquUU");
        ((ArrayList) term352104).add("JAwwxWQgmr");
        ((ArrayList) term352104).add("lAdAYXKfnL");
        ((ArrayList) term352104).add("lTNqOlLdpl");
        Long term352221 = new Long(-6198150397627694231L);
        Class<? extends Object> term352425 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term352424 = ((Class) term352425).getDeclaredField((String) "FLAT");
        ((Field) term352424).setAccessible(true);
        Object enum684 = ((Field) term352424).get((Object) null);
        Long term352267 = new Long(7725924092701084764L);
        Class<? extends Object> term352829 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term352828 = ((Class) term352829).getDeclaredField((String) "WEEKLY");
        ((Field) term352828).setAccessible(true);
        Object enum685 = ((Field) term352828).get((Object) null);
        term352055 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term352168 = newInstance(Class.forName("java.util.Date"));
        Object term352279 = newInstance(Class.forName("java.util.Date"));
        setField(term352055, term352055.getClass(), "memo", "fMURyzrrea");
        setField(term352055, term352055.getClass(), "fromClassicAddress", "ygrjPzcZKQ");
        setField(term352055, term352055.getClass(), "fromSigningPublicKey", "grvnzDWRmO");
        setField(term352055, term352055.getClass(), "fromPrivateKey", "eYEANXeClm");
        setField(term352055, term352055.getClass(), "toClassicAddresses", term352104);
        setField(term352055, term352055.getClass(), "amount", "SPhkdbcCTv");
        setLongField(term352168, term352168.getClass(), "fastTime", 1693299280437L);
        setField(term352168, term352168.getClass(), "cdate", null);
        setField(term352055, term352055.getClass(), "startTime", term352168);
        setField(term352055, term352055.getClass(), "destinationTag", "MdyRBldsUU");
        setField(term352055, term352055.getClass(), "trustlineIssuerClassicAddress", "bMomxgTVVZ");
        setField(term352055, term352055.getClass(), "currencyName", "QqyLAXdHvC");
        setBooleanField(term352055, term352055.getClass(), "agreeFee", true);
        setField(term352055, term352055.getClass(), "maxXrpFeePerTransaction", "VwJUzMDEZT");
        setBooleanField(term352055, term352055.getClass(), "globalIdVerified", true);
        setBooleanField(term352055, term352055.getClass(), "useBlacklist", false);
        setField(term352055, term352055.getClass(), "retryOfId", term352221);
        setField(term352055, term352055.getClass(), "paymentType", enum684);
        setField(term352055, term352055.getClass(), "snapshotTrustlineIssuerClassicAddress", "xvJUVvysto");
        setField(term352055, term352055.getClass(), "snapshotCurrencyName", "PEpzfnEzeY");
        setField(term352055, term352055.getClass(), "nftIssuingAddress", "ziaCNpyRqc");
        setField(term352055, term352055.getClass(), "nftTaxon", term352267);
        setField(term352055, term352055.getClass(), "frequency", enum685);
        setLongField(term352279, term352279.getClass(), "fastTime", 1462740219622L);
        setField(term352279, term352279.getClass(), "cdate", null);
        setField(term352055, term352055.getClass(), "repeatUntilDate", term352279);
        setField(term352055, term352055.getClass(), "email", "cCSUBnMjUV");
        setBooleanField(term352055, term352055.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAmount", argTypes, term352055, args);
    }

};


