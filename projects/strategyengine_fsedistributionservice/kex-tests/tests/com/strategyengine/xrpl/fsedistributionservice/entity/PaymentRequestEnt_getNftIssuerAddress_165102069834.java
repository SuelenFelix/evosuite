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

public class PaymentRequestEnt_getNftIssuerAddress_165102069834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165780;

    public PaymentRequestEnt_getNftIssuerAddress_165102069834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term165781 = new Long(-9168517519350392654L);
        Class<? extends Object> term166101 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term166100 = ((Class) term166101).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term166100).setAccessible(true);
        Object enum295 = ((Field) term166100).get((Object) null);
        Class<? extends Object> term166625 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term166624 = ((Class) term166625).getDeclaredField((String) "FLAT");
        ((Field) term166624).setAccessible(true);
        Object enum296 = ((Field) term166624).get((Object) null);
        Boolean term165947 = new Boolean(true);
        Boolean term165949 = new Boolean(false);
        Integer term165951 = new Integer(691577392);
        Class<? extends Object> term166999 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term166998 = ((Class) term166999).getDeclaredField((String) "TRUSTLINE");
        ((Field) term166998).setAccessible(true);
        Object enum297 = ((Field) term166998).get((Object) null);
        Long term166038 = new Long(4828755228445882127L);
        Long term166052 = new Long(970120292495348028L);
        Boolean term166066 = new Boolean(true);
        term165780 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term165807 = newInstance(Class.forName("java.util.Date"));
        Object term165809 = newInstance(Class.forName("java.util.Date"));
        Object term165811 = newInstance(Class.forName("java.util.Date"));
        setField(term165780, term165780.getClass(), "id", term165781);
        setField(term165780, term165780.getClass(), "environment", "kSkiIpaepq");
        setField(term165780, term165780.getClass(), "populateEnvironment", "FzJhDecyvI");
        setLongField(term165807, term165807.getClass(), "fastTime", 1311658288315L);
        setField(term165807, term165807.getClass(), "cdate", null);
        setField(term165780, term165780.getClass(), "createDate", term165807);
        setLongField(term165809, term165809.getClass(), "fastTime", 1498239061308L);
        setField(term165809, term165809.getClass(), "cdate", null);
        setField(term165780, term165780.getClass(), "updateDate", term165809);
        setLongField(term165811, term165811.getClass(), "fastTime", 1572369705867L);
        setField(term165811, term165811.getClass(), "cdate", null);
        setField(term165780, term165780.getClass(), "startTime", term165811);
        setField(term165780, term165780.getClass(), "status", enum295);
        setField(term165780, term165780.getClass(), "fromClassicAddress", "zOxseYMSdY");
        setField(term165780, term165780.getClass(), "fromSigningPublicKey", "jEKlkqpHMQ");
        setField(term165780, term165780.getClass(), "fromPrivateKey", "QpEVWispEh");
        setField(term165780, term165780.getClass(), "trustlineIssuerClassicAddress", "STofGrqXqL");
        setField(term165780, term165780.getClass(), "currencyName", "IoRhBfdSuN");
        setField(term165780, term165780.getClass(), "snapshotTrustlineIssuerClassicAddress", "JGdxVjQzts");
        setField(term165780, term165780.getClass(), "snapshotCurrencyName", "jEdjRikQtN");
        setField(term165780, term165780.getClass(), "currencyNameForProcess", "fSNUaokVWs");
        setField(term165780, term165780.getClass(), "amount", "dTxnMmHoVm");
        setField(term165780, term165780.getClass(), "paymentType", enum296);
        setField(term165780, term165780.getClass(), "newTrustlinesOnly", term165947);
        setField(term165780, term165780.getClass(), "useBlacklist", term165949);
        setField(term165780, term165780.getClass(), "maximumTrustlines", term165951);
        setField(term165780, term165780.getClass(), "dropType", enum297);
        setField(term165780, term165780.getClass(), "lockUuid", "iswxaQUQgT");
        setField(term165780, term165780.getClass(), "failReason", "MxUSQqhNse");
        setField(term165780, term165780.getClass(), "feesPaid", "skwxdosvQV");
        setField(term165780, term165780.getClass(), "minBalance", "DBYTggnCkD");
        setField(term165780, term165780.getClass(), "maxBalance", "RyXrJxJQiY");
        setField(term165780, term165780.getClass(), "maxXrpFeePerTransaction", "JfnQeTdzWs");
        setField(term165780, term165780.getClass(), "retryOfId", term166038);
        setField(term165780, term165780.getClass(), "nftIssuerAddress", "HGhGqMiMOk");
        setField(term165780, term165780.getClass(), "nftTaxon", term166052);
        setField(term165780, term165780.getClass(), "contactEmail", "VtTzFdKpZI");
        setField(term165780, term165780.getClass(), "autoApprove", term166066);
        setField(term165780, term165780.getClass(), "memo", "yCqQIOXRXO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNftIssuerAddress", argTypes, term165780, args);
    }

};


