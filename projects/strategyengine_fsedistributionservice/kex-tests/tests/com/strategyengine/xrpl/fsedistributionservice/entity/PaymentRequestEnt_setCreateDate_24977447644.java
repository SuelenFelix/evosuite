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

public class PaymentRequestEnt_setCreateDate_24977447644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180935;
     Object term181240;

    public PaymentRequestEnt_setCreateDate_24977447644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term180936 = new Long(-4562564710769146498L);
        Class<? extends Object> term181263 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term181262 = ((Class) term181263).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term181262).setAccessible(true);
        Object enum322 = ((Field) term181262).get((Object) null);
        Class<? extends Object> term181805 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term181804 = ((Class) term181805).getDeclaredField((String) "FLAT");
        ((Field) term181804).setAccessible(true);
        Object enum323 = ((Field) term181804).get((Object) null);
        Boolean term181108 = new Boolean(true);
        Boolean term181110 = new Boolean(true);
        Integer term181112 = new Integer(568954359);
        Class<? extends Object> term182179 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term182178 = ((Class) term182179).getDeclaredField((String) "GLOBALID");
        ((Field) term182178).setAccessible(true);
        Object enum324 = ((Field) term182178).get((Object) null);
        Long term181198 = new Long(-6254265799185295775L);
        Long term181212 = new Long(3831994970480278159L);
        Boolean term181226 = new Boolean(true);
        term180935 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term180962 = newInstance(Class.forName("java.util.Date"));
        Object term180964 = newInstance(Class.forName("java.util.Date"));
        Object term180966 = newInstance(Class.forName("java.util.Date"));
        setField(term180935, term180935.getClass(), "id", term180936);
        setField(term180935, term180935.getClass(), "environment", "iaYiUQnOLD");
        setField(term180935, term180935.getClass(), "populateEnvironment", "upnleTLVdf");
        setLongField(term180962, term180962.getClass(), "fastTime", 1661785330901L);
        setField(term180962, term180962.getClass(), "cdate", null);
        setField(term180935, term180935.getClass(), "createDate", term180962);
        setLongField(term180964, term180964.getClass(), "fastTime", 1306045012871L);
        setField(term180964, term180964.getClass(), "cdate", null);
        setField(term180935, term180935.getClass(), "updateDate", term180964);
        setLongField(term180966, term180966.getClass(), "fastTime", 1368529552688L);
        setField(term180966, term180966.getClass(), "cdate", null);
        setField(term180935, term180935.getClass(), "startTime", term180966);
        setField(term180935, term180935.getClass(), "status", enum322);
        setField(term180935, term180935.getClass(), "fromClassicAddress", "pvjlKAnxzJ");
        setField(term180935, term180935.getClass(), "fromSigningPublicKey", "ejxUBDQQKB");
        setField(term180935, term180935.getClass(), "fromPrivateKey", "IbOvZLmtSE");
        setField(term180935, term180935.getClass(), "trustlineIssuerClassicAddress", "AOsIglRFcp");
        setField(term180935, term180935.getClass(), "currencyName", "bdONLhBZoA");
        setField(term180935, term180935.getClass(), "snapshotTrustlineIssuerClassicAddress", "qPVeRcolUe");
        setField(term180935, term180935.getClass(), "snapshotCurrencyName", "AscZyfQFkU");
        setField(term180935, term180935.getClass(), "currencyNameForProcess", "nPfruizWey");
        setField(term180935, term180935.getClass(), "amount", "RvgkUqMUFX");
        setField(term180935, term180935.getClass(), "paymentType", enum323);
        setField(term180935, term180935.getClass(), "newTrustlinesOnly", term181108);
        setField(term180935, term180935.getClass(), "useBlacklist", term181110);
        setField(term180935, term180935.getClass(), "maximumTrustlines", term181112);
        setField(term180935, term180935.getClass(), "dropType", enum324);
        setField(term180935, term180935.getClass(), "lockUuid", "nOqmldTbXj");
        setField(term180935, term180935.getClass(), "failReason", "xNDnWDGUNx");
        setField(term180935, term180935.getClass(), "feesPaid", "faGVqjLquQ");
        setField(term180935, term180935.getClass(), "minBalance", "MbsTNUmNqV");
        setField(term180935, term180935.getClass(), "maxBalance", "VdDIonpedU");
        setField(term180935, term180935.getClass(), "maxXrpFeePerTransaction", "VjtXZcUFNx");
        setField(term180935, term180935.getClass(), "retryOfId", term181198);
        setField(term180935, term180935.getClass(), "nftIssuerAddress", "bOZSTccXbt");
        setField(term180935, term180935.getClass(), "nftTaxon", term181212);
        setField(term180935, term180935.getClass(), "contactEmail", "MBSsxxeNUU");
        setField(term180935, term180935.getClass(), "autoApprove", term181226);
        setField(term180935, term180935.getClass(), "memo", "NmUhmPLSgG");
        term181240 = newInstance(Class.forName("java.util.Date"));
        setLongField(term181240, term181240.getClass(), "fastTime", 1639488027044L);
        setField(term181240, term181240.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term181240;
        callMethod(klass, "setCreateDate", argTypes, term180935, args);
    }

};


