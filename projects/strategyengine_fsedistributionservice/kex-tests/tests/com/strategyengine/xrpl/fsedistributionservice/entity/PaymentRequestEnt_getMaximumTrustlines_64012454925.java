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

public class PaymentRequestEnt_getMaximumTrustlines_64012454925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150414;

    public PaymentRequestEnt_getMaximumTrustlines_64012454925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term150415 = new Long(-3753621038448351550L);
        Class<? extends Object> term150731 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term150730 = ((Class) term150731).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term150730).setAccessible(true);
        Object enum268 = ((Field) term150730).get((Object) null);
        Class<? extends Object> term151246 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term151245 = ((Class) term151246).getDeclaredField((String) "FLAT");
        ((Field) term151245).setAccessible(true);
        Object enum269 = ((Field) term151245).get((Object) null);
        Boolean term150578 = new Boolean(false);
        Boolean term150580 = new Boolean(true);
        Integer term150582 = new Integer(-663691365);
        Class<? extends Object> term151620 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term151619 = ((Class) term151620).getDeclaredField((String) "GLOBALID");
        ((Field) term151619).setAccessible(true);
        Object enum270 = ((Field) term151619).get((Object) null);
        Long term150668 = new Long(5304481534735378567L);
        Long term150682 = new Long(3423155413133381764L);
        Boolean term150696 = new Boolean(false);
        term150414 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term150441 = newInstance(Class.forName("java.util.Date"));
        Object term150443 = newInstance(Class.forName("java.util.Date"));
        Object term150445 = newInstance(Class.forName("java.util.Date"));
        setField(term150414, term150414.getClass(), "id", term150415);
        setField(term150414, term150414.getClass(), "environment", "ceGAKcClsG");
        setField(term150414, term150414.getClass(), "populateEnvironment", "SEldZGJyvX");
        setLongField(term150441, term150441.getClass(), "fastTime", 1688138498192L);
        setField(term150441, term150441.getClass(), "cdate", null);
        setField(term150414, term150414.getClass(), "createDate", term150441);
        setLongField(term150443, term150443.getClass(), "fastTime", 1321873654655L);
        setField(term150443, term150443.getClass(), "cdate", null);
        setField(term150414, term150414.getClass(), "updateDate", term150443);
        setLongField(term150445, term150445.getClass(), "fastTime", 1381141895666L);
        setField(term150445, term150445.getClass(), "cdate", null);
        setField(term150414, term150414.getClass(), "startTime", term150445);
        setField(term150414, term150414.getClass(), "status", enum268);
        setField(term150414, term150414.getClass(), "fromClassicAddress", "vyvpqcHTQN");
        setField(term150414, term150414.getClass(), "fromSigningPublicKey", "QQcpNMSHvA");
        setField(term150414, term150414.getClass(), "fromPrivateKey", "FLLklaMZvg");
        setField(term150414, term150414.getClass(), "trustlineIssuerClassicAddress", "jRDZpkFkoD");
        setField(term150414, term150414.getClass(), "currencyName", "wwSknqIBIO");
        setField(term150414, term150414.getClass(), "snapshotTrustlineIssuerClassicAddress", "zQPAxUFaeX");
        setField(term150414, term150414.getClass(), "snapshotCurrencyName", "cKNHUkrYfK");
        setField(term150414, term150414.getClass(), "currencyNameForProcess", "crMeWqJOCQ");
        setField(term150414, term150414.getClass(), "amount", "VUVgiQvSYa");
        setField(term150414, term150414.getClass(), "paymentType", enum269);
        setField(term150414, term150414.getClass(), "newTrustlinesOnly", term150578);
        setField(term150414, term150414.getClass(), "useBlacklist", term150580);
        setField(term150414, term150414.getClass(), "maximumTrustlines", term150582);
        setField(term150414, term150414.getClass(), "dropType", enum270);
        setField(term150414, term150414.getClass(), "lockUuid", "sEGgJJplmE");
        setField(term150414, term150414.getClass(), "failReason", "jyexiarswN");
        setField(term150414, term150414.getClass(), "feesPaid", "ZBLFNFVEHD");
        setField(term150414, term150414.getClass(), "minBalance", "miNxpUfOyL");
        setField(term150414, term150414.getClass(), "maxBalance", "BAPTojeHRU");
        setField(term150414, term150414.getClass(), "maxXrpFeePerTransaction", "uqDEIRoVVf");
        setField(term150414, term150414.getClass(), "retryOfId", term150668);
        setField(term150414, term150414.getClass(), "nftIssuerAddress", "HnLeZhnLzz");
        setField(term150414, term150414.getClass(), "nftTaxon", term150682);
        setField(term150414, term150414.getClass(), "contactEmail", "ziYEsRkZmD");
        setField(term150414, term150414.getClass(), "autoApprove", term150696);
        setField(term150414, term150414.getClass(), "memo", "RFbJNwiLtv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaximumTrustlines", argTypes, term150414, args);
    }

};


