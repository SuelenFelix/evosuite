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
import java.lang.Object;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;

public class FsePaymentTrustlinesMinTriggeredRequest_setMinTrustLinesTriggerValue_199823676710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9603;
     Object term9782;

    public FsePaymentTrustlinesMinTriggeredRequest_setMinTrustLinesTriggerValue_199823676710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9693 = new Integer(-1339778481);
        Double term9695 = new Double(0.6436713023569729);
        Double term9697 = new Double(0.7332741045694002);
        Long term9711 = new Long(6967924379644551255L);
        Class<? extends Object> term9865 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term9864 = ((Class) term9865).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term9864).setAccessible(true);
        Object enum18 = ((Field) term9864).get((Object) null);
        Class<? extends Object> term10283 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term10282 = ((Class) term10283).getDeclaredField((String) "MONTHLY");
        ((Field) term10282).setAccessible(true);
        Object enum19 = ((Field) term10282).get((Object) null);
        term9603 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest"));
        Object term9604 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term9753 = newInstance(Class.forName("java.util.Date"));
        Object term9766 = newInstance(Class.forName("java.util.Date"));
        setField(term9604, term9604.getClass(), "memo", "BKLfkLiZTH");
        setField(term9604, term9604.getClass(), "fromClassicAddress", "SPpkrGcPRr");
        setField(term9604, term9604.getClass(), "fromSigningPublicKey", "sEccwbJKYE");
        setField(term9604, term9604.getClass(), "fromPrivateKey", "AWRooQKkdW");
        setField(term9604, term9604.getClass(), "trustlineIssuerClassicAddress", "vjxIhXHxGR");
        setField(term9604, term9604.getClass(), "currencyName", "QXzGXbEXMu");
        setField(term9604, term9604.getClass(), "amount", "qxSDVejjiY");
        setBooleanField(term9604, term9604.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term9604, term9604.getClass(), "globalIdVerified", true);
        setBooleanField(term9604, term9604.getClass(), "useBlacklist", true);
        setBooleanField(term9604, term9604.getClass(), "agreeFee", false);
        setField(term9604, term9604.getClass(), "maximumTrustlines", term9693);
        setField(term9604, term9604.getClass(), "minBalance", term9695);
        setField(term9604, term9604.getClass(), "maxBalance", term9697);
        setField(term9604, term9604.getClass(), "maxXrpFeePerTransaction", "xBsXSDjXYK");
        setField(term9604, term9604.getClass(), "retryOfId", term9711);
        setField(term9604, term9604.getClass(), "paymentType", enum18);
        setField(term9604, term9604.getClass(), "snapshotTrustlineIssuerClassicAddress", "sEnIVFtZuQ");
        setField(term9604, term9604.getClass(), "snapshotCurrencyName", "ZVecLZMLHF");
        setLongField(term9753, term9753.getClass(), "fastTime", 1668569229825L);
        setField(term9753, term9753.getClass(), "cdate", null);
        setField(term9604, term9604.getClass(), "startTime", term9753);
        setField(term9604, term9604.getClass(), "frequency", enum19);
        setLongField(term9766, term9766.getClass(), "fastTime", 1725122217647L);
        setField(term9766, term9766.getClass(), "cdate", null);
        setField(term9604, term9604.getClass(), "repeatUntilDate", term9766);
        setField(term9604, term9604.getClass(), "email", "fztQhjqwdP");
        setBooleanField(term9604, term9604.getClass(), "autoApprove", true);
        setField(term9603, term9603.getClass(), "trustlinePaymentRequest", term9604);
        setIntField(term9603, term9603.getClass(), "minTrustLinesTriggerValue", 1227103734);
        term9782 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9782;
        callMethod(klass, "setMinTrustLinesTriggerValue", argTypes, term9603, args);
    }

};


