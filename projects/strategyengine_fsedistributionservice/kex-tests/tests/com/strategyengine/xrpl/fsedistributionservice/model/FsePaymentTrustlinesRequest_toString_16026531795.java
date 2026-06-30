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

public class FsePaymentTrustlinesRequest_toString_16026531795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23237;

    public FsePaymentTrustlinesRequest_toString_16026531795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23326 = new Integer(1135664017);
        Double term23328 = new Double(0.10667076642995188);
        Double term23330 = new Double(0.11493000848982304);
        Long term23344 = new Long(4784595517102746672L);
        Class<? extends Object> term23486 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term23485 = ((Class) term23486).getDeclaredField((String) "FLAT");
        ((Field) term23485).setAccessible(true);
        Object enum39 = ((Field) term23485).get((Object) null);
        Class<? extends Object> term23880 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term23879 = ((Class) term23880).getDeclaredField((String) "WEEKLY");
        ((Field) term23879).setAccessible(true);
        Object enum40 = ((Field) term23879).get((Object) null);
        term23237 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest"));
        Object term23378 = newInstance(Class.forName("java.util.Date"));
        Object term23390 = newInstance(Class.forName("java.util.Date"));
        setField(term23237, term23237.getClass(), "memo", "OUeBWNTQDh");
        setField(term23237, term23237.getClass(), "fromClassicAddress", "gltJarNuUk");
        setField(term23237, term23237.getClass(), "fromSigningPublicKey", "ZwZIDwYcSW");
        setField(term23237, term23237.getClass(), "fromPrivateKey", "sOdkipUKRu");
        setField(term23237, term23237.getClass(), "trustlineIssuerClassicAddress", "oKwCDqywym");
        setField(term23237, term23237.getClass(), "currencyName", "zjZYTddemL");
        setField(term23237, term23237.getClass(), "amount", "QtrylgCLiF");
        setBooleanField(term23237, term23237.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term23237, term23237.getClass(), "globalIdVerified", false);
        setBooleanField(term23237, term23237.getClass(), "useBlacklist", false);
        setBooleanField(term23237, term23237.getClass(), "agreeFee", false);
        setField(term23237, term23237.getClass(), "maximumTrustlines", term23326);
        setField(term23237, term23237.getClass(), "minBalance", term23328);
        setField(term23237, term23237.getClass(), "maxBalance", term23330);
        setField(term23237, term23237.getClass(), "maxXrpFeePerTransaction", "orEuhCStGM");
        setField(term23237, term23237.getClass(), "retryOfId", term23344);
        setField(term23237, term23237.getClass(), "paymentType", enum39);
        setField(term23237, term23237.getClass(), "snapshotTrustlineIssuerClassicAddress", "HhEaSXWvrY");
        setField(term23237, term23237.getClass(), "snapshotCurrencyName", "CVRGEomOth");
        setLongField(term23378, term23378.getClass(), "fastTime", 1329640267573L);
        setField(term23378, term23378.getClass(), "cdate", null);
        setField(term23237, term23237.getClass(), "startTime", term23378);
        setField(term23237, term23237.getClass(), "frequency", enum40);
        setLongField(term23390, term23390.getClass(), "fastTime", 1334853104718L);
        setField(term23390, term23390.getClass(), "cdate", null);
        setField(term23237, term23237.getClass(), "repeatUntilDate", term23390);
        setField(term23237, term23237.getClass(), "email", "vSeruUyNWX");
        setBooleanField(term23237, term23237.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term23237, args);
    }

};


