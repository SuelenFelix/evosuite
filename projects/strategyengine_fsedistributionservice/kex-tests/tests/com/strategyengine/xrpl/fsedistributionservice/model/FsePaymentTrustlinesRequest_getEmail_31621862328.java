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
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FsePaymentTrustlinesRequest_getEmail_31621862328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47759;

    public FsePaymentTrustlinesRequest_getEmail_31621862328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term47848 = new Integer(579005622);
        Double term47850 = new Double(0.03699061125289671);
        Double term47852 = new Double(0.6047137830113202);
        Long term47866 = new Long(463622836963501975L);
        Class<? extends Object> term48018 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term48017 = ((Class) term48018).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term48017).setAccessible(true);
        Object enum85 = ((Field) term48017).get((Object) null);
        Class<? extends Object> term48436 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term48435 = ((Class) term48436).getDeclaredField((String) "ANNUALLY");
        ((Field) term48435).setAccessible(true);
        Object enum86 = ((Field) term48435).get((Object) null);
        term47759 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term47908 = newInstance(Class.forName("java.util.Date"));
        Object term47922 = newInstance(Class.forName("java.util.Date"));
        setField(term47759, term47759.getClass(), "memo", "njvnWFTMxN");
        setField(term47759, term47759.getClass(), "fromClassicAddress", "fLRqcTSfzF");
        setField(term47759, term47759.getClass(), "fromSigningPublicKey", "EBYHwsuWAU");
        setField(term47759, term47759.getClass(), "fromPrivateKey", "PtIjKpiSix");
        setField(term47759, term47759.getClass(), "trustlineIssuerClassicAddress", "NZdTuwSCIM");
        setField(term47759, term47759.getClass(), "currencyName", "dDHcmzPAmP");
        setField(term47759, term47759.getClass(), "amount", "HEaTkWYBgv");
        setBooleanField(term47759, term47759.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term47759, term47759.getClass(), "globalIdVerified", true);
        setBooleanField(term47759, term47759.getClass(), "useBlacklist", true);
        setBooleanField(term47759, term47759.getClass(), "agreeFee", false);
        setField(term47759, term47759.getClass(), "maximumTrustlines", term47848);
        setField(term47759, term47759.getClass(), "minBalance", term47850);
        setField(term47759, term47759.getClass(), "maxBalance", term47852);
        setField(term47759, term47759.getClass(), "maxXrpFeePerTransaction", "MpJsPKLTIU");
        setField(term47759, term47759.getClass(), "retryOfId", term47866);
        setField(term47759, term47759.getClass(), "paymentType", enum85);
        setField(term47759, term47759.getClass(), "snapshotTrustlineIssuerClassicAddress", "IiNCZfdouL");
        setField(term47759, term47759.getClass(), "snapshotCurrencyName", "AhOHzCsHKW");
        setLongField(term47908, term47908.getClass(), "fastTime", 1285661498273L);
        setField(term47908, term47908.getClass(), "cdate", null);
        setField(term47759, term47759.getClass(), "startTime", term47908);
        setField(term47759, term47759.getClass(), "frequency", enum86);
        setLongField(term47922, term47922.getClass(), "fastTime", 1643981113575L);
        setField(term47922, term47922.getClass(), "cdate", null);
        setField(term47759, term47759.getClass(), "repeatUntilDate", term47922);
        setField(term47759, term47759.getClass(), "email", "UqgLPaaAHi");
        setBooleanField(term47759, term47759.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term47759, args);
    }

};


