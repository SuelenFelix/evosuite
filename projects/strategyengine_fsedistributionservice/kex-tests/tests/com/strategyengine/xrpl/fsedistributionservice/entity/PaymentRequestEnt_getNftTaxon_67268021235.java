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

public class PaymentRequestEnt_getNftTaxon_67268021235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167462;

    public PaymentRequestEnt_getNftTaxon_67268021235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term167463 = new Long(77619432202128806L);
        Class<? extends Object> term167777 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term167776 = ((Class) term167777).getDeclaredField((String) "REJECTED");
        ((Field) term167776).setAccessible(true);
        Object enum298 = ((Field) term167776).get((Object) null);
        Class<? extends Object> term168283 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term168282 = ((Class) term168283).getDeclaredField((String) "FLAT");
        ((Field) term168282).setAccessible(true);
        Object enum299 = ((Field) term168282).get((Object) null);
        Boolean term167623 = new Boolean(true);
        Boolean term167625 = new Boolean(false);
        Integer term167627 = new Integer(-893623680);
        Class<? extends Object> term168657 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term168656 = ((Class) term168657).getDeclaredField((String) "TRUSTLINE");
        ((Field) term168656).setAccessible(true);
        Object enum300 = ((Field) term168656).get((Object) null);
        Long term167714 = new Long(-1647156882669215876L);
        Long term167728 = new Long(4115148503664117517L);
        Boolean term167742 = new Boolean(false);
        term167462 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term167489 = newInstance(Class.forName("java.util.Date"));
        Object term167491 = newInstance(Class.forName("java.util.Date"));
        Object term167493 = newInstance(Class.forName("java.util.Date"));
        setField(term167462, term167462.getClass(), "id", term167463);
        setField(term167462, term167462.getClass(), "environment", "aevLPMVcYW");
        setField(term167462, term167462.getClass(), "populateEnvironment", "orHcHVrwHz");
        setLongField(term167489, term167489.getClass(), "fastTime", 1640244611861L);
        setField(term167489, term167489.getClass(), "cdate", null);
        setField(term167462, term167462.getClass(), "createDate", term167489);
        setLongField(term167491, term167491.getClass(), "fastTime", 1585770433121L);
        setField(term167491, term167491.getClass(), "cdate", null);
        setField(term167462, term167462.getClass(), "updateDate", term167491);
        setLongField(term167493, term167493.getClass(), "fastTime", 1340590973430L);
        setField(term167493, term167493.getClass(), "cdate", null);
        setField(term167462, term167462.getClass(), "startTime", term167493);
        setField(term167462, term167462.getClass(), "status", enum298);
        setField(term167462, term167462.getClass(), "fromClassicAddress", "mkEWcQdwUn");
        setField(term167462, term167462.getClass(), "fromSigningPublicKey", "VRjVlzFSIx");
        setField(term167462, term167462.getClass(), "fromPrivateKey", "fNlDLqQZFT");
        setField(term167462, term167462.getClass(), "trustlineIssuerClassicAddress", "szCfpoTDXX");
        setField(term167462, term167462.getClass(), "currencyName", "blnSDUyHkS");
        setField(term167462, term167462.getClass(), "snapshotTrustlineIssuerClassicAddress", "byyepwHlHN");
        setField(term167462, term167462.getClass(), "snapshotCurrencyName", "akVNsUcFra");
        setField(term167462, term167462.getClass(), "currencyNameForProcess", "BKiHMTzLoY");
        setField(term167462, term167462.getClass(), "amount", "arrHHpXCBD");
        setField(term167462, term167462.getClass(), "paymentType", enum299);
        setField(term167462, term167462.getClass(), "newTrustlinesOnly", term167623);
        setField(term167462, term167462.getClass(), "useBlacklist", term167625);
        setField(term167462, term167462.getClass(), "maximumTrustlines", term167627);
        setField(term167462, term167462.getClass(), "dropType", enum300);
        setField(term167462, term167462.getClass(), "lockUuid", "zzfzxQYlis");
        setField(term167462, term167462.getClass(), "failReason", "TJJQwVEzxz");
        setField(term167462, term167462.getClass(), "feesPaid", "kHtEHBrsFo");
        setField(term167462, term167462.getClass(), "minBalance", "EmAvkhGlPV");
        setField(term167462, term167462.getClass(), "maxBalance", "mBrbyQVzve");
        setField(term167462, term167462.getClass(), "maxXrpFeePerTransaction", "FQODEbQeKa");
        setField(term167462, term167462.getClass(), "retryOfId", term167714);
        setField(term167462, term167462.getClass(), "nftIssuerAddress", "iLsUPvsdys");
        setField(term167462, term167462.getClass(), "nftTaxon", term167728);
        setField(term167462, term167462.getClass(), "contactEmail", "zsglFxvzdp");
        setField(term167462, term167462.getClass(), "autoApprove", term167742);
        setField(term167462, term167462.getClass(), "memo", "zhXtSGLnJR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNftTaxon", argTypes, term167462, args);
    }

};


