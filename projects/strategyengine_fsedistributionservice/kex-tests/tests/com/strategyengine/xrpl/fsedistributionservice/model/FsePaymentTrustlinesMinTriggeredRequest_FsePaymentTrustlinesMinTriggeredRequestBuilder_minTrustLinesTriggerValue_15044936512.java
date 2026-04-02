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

public class FsePaymentTrustlinesMinTriggeredRequest_FsePaymentTrustlinesMinTriggeredRequestBuilder_minTrustLinesTriggerValue_15044936512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560683;
     Object term560853;

    public FsePaymentTrustlinesMinTriggeredRequest_FsePaymentTrustlinesMinTriggeredRequestBuilder_minTrustLinesTriggerValue_15044936512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term560773 = new Integer(474518942);
        Double term560775 = new Double(0.5485690030548175);
        Double term560777 = new Double(0.9765248027281291);
        Long term560791 = new Long(4137076813890606231L);
        Class<? extends Object> term560936 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term560935 = ((Class) term560936).getDeclaredField((String) "FLAT");
        ((Field) term560935).setAccessible(true);
        Object enum1066 = ((Field) term560935).get((Object) null);
        Class<? extends Object> term561330 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term561329 = ((Class) term561330).getDeclaredField((String) "WEEKLY");
        ((Field) term561329).setAccessible(true);
        Object enum1067 = ((Field) term561329).get((Object) null);
        term560683 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest$FsePaymentTrustlinesMinTriggeredRequestBuilder"));
        Object term560684 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term560825 = newInstance(Class.forName("java.util.Date"));
        Object term560837 = newInstance(Class.forName("java.util.Date"));
        setField(term560684, term560684.getClass(), "memo", "LTKjLSGpcQ");
        setField(term560684, term560684.getClass(), "fromClassicAddress", "aTxAeHZsQJ");
        setField(term560684, term560684.getClass(), "fromSigningPublicKey", "VeVoOlkaSZ");
        setField(term560684, term560684.getClass(), "fromPrivateKey", "wdxwtYvPiv");
        setField(term560684, term560684.getClass(), "trustlineIssuerClassicAddress", "xUmjORhtNm");
        setField(term560684, term560684.getClass(), "currencyName", "aAllLDsbll");
        setField(term560684, term560684.getClass(), "amount", "tATJNkymBw");
        setBooleanField(term560684, term560684.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term560684, term560684.getClass(), "globalIdVerified", true);
        setBooleanField(term560684, term560684.getClass(), "useBlacklist", false);
        setBooleanField(term560684, term560684.getClass(), "agreeFee", true);
        setField(term560684, term560684.getClass(), "maximumTrustlines", term560773);
        setField(term560684, term560684.getClass(), "minBalance", term560775);
        setField(term560684, term560684.getClass(), "maxBalance", term560777);
        setField(term560684, term560684.getClass(), "maxXrpFeePerTransaction", "bkSURJdLBL");
        setField(term560684, term560684.getClass(), "retryOfId", term560791);
        setField(term560684, term560684.getClass(), "paymentType", enum1066);
        setField(term560684, term560684.getClass(), "snapshotTrustlineIssuerClassicAddress", "aNcXIRUToO");
        setField(term560684, term560684.getClass(), "snapshotCurrencyName", "nBABxWLGOf");
        setLongField(term560825, term560825.getClass(), "fastTime", 1678276206753L);
        setField(term560825, term560825.getClass(), "cdate", null);
        setField(term560684, term560684.getClass(), "startTime", term560825);
        setField(term560684, term560684.getClass(), "frequency", enum1067);
        setLongField(term560837, term560837.getClass(), "fastTime", 1408428840024L);
        setField(term560837, term560837.getClass(), "cdate", null);
        setField(term560684, term560684.getClass(), "repeatUntilDate", term560837);
        setField(term560684, term560684.getClass(), "email", "jdlTBcTsNZ");
        setBooleanField(term560684, term560684.getClass(), "autoApprove", true);
        setField(term560683, term560683.getClass(), "trustlinePaymentRequest", term560684);
        setIntField(term560683, term560683.getClass(), "minTrustLinesTriggerValue", -522618178);
        term560853 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesMinTriggeredRequest$FsePaymentTrustlinesMinTriggeredRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term560853;
        callMethod(klass, "minTrustLinesTriggerValue", argTypes, term560683, args);
    }

};


