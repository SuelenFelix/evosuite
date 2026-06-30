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
import java.lang.Boolean;

public class FsePaymentRequest_FsePaymentRequestBuilder_useBlacklist_27342517514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term583460;
     Object term583735;

    public FsePaymentRequest_FsePaymentRequestBuilder_useBlacklist_27342517514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term583509 = new ArrayList();
        ((ArrayList) term583509).add("ldhzrfViik");
        ((ArrayList) term583509).add("lvGRyBZXCP");
        ((ArrayList) term583509).add("bnLazzhSKG");
        ((ArrayList) term583509).add("iQmPksKQuQ");
        ((ArrayList) term583509).add("paffgSIgia");
        ((ArrayList) term583509).add("VHXyYylDte");
        ((ArrayList) term583509).add("HaapzCPUgv");
        Long term583662 = new Long(8483270362078349289L);
        Class<? extends Object> term583898 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term583897 = ((Class) term583898).getDeclaredField((String) "FLAT");
        ((Field) term583897).setAccessible(true);
        Object enum1098 = ((Field) term583897).get((Object) null);
        Long term583708 = new Long(-2660365005868686870L);
        Class<? extends Object> term584302 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term584301 = ((Class) term584302).getDeclaredField((String) "WEEKLY");
        ((Field) term584301).setAccessible(true);
        Object enum1099 = ((Field) term584301).get((Object) null);
        term583460 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term583609 = newInstance(Class.forName("java.util.Date"));
        Object term583720 = newInstance(Class.forName("java.util.Date"));
        setField(term583460, term583460.getClass(), "memo", "GzKodkVNkA");
        setField(term583460, term583460.getClass(), "fromClassicAddress", "mEXwOlYBEo");
        setField(term583460, term583460.getClass(), "fromSigningPublicKey", "MHYIXqSlwf");
        setField(term583460, term583460.getClass(), "fromPrivateKey", "sJpbENqPxH");
        setField(term583460, term583460.getClass(), "toClassicAddresses", term583509);
        setField(term583460, term583460.getClass(), "amount", "nWlqfMmBHs");
        setLongField(term583609, term583609.getClass(), "fastTime", 1405585435482L);
        setField(term583609, term583609.getClass(), "cdate", null);
        setField(term583460, term583460.getClass(), "startTime", term583609);
        setField(term583460, term583460.getClass(), "destinationTag", "plSlQRdRVX");
        setField(term583460, term583460.getClass(), "trustlineIssuerClassicAddress", "pFmGgCMqnF");
        setField(term583460, term583460.getClass(), "currencyName", "ZjqqDMUmbj");
        setBooleanField(term583460, term583460.getClass(), "agreeFee", true);
        setField(term583460, term583460.getClass(), "maxXrpFeePerTransaction", "VXlTBlNDUC");
        setBooleanField(term583460, term583460.getClass(), "globalIdVerified", false);
        setBooleanField(term583460, term583460.getClass(), "useBlacklist", false);
        setField(term583460, term583460.getClass(), "retryOfId", term583662);
        setField(term583460, term583460.getClass(), "paymentType", enum1098);
        setField(term583460, term583460.getClass(), "snapshotTrustlineIssuerClassicAddress", "JrRvLrAvOe");
        setField(term583460, term583460.getClass(), "snapshotCurrencyName", "PKoYIuVvCK");
        setField(term583460, term583460.getClass(), "nftIssuingAddress", "cwzXkcrDLR");
        setField(term583460, term583460.getClass(), "nftTaxon", term583708);
        setField(term583460, term583460.getClass(), "frequency", enum1099);
        setLongField(term583720, term583720.getClass(), "fastTime", 1587329360998L);
        setField(term583720, term583720.getClass(), "cdate", null);
        setField(term583460, term583460.getClass(), "repeatUntilDate", term583720);
        setField(term583460, term583460.getClass(), "email", "PWbkTRRQhH");
        setBooleanField(term583460, term583460.getClass(), "autoApprove", false);
        term583735 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term583735;
        callMethod(klass, "useBlacklist", argTypes, term583460, args);
    }

};


