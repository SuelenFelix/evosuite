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

public class PaymentRequestEnt_setAutoApprove_172031446672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230224;
     Object term230524;

    public PaymentRequestEnt_setAutoApprove_172031446672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term230225 = new Long(-8605430501912680279L);
        Class<? extends Object> term230547 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term230546 = ((Class) term230547).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term230546).setAccessible(true);
        Object enum408 = ((Field) term230546).get((Object) null);
        Class<? extends Object> term231071 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term231070 = ((Class) term231071).getDeclaredField((String) "FLAT");
        ((Field) term231070).setAccessible(true);
        Object enum409 = ((Field) term231070).get((Object) null);
        Boolean term230391 = new Boolean(false);
        Boolean term230393 = new Boolean(true);
        Integer term230395 = new Integer(-1498296052);
        Class<? extends Object> term231445 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term231444 = ((Class) term231445).getDeclaredField((String) "TRUSTLINE");
        ((Field) term231444).setAccessible(true);
        Object enum410 = ((Field) term231444).get((Object) null);
        Long term230482 = new Long(2985226914509512766L);
        Long term230496 = new Long(4041117732464806744L);
        Boolean term230510 = new Boolean(true);
        term230224 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term230251 = newInstance(Class.forName("java.util.Date"));
        Object term230253 = newInstance(Class.forName("java.util.Date"));
        Object term230255 = newInstance(Class.forName("java.util.Date"));
        setField(term230224, term230224.getClass(), "id", term230225);
        setField(term230224, term230224.getClass(), "environment", "WIJiLZqEqc");
        setField(term230224, term230224.getClass(), "populateEnvironment", "OuZMVgPpoE");
        setLongField(term230251, term230251.getClass(), "fastTime", 1308527949856L);
        setField(term230251, term230251.getClass(), "cdate", null);
        setField(term230224, term230224.getClass(), "createDate", term230251);
        setLongField(term230253, term230253.getClass(), "fastTime", 1740274154126L);
        setField(term230253, term230253.getClass(), "cdate", null);
        setField(term230224, term230224.getClass(), "updateDate", term230253);
        setLongField(term230255, term230255.getClass(), "fastTime", 1478659622783L);
        setField(term230255, term230255.getClass(), "cdate", null);
        setField(term230224, term230224.getClass(), "startTime", term230255);
        setField(term230224, term230224.getClass(), "status", enum408);
        setField(term230224, term230224.getClass(), "fromClassicAddress", "nDUyFfanYp");
        setField(term230224, term230224.getClass(), "fromSigningPublicKey", "hYmQxPxTFd");
        setField(term230224, term230224.getClass(), "fromPrivateKey", "Clkrygzvpw");
        setField(term230224, term230224.getClass(), "trustlineIssuerClassicAddress", "TPzGOBNENK");
        setField(term230224, term230224.getClass(), "currencyName", "ADhlvQDtuh");
        setField(term230224, term230224.getClass(), "snapshotTrustlineIssuerClassicAddress", "rvUfMhtNrD");
        setField(term230224, term230224.getClass(), "snapshotCurrencyName", "tVJNKfGPYg");
        setField(term230224, term230224.getClass(), "currencyNameForProcess", "AlAUNSOTmH");
        setField(term230224, term230224.getClass(), "amount", "IeuSZGvhvH");
        setField(term230224, term230224.getClass(), "paymentType", enum409);
        setField(term230224, term230224.getClass(), "newTrustlinesOnly", term230391);
        setField(term230224, term230224.getClass(), "useBlacklist", term230393);
        setField(term230224, term230224.getClass(), "maximumTrustlines", term230395);
        setField(term230224, term230224.getClass(), "dropType", enum410);
        setField(term230224, term230224.getClass(), "lockUuid", "zCejWZdaIc");
        setField(term230224, term230224.getClass(), "failReason", "aCfzlsgXhB");
        setField(term230224, term230224.getClass(), "feesPaid", "HmhoMiUgEv");
        setField(term230224, term230224.getClass(), "minBalance", "MuJvYyPzjX");
        setField(term230224, term230224.getClass(), "maxBalance", "pEZeQhLjKN");
        setField(term230224, term230224.getClass(), "maxXrpFeePerTransaction", "saKRDpPnGD");
        setField(term230224, term230224.getClass(), "retryOfId", term230482);
        setField(term230224, term230224.getClass(), "nftIssuerAddress", "UesGweYSco");
        setField(term230224, term230224.getClass(), "nftTaxon", term230496);
        setField(term230224, term230224.getClass(), "contactEmail", "uVnPUUZHSY");
        setField(term230224, term230224.getClass(), "autoApprove", term230510);
        setField(term230224, term230224.getClass(), "memo", "LaWPqdDqyl");
        term230524 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term230524;
        callMethod(klass, "setAutoApprove", argTypes, term230224, args);
    }

};


