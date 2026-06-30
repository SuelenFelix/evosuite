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

public class PaymentRequestEnt_PaymentRequestEntBuilder_retryOfId_157928567528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95361;
     Object term95680;

    public PaymentRequestEnt_PaymentRequestEntBuilder_retryOfId_157928567528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term95362 = new Long(6636235983121346803L);
        Class<? extends Object> term95703 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term95702 = ((Class) term95703).getDeclaredField((String) "REJECTED");
        ((Field) term95702).setAccessible(true);
        Object enum172 = ((Field) term95702).get((Object) null);
        Class<? extends Object> term96209 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term96208 = ((Class) term96209).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term96208).setAccessible(true);
        Object enum173 = ((Field) term96208).get((Object) null);
        Boolean term95530 = new Boolean(false);
        Boolean term95532 = new Boolean(true);
        Integer term95534 = new Integer(335112684);
        Class<? extends Object> term96607 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term96606 = ((Class) term96607).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term96606).setAccessible(true);
        Object enum174 = ((Field) term96606).get((Object) null);
        Long term95638 = new Long(146749226579788091L);
        Long term95652 = new Long(-1279670138064751276L);
        Boolean term95666 = new Boolean(false);
        term95361 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term95388 = newInstance(Class.forName("java.util.Date"));
        Object term95390 = newInstance(Class.forName("java.util.Date"));
        Object term95392 = newInstance(Class.forName("java.util.Date"));
        setField(term95361, term95361.getClass(), "id", term95362);
        setField(term95361, term95361.getClass(), "environment", "KoasxTJGpx");
        setField(term95361, term95361.getClass(), "populateEnvironment", "ceGeARYMoa");
        setLongField(term95388, term95388.getClass(), "fastTime", 1407926618924L);
        setField(term95388, term95388.getClass(), "cdate", null);
        setField(term95361, term95361.getClass(), "createDate", term95388);
        setLongField(term95390, term95390.getClass(), "fastTime", 1536062261151L);
        setField(term95390, term95390.getClass(), "cdate", null);
        setField(term95361, term95361.getClass(), "updateDate", term95390);
        setLongField(term95392, term95392.getClass(), "fastTime", 1337922977026L);
        setField(term95392, term95392.getClass(), "cdate", null);
        setField(term95361, term95361.getClass(), "startTime", term95392);
        setField(term95361, term95361.getClass(), "status", enum172);
        setField(term95361, term95361.getClass(), "fromClassicAddress", "fFWllaiFvh");
        setField(term95361, term95361.getClass(), "fromSigningPublicKey", "PFTdEDSbvZ");
        setField(term95361, term95361.getClass(), "fromPrivateKey", "TbiwoiebNe");
        setField(term95361, term95361.getClass(), "trustlineIssuerClassicAddress", "laTITSWZuc");
        setField(term95361, term95361.getClass(), "currencyName", "fkzRpxlAqS");
        setField(term95361, term95361.getClass(), "snapshotTrustlineIssuerClassicAddress", "VYvbTGKslj");
        setField(term95361, term95361.getClass(), "snapshotCurrencyName", "owLqDDnwZA");
        setField(term95361, term95361.getClass(), "currencyNameForProcess", "eBcTbweeYp");
        setField(term95361, term95361.getClass(), "amount", "drcmjfQUDq");
        setField(term95361, term95361.getClass(), "paymentType", enum173);
        setField(term95361, term95361.getClass(), "newTrustlinesOnly", term95530);
        setField(term95361, term95361.getClass(), "useBlacklist", term95532);
        setField(term95361, term95361.getClass(), "maximumTrustlines", term95534);
        setField(term95361, term95361.getClass(), "dropType", enum174);
        setField(term95361, term95361.getClass(), "lockUuid", "GjdWUoUSyA");
        setField(term95361, term95361.getClass(), "failReason", "YEkxWsWaUl");
        setField(term95361, term95361.getClass(), "feesPaid", "RINhPkhhct");
        setField(term95361, term95361.getClass(), "minBalance", "vjNPcTSqmS");
        setField(term95361, term95361.getClass(), "maxBalance", "fFhdWuJbdC");
        setField(term95361, term95361.getClass(), "maxXrpFeePerTransaction", "JlgLIHPabR");
        setField(term95361, term95361.getClass(), "retryOfId", term95638);
        setField(term95361, term95361.getClass(), "nftIssuerAddress", "LHnkeoNwHq");
        setField(term95361, term95361.getClass(), "nftTaxon", term95652);
        setField(term95361, term95361.getClass(), "contactEmail", "gVnDVbSyKa");
        setField(term95361, term95361.getClass(), "autoApprove", term95666);
        setField(term95361, term95361.getClass(), "memo", "kdCYNMSuoD");
        term95680 = new Long(-7205236974351118210L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term95680;
        callMethod(klass, "retryOfId", argTypes, term95361, args);
    }

};


