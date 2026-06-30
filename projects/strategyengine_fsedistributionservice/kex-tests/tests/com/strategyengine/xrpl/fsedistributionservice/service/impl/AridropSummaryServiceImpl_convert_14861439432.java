package com.strategyengine.xrpl.fsedistributionservice.service.impl;

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
import static com.strategyengine.xrpl.fsedistributionservice.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;

public class AridropSummaryServiceImpl_convert_14861439432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public AridropSummaryServiceImpl_convert_14861439432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24 = new Long(2442117782898005296L);
        Class<? extends Object> term442 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term441 = ((Class) term442).getDeclaredField((String) "COMPLETE");
        ((Field) term441).setAccessible(true);
        Object enum0 = ((Field) term441).get((Object) null);
        Class<? extends Object> term972 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term971 = ((Class) term972).getDeclaredField((String) "FLAT");
        ((Field) term971).setAccessible(true);
        Object enum1 = ((Field) term971).get((Object) null);
        Boolean term184 = new Boolean(false);
        Boolean term186 = new Boolean(false);
        Integer term188 = new Integer(568599855);
        Class<? extends Object> term1422 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term1421 = ((Class) term1422).getDeclaredField((String) "TRUSTLINE");
        ((Field) term1421).setAccessible(true);
        Object enum2 = ((Field) term1421).get((Object) null);
        Long term275 = new Long(6375119433582206027L);
        Long term289 = new Long(-8257434502486459194L);
        Boolean term303 = new Boolean(false);
        term23 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term50 = newInstance(Class.forName("java.util.Date"));
        Object term52 = newInstance(Class.forName("java.util.Date"));
        Object term54 = newInstance(Class.forName("java.util.Date"));
        setField(term23, term23.getClass(), "id", term24);
        setField(term23, term23.getClass(), "environment", "sjlJAEtRrb");
        setField(term23, term23.getClass(), "populateEnvironment", "MuLcgQHgqz");
        setLongField(term50, term50.getClass(), "fastTime", 1345871412244L);
        setField(term50, term50.getClass(), "cdate", null);
        setField(term23, term23.getClass(), "createDate", term50);
        setLongField(term52, term52.getClass(), "fastTime", 1480438351369L);
        setField(term52, term52.getClass(), "cdate", null);
        setField(term23, term23.getClass(), "updateDate", term52);
        setLongField(term54, term54.getClass(), "fastTime", 1610940182830L);
        setField(term54, term54.getClass(), "cdate", null);
        setField(term23, term23.getClass(), "startTime", term54);
        setField(term23, term23.getClass(), "status", enum0);
        setField(term23, term23.getClass(), "fromClassicAddress", "xxtlPwDYFs");
        setField(term23, term23.getClass(), "fromSigningPublicKey", "jJCZpVmanW");
        setField(term23, term23.getClass(), "fromPrivateKey", "EGtDIRbSSb");
        setField(term23, term23.getClass(), "trustlineIssuerClassicAddress", "SzjVpOQTyS");
        setField(term23, term23.getClass(), "currencyName", "MjGYSRKTNF");
        setField(term23, term23.getClass(), "snapshotTrustlineIssuerClassicAddress", "hRNSzYYIrc");
        setField(term23, term23.getClass(), "snapshotCurrencyName", "RMFIsYGgne");
        setField(term23, term23.getClass(), "currencyNameForProcess", "NRdvgJlhkX");
        setField(term23, term23.getClass(), "amount", "uuaPigETmJ");
        setField(term23, term23.getClass(), "paymentType", enum1);
        setField(term23, term23.getClass(), "newTrustlinesOnly", term184);
        setField(term23, term23.getClass(), "useBlacklist", term186);
        setField(term23, term23.getClass(), "maximumTrustlines", term188);
        setField(term23, term23.getClass(), "dropType", enum2);
        setField(term23, term23.getClass(), "lockUuid", "MxlszYVzRf");
        setField(term23, term23.getClass(), "failReason", "LQFpaHEwXR");
        setField(term23, term23.getClass(), "feesPaid", "oVcInYnLWB");
        setField(term23, term23.getClass(), "minBalance", "aJlieCFVtF");
        setField(term23, term23.getClass(), "maxBalance", "ZiaGIbnzTs");
        setField(term23, term23.getClass(), "maxXrpFeePerTransaction", "tbcdzjIfER");
        setField(term23, term23.getClass(), "retryOfId", term275);
        setField(term23, term23.getClass(), "nftIssuerAddress", "HyxfbSQYBe");
        setField(term23, term23.getClass(), "nftTaxon", term289);
        setField(term23, term23.getClass(), "contactEmail", "pCTimMblYc");
        setField(term23, term23.getClass(), "autoApprove", term303);
        setField(term23, term23.getClass(), "memo", "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.AridropSummaryServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Object[] args = new Object[1];
        args[0] = term23;
        callMethod(klass, "convert", argTypes, null, args);
    }

};


