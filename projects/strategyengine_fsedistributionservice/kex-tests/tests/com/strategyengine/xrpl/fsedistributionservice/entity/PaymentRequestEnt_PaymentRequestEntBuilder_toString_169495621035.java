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

public class PaymentRequestEnt_PaymentRequestEntBuilder_toString_169495621035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107607;

    public PaymentRequestEnt_PaymentRequestEntBuilder_toString_169495621035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term107608 = new Long(-6001151456088965547L);
        Class<? extends Object> term107945 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term107944 = ((Class) term107945).getDeclaredField((String) "QUEUED");
        ((Field) term107944).setAccessible(true);
        Object enum193 = ((Field) term107944).get((Object) null);
        Class<? extends Object> term108445 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term108444 = ((Class) term108445).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term108444).setAccessible(true);
        Object enum194 = ((Field) term108444).get((Object) null);
        Boolean term107774 = new Boolean(true);
        Boolean term107776 = new Boolean(true);
        Integer term107778 = new Integer(1655935355);
        Class<? extends Object> term108843 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term108842 = ((Class) term108843).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term108842).setAccessible(true);
        Object enum195 = ((Field) term108842).get((Object) null);
        Long term107882 = new Long(1740732617708040141L);
        Long term107896 = new Long(3472971833455746664L);
        Boolean term107910 = new Boolean(false);
        term107607 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term107634 = newInstance(Class.forName("java.util.Date"));
        Object term107636 = newInstance(Class.forName("java.util.Date"));
        Object term107638 = newInstance(Class.forName("java.util.Date"));
        setField(term107607, term107607.getClass(), "id", term107608);
        setField(term107607, term107607.getClass(), "environment", "cjaaJUnNCR");
        setField(term107607, term107607.getClass(), "populateEnvironment", "ETbxNuJLii");
        setLongField(term107634, term107634.getClass(), "fastTime", 1713532939227L);
        setField(term107634, term107634.getClass(), "cdate", null);
        setField(term107607, term107607.getClass(), "createDate", term107634);
        setLongField(term107636, term107636.getClass(), "fastTime", 1263138252859L);
        setField(term107636, term107636.getClass(), "cdate", null);
        setField(term107607, term107607.getClass(), "updateDate", term107636);
        setLongField(term107638, term107638.getClass(), "fastTime", 1603415189333L);
        setField(term107638, term107638.getClass(), "cdate", null);
        setField(term107607, term107607.getClass(), "startTime", term107638);
        setField(term107607, term107607.getClass(), "status", enum193);
        setField(term107607, term107607.getClass(), "fromClassicAddress", "YJhnPtWtJR");
        setField(term107607, term107607.getClass(), "fromSigningPublicKey", "xzGnrvbExX");
        setField(term107607, term107607.getClass(), "fromPrivateKey", "LFZNDELxUZ");
        setField(term107607, term107607.getClass(), "trustlineIssuerClassicAddress", "GNIVsSTglt");
        setField(term107607, term107607.getClass(), "currencyName", "mzPebFiUSP");
        setField(term107607, term107607.getClass(), "snapshotTrustlineIssuerClassicAddress", "HvbkjsQyDy");
        setField(term107607, term107607.getClass(), "snapshotCurrencyName", "wzSukELQFL");
        setField(term107607, term107607.getClass(), "currencyNameForProcess", "VZyeaOWYEj");
        setField(term107607, term107607.getClass(), "amount", "PErxMBQSUv");
        setField(term107607, term107607.getClass(), "paymentType", enum194);
        setField(term107607, term107607.getClass(), "newTrustlinesOnly", term107774);
        setField(term107607, term107607.getClass(), "useBlacklist", term107776);
        setField(term107607, term107607.getClass(), "maximumTrustlines", term107778);
        setField(term107607, term107607.getClass(), "dropType", enum195);
        setField(term107607, term107607.getClass(), "lockUuid", "KZQwbvujui");
        setField(term107607, term107607.getClass(), "failReason", "JPUZuGxKlI");
        setField(term107607, term107607.getClass(), "feesPaid", "xqIbVsUspl");
        setField(term107607, term107607.getClass(), "minBalance", "GnjLRtJywq");
        setField(term107607, term107607.getClass(), "maxBalance", "TDaodpHTRK");
        setField(term107607, term107607.getClass(), "maxXrpFeePerTransaction", "JayazbYDLK");
        setField(term107607, term107607.getClass(), "retryOfId", term107882);
        setField(term107607, term107607.getClass(), "nftIssuerAddress", "ORDuSTrpNA");
        setField(term107607, term107607.getClass(), "nftTaxon", term107896);
        setField(term107607, term107607.getClass(), "contactEmail", "hysThIPoEJ");
        setField(term107607, term107607.getClass(), "autoApprove", term107910);
        setField(term107607, term107607.getClass(), "memo", "dfZepHfGwh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term107607, args);
    }

};


