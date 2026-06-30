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

public class PaymentRequestEnt_hashCode_3535137874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114648;

    public PaymentRequestEnt_hashCode_3535137874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term114649 = new Long(7799452759993694308L);
        Class<? extends Object> term114966 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term114965 = ((Class) term114966).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term114965).setAccessible(true);
        Object enum205 = ((Field) term114965).get((Object) null);
        Class<? extends Object> term115481 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term115480 = ((Class) term115481).getDeclaredField((String) "FLAT");
        ((Field) term115480).setAccessible(true);
        Object enum206 = ((Field) term115480).get((Object) null);
        Boolean term114812 = new Boolean(true);
        Boolean term114814 = new Boolean(false);
        Integer term114816 = new Integer(1090617576);
        Class<? extends Object> term115855 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term115854 = ((Class) term115855).getDeclaredField((String) "TRUSTLINE");
        ((Field) term115854).setAccessible(true);
        Object enum207 = ((Field) term115854).get((Object) null);
        Long term114903 = new Long(-1571034605670661708L);
        Long term114917 = new Long(-7983954942068142191L);
        Boolean term114931 = new Boolean(false);
        term114648 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term114675 = newInstance(Class.forName("java.util.Date"));
        Object term114677 = newInstance(Class.forName("java.util.Date"));
        Object term114679 = newInstance(Class.forName("java.util.Date"));
        setField(term114648, term114648.getClass(), "id", term114649);
        setField(term114648, term114648.getClass(), "environment", "nSzzeexTDI");
        setField(term114648, term114648.getClass(), "populateEnvironment", "WBrpvMhmsz");
        setLongField(term114675, term114675.getClass(), "fastTime", 1312384068303L);
        setField(term114675, term114675.getClass(), "cdate", null);
        setField(term114648, term114648.getClass(), "createDate", term114675);
        setLongField(term114677, term114677.getClass(), "fastTime", 1535966665284L);
        setField(term114677, term114677.getClass(), "cdate", null);
        setField(term114648, term114648.getClass(), "updateDate", term114677);
        setLongField(term114679, term114679.getClass(), "fastTime", 1842782087058L);
        setField(term114679, term114679.getClass(), "cdate", null);
        setField(term114648, term114648.getClass(), "startTime", term114679);
        setField(term114648, term114648.getClass(), "status", enum205);
        setField(term114648, term114648.getClass(), "fromClassicAddress", "ZzqRHVEXcM");
        setField(term114648, term114648.getClass(), "fromSigningPublicKey", "YYwIEARNxi");
        setField(term114648, term114648.getClass(), "fromPrivateKey", "rblXBUdTFc");
        setField(term114648, term114648.getClass(), "trustlineIssuerClassicAddress", "rbsXSOJFKW");
        setField(term114648, term114648.getClass(), "currencyName", "sAgGDoUNlf");
        setField(term114648, term114648.getClass(), "snapshotTrustlineIssuerClassicAddress", "TSTZcXdFFi");
        setField(term114648, term114648.getClass(), "snapshotCurrencyName", "RyaaOzWfYO");
        setField(term114648, term114648.getClass(), "currencyNameForProcess", "HAkxFBZZzz");
        setField(term114648, term114648.getClass(), "amount", "yejonZnVuy");
        setField(term114648, term114648.getClass(), "paymentType", enum206);
        setField(term114648, term114648.getClass(), "newTrustlinesOnly", term114812);
        setField(term114648, term114648.getClass(), "useBlacklist", term114814);
        setField(term114648, term114648.getClass(), "maximumTrustlines", term114816);
        setField(term114648, term114648.getClass(), "dropType", enum207);
        setField(term114648, term114648.getClass(), "lockUuid", "ouesGIsvuG");
        setField(term114648, term114648.getClass(), "failReason", "pHBHlmLIZQ");
        setField(term114648, term114648.getClass(), "feesPaid", "ZWRAbOuktl");
        setField(term114648, term114648.getClass(), "minBalance", "iqFRvFmVID");
        setField(term114648, term114648.getClass(), "maxBalance", "pNAEtppZdv");
        setField(term114648, term114648.getClass(), "maxXrpFeePerTransaction", "VsFWNMdyRt");
        setField(term114648, term114648.getClass(), "retryOfId", term114903);
        setField(term114648, term114648.getClass(), "nftIssuerAddress", "QaoYFZhScg");
        setField(term114648, term114648.getClass(), "nftTaxon", term114917);
        setField(term114648, term114648.getClass(), "contactEmail", "UTvXIenLCR");
        setField(term114648, term114648.getClass(), "autoApprove", term114931);
        setField(term114648, term114648.getClass(), "memo", "PLeKpWaxhQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term114648, args);
    }

};


