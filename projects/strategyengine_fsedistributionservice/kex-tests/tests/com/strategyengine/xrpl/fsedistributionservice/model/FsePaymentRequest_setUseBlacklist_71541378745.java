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

public class FsePaymentRequest_setUseBlacklist_71541378745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392553;
     Object term392743;

    public FsePaymentRequest_setUseBlacklist_71541378745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term392602 = new ArrayList();
        Long term392671 = new Long(-8743015685701431890L);
        Class<? extends Object> term392836 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term392835 = ((Class) term392836).getDeclaredField((String) "FLAT");
        ((Field) term392835).setAccessible(true);
        Object enum750 = ((Field) term392835).get((Object) null);
        Long term392717 = new Long(3627398214180261490L);
        Class<? extends Object> term393240 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term393239 = ((Class) term393240).getDeclaredField((String) "DAILY");
        ((Field) term393239).setAccessible(true);
        Object enum751 = ((Field) term393239).get((Object) null);
        term392553 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term392618 = newInstance(Class.forName("java.util.Date"));
        Object term392728 = newInstance(Class.forName("java.util.Date"));
        setField(term392553, term392553.getClass(), "memo", "lEpAXknwdP");
        setField(term392553, term392553.getClass(), "fromClassicAddress", "gCtjoRBQvq");
        setField(term392553, term392553.getClass(), "fromSigningPublicKey", "DELOfnFjxZ");
        setField(term392553, term392553.getClass(), "fromPrivateKey", "ZnpJnglqki");
        setField(term392553, term392553.getClass(), "toClassicAddresses", term392602);
        setField(term392553, term392553.getClass(), "amount", "fKqDEStgcU");
        setLongField(term392618, term392618.getClass(), "fastTime", 1665688164494L);
        setField(term392618, term392618.getClass(), "cdate", null);
        setField(term392553, term392553.getClass(), "startTime", term392618);
        setField(term392553, term392553.getClass(), "destinationTag", "ciTsscpufN");
        setField(term392553, term392553.getClass(), "trustlineIssuerClassicAddress", "kGYGMmKJEx");
        setField(term392553, term392553.getClass(), "currencyName", "YFKtymjreZ");
        setBooleanField(term392553, term392553.getClass(), "agreeFee", false);
        setField(term392553, term392553.getClass(), "maxXrpFeePerTransaction", "vnWFBfVdIg");
        setBooleanField(term392553, term392553.getClass(), "globalIdVerified", true);
        setBooleanField(term392553, term392553.getClass(), "useBlacklist", false);
        setField(term392553, term392553.getClass(), "retryOfId", term392671);
        setField(term392553, term392553.getClass(), "paymentType", enum750);
        setField(term392553, term392553.getClass(), "snapshotTrustlineIssuerClassicAddress", "AiFTACwPhj");
        setField(term392553, term392553.getClass(), "snapshotCurrencyName", "OArCBGiKUA");
        setField(term392553, term392553.getClass(), "nftIssuingAddress", "TtyfHrKviO");
        setField(term392553, term392553.getClass(), "nftTaxon", term392717);
        setField(term392553, term392553.getClass(), "frequency", enum751);
        setLongField(term392728, term392728.getClass(), "fastTime", 1870029600338L);
        setField(term392728, term392728.getClass(), "cdate", null);
        setField(term392553, term392553.getClass(), "repeatUntilDate", term392728);
        setField(term392553, term392553.getClass(), "email", "EUVfrPCqms");
        setBooleanField(term392553, term392553.getClass(), "autoApprove", true);
        term392743 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term392743;
        callMethod(klass, "setUseBlacklist", argTypes, term392553, args);
    }

};


