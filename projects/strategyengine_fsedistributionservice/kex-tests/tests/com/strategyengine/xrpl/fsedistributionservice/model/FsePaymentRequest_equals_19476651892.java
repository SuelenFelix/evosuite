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

public class FsePaymentRequest_equals_19476651892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341522;
     Object term341736;

    public FsePaymentRequest_equals_19476651892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term341571 = new ArrayList();
        ((ArrayList) term341571).add("gEvlBxOmbD");
        ((ArrayList) term341571).add("RVEPBAUthD");
        Long term341664 = new Long(8085945615925723302L);
        Class<? extends Object> term341848 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term341847 = ((Class) term341848).getDeclaredField((String) "FLAT");
        ((Field) term341847).setAccessible(true);
        Object enum666 = ((Field) term341847).get((Object) null);
        Long term341710 = new Long(5874242482849721868L);
        Class<? extends Object> term342252 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term342251 = ((Class) term342252).getDeclaredField((String) "DAILY");
        ((Field) term342251).setAccessible(true);
        Object enum667 = ((Field) term342251).get((Object) null);
        term341522 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term341611 = newInstance(Class.forName("java.util.Date"));
        Object term341721 = newInstance(Class.forName("java.util.Date"));
        setField(term341522, term341522.getClass(), "memo", "gqqCNmfcKd");
        setField(term341522, term341522.getClass(), "fromClassicAddress", "IUHDEPZYAP");
        setField(term341522, term341522.getClass(), "fromSigningPublicKey", "LsthnVpsJm");
        setField(term341522, term341522.getClass(), "fromPrivateKey", "dWMQzoXYsQ");
        setField(term341522, term341522.getClass(), "toClassicAddresses", term341571);
        setField(term341522, term341522.getClass(), "amount", "NFNQQRlzoy");
        setLongField(term341611, term341611.getClass(), "fastTime", 1767113649745L);
        setField(term341611, term341611.getClass(), "cdate", null);
        setField(term341522, term341522.getClass(), "startTime", term341611);
        setField(term341522, term341522.getClass(), "destinationTag", "IeKvLueLAJ");
        setField(term341522, term341522.getClass(), "trustlineIssuerClassicAddress", "ieojZMRfIP");
        setField(term341522, term341522.getClass(), "currencyName", "xGdfhUYQmU");
        setBooleanField(term341522, term341522.getClass(), "agreeFee", false);
        setField(term341522, term341522.getClass(), "maxXrpFeePerTransaction", "PWmzhOfNzV");
        setBooleanField(term341522, term341522.getClass(), "globalIdVerified", true);
        setBooleanField(term341522, term341522.getClass(), "useBlacklist", false);
        setField(term341522, term341522.getClass(), "retryOfId", term341664);
        setField(term341522, term341522.getClass(), "paymentType", enum666);
        setField(term341522, term341522.getClass(), "snapshotTrustlineIssuerClassicAddress", "ZeTCBMLdWW");
        setField(term341522, term341522.getClass(), "snapshotCurrencyName", "bffGvWgxLN");
        setField(term341522, term341522.getClass(), "nftIssuingAddress", "TvYKjqAoNz");
        setField(term341522, term341522.getClass(), "nftTaxon", term341710);
        setField(term341522, term341522.getClass(), "frequency", enum667);
        setLongField(term341721, term341721.getClass(), "fastTime", 1450460188372L);
        setField(term341721, term341721.getClass(), "cdate", null);
        setField(term341522, term341522.getClass(), "repeatUntilDate", term341721);
        setField(term341522, term341522.getClass(), "email", "zPRseSodwc");
        setBooleanField(term341522, term341522.getClass(), "autoApprove", true);
        term341736 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term341736;
        callMethod(klass, "equals", argTypes, term341522, args);
    }

};


