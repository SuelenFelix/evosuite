package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FsePaymentTrustlinesRequest_setStartTime_99120965551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71705;
     Object term71873;

    public FsePaymentTrustlinesRequest_setStartTime_99120965551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term71794 = new Integer(962840079);
        Double term71796 = new Double(0.3074693824288357);
        Double term71798 = new Double(0.1245258965512791);
        Long term71812 = new Long(6689117472719450333L);
        Class<? extends Object> term71956 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term71955 = ((Class) term71956).getDeclaredField((String) "FLAT");
        ((Field) term71955).setAccessible(true);
        Object enum130 = ((Field) term71955).get((Object) null);
        Class<? extends Object> term72350 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term72349 = ((Class) term72350).getDeclaredField((String) "WEEKLY");
        ((Field) term72349).setAccessible(true);
        Object enum131 = ((Field) term72349).get((Object) null);
        term71705 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term71846 = newInstance(Class.forName("java.util.Date"));
        Object term71858 = newInstance(Class.forName("java.util.Date"));
        setField(term71705, term71705.getClass(), "memo", "GISHLsgALf");
        setField(term71705, term71705.getClass(), "fromClassicAddress", "PVykkUSgBq");
        setField(term71705, term71705.getClass(), "fromSigningPublicKey", "tnKbZaCsuj");
        setField(term71705, term71705.getClass(), "fromPrivateKey", "ZFpcYBgLNC");
        setField(term71705, term71705.getClass(), "trustlineIssuerClassicAddress", "VAGkRppBem");
        setField(term71705, term71705.getClass(), "currencyName", "eKcEJRxNSu");
        setField(term71705, term71705.getClass(), "amount", "NTXQPWFYSA");
        setBooleanField(term71705, term71705.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term71705, term71705.getClass(), "globalIdVerified", true);
        setBooleanField(term71705, term71705.getClass(), "useBlacklist", true);
        setBooleanField(term71705, term71705.getClass(), "agreeFee", true);
        setField(term71705, term71705.getClass(), "maximumTrustlines", term71794);
        setField(term71705, term71705.getClass(), "minBalance", term71796);
        setField(term71705, term71705.getClass(), "maxBalance", term71798);
        setField(term71705, term71705.getClass(), "maxXrpFeePerTransaction", "fOuOhBpldm");
        setField(term71705, term71705.getClass(), "retryOfId", term71812);
        setField(term71705, term71705.getClass(), "paymentType", enum130);
        setField(term71705, term71705.getClass(), "snapshotTrustlineIssuerClassicAddress", "qQQRKGPyIM");
        setField(term71705, term71705.getClass(), "snapshotCurrencyName", "lzcwhvjdFg");
        setLongField(term71846, term71846.getClass(), "fastTime", 1709178890088L);
        setField(term71846, term71846.getClass(), "cdate", null);
        setField(term71705, term71705.getClass(), "startTime", term71846);
        setField(term71705, term71705.getClass(), "frequency", enum131);
        setLongField(term71858, term71858.getClass(), "fastTime", 1644776129220L);
        setField(term71858, term71858.getClass(), "cdate", null);
        setField(term71705, term71705.getClass(), "repeatUntilDate", term71858);
        setField(term71705, term71705.getClass(), "email", "dfzWTjcjnI");
        setBooleanField(term71705, term71705.getClass(), "autoApprove", true);
        term71873 = newInstance(Class.forName("java.util.Date"));
        setLongField(term71873, term71873.getClass(), "fastTime", 1456374715658L);
        setField(term71873, term71873.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term71873;
        callMethod(klass, "setStartTime", argTypes, term71705, args);
    }

};


