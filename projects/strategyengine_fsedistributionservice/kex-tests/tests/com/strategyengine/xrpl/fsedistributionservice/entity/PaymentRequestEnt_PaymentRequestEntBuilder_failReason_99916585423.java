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

public class PaymentRequestEnt_PaymentRequestEntBuilder_failReason_99916585423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86725;

    public PaymentRequestEnt_PaymentRequestEntBuilder_failReason_99916585423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term86726 = new Long(-2463629530824341661L);
        Class<? extends Object> term87080 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term87079 = ((Class) term87080).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term87079).setAccessible(true);
        Object enum157 = ((Field) term87079).get((Object) null);
        Class<? extends Object> term87622 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term87621 = ((Class) term87622).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term87621).setAccessible(true);
        Object enum158 = ((Field) term87621).get((Object) null);
        Boolean term86906 = new Boolean(true);
        Boolean term86908 = new Boolean(false);
        Integer term86910 = new Integer(933028652);
        Class<? extends Object> term88020 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term88019 = ((Class) term88020).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term88019).setAccessible(true);
        Object enum159 = ((Field) term88019).get((Object) null);
        Long term87005 = new Long(7800835025296877231L);
        Long term87019 = new Long(-187772971269812453L);
        Boolean term87033 = new Boolean(false);
        term86725 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term86752 = newInstance(Class.forName("java.util.Date"));
        Object term86754 = newInstance(Class.forName("java.util.Date"));
        Object term86756 = newInstance(Class.forName("java.util.Date"));
        setField(term86725, term86725.getClass(), "id", term86726);
        setField(term86725, term86725.getClass(), "environment", "tlRvilQyjJ");
        setField(term86725, term86725.getClass(), "populateEnvironment", "gwTUlYNpjM");
        setLongField(term86752, term86752.getClass(), "fastTime", 1891157798466L);
        setField(term86752, term86752.getClass(), "cdate", null);
        setField(term86725, term86725.getClass(), "createDate", term86752);
        setLongField(term86754, term86754.getClass(), "fastTime", 1460978610142L);
        setField(term86754, term86754.getClass(), "cdate", null);
        setField(term86725, term86725.getClass(), "updateDate", term86754);
        setLongField(term86756, term86756.getClass(), "fastTime", 1418905725858L);
        setField(term86756, term86756.getClass(), "cdate", null);
        setField(term86725, term86725.getClass(), "startTime", term86756);
        setField(term86725, term86725.getClass(), "status", enum157);
        setField(term86725, term86725.getClass(), "fromClassicAddress", "uXYojRmxrM");
        setField(term86725, term86725.getClass(), "fromSigningPublicKey", "cxRwRcodud");
        setField(term86725, term86725.getClass(), "fromPrivateKey", "GDGBPlYeLn");
        setField(term86725, term86725.getClass(), "trustlineIssuerClassicAddress", "jdQANIXSTq");
        setField(term86725, term86725.getClass(), "currencyName", "stVcZLTNpu");
        setField(term86725, term86725.getClass(), "snapshotTrustlineIssuerClassicAddress", "LgXdqWrsLL");
        setField(term86725, term86725.getClass(), "snapshotCurrencyName", "bbHWyibNmy");
        setField(term86725, term86725.getClass(), "currencyNameForProcess", "vYYOYhWMWZ");
        setField(term86725, term86725.getClass(), "amount", "FLQJOzEXff");
        setField(term86725, term86725.getClass(), "paymentType", enum158);
        setField(term86725, term86725.getClass(), "newTrustlinesOnly", term86906);
        setField(term86725, term86725.getClass(), "useBlacklist", term86908);
        setField(term86725, term86725.getClass(), "maximumTrustlines", term86910);
        setField(term86725, term86725.getClass(), "dropType", enum159);
        setField(term86725, term86725.getClass(), "lockUuid", "qlaIVJBSfQ");
        setField(term86725, term86725.getClass(), "failReason", "lYvIWBFFsq");
        setField(term86725, term86725.getClass(), "feesPaid", "tThwsqWKcE");
        setField(term86725, term86725.getClass(), "minBalance", "bkSgsDrkCN");
        setField(term86725, term86725.getClass(), "maxBalance", "hwjlcimgJH");
        setField(term86725, term86725.getClass(), "maxXrpFeePerTransaction", "TLxQzxvizR");
        setField(term86725, term86725.getClass(), "retryOfId", term87005);
        setField(term86725, term86725.getClass(), "nftIssuerAddress", "uUgJfKAzDM");
        setField(term86725, term86725.getClass(), "nftTaxon", term87019);
        setField(term86725, term86725.getClass(), "contactEmail", "gZPZNkweEp");
        setField(term86725, term86725.getClass(), "autoApprove", term87033);
        setField(term86725, term86725.getClass(), "memo", "vfennwtmqe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zZxoNkohbw";
        callMethod(klass, "failReason", argTypes, term86725, args);
    }

};


