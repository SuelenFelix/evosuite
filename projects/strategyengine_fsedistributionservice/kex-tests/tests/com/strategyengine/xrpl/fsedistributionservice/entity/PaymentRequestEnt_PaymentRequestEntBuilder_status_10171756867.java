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

public class PaymentRequestEnt_PaymentRequestEntBuilder_status_10171756867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58955;
     Object enum109;

    public PaymentRequestEnt_PaymentRequestEntBuilder_status_10171756867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58956 = new Long(-5656664340499957324L);
        Class<? extends Object> term59298 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term59297 = ((Class) term59298).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term59297).setAccessible(true);
        enum109 = ((Field) term59297).get((Object) null);
        Class<? extends Object> term59813 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term59812 = ((Class) term59813).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term59812).setAccessible(true);
        Object enum110 = ((Field) term59812).get((Object) null);
        Boolean term59127 = new Boolean(false);
        Boolean term59129 = new Boolean(false);
        Integer term59131 = new Integer(-1786399638);
        Class<? extends Object> term60211 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term60210 = ((Class) term60211).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term60210).setAccessible(true);
        Object enum111 = ((Field) term60210).get((Object) null);
        Long term59235 = new Long(-5460517064177800852L);
        Long term59249 = new Long(-5242567610844514867L);
        Boolean term59263 = new Boolean(true);
        term58955 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term58982 = newInstance(Class.forName("java.util.Date"));
        Object term58984 = newInstance(Class.forName("java.util.Date"));
        Object term58986 = newInstance(Class.forName("java.util.Date"));
        setField(term58955, term58955.getClass(), "id", term58956);
        setField(term58955, term58955.getClass(), "environment", "rsumfoDNHa");
        setField(term58955, term58955.getClass(), "populateEnvironment", "ceCWHUTQUM");
        setLongField(term58982, term58982.getClass(), "fastTime", 1554543387782L);
        setField(term58982, term58982.getClass(), "cdate", null);
        setField(term58955, term58955.getClass(), "createDate", term58982);
        setLongField(term58984, term58984.getClass(), "fastTime", 1813469018389L);
        setField(term58984, term58984.getClass(), "cdate", null);
        setField(term58955, term58955.getClass(), "updateDate", term58984);
        setLongField(term58986, term58986.getClass(), "fastTime", 1828947956352L);
        setField(term58986, term58986.getClass(), "cdate", null);
        setField(term58955, term58955.getClass(), "startTime", term58986);
        setField(term58955, term58955.getClass(), "status", enum109);
        setField(term58955, term58955.getClass(), "fromClassicAddress", "LrqwfrKKtS");
        setField(term58955, term58955.getClass(), "fromSigningPublicKey", "ZUdnQXfzCI");
        setField(term58955, term58955.getClass(), "fromPrivateKey", "EULDrUNQvw");
        setField(term58955, term58955.getClass(), "trustlineIssuerClassicAddress", "BtvAvsJSei");
        setField(term58955, term58955.getClass(), "currencyName", "vqnBkkxoIa");
        setField(term58955, term58955.getClass(), "snapshotTrustlineIssuerClassicAddress", "bycpZjxXFn");
        setField(term58955, term58955.getClass(), "snapshotCurrencyName", "jQWttOAiwL");
        setField(term58955, term58955.getClass(), "currencyNameForProcess", "DzKFxEuEEC");
        setField(term58955, term58955.getClass(), "amount", "CAMnvfDLJL");
        setField(term58955, term58955.getClass(), "paymentType", enum110);
        setField(term58955, term58955.getClass(), "newTrustlinesOnly", term59127);
        setField(term58955, term58955.getClass(), "useBlacklist", term59129);
        setField(term58955, term58955.getClass(), "maximumTrustlines", term59131);
        setField(term58955, term58955.getClass(), "dropType", enum111);
        setField(term58955, term58955.getClass(), "lockUuid", "mfHtgSbdjD");
        setField(term58955, term58955.getClass(), "failReason", "cmuaUiHMVL");
        setField(term58955, term58955.getClass(), "feesPaid", "xjoSGPWUgu");
        setField(term58955, term58955.getClass(), "minBalance", "uzmqjnOUXu");
        setField(term58955, term58955.getClass(), "maxBalance", "xeyjTOCOJb");
        setField(term58955, term58955.getClass(), "maxXrpFeePerTransaction", "DGRqjjdhzy");
        setField(term58955, term58955.getClass(), "retryOfId", term59235);
        setField(term58955, term58955.getClass(), "nftIssuerAddress", "lQFkjJUPAR");
        setField(term58955, term58955.getClass(), "nftTaxon", term59249);
        setField(term58955, term58955.getClass(), "contactEmail", "BsuVlGUUjV");
        setField(term58955, term58955.getClass(), "autoApprove", term59263);
        setField(term58955, term58955.getClass(), "memo", "bHHjfDCntT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Object[] args = new Object[1];
        args[0] = enum109;
        callMethod(klass, "status", argTypes, term58955, args);
    }

};


