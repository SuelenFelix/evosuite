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

public class PaymentRequestEnt_getAutoApprove_211557039637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170778;

    public PaymentRequestEnt_getAutoApprove_211557039637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term170779 = new Long(370847120687610747L);
        Class<? extends Object> term171092 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term171091 = ((Class) term171092).getDeclaredField((String) "COMPLETE");
        ((Field) term171091).setAccessible(true);
        Object enum304 = ((Field) term171091).get((Object) null);
        Class<? extends Object> term171598 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term171597 = ((Class) term171598).getDeclaredField((String) "FLAT");
        ((Field) term171597).setAccessible(true);
        Object enum305 = ((Field) term171597).get((Object) null);
        Boolean term170939 = new Boolean(true);
        Boolean term170941 = new Boolean(true);
        Integer term170943 = new Integer(906181092);
        Class<? extends Object> term171972 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term171971 = ((Class) term171972).getDeclaredField((String) "GLOBALID");
        ((Field) term171971).setAccessible(true);
        Object enum306 = ((Field) term171971).get((Object) null);
        Long term171029 = new Long(-6399462725251497844L);
        Long term171043 = new Long(-4855037955202452256L);
        Boolean term171057 = new Boolean(false);
        term170778 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term170805 = newInstance(Class.forName("java.util.Date"));
        Object term170807 = newInstance(Class.forName("java.util.Date"));
        Object term170809 = newInstance(Class.forName("java.util.Date"));
        setField(term170778, term170778.getClass(), "id", term170779);
        setField(term170778, term170778.getClass(), "environment", "lbnnCkEZgE");
        setField(term170778, term170778.getClass(), "populateEnvironment", "YaWdTQZkTw");
        setLongField(term170805, term170805.getClass(), "fastTime", 1730039204666L);
        setField(term170805, term170805.getClass(), "cdate", null);
        setField(term170778, term170778.getClass(), "createDate", term170805);
        setLongField(term170807, term170807.getClass(), "fastTime", 1644599149749L);
        setField(term170807, term170807.getClass(), "cdate", null);
        setField(term170778, term170778.getClass(), "updateDate", term170807);
        setLongField(term170809, term170809.getClass(), "fastTime", 1879056669403L);
        setField(term170809, term170809.getClass(), "cdate", null);
        setField(term170778, term170778.getClass(), "startTime", term170809);
        setField(term170778, term170778.getClass(), "status", enum304);
        setField(term170778, term170778.getClass(), "fromClassicAddress", "QqsjlsXtmm");
        setField(term170778, term170778.getClass(), "fromSigningPublicKey", "FuWUjAYXxz");
        setField(term170778, term170778.getClass(), "fromPrivateKey", "rKIvvYydou");
        setField(term170778, term170778.getClass(), "trustlineIssuerClassicAddress", "KNgeIkQoef");
        setField(term170778, term170778.getClass(), "currencyName", "MeMWAHyjMR");
        setField(term170778, term170778.getClass(), "snapshotTrustlineIssuerClassicAddress", "lTuLOcnSnJ");
        setField(term170778, term170778.getClass(), "snapshotCurrencyName", "govbBrRstA");
        setField(term170778, term170778.getClass(), "currencyNameForProcess", "zSMUNzRRyM");
        setField(term170778, term170778.getClass(), "amount", "aKwJiIZSjJ");
        setField(term170778, term170778.getClass(), "paymentType", enum305);
        setField(term170778, term170778.getClass(), "newTrustlinesOnly", term170939);
        setField(term170778, term170778.getClass(), "useBlacklist", term170941);
        setField(term170778, term170778.getClass(), "maximumTrustlines", term170943);
        setField(term170778, term170778.getClass(), "dropType", enum306);
        setField(term170778, term170778.getClass(), "lockUuid", "lYbeaINKud");
        setField(term170778, term170778.getClass(), "failReason", "BrwuUkkatt");
        setField(term170778, term170778.getClass(), "feesPaid", "NjmSJhbVEM");
        setField(term170778, term170778.getClass(), "minBalance", "aftnGRjhKN");
        setField(term170778, term170778.getClass(), "maxBalance", "TirWkyiCHh");
        setField(term170778, term170778.getClass(), "maxXrpFeePerTransaction", "lsQrIFMkgZ");
        setField(term170778, term170778.getClass(), "retryOfId", term171029);
        setField(term170778, term170778.getClass(), "nftIssuerAddress", "VgAyBhgBhq");
        setField(term170778, term170778.getClass(), "nftTaxon", term171043);
        setField(term170778, term170778.getClass(), "contactEmail", "nhpssUKjpK");
        setField(term170778, term170778.getClass(), "autoApprove", term171057);
        setField(term170778, term170778.getClass(), "memo", "lnJVsFNsCN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAutoApprove", argTypes, term170778, args);
    }

};


