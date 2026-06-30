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

public class PaymentRequestEnt_getSnapshotTrustlineIssuerClassicAddress_125777486218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138552;

    public PaymentRequestEnt_getSnapshotTrustlineIssuerClassicAddress_125777486218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term138553 = new Long(-6771377873268167033L);
        Class<? extends Object> term138866 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term138865 = ((Class) term138866).getDeclaredField((String) "COMPLETE");
        ((Field) term138865).setAccessible(true);
        Object enum247 = ((Field) term138865).get((Object) null);
        Class<? extends Object> term139372 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term139371 = ((Class) term139372).getDeclaredField((String) "FLAT");
        ((Field) term139371).setAccessible(true);
        Object enum248 = ((Field) term139371).get((Object) null);
        Boolean term138713 = new Boolean(false);
        Boolean term138715 = new Boolean(false);
        Integer term138717 = new Integer(304775596);
        Class<? extends Object> term139746 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term139745 = ((Class) term139746).getDeclaredField((String) "GLOBALID");
        ((Field) term139745).setAccessible(true);
        Object enum249 = ((Field) term139745).get((Object) null);
        Long term138803 = new Long(1278107327214302894L);
        Long term138817 = new Long(3104349415269466587L);
        Boolean term138831 = new Boolean(true);
        term138552 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term138579 = newInstance(Class.forName("java.util.Date"));
        Object term138581 = newInstance(Class.forName("java.util.Date"));
        Object term138583 = newInstance(Class.forName("java.util.Date"));
        setField(term138552, term138552.getClass(), "id", term138553);
        setField(term138552, term138552.getClass(), "environment", "NeTiWVoyjZ");
        setField(term138552, term138552.getClass(), "populateEnvironment", "CGeclMyIOP");
        setLongField(term138579, term138579.getClass(), "fastTime", 1849683117875L);
        setField(term138579, term138579.getClass(), "cdate", null);
        setField(term138552, term138552.getClass(), "createDate", term138579);
        setLongField(term138581, term138581.getClass(), "fastTime", 1646940924790L);
        setField(term138581, term138581.getClass(), "cdate", null);
        setField(term138552, term138552.getClass(), "updateDate", term138581);
        setLongField(term138583, term138583.getClass(), "fastTime", 1820353382770L);
        setField(term138583, term138583.getClass(), "cdate", null);
        setField(term138552, term138552.getClass(), "startTime", term138583);
        setField(term138552, term138552.getClass(), "status", enum247);
        setField(term138552, term138552.getClass(), "fromClassicAddress", "yyWOYvIBsp");
        setField(term138552, term138552.getClass(), "fromSigningPublicKey", "mmpgARMYFV");
        setField(term138552, term138552.getClass(), "fromPrivateKey", "NUqhsZprdZ");
        setField(term138552, term138552.getClass(), "trustlineIssuerClassicAddress", "jkzgCqWJrA");
        setField(term138552, term138552.getClass(), "currencyName", "rawiXxuyRn");
        setField(term138552, term138552.getClass(), "snapshotTrustlineIssuerClassicAddress", "ZyAecZGope");
        setField(term138552, term138552.getClass(), "snapshotCurrencyName", "uYnmxkwLfB");
        setField(term138552, term138552.getClass(), "currencyNameForProcess", "RVZTQxYOUO");
        setField(term138552, term138552.getClass(), "amount", "tydPpKxAbv");
        setField(term138552, term138552.getClass(), "paymentType", enum248);
        setField(term138552, term138552.getClass(), "newTrustlinesOnly", term138713);
        setField(term138552, term138552.getClass(), "useBlacklist", term138715);
        setField(term138552, term138552.getClass(), "maximumTrustlines", term138717);
        setField(term138552, term138552.getClass(), "dropType", enum249);
        setField(term138552, term138552.getClass(), "lockUuid", "CJxQpJUfLJ");
        setField(term138552, term138552.getClass(), "failReason", "NUUjAyqOva");
        setField(term138552, term138552.getClass(), "feesPaid", "EoAMIIUdDX");
        setField(term138552, term138552.getClass(), "minBalance", "OATNwRncsv");
        setField(term138552, term138552.getClass(), "maxBalance", "rACmzcmIPm");
        setField(term138552, term138552.getClass(), "maxXrpFeePerTransaction", "OCtePrLDhe");
        setField(term138552, term138552.getClass(), "retryOfId", term138803);
        setField(term138552, term138552.getClass(), "nftIssuerAddress", "yqEphNxUPZ");
        setField(term138552, term138552.getClass(), "nftTaxon", term138817);
        setField(term138552, term138552.getClass(), "contactEmail", "mJJxTuZuKO");
        setField(term138552, term138552.getClass(), "autoApprove", term138831);
        setField(term138552, term138552.getClass(), "memo", "anSZCikKpS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSnapshotTrustlineIssuerClassicAddress", argTypes, term138552, args);
    }

};


