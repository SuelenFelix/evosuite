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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_snapshotTrustlineIssuerClassicAddress_25450879918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433058;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_snapshotTrustlineIssuerClassicAddress_25450879918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term433147 = new Integer(1694224101);
        Double term433149 = new Double(0.5407563152320285);
        Double term433151 = new Double(0.9485929668765458);
        Long term433165 = new Long(8298987863520566549L);
        Class<? extends Object> term433328 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term433327 = ((Class) term433328).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term433327).setAccessible(true);
        Object enum807 = ((Field) term433327).get((Object) null);
        Class<? extends Object> term433746 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term433745 = ((Class) term433746).getDeclaredField((String) "MONTHLY");
        ((Field) term433745).setAccessible(true);
        Object enum808 = ((Field) term433745).get((Object) null);
        term433058 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term433207 = newInstance(Class.forName("java.util.Date"));
        Object term433220 = newInstance(Class.forName("java.util.Date"));
        setField(term433058, term433058.getClass(), "memo", "XxDHAdmCbo");
        setField(term433058, term433058.getClass(), "fromClassicAddress", "HoItLNtiRa");
        setField(term433058, term433058.getClass(), "fromSigningPublicKey", "yVwIDSErFo");
        setField(term433058, term433058.getClass(), "fromPrivateKey", "qChIJomfix");
        setField(term433058, term433058.getClass(), "trustlineIssuerClassicAddress", "GPbvtEgxWl");
        setField(term433058, term433058.getClass(), "currencyName", "KleXGbqLCZ");
        setField(term433058, term433058.getClass(), "amount", "lHPixZLDIw");
        setBooleanField(term433058, term433058.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term433058, term433058.getClass(), "globalIdVerified", true);
        setBooleanField(term433058, term433058.getClass(), "useBlacklist", false);
        setBooleanField(term433058, term433058.getClass(), "agreeFee", true);
        setField(term433058, term433058.getClass(), "maximumTrustlines", term433147);
        setField(term433058, term433058.getClass(), "minBalance", term433149);
        setField(term433058, term433058.getClass(), "maxBalance", term433151);
        setField(term433058, term433058.getClass(), "maxXrpFeePerTransaction", "VgDpsGWncx");
        setField(term433058, term433058.getClass(), "retryOfId", term433165);
        setField(term433058, term433058.getClass(), "paymentType", enum807);
        setField(term433058, term433058.getClass(), "snapshotTrustlineIssuerClassicAddress", "ZptVUzLPCw");
        setField(term433058, term433058.getClass(), "snapshotCurrencyName", "PhxaskGUox");
        setLongField(term433207, term433207.getClass(), "fastTime", 1755459801893L);
        setField(term433207, term433207.getClass(), "cdate", null);
        setField(term433058, term433058.getClass(), "startTime", term433207);
        setField(term433058, term433058.getClass(), "frequency", enum808);
        setLongField(term433220, term433220.getClass(), "fastTime", 1282612068524L);
        setField(term433220, term433220.getClass(), "cdate", null);
        setField(term433058, term433058.getClass(), "repeatUntilDate", term433220);
        setField(term433058, term433058.getClass(), "email", "PqySjixIoc");
        setBooleanField(term433058, term433058.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QCJXeGbEor";
        callMethod(klass, "snapshotTrustlineIssuerClassicAddress", argTypes, term433058, args);
    }

};


