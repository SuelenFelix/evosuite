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

public class PaymentRequestEnt_getCreateDate_15586794109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123086;

    public PaymentRequestEnt_getCreateDate_15586794109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term123087 = new Long(1442167273909860961L);
        Class<? extends Object> term123406 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term123405 = ((Class) term123406).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term123405).setAccessible(true);
        Object enum220 = ((Field) term123405).get((Object) null);
        Class<? extends Object> term123930 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term123929 = ((Class) term123930).getDeclaredField((String) "FLAT");
        ((Field) term123929).setAccessible(true);
        Object enum221 = ((Field) term123929).get((Object) null);
        Boolean term123253 = new Boolean(false);
        Boolean term123255 = new Boolean(true);
        Integer term123257 = new Integer(-1772434990);
        Class<? extends Object> term124304 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term124303 = ((Class) term124304).getDeclaredField((String) "GLOBALID");
        ((Field) term124303).setAccessible(true);
        Object enum222 = ((Field) term124303).get((Object) null);
        Long term123343 = new Long(6895382576300001141L);
        Long term123357 = new Long(9062006526792682783L);
        Boolean term123371 = new Boolean(false);
        term123086 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term123113 = newInstance(Class.forName("java.util.Date"));
        Object term123115 = newInstance(Class.forName("java.util.Date"));
        Object term123117 = newInstance(Class.forName("java.util.Date"));
        setField(term123086, term123086.getClass(), "id", term123087);
        setField(term123086, term123086.getClass(), "environment", "WRIQkTdeMl");
        setField(term123086, term123086.getClass(), "populateEnvironment", "rLSEheWsHd");
        setLongField(term123113, term123113.getClass(), "fastTime", 1667317804114L);
        setField(term123113, term123113.getClass(), "cdate", null);
        setField(term123086, term123086.getClass(), "createDate", term123113);
        setLongField(term123115, term123115.getClass(), "fastTime", 1643824174710L);
        setField(term123115, term123115.getClass(), "cdate", null);
        setField(term123086, term123086.getClass(), "updateDate", term123115);
        setLongField(term123117, term123117.getClass(), "fastTime", 1589287310419L);
        setField(term123117, term123117.getClass(), "cdate", null);
        setField(term123086, term123086.getClass(), "startTime", term123117);
        setField(term123086, term123086.getClass(), "status", enum220);
        setField(term123086, term123086.getClass(), "fromClassicAddress", "DoUKDhlGCY");
        setField(term123086, term123086.getClass(), "fromSigningPublicKey", "IeoToWsQWU");
        setField(term123086, term123086.getClass(), "fromPrivateKey", "QxiiHtQAzN");
        setField(term123086, term123086.getClass(), "trustlineIssuerClassicAddress", "gQgTBlRIvX");
        setField(term123086, term123086.getClass(), "currencyName", "ulKaKnANzj");
        setField(term123086, term123086.getClass(), "snapshotTrustlineIssuerClassicAddress", "ABwhdjjeJi");
        setField(term123086, term123086.getClass(), "snapshotCurrencyName", "KKEcpYXNZV");
        setField(term123086, term123086.getClass(), "currencyNameForProcess", "shLHFznysy");
        setField(term123086, term123086.getClass(), "amount", "YCKIloBHLj");
        setField(term123086, term123086.getClass(), "paymentType", enum221);
        setField(term123086, term123086.getClass(), "newTrustlinesOnly", term123253);
        setField(term123086, term123086.getClass(), "useBlacklist", term123255);
        setField(term123086, term123086.getClass(), "maximumTrustlines", term123257);
        setField(term123086, term123086.getClass(), "dropType", enum222);
        setField(term123086, term123086.getClass(), "lockUuid", "qUWDhAeFJY");
        setField(term123086, term123086.getClass(), "failReason", "wboNBMhRjP");
        setField(term123086, term123086.getClass(), "feesPaid", "HZODpafOGe");
        setField(term123086, term123086.getClass(), "minBalance", "dUTYEKtTfQ");
        setField(term123086, term123086.getClass(), "maxBalance", "HUtbHklGel");
        setField(term123086, term123086.getClass(), "maxXrpFeePerTransaction", "QbfKDAwhSB");
        setField(term123086, term123086.getClass(), "retryOfId", term123343);
        setField(term123086, term123086.getClass(), "nftIssuerAddress", "ckTRHEIcCK");
        setField(term123086, term123086.getClass(), "nftTaxon", term123357);
        setField(term123086, term123086.getClass(), "contactEmail", "NYSBqIpNlD");
        setField(term123086, term123086.getClass(), "autoApprove", term123371);
        setField(term123086, term123086.getClass(), "memo", "OWglDUWQYb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateDate", argTypes, term123086, args);
    }

};


