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

public class PaymentRequestEnt_PaymentRequestEntBuilder_createDate_19822214434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53715;
     Object term54015;

    public PaymentRequestEnt_PaymentRequestEntBuilder_createDate_19822214434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term53716 = new Long(8000844860910174690L);
        Class<? extends Object> term54038 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term54037 = ((Class) term54038).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term54037).setAccessible(true);
        Object enum100 = ((Field) term54037).get((Object) null);
        Class<? extends Object> term54562 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term54561 = ((Class) term54562).getDeclaredField((String) "FLAT");
        ((Field) term54561).setAccessible(true);
        Object enum101 = ((Field) term54561).get((Object) null);
        Boolean term53882 = new Boolean(true);
        Boolean term53884 = new Boolean(false);
        Integer term53886 = new Integer(-14890619);
        Class<? extends Object> term54936 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term54935 = ((Class) term54936).getDeclaredField((String) "TRUSTLINE");
        ((Field) term54935).setAccessible(true);
        Object enum102 = ((Field) term54935).get((Object) null);
        Long term53973 = new Long(2209808079059619773L);
        Long term53987 = new Long(8403492202041709902L);
        Boolean term54001 = new Boolean(true);
        term53715 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term53742 = newInstance(Class.forName("java.util.Date"));
        Object term53744 = newInstance(Class.forName("java.util.Date"));
        Object term53746 = newInstance(Class.forName("java.util.Date"));
        setField(term53715, term53715.getClass(), "id", term53716);
        setField(term53715, term53715.getClass(), "environment", "gPzGDOEPPw");
        setField(term53715, term53715.getClass(), "populateEnvironment", "rwKoAngzCu");
        setLongField(term53742, term53742.getClass(), "fastTime", 1491501240125L);
        setField(term53742, term53742.getClass(), "cdate", null);
        setField(term53715, term53715.getClass(), "createDate", term53742);
        setLongField(term53744, term53744.getClass(), "fastTime", 1608545223416L);
        setField(term53744, term53744.getClass(), "cdate", null);
        setField(term53715, term53715.getClass(), "updateDate", term53744);
        setLongField(term53746, term53746.getClass(), "fastTime", 1878650382291L);
        setField(term53746, term53746.getClass(), "cdate", null);
        setField(term53715, term53715.getClass(), "startTime", term53746);
        setField(term53715, term53715.getClass(), "status", enum100);
        setField(term53715, term53715.getClass(), "fromClassicAddress", "VUkRVwROTl");
        setField(term53715, term53715.getClass(), "fromSigningPublicKey", "UDlkdccCRn");
        setField(term53715, term53715.getClass(), "fromPrivateKey", "McpzErOcYb");
        setField(term53715, term53715.getClass(), "trustlineIssuerClassicAddress", "jqrVEUvYEz");
        setField(term53715, term53715.getClass(), "currencyName", "QITgiBrmfj");
        setField(term53715, term53715.getClass(), "snapshotTrustlineIssuerClassicAddress", "pXxkiXgQnq");
        setField(term53715, term53715.getClass(), "snapshotCurrencyName", "tKmrUDURku");
        setField(term53715, term53715.getClass(), "currencyNameForProcess", "JeZbrwZmsP");
        setField(term53715, term53715.getClass(), "amount", "bxyfeicqrK");
        setField(term53715, term53715.getClass(), "paymentType", enum101);
        setField(term53715, term53715.getClass(), "newTrustlinesOnly", term53882);
        setField(term53715, term53715.getClass(), "useBlacklist", term53884);
        setField(term53715, term53715.getClass(), "maximumTrustlines", term53886);
        setField(term53715, term53715.getClass(), "dropType", enum102);
        setField(term53715, term53715.getClass(), "lockUuid", "vBnWPlsZMk");
        setField(term53715, term53715.getClass(), "failReason", "fIZsWucfXz");
        setField(term53715, term53715.getClass(), "feesPaid", "IApvtmfhnq");
        setField(term53715, term53715.getClass(), "minBalance", "VSaNnhMpRc");
        setField(term53715, term53715.getClass(), "maxBalance", "QNjNTLlUaV");
        setField(term53715, term53715.getClass(), "maxXrpFeePerTransaction", "hIYsRyOZxk");
        setField(term53715, term53715.getClass(), "retryOfId", term53973);
        setField(term53715, term53715.getClass(), "nftIssuerAddress", "RjNoEywJbC");
        setField(term53715, term53715.getClass(), "nftTaxon", term53987);
        setField(term53715, term53715.getClass(), "contactEmail", "RTTvrwwhou");
        setField(term53715, term53715.getClass(), "autoApprove", term54001);
        setField(term53715, term53715.getClass(), "memo", "lRORwXipuk");
        term54015 = newInstance(Class.forName("java.util.Date"));
        setLongField(term54015, term54015.getClass(), "fastTime", 1841966960256L);
        setField(term54015, term54015.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term54015;
        callMethod(klass, "createDate", argTypes, term53715, args);
    }

};


