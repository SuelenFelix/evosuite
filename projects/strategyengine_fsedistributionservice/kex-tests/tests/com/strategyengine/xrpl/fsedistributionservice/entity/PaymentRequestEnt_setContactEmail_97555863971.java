package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;

public class PaymentRequestEnt_setContactEmail_97555863971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228468;

    public PaymentRequestEnt_setContactEmail_97555863971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term228469 = new Long(-723697646775816649L);
        Class<? extends Object> term228814 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term228813 = ((Class) term228814).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term228813).setAccessible(true);
        Object enum405 = ((Field) term228813).get((Object) null);
        Class<? extends Object> term229329 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term229328 = ((Class) term229329).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term229328).setAccessible(true);
        Object enum406 = ((Field) term229328).get((Object) null);
        Boolean term228640 = new Boolean(false);
        Boolean term228642 = new Boolean(false);
        Integer term228644 = new Integer(-1388471422);
        Class<? extends Object> term229727 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term229726 = ((Class) term229727).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term229726).setAccessible(true);
        Object enum407 = ((Field) term229726).get((Object) null);
        Long term228739 = new Long(-5671086125367688052L);
        Long term228753 = new Long(7875739215674729968L);
        Boolean term228767 = new Boolean(true);
        term228468 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term228495 = newInstance(Class.forName("java.util.Date"));
        Object term228497 = newInstance(Class.forName("java.util.Date"));
        Object term228499 = newInstance(Class.forName("java.util.Date"));
        setField(term228468, term228468.getClass(), "id", term228469);
        setField(term228468, term228468.getClass(), "environment", "cFwZnaLmLP");
        setField(term228468, term228468.getClass(), "populateEnvironment", "cBtfnWBMkE");
        setLongField(term228495, term228495.getClass(), "fastTime", 1595594196752L);
        setField(term228495, term228495.getClass(), "cdate", null);
        setField(term228468, term228468.getClass(), "createDate", term228495);
        setLongField(term228497, term228497.getClass(), "fastTime", 1633791827951L);
        setField(term228497, term228497.getClass(), "cdate", null);
        setField(term228468, term228468.getClass(), "updateDate", term228497);
        setLongField(term228499, term228499.getClass(), "fastTime", 1565038927228L);
        setField(term228499, term228499.getClass(), "cdate", null);
        setField(term228468, term228468.getClass(), "startTime", term228499);
        setField(term228468, term228468.getClass(), "status", enum405);
        setField(term228468, term228468.getClass(), "fromClassicAddress", "sFixkFlMhw");
        setField(term228468, term228468.getClass(), "fromSigningPublicKey", "wNaCYPwDGZ");
        setField(term228468, term228468.getClass(), "fromPrivateKey", "CFojehEtAR");
        setField(term228468, term228468.getClass(), "trustlineIssuerClassicAddress", "EYeLeoxDrM");
        setField(term228468, term228468.getClass(), "currencyName", "zIPJJJubgX");
        setField(term228468, term228468.getClass(), "snapshotTrustlineIssuerClassicAddress", "WRbxmSFTaO");
        setField(term228468, term228468.getClass(), "snapshotCurrencyName", "ZekQCuvPXT");
        setField(term228468, term228468.getClass(), "currencyNameForProcess", "GUXdlpmVNQ");
        setField(term228468, term228468.getClass(), "amount", "QxSwOpnogl");
        setField(term228468, term228468.getClass(), "paymentType", enum406);
        setField(term228468, term228468.getClass(), "newTrustlinesOnly", term228640);
        setField(term228468, term228468.getClass(), "useBlacklist", term228642);
        setField(term228468, term228468.getClass(), "maximumTrustlines", term228644);
        setField(term228468, term228468.getClass(), "dropType", enum407);
        setField(term228468, term228468.getClass(), "lockUuid", "wXeTrDfRqa");
        setField(term228468, term228468.getClass(), "failReason", "QsFsmwqvwM");
        setField(term228468, term228468.getClass(), "feesPaid", "pSDSdAjceB");
        setField(term228468, term228468.getClass(), "minBalance", "TGMaCYOqml");
        setField(term228468, term228468.getClass(), "maxBalance", "btqCBRPcNd");
        setField(term228468, term228468.getClass(), "maxXrpFeePerTransaction", "LEbiLyVKDG");
        setField(term228468, term228468.getClass(), "retryOfId", term228739);
        setField(term228468, term228468.getClass(), "nftIssuerAddress", "PzUzEwZhUT");
        setField(term228468, term228468.getClass(), "nftTaxon", term228753);
        setField(term228468, term228468.getClass(), "contactEmail", "bJKvwEFeLG");
        setField(term228468, term228468.getClass(), "autoApprove", term228767);
        setField(term228468, term228468.getClass(), "memo", "MQzXbKeQIa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YHDwlXeRTi";
        callMethod(klass, "setContactEmail", argTypes, term228468, args);
    }

};


