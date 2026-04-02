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

public class PaymentRequestEnt_getSnapshotCurrencyName_85041360519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140206;

    public PaymentRequestEnt_getSnapshotCurrencyName_85041360519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term140207 = new Long(-7423063312741500355L);
        Class<? extends Object> term140549 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term140548 = ((Class) term140549).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term140548).setAccessible(true);
        Object enum250 = ((Field) term140548).get((Object) null);
        Class<? extends Object> term141091 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term141090 = ((Class) term141091).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term141090).setAccessible(true);
        Object enum251 = ((Field) term141090).get((Object) null);
        Boolean term140387 = new Boolean(false);
        Boolean term140389 = new Boolean(false);
        Integer term140391 = new Integer(-1347665717);
        Class<? extends Object> term141489 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term141488 = ((Class) term141489).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term141488).setAccessible(true);
        Object enum252 = ((Field) term141488).get((Object) null);
        Long term140486 = new Long(-8992404862613425105L);
        Long term140500 = new Long(3103198349031409063L);
        Boolean term140514 = new Boolean(true);
        term140206 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term140233 = newInstance(Class.forName("java.util.Date"));
        Object term140235 = newInstance(Class.forName("java.util.Date"));
        Object term140237 = newInstance(Class.forName("java.util.Date"));
        setField(term140206, term140206.getClass(), "id", term140207);
        setField(term140206, term140206.getClass(), "environment", "zvMQGbTtsV");
        setField(term140206, term140206.getClass(), "populateEnvironment", "DyUuIDzZPG");
        setLongField(term140233, term140233.getClass(), "fastTime", 1580485206758L);
        setField(term140233, term140233.getClass(), "cdate", null);
        setField(term140206, term140206.getClass(), "createDate", term140233);
        setLongField(term140235, term140235.getClass(), "fastTime", 1606117692592L);
        setField(term140235, term140235.getClass(), "cdate", null);
        setField(term140206, term140206.getClass(), "updateDate", term140235);
        setLongField(term140237, term140237.getClass(), "fastTime", 1818363160308L);
        setField(term140237, term140237.getClass(), "cdate", null);
        setField(term140206, term140206.getClass(), "startTime", term140237);
        setField(term140206, term140206.getClass(), "status", enum250);
        setField(term140206, term140206.getClass(), "fromClassicAddress", "EGQLusEtRN");
        setField(term140206, term140206.getClass(), "fromSigningPublicKey", "GwGUMPdvZq");
        setField(term140206, term140206.getClass(), "fromPrivateKey", "iXRAYcFyfS");
        setField(term140206, term140206.getClass(), "trustlineIssuerClassicAddress", "lokyclbLEz");
        setField(term140206, term140206.getClass(), "currencyName", "hAPmQGaxkI");
        setField(term140206, term140206.getClass(), "snapshotTrustlineIssuerClassicAddress", "ojrnLnJZjT");
        setField(term140206, term140206.getClass(), "snapshotCurrencyName", "rtvXSMjOdJ");
        setField(term140206, term140206.getClass(), "currencyNameForProcess", "EDkfjuDpNv");
        setField(term140206, term140206.getClass(), "amount", "LNHkTUfuHX");
        setField(term140206, term140206.getClass(), "paymentType", enum251);
        setField(term140206, term140206.getClass(), "newTrustlinesOnly", term140387);
        setField(term140206, term140206.getClass(), "useBlacklist", term140389);
        setField(term140206, term140206.getClass(), "maximumTrustlines", term140391);
        setField(term140206, term140206.getClass(), "dropType", enum252);
        setField(term140206, term140206.getClass(), "lockUuid", "SVWcOAHiTp");
        setField(term140206, term140206.getClass(), "failReason", "oShLCaneoQ");
        setField(term140206, term140206.getClass(), "feesPaid", "nwKkzNpzyC");
        setField(term140206, term140206.getClass(), "minBalance", "CwrsdYnHpH");
        setField(term140206, term140206.getClass(), "maxBalance", "jifjXNXluS");
        setField(term140206, term140206.getClass(), "maxXrpFeePerTransaction", "uDayZDXPOP");
        setField(term140206, term140206.getClass(), "retryOfId", term140486);
        setField(term140206, term140206.getClass(), "nftIssuerAddress", "kbjWxMAIhY");
        setField(term140206, term140206.getClass(), "nftTaxon", term140500);
        setField(term140206, term140206.getClass(), "contactEmail", "GmtlSgqKcI");
        setField(term140206, term140206.getClass(), "autoApprove", term140514);
        setField(term140206, term140206.getClass(), "memo", "ssSbvPoMjB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSnapshotCurrencyName", argTypes, term140206, args);
    }

};


