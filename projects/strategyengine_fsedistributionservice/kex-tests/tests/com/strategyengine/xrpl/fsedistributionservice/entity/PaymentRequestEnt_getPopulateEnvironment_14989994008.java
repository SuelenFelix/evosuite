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

public class PaymentRequestEnt_getPopulateEnvironment_14989994008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121360;

    public PaymentRequestEnt_getPopulateEnvironment_14989994008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term121361 = new Long(8073378116544724166L);
        Class<? extends Object> term121692 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term121691 = ((Class) term121692).getDeclaredField((String) "SCHEDULED");
        ((Field) term121691).setAccessible(true);
        Object enum217 = ((Field) term121691).get((Object) null);
        Class<? extends Object> term122201 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term122200 = ((Class) term122201).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term122200).setAccessible(true);
        Object enum218 = ((Field) term122200).get((Object) null);
        Boolean term121530 = new Boolean(true);
        Boolean term121532 = new Boolean(true);
        Integer term121534 = new Integer(-556405712);
        Class<? extends Object> term122599 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term122598 = ((Class) term122599).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term122598).setAccessible(true);
        Object enum219 = ((Field) term122598).get((Object) null);
        Long term121629 = new Long(-8303973304709662279L);
        Long term121643 = new Long(6853972830905120647L);
        Boolean term121657 = new Boolean(false);
        term121360 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term121387 = newInstance(Class.forName("java.util.Date"));
        Object term121389 = newInstance(Class.forName("java.util.Date"));
        Object term121391 = newInstance(Class.forName("java.util.Date"));
        setField(term121360, term121360.getClass(), "id", term121361);
        setField(term121360, term121360.getClass(), "environment", "zRnpRGaHlI");
        setField(term121360, term121360.getClass(), "populateEnvironment", "dVHfxjbMRK");
        setLongField(term121387, term121387.getClass(), "fastTime", 1766247544969L);
        setField(term121387, term121387.getClass(), "cdate", null);
        setField(term121360, term121360.getClass(), "createDate", term121387);
        setLongField(term121389, term121389.getClass(), "fastTime", 1690384147635L);
        setField(term121389, term121389.getClass(), "cdate", null);
        setField(term121360, term121360.getClass(), "updateDate", term121389);
        setLongField(term121391, term121391.getClass(), "fastTime", 1670332763507L);
        setField(term121391, term121391.getClass(), "cdate", null);
        setField(term121360, term121360.getClass(), "startTime", term121391);
        setField(term121360, term121360.getClass(), "status", enum217);
        setField(term121360, term121360.getClass(), "fromClassicAddress", "LzwyLxKJpw");
        setField(term121360, term121360.getClass(), "fromSigningPublicKey", "ZhWJlplAVK");
        setField(term121360, term121360.getClass(), "fromPrivateKey", "pnmjTuTojv");
        setField(term121360, term121360.getClass(), "trustlineIssuerClassicAddress", "eMtshhmGEm");
        setField(term121360, term121360.getClass(), "currencyName", "VJUbzHGOvg");
        setField(term121360, term121360.getClass(), "snapshotTrustlineIssuerClassicAddress", "SiwcigIrfD");
        setField(term121360, term121360.getClass(), "snapshotCurrencyName", "MFIdGVLoDo");
        setField(term121360, term121360.getClass(), "currencyNameForProcess", "kbxgTcnXyU");
        setField(term121360, term121360.getClass(), "amount", "lnJvDbbuwo");
        setField(term121360, term121360.getClass(), "paymentType", enum218);
        setField(term121360, term121360.getClass(), "newTrustlinesOnly", term121530);
        setField(term121360, term121360.getClass(), "useBlacklist", term121532);
        setField(term121360, term121360.getClass(), "maximumTrustlines", term121534);
        setField(term121360, term121360.getClass(), "dropType", enum219);
        setField(term121360, term121360.getClass(), "lockUuid", "KExnWkKGvF");
        setField(term121360, term121360.getClass(), "failReason", "luGUNfvmKk");
        setField(term121360, term121360.getClass(), "feesPaid", "oOUHomyJff");
        setField(term121360, term121360.getClass(), "minBalance", "KnnoLMOuur");
        setField(term121360, term121360.getClass(), "maxBalance", "buRpVghIvt");
        setField(term121360, term121360.getClass(), "maxXrpFeePerTransaction", "oTGxFdiaIW");
        setField(term121360, term121360.getClass(), "retryOfId", term121629);
        setField(term121360, term121360.getClass(), "nftIssuerAddress", "jlyFvaZlmv");
        setField(term121360, term121360.getClass(), "nftTaxon", term121643);
        setField(term121360, term121360.getClass(), "contactEmail", "sofyLEfomV");
        setField(term121360, term121360.getClass(), "autoApprove", term121657);
        setField(term121360, term121360.getClass(), "memo", "zHcDSJHKAb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPopulateEnvironment", argTypes, term121360, args);
    }

};


