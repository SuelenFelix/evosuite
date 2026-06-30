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

public class PaymentRequestEnt_getStartTime_182778141511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126534;

    public PaymentRequestEnt_getStartTime_182778141511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term126535 = new Long(-7283193381993602128L);
        Class<? extends Object> term126865 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term126864 = ((Class) term126865).getDeclaredField((String) "COMPLETE");
        ((Field) term126864).setAccessible(true);
        Object enum226 = ((Field) term126864).get((Object) null);
        Class<? extends Object> term127371 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term127370 = ((Class) term127371).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term127370).setAccessible(true);
        Object enum227 = ((Field) term127370).get((Object) null);
        Boolean term126703 = new Boolean(true);
        Boolean term126705 = new Boolean(true);
        Integer term126707 = new Integer(-505439934);
        Class<? extends Object> term127769 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term127768 = ((Class) term127769).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term127768).setAccessible(true);
        Object enum228 = ((Field) term127768).get((Object) null);
        Long term126802 = new Long(6351887424140565471L);
        Long term126816 = new Long(6273670659288205855L);
        Boolean term126830 = new Boolean(true);
        term126534 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term126561 = newInstance(Class.forName("java.util.Date"));
        Object term126563 = newInstance(Class.forName("java.util.Date"));
        Object term126565 = newInstance(Class.forName("java.util.Date"));
        setField(term126534, term126534.getClass(), "id", term126535);
        setField(term126534, term126534.getClass(), "environment", "QZfhwDBzyR");
        setField(term126534, term126534.getClass(), "populateEnvironment", "HvnMmAOZev");
        setLongField(term126561, term126561.getClass(), "fastTime", 1770196770908L);
        setField(term126561, term126561.getClass(), "cdate", null);
        setField(term126534, term126534.getClass(), "createDate", term126561);
        setLongField(term126563, term126563.getClass(), "fastTime", 1367935077317L);
        setField(term126563, term126563.getClass(), "cdate", null);
        setField(term126534, term126534.getClass(), "updateDate", term126563);
        setLongField(term126565, term126565.getClass(), "fastTime", 1875231796050L);
        setField(term126565, term126565.getClass(), "cdate", null);
        setField(term126534, term126534.getClass(), "startTime", term126565);
        setField(term126534, term126534.getClass(), "status", enum226);
        setField(term126534, term126534.getClass(), "fromClassicAddress", "JTPAQsfRtT");
        setField(term126534, term126534.getClass(), "fromSigningPublicKey", "otxkkKfDfl");
        setField(term126534, term126534.getClass(), "fromPrivateKey", "bqIuFFFwnP");
        setField(term126534, term126534.getClass(), "trustlineIssuerClassicAddress", "hDxvvVgGlk");
        setField(term126534, term126534.getClass(), "currencyName", "XdjSvjaTqk");
        setField(term126534, term126534.getClass(), "snapshotTrustlineIssuerClassicAddress", "ukrlYVcvsg");
        setField(term126534, term126534.getClass(), "snapshotCurrencyName", "cpjqTCNflQ");
        setField(term126534, term126534.getClass(), "currencyNameForProcess", "wiYGATEfmw");
        setField(term126534, term126534.getClass(), "amount", "FiALSqneIg");
        setField(term126534, term126534.getClass(), "paymentType", enum227);
        setField(term126534, term126534.getClass(), "newTrustlinesOnly", term126703);
        setField(term126534, term126534.getClass(), "useBlacklist", term126705);
        setField(term126534, term126534.getClass(), "maximumTrustlines", term126707);
        setField(term126534, term126534.getClass(), "dropType", enum228);
        setField(term126534, term126534.getClass(), "lockUuid", "lGVACSQceQ");
        setField(term126534, term126534.getClass(), "failReason", "jpgWRbSvyQ");
        setField(term126534, term126534.getClass(), "feesPaid", "tFMlYmPEBX");
        setField(term126534, term126534.getClass(), "minBalance", "ljkZxGNgjZ");
        setField(term126534, term126534.getClass(), "maxBalance", "hrFtgdcZKS");
        setField(term126534, term126534.getClass(), "maxXrpFeePerTransaction", "ZhZJvpPaTU");
        setField(term126534, term126534.getClass(), "retryOfId", term126802);
        setField(term126534, term126534.getClass(), "nftIssuerAddress", "NZwUsJxDLI");
        setField(term126534, term126534.getClass(), "nftTaxon", term126816);
        setField(term126534, term126534.getClass(), "contactEmail", "wlusYBOfXW");
        setField(term126534, term126534.getClass(), "autoApprove", term126830);
        setField(term126534, term126534.getClass(), "memo", "HEWWLhfKIa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartTime", argTypes, term126534, args);
    }

};


