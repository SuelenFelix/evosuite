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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_toString_97164570626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442086;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_toString_97164570626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term442175 = new Integer(-159494544);
        Double term442177 = new Double(0.25997329921466494);
        Double term442179 = new Double(0.7814864708383836);
        Long term442193 = new Long(1789068809283154146L);
        Class<? extends Object> term442334 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term442333 = ((Class) term442334).getDeclaredField((String) "FLAT");
        ((Field) term442333).setAccessible(true);
        Object enum824 = ((Field) term442333).get((Object) null);
        Class<? extends Object> term442728 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term442727 = ((Class) term442728).getDeclaredField((String) "DAILY");
        ((Field) term442727).setAccessible(true);
        Object enum825 = ((Field) term442727).get((Object) null);
        term442086 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term442227 = newInstance(Class.forName("java.util.Date"));
        Object term442238 = newInstance(Class.forName("java.util.Date"));
        setField(term442086, term442086.getClass(), "memo", "HqKNPHdTsZ");
        setField(term442086, term442086.getClass(), "fromClassicAddress", "NAkrjjouYH");
        setField(term442086, term442086.getClass(), "fromSigningPublicKey", "dSiUSTAjCX");
        setField(term442086, term442086.getClass(), "fromPrivateKey", "xBAPqcTBHS");
        setField(term442086, term442086.getClass(), "trustlineIssuerClassicAddress", "VFosMMhIdi");
        setField(term442086, term442086.getClass(), "currencyName", "zUZtiqtfst");
        setField(term442086, term442086.getClass(), "amount", "hQcNBUpzME");
        setBooleanField(term442086, term442086.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term442086, term442086.getClass(), "globalIdVerified", false);
        setBooleanField(term442086, term442086.getClass(), "useBlacklist", true);
        setBooleanField(term442086, term442086.getClass(), "agreeFee", false);
        setField(term442086, term442086.getClass(), "maximumTrustlines", term442175);
        setField(term442086, term442086.getClass(), "minBalance", term442177);
        setField(term442086, term442086.getClass(), "maxBalance", term442179);
        setField(term442086, term442086.getClass(), "maxXrpFeePerTransaction", "eNnBrxvrSt");
        setField(term442086, term442086.getClass(), "retryOfId", term442193);
        setField(term442086, term442086.getClass(), "paymentType", enum824);
        setField(term442086, term442086.getClass(), "snapshotTrustlineIssuerClassicAddress", "PxvnQVNeCZ");
        setField(term442086, term442086.getClass(), "snapshotCurrencyName", "DhASIoZdwe");
        setLongField(term442227, term442227.getClass(), "fastTime", 1427658283623L);
        setField(term442227, term442227.getClass(), "cdate", null);
        setField(term442086, term442086.getClass(), "startTime", term442227);
        setField(term442086, term442086.getClass(), "frequency", enum825);
        setLongField(term442238, term442238.getClass(), "fastTime", 1530567305513L);
        setField(term442238, term442238.getClass(), "cdate", null);
        setField(term442086, term442086.getClass(), "repeatUntilDate", term442238);
        setField(term442086, term442086.getClass(), "email", "PMrzFHnOYQ");
        setBooleanField(term442086, term442086.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term442086, args);
    }

};


