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

public class PaymentRequestEnt_getStatus_85373817512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128256;

    public PaymentRequestEnt_getStatus_85373817512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term128257 = new Long(-4776514981294468834L);
        Class<? extends Object> term128597 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term128596 = ((Class) term128597).getDeclaredField((String) "SCHEDULED");
        ((Field) term128596).setAccessible(true);
        Object enum229 = ((Field) term128596).get((Object) null);
        Class<? extends Object> term129106 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term129105 = ((Class) term129106).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term129105).setAccessible(true);
        Object enum230 = ((Field) term129105).get((Object) null);
        Boolean term128426 = new Boolean(false);
        Boolean term128428 = new Boolean(true);
        Integer term128430 = new Integer(-344842608);
        Class<? extends Object> term129504 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term129503 = ((Class) term129504).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term129503).setAccessible(true);
        Object enum231 = ((Field) term129503).get((Object) null);
        Long term128534 = new Long(-7273680182770718108L);
        Long term128548 = new Long(-421166328269063791L);
        Boolean term128562 = new Boolean(false);
        term128256 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term128283 = newInstance(Class.forName("java.util.Date"));
        Object term128285 = newInstance(Class.forName("java.util.Date"));
        Object term128287 = newInstance(Class.forName("java.util.Date"));
        setField(term128256, term128256.getClass(), "id", term128257);
        setField(term128256, term128256.getClass(), "environment", "mJJkYzNPob");
        setField(term128256, term128256.getClass(), "populateEnvironment", "mRDwekkZQg");
        setLongField(term128283, term128283.getClass(), "fastTime", 1470108020852L);
        setField(term128283, term128283.getClass(), "cdate", null);
        setField(term128256, term128256.getClass(), "createDate", term128283);
        setLongField(term128285, term128285.getClass(), "fastTime", 1809174159373L);
        setField(term128285, term128285.getClass(), "cdate", null);
        setField(term128256, term128256.getClass(), "updateDate", term128285);
        setLongField(term128287, term128287.getClass(), "fastTime", 1529218958865L);
        setField(term128287, term128287.getClass(), "cdate", null);
        setField(term128256, term128256.getClass(), "startTime", term128287);
        setField(term128256, term128256.getClass(), "status", enum229);
        setField(term128256, term128256.getClass(), "fromClassicAddress", "RIGChgqpTI");
        setField(term128256, term128256.getClass(), "fromSigningPublicKey", "YCrgXnhgoK");
        setField(term128256, term128256.getClass(), "fromPrivateKey", "nQodIeQekM");
        setField(term128256, term128256.getClass(), "trustlineIssuerClassicAddress", "YXORpHCDcd");
        setField(term128256, term128256.getClass(), "currencyName", "XzZbAcRADD");
        setField(term128256, term128256.getClass(), "snapshotTrustlineIssuerClassicAddress", "UqSNWSoTRy");
        setField(term128256, term128256.getClass(), "snapshotCurrencyName", "VesRqDfjMa");
        setField(term128256, term128256.getClass(), "currencyNameForProcess", "AQTTebOiZR");
        setField(term128256, term128256.getClass(), "amount", "mgeIhswNtk");
        setField(term128256, term128256.getClass(), "paymentType", enum230);
        setField(term128256, term128256.getClass(), "newTrustlinesOnly", term128426);
        setField(term128256, term128256.getClass(), "useBlacklist", term128428);
        setField(term128256, term128256.getClass(), "maximumTrustlines", term128430);
        setField(term128256, term128256.getClass(), "dropType", enum231);
        setField(term128256, term128256.getClass(), "lockUuid", "QwKYpiVQlL");
        setField(term128256, term128256.getClass(), "failReason", "kSGsHNQQoW");
        setField(term128256, term128256.getClass(), "feesPaid", "MWezlyjdaG");
        setField(term128256, term128256.getClass(), "minBalance", "drpBJuEKQG");
        setField(term128256, term128256.getClass(), "maxBalance", "GGpORnLrOW");
        setField(term128256, term128256.getClass(), "maxXrpFeePerTransaction", "gDGZwlpOZx");
        setField(term128256, term128256.getClass(), "retryOfId", term128534);
        setField(term128256, term128256.getClass(), "nftIssuerAddress", "gkDpxkHPDg");
        setField(term128256, term128256.getClass(), "nftTaxon", term128548);
        setField(term128256, term128256.getClass(), "contactEmail", "pADwkrWiMW");
        setField(term128256, term128256.getClass(), "autoApprove", term128562);
        setField(term128256, term128256.getClass(), "memo", "FDORDJuAXQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term128256, args);
    }

};


