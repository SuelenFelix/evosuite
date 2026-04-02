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

public class PaymentRequestEnt_getNewTrustlinesOnly_52813752123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147054;

    public PaymentRequestEnt_getNewTrustlinesOnly_52813752123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term147055 = new Long(-1449569009562240465L);
        Class<? extends Object> term147381 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term147380 = ((Class) term147381).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term147380).setAccessible(true);
        Object enum262 = ((Field) term147380).get((Object) null);
        Class<? extends Object> term147923 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term147922 = ((Class) term147923).getDeclaredField((String) "FLAT");
        ((Field) term147922).setAccessible(true);
        Object enum263 = ((Field) term147922).get((Object) null);
        Boolean term147227 = new Boolean(false);
        Boolean term147229 = new Boolean(true);
        Integer term147231 = new Integer(-268815336);
        Class<? extends Object> term148297 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term148296 = ((Class) term148297).getDeclaredField((String) "TRUSTLINE");
        ((Field) term148296).setAccessible(true);
        Object enum264 = ((Field) term148296).get((Object) null);
        Long term147318 = new Long(2287449183416662404L);
        Long term147332 = new Long(-1223573843683081410L);
        Boolean term147346 = new Boolean(true);
        term147054 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term147081 = newInstance(Class.forName("java.util.Date"));
        Object term147083 = newInstance(Class.forName("java.util.Date"));
        Object term147085 = newInstance(Class.forName("java.util.Date"));
        setField(term147054, term147054.getClass(), "id", term147055);
        setField(term147054, term147054.getClass(), "environment", "hNWRuNEgOf");
        setField(term147054, term147054.getClass(), "populateEnvironment", "CEtjGBplmv");
        setLongField(term147081, term147081.getClass(), "fastTime", 1878671485848L);
        setField(term147081, term147081.getClass(), "cdate", null);
        setField(term147054, term147054.getClass(), "createDate", term147081);
        setLongField(term147083, term147083.getClass(), "fastTime", 1472742328615L);
        setField(term147083, term147083.getClass(), "cdate", null);
        setField(term147054, term147054.getClass(), "updateDate", term147083);
        setLongField(term147085, term147085.getClass(), "fastTime", 1761728693407L);
        setField(term147085, term147085.getClass(), "cdate", null);
        setField(term147054, term147054.getClass(), "startTime", term147085);
        setField(term147054, term147054.getClass(), "status", enum262);
        setField(term147054, term147054.getClass(), "fromClassicAddress", "XosDTAzIAT");
        setField(term147054, term147054.getClass(), "fromSigningPublicKey", "lcCEhCpiZM");
        setField(term147054, term147054.getClass(), "fromPrivateKey", "OPJlqMJxdq");
        setField(term147054, term147054.getClass(), "trustlineIssuerClassicAddress", "COhzwXcfds");
        setField(term147054, term147054.getClass(), "currencyName", "anncJTnzrg");
        setField(term147054, term147054.getClass(), "snapshotTrustlineIssuerClassicAddress", "GMylOocLnB");
        setField(term147054, term147054.getClass(), "snapshotCurrencyName", "spOehuHwSl");
        setField(term147054, term147054.getClass(), "currencyNameForProcess", "cyobgydTWP");
        setField(term147054, term147054.getClass(), "amount", "moHYQFfLnp");
        setField(term147054, term147054.getClass(), "paymentType", enum263);
        setField(term147054, term147054.getClass(), "newTrustlinesOnly", term147227);
        setField(term147054, term147054.getClass(), "useBlacklist", term147229);
        setField(term147054, term147054.getClass(), "maximumTrustlines", term147231);
        setField(term147054, term147054.getClass(), "dropType", enum264);
        setField(term147054, term147054.getClass(), "lockUuid", "BrPqlvIbEQ");
        setField(term147054, term147054.getClass(), "failReason", "JDTrhGRsDT");
        setField(term147054, term147054.getClass(), "feesPaid", "vHxsVQImjS");
        setField(term147054, term147054.getClass(), "minBalance", "jkVaRrZHQX");
        setField(term147054, term147054.getClass(), "maxBalance", "gSFFUuJipG");
        setField(term147054, term147054.getClass(), "maxXrpFeePerTransaction", "bQWfIFvxkQ");
        setField(term147054, term147054.getClass(), "retryOfId", term147318);
        setField(term147054, term147054.getClass(), "nftIssuerAddress", "aDoBLXfFQI");
        setField(term147054, term147054.getClass(), "nftTaxon", term147332);
        setField(term147054, term147054.getClass(), "contactEmail", "HTimNhSNVi");
        setField(term147054, term147054.getClass(), "autoApprove", term147346);
        setField(term147054, term147054.getClass(), "memo", "IWJWbrHcqm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNewTrustlinesOnly", argTypes, term147054, args);
    }

};


