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

public class PaymentRequestEnt_getRetryOfId_167061438033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164058;

    public PaymentRequestEnt_getRetryOfId_167061438033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term164059 = new Long(-599981502351912419L);
        Class<? extends Object> term164389 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term164388 = ((Class) term164389).getDeclaredField((String) "REJECTED");
        ((Field) term164388).setAccessible(true);
        Object enum292 = ((Field) term164388).get((Object) null);
        Class<? extends Object> term164895 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term164894 = ((Class) term164895).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term164894).setAccessible(true);
        Object enum293 = ((Field) term164894).get((Object) null);
        Boolean term164227 = new Boolean(true);
        Boolean term164229 = new Boolean(true);
        Integer term164231 = new Integer(890669485);
        Class<? extends Object> term165293 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term165292 = ((Class) term165293).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term165292).setAccessible(true);
        Object enum294 = ((Field) term165292).get((Object) null);
        Long term164326 = new Long(8171709541116491249L);
        Long term164340 = new Long(1867943942587005261L);
        Boolean term164354 = new Boolean(true);
        term164058 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term164085 = newInstance(Class.forName("java.util.Date"));
        Object term164087 = newInstance(Class.forName("java.util.Date"));
        Object term164089 = newInstance(Class.forName("java.util.Date"));
        setField(term164058, term164058.getClass(), "id", term164059);
        setField(term164058, term164058.getClass(), "environment", "qdErlZeTVv");
        setField(term164058, term164058.getClass(), "populateEnvironment", "OCCDQbndDE");
        setLongField(term164085, term164085.getClass(), "fastTime", 1538543965322L);
        setField(term164085, term164085.getClass(), "cdate", null);
        setField(term164058, term164058.getClass(), "createDate", term164085);
        setLongField(term164087, term164087.getClass(), "fastTime", 1609347865216L);
        setField(term164087, term164087.getClass(), "cdate", null);
        setField(term164058, term164058.getClass(), "updateDate", term164087);
        setLongField(term164089, term164089.getClass(), "fastTime", 1496822235349L);
        setField(term164089, term164089.getClass(), "cdate", null);
        setField(term164058, term164058.getClass(), "startTime", term164089);
        setField(term164058, term164058.getClass(), "status", enum292);
        setField(term164058, term164058.getClass(), "fromClassicAddress", "NMANMKfctU");
        setField(term164058, term164058.getClass(), "fromSigningPublicKey", "mQsaqUltLU");
        setField(term164058, term164058.getClass(), "fromPrivateKey", "jwENwZiGlR");
        setField(term164058, term164058.getClass(), "trustlineIssuerClassicAddress", "rfFHGPcfpz");
        setField(term164058, term164058.getClass(), "currencyName", "fViQeyMrrL");
        setField(term164058, term164058.getClass(), "snapshotTrustlineIssuerClassicAddress", "zzeaToyLmI");
        setField(term164058, term164058.getClass(), "snapshotCurrencyName", "sKYWhmRMLx");
        setField(term164058, term164058.getClass(), "currencyNameForProcess", "SOJpgWUZCf");
        setField(term164058, term164058.getClass(), "amount", "jgywFOzBDw");
        setField(term164058, term164058.getClass(), "paymentType", enum293);
        setField(term164058, term164058.getClass(), "newTrustlinesOnly", term164227);
        setField(term164058, term164058.getClass(), "useBlacklist", term164229);
        setField(term164058, term164058.getClass(), "maximumTrustlines", term164231);
        setField(term164058, term164058.getClass(), "dropType", enum294);
        setField(term164058, term164058.getClass(), "lockUuid", "yKIXLtCWYi");
        setField(term164058, term164058.getClass(), "failReason", "EhuyRKrUJu");
        setField(term164058, term164058.getClass(), "feesPaid", "UlBxuoBXcJ");
        setField(term164058, term164058.getClass(), "minBalance", "PqduvNFXXw");
        setField(term164058, term164058.getClass(), "maxBalance", "bMQrxvaBAI");
        setField(term164058, term164058.getClass(), "maxXrpFeePerTransaction", "StFtysZlWm");
        setField(term164058, term164058.getClass(), "retryOfId", term164326);
        setField(term164058, term164058.getClass(), "nftIssuerAddress", "CoqUcmjnkF");
        setField(term164058, term164058.getClass(), "nftTaxon", term164340);
        setField(term164058, term164058.getClass(), "contactEmail", "oOrXvGaFwa");
        setField(term164058, term164058.getClass(), "autoApprove", term164354);
        setField(term164058, term164058.getClass(), "memo", "KJSTLGsSvO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRetryOfId", argTypes, term164058, args);
    }

};


