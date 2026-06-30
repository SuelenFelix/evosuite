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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;

public class FsePaymentRequest_setFrequency_199284397752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400950;
     Object enum766;

    public FsePaymentRequest_setFrequency_199284397752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term400999 = new ArrayList();
        ((ArrayList) term400999).add("NuZjAOTYRg");
        ((ArrayList) term400999).add("NeaPAFTzux");
        ((ArrayList) term400999).add("hEkfLXneNw");
        Long term401104 = new Long(-2967233328786457154L);
        Class<? extends Object> term401309 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term401308 = ((Class) term401309).getDeclaredField((String) "FLAT");
        ((Field) term401308).setAccessible(true);
        Object enum764 = ((Field) term401308).get((Object) null);
        Long term401150 = new Long(3081163056749096636L);
        Class<? extends Object> term401713 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term401712 = ((Class) term401713).getDeclaredField((String) "MONTHLY");
        ((Field) term401712).setAccessible(true);
        Object enum765 = ((Field) term401712).get((Object) null);
        term400950 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term401051 = newInstance(Class.forName("java.util.Date"));
        Object term401163 = newInstance(Class.forName("java.util.Date"));
        setField(term400950, term400950.getClass(), "memo", "KaapXeuyMz");
        setField(term400950, term400950.getClass(), "fromClassicAddress", "EmBCkgfeeq");
        setField(term400950, term400950.getClass(), "fromSigningPublicKey", "ykZFVwriEI");
        setField(term400950, term400950.getClass(), "fromPrivateKey", "AehdHjTJCv");
        setField(term400950, term400950.getClass(), "toClassicAddresses", term400999);
        setField(term400950, term400950.getClass(), "amount", "RcaCLEZXeW");
        setLongField(term401051, term401051.getClass(), "fastTime", 1353705436070L);
        setField(term401051, term401051.getClass(), "cdate", null);
        setField(term400950, term400950.getClass(), "startTime", term401051);
        setField(term400950, term400950.getClass(), "destinationTag", "QkGvmhgHMp");
        setField(term400950, term400950.getClass(), "trustlineIssuerClassicAddress", "LubciqAmSz");
        setField(term400950, term400950.getClass(), "currencyName", "cwOkbHJWZu");
        setBooleanField(term400950, term400950.getClass(), "agreeFee", true);
        setField(term400950, term400950.getClass(), "maxXrpFeePerTransaction", "zgUqpRpIHH");
        setBooleanField(term400950, term400950.getClass(), "globalIdVerified", true);
        setBooleanField(term400950, term400950.getClass(), "useBlacklist", false);
        setField(term400950, term400950.getClass(), "retryOfId", term401104);
        setField(term400950, term400950.getClass(), "paymentType", enum764);
        setField(term400950, term400950.getClass(), "snapshotTrustlineIssuerClassicAddress", "CKfRJfocoI");
        setField(term400950, term400950.getClass(), "snapshotCurrencyName", "NbBBkNIiQM");
        setField(term400950, term400950.getClass(), "nftIssuingAddress", "LCvTiyldNf");
        setField(term400950, term400950.getClass(), "nftTaxon", term401150);
        setField(term400950, term400950.getClass(), "frequency", enum765);
        setLongField(term401163, term401163.getClass(), "fastTime", 1568220728964L);
        setField(term401163, term401163.getClass(), "cdate", null);
        setField(term400950, term400950.getClass(), "repeatUntilDate", term401163);
        setField(term400950, term400950.getClass(), "email", "ipjOaXsJXZ");
        setBooleanField(term400950, term400950.getClass(), "autoApprove", true);
        Class<? extends Object> term402116 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term402115 = ((Class) term402116).getDeclaredField((String) "WEEKLY");
        ((Field) term402115).setAccessible(true);
        enum766 = ((Field) term402115).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Object[] args = new Object[1];
        args[0] = enum766;
        callMethod(klass, "setFrequency", argTypes, term400950, args);
    }

};


