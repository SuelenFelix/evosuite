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

public class FsePaymentRequest_setRepeatUntilDate_75040812453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402505;
     Object term402695;

    public FsePaymentRequest_setRepeatUntilDate_75040812453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term402554 = new ArrayList();
        Long term402623 = new Long(8461184996981583369L);
        Class<? extends Object> term402788 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term402787 = ((Class) term402788).getDeclaredField((String) "FLAT");
        ((Field) term402787).setAccessible(true);
        Object enum767 = ((Field) term402787).get((Object) null);
        Long term402669 = new Long(8327650518139070689L);
        Class<? extends Object> term403192 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term403191 = ((Class) term403192).getDeclaredField((String) "DAILY");
        ((Field) term403191).setAccessible(true);
        Object enum768 = ((Field) term403191).get((Object) null);
        term402505 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term402570 = newInstance(Class.forName("java.util.Date"));
        Object term402680 = newInstance(Class.forName("java.util.Date"));
        setField(term402505, term402505.getClass(), "memo", "sHLnLqlFRd");
        setField(term402505, term402505.getClass(), "fromClassicAddress", "LewMqyEYKK");
        setField(term402505, term402505.getClass(), "fromSigningPublicKey", "XgJlOSXfAc");
        setField(term402505, term402505.getClass(), "fromPrivateKey", "DkeuJbjEvF");
        setField(term402505, term402505.getClass(), "toClassicAddresses", term402554);
        setField(term402505, term402505.getClass(), "amount", "jBvdIocvss");
        setLongField(term402570, term402570.getClass(), "fastTime", 1829655896794L);
        setField(term402570, term402570.getClass(), "cdate", null);
        setField(term402505, term402505.getClass(), "startTime", term402570);
        setField(term402505, term402505.getClass(), "destinationTag", "hpCfQefAiV");
        setField(term402505, term402505.getClass(), "trustlineIssuerClassicAddress", "BNsTwwSVdm");
        setField(term402505, term402505.getClass(), "currencyName", "AwwvvQGxpM");
        setBooleanField(term402505, term402505.getClass(), "agreeFee", true);
        setField(term402505, term402505.getClass(), "maxXrpFeePerTransaction", "ROJQMhSlSp");
        setBooleanField(term402505, term402505.getClass(), "globalIdVerified", false);
        setBooleanField(term402505, term402505.getClass(), "useBlacklist", false);
        setField(term402505, term402505.getClass(), "retryOfId", term402623);
        setField(term402505, term402505.getClass(), "paymentType", enum767);
        setField(term402505, term402505.getClass(), "snapshotTrustlineIssuerClassicAddress", "kCavCQhLaT");
        setField(term402505, term402505.getClass(), "snapshotCurrencyName", "VByICFrnXL");
        setField(term402505, term402505.getClass(), "nftIssuingAddress", "tynLvlOaxC");
        setField(term402505, term402505.getClass(), "nftTaxon", term402669);
        setField(term402505, term402505.getClass(), "frequency", enum768);
        setLongField(term402680, term402680.getClass(), "fastTime", 1342913027617L);
        setField(term402680, term402680.getClass(), "cdate", null);
        setField(term402505, term402505.getClass(), "repeatUntilDate", term402680);
        setField(term402505, term402505.getClass(), "email", "kWIhwDlMNe");
        setBooleanField(term402505, term402505.getClass(), "autoApprove", true);
        term402695 = newInstance(Class.forName("java.util.Date"));
        setLongField(term402695, term402695.getClass(), "fastTime", 1515279941157L);
        setField(term402695, term402695.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term402695;
        callMethod(klass, "setRepeatUntilDate", argTypes, term402505, args);
    }

};


