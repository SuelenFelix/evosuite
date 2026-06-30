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

public class PaymentRequestEnt_PaymentRequestEntBuilder_snapshotCurrencyName_11375698814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71141;

    public PaymentRequestEnt_PaymentRequestEntBuilder_snapshotCurrencyName_11375698814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term71142 = new Long(1346299551708610248L);
        Class<? extends Object> term71490 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term71489 = ((Class) term71490).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term71489).setAccessible(true);
        Object enum130 = ((Field) term71489).get((Object) null);
        Class<? extends Object> term72014 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term72013 = ((Class) term72014).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term72013).setAccessible(true);
        Object enum131 = ((Field) term72013).get((Object) null);
        Boolean term71316 = new Boolean(false);
        Boolean term71318 = new Boolean(false);
        Integer term71320 = new Integer(1328271830);
        Class<? extends Object> term72412 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term72411 = ((Class) term72412).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term72411).setAccessible(true);
        Object enum132 = ((Field) term72411).get((Object) null);
        Long term71415 = new Long(-7191625829563442696L);
        Long term71429 = new Long(1463379874413441830L);
        Boolean term71443 = new Boolean(false);
        term71141 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term71168 = newInstance(Class.forName("java.util.Date"));
        Object term71170 = newInstance(Class.forName("java.util.Date"));
        Object term71172 = newInstance(Class.forName("java.util.Date"));
        setField(term71141, term71141.getClass(), "id", term71142);
        setField(term71141, term71141.getClass(), "environment", "zyZTzHNjQr");
        setField(term71141, term71141.getClass(), "populateEnvironment", "YSrFKQQwXE");
        setLongField(term71168, term71168.getClass(), "fastTime", 1879103408714L);
        setField(term71168, term71168.getClass(), "cdate", null);
        setField(term71141, term71141.getClass(), "createDate", term71168);
        setLongField(term71170, term71170.getClass(), "fastTime", 1464342312685L);
        setField(term71170, term71170.getClass(), "cdate", null);
        setField(term71141, term71141.getClass(), "updateDate", term71170);
        setLongField(term71172, term71172.getClass(), "fastTime", 1831173948055L);
        setField(term71172, term71172.getClass(), "cdate", null);
        setField(term71141, term71141.getClass(), "startTime", term71172);
        setField(term71141, term71141.getClass(), "status", enum130);
        setField(term71141, term71141.getClass(), "fromClassicAddress", "qxhOsmyyjm");
        setField(term71141, term71141.getClass(), "fromSigningPublicKey", "DuKcNfVVYR");
        setField(term71141, term71141.getClass(), "fromPrivateKey", "fRujHWvXjJ");
        setField(term71141, term71141.getClass(), "trustlineIssuerClassicAddress", "EAIAAStlTz");
        setField(term71141, term71141.getClass(), "currencyName", "yIWXcOQTgy");
        setField(term71141, term71141.getClass(), "snapshotTrustlineIssuerClassicAddress", "xAWekqanqc");
        setField(term71141, term71141.getClass(), "snapshotCurrencyName", "GSOWFHMlbF");
        setField(term71141, term71141.getClass(), "currencyNameForProcess", "vpZIqpFbKM");
        setField(term71141, term71141.getClass(), "amount", "dAbwpJCDif");
        setField(term71141, term71141.getClass(), "paymentType", enum131);
        setField(term71141, term71141.getClass(), "newTrustlinesOnly", term71316);
        setField(term71141, term71141.getClass(), "useBlacklist", term71318);
        setField(term71141, term71141.getClass(), "maximumTrustlines", term71320);
        setField(term71141, term71141.getClass(), "dropType", enum132);
        setField(term71141, term71141.getClass(), "lockUuid", "ATSXJPySio");
        setField(term71141, term71141.getClass(), "failReason", "XZkOUcbfFg");
        setField(term71141, term71141.getClass(), "feesPaid", "TGiJfagfky");
        setField(term71141, term71141.getClass(), "minBalance", "BJklinBmhN");
        setField(term71141, term71141.getClass(), "maxBalance", "IOddzvEWcl");
        setField(term71141, term71141.getClass(), "maxXrpFeePerTransaction", "bIrtpkYJWT");
        setField(term71141, term71141.getClass(), "retryOfId", term71415);
        setField(term71141, term71141.getClass(), "nftIssuerAddress", "VuLLXpvPpZ");
        setField(term71141, term71141.getClass(), "nftTaxon", term71429);
        setField(term71141, term71141.getClass(), "contactEmail", "UEdzEKEEEV");
        setField(term71141, term71141.getClass(), "autoApprove", term71443);
        setField(term71141, term71141.getClass(), "memo", "BcENaQFYSd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "POPYycoDBy";
        callMethod(klass, "snapshotCurrencyName", argTypes, term71141, args);
    }

};


