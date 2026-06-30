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

public class PaymentRequestEnt_getPaymentType_187405156922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145340;

    public PaymentRequestEnt_getPaymentType_187405156922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term145341 = new Long(-1528017371096319990L);
        Class<? extends Object> term145669 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term145668 = ((Class) term145669).getDeclaredField((String) "QUEUED");
        ((Field) term145668).setAccessible(true);
        Object enum259 = ((Field) term145668).get((Object) null);
        Class<? extends Object> term146169 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term146168 = ((Class) term146169).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term146168).setAccessible(true);
        Object enum260 = ((Field) term146168).get((Object) null);
        Boolean term145507 = new Boolean(true);
        Boolean term145509 = new Boolean(false);
        Integer term145511 = new Integer(1596213415);
        Class<? extends Object> term146567 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term146566 = ((Class) term146567).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term146566).setAccessible(true);
        Object enum261 = ((Field) term146566).get((Object) null);
        Long term145606 = new Long(-1526328443223793465L);
        Long term145620 = new Long(-412186147449928821L);
        Boolean term145634 = new Boolean(true);
        term145340 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term145367 = newInstance(Class.forName("java.util.Date"));
        Object term145369 = newInstance(Class.forName("java.util.Date"));
        Object term145371 = newInstance(Class.forName("java.util.Date"));
        setField(term145340, term145340.getClass(), "id", term145341);
        setField(term145340, term145340.getClass(), "environment", "eUXPtGmoNg");
        setField(term145340, term145340.getClass(), "populateEnvironment", "ZjqXyUmAJY");
        setLongField(term145367, term145367.getClass(), "fastTime", 1653925601527L);
        setField(term145367, term145367.getClass(), "cdate", null);
        setField(term145340, term145340.getClass(), "createDate", term145367);
        setLongField(term145369, term145369.getClass(), "fastTime", 1367603522080L);
        setField(term145369, term145369.getClass(), "cdate", null);
        setField(term145340, term145340.getClass(), "updateDate", term145369);
        setLongField(term145371, term145371.getClass(), "fastTime", 1414854822554L);
        setField(term145371, term145371.getClass(), "cdate", null);
        setField(term145340, term145340.getClass(), "startTime", term145371);
        setField(term145340, term145340.getClass(), "status", enum259);
        setField(term145340, term145340.getClass(), "fromClassicAddress", "pjEERkBbYo");
        setField(term145340, term145340.getClass(), "fromSigningPublicKey", "FQPqmjhWog");
        setField(term145340, term145340.getClass(), "fromPrivateKey", "sYtJsiIiSX");
        setField(term145340, term145340.getClass(), "trustlineIssuerClassicAddress", "KgfsAwTFFn");
        setField(term145340, term145340.getClass(), "currencyName", "hFnFlgThhp");
        setField(term145340, term145340.getClass(), "snapshotTrustlineIssuerClassicAddress", "aEZAnHuGSR");
        setField(term145340, term145340.getClass(), "snapshotCurrencyName", "uMzGGnJFYF");
        setField(term145340, term145340.getClass(), "currencyNameForProcess", "iAIRLRjFkP");
        setField(term145340, term145340.getClass(), "amount", "cdXvvxXVTz");
        setField(term145340, term145340.getClass(), "paymentType", enum260);
        setField(term145340, term145340.getClass(), "newTrustlinesOnly", term145507);
        setField(term145340, term145340.getClass(), "useBlacklist", term145509);
        setField(term145340, term145340.getClass(), "maximumTrustlines", term145511);
        setField(term145340, term145340.getClass(), "dropType", enum261);
        setField(term145340, term145340.getClass(), "lockUuid", "tXsfWIqIPn");
        setField(term145340, term145340.getClass(), "failReason", "tDmfqEyHaN");
        setField(term145340, term145340.getClass(), "feesPaid", "mTSMXFkWRr");
        setField(term145340, term145340.getClass(), "minBalance", "qdIiMKwfzT");
        setField(term145340, term145340.getClass(), "maxBalance", "qrmUWIxufo");
        setField(term145340, term145340.getClass(), "maxXrpFeePerTransaction", "SeWCUkXfZv");
        setField(term145340, term145340.getClass(), "retryOfId", term145606);
        setField(term145340, term145340.getClass(), "nftIssuerAddress", "woQcQRYwNH");
        setField(term145340, term145340.getClass(), "nftTaxon", term145620);
        setField(term145340, term145340.getClass(), "contactEmail", "uQjzusifTg");
        setField(term145340, term145340.getClass(), "autoApprove", term145634);
        setField(term145340, term145340.getClass(), "memo", "mOulGkUjOk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPaymentType", argTypes, term145340, args);
    }

};


