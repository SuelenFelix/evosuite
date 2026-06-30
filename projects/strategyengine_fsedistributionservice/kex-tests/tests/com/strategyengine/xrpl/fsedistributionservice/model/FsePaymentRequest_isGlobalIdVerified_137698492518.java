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

public class FsePaymentRequest_isGlobalIdVerified_137698492518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360814;

    public FsePaymentRequest_isGlobalIdVerified_137698492518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term360863 = new ArrayList();
        ((ArrayList) term360863).add("HlqCQVVCvy");
        ((ArrayList) term360863).add("eSjqyipIEH");
        Long term360956 = new Long(-5822755741902532021L);
        Class<? extends Object> term361139 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term361138 = ((Class) term361139).getDeclaredField((String) "FLAT");
        ((Field) term361138).setAccessible(true);
        Object enum698 = ((Field) term361138).get((Object) null);
        Long term361002 = new Long(3092709067387780151L);
        Class<? extends Object> term361543 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term361542 = ((Class) term361543).getDeclaredField((String) "DAILY");
        ((Field) term361542).setAccessible(true);
        Object enum699 = ((Field) term361542).get((Object) null);
        term360814 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term360903 = newInstance(Class.forName("java.util.Date"));
        Object term361013 = newInstance(Class.forName("java.util.Date"));
        setField(term360814, term360814.getClass(), "memo", "HAvelKHpob");
        setField(term360814, term360814.getClass(), "fromClassicAddress", "nFKhEfljjj");
        setField(term360814, term360814.getClass(), "fromSigningPublicKey", "TbAlefWyzU");
        setField(term360814, term360814.getClass(), "fromPrivateKey", "CVIsKWEpTu");
        setField(term360814, term360814.getClass(), "toClassicAddresses", term360863);
        setField(term360814, term360814.getClass(), "amount", "DoHfdWKluP");
        setLongField(term360903, term360903.getClass(), "fastTime", 1398084101491L);
        setField(term360903, term360903.getClass(), "cdate", null);
        setField(term360814, term360814.getClass(), "startTime", term360903);
        setField(term360814, term360814.getClass(), "destinationTag", "APjhJaIDgk");
        setField(term360814, term360814.getClass(), "trustlineIssuerClassicAddress", "QoFSUTaQng");
        setField(term360814, term360814.getClass(), "currencyName", "zRpqQnOFBI");
        setBooleanField(term360814, term360814.getClass(), "agreeFee", true);
        setField(term360814, term360814.getClass(), "maxXrpFeePerTransaction", "HqBUcvufgR");
        setBooleanField(term360814, term360814.getClass(), "globalIdVerified", false);
        setBooleanField(term360814, term360814.getClass(), "useBlacklist", true);
        setField(term360814, term360814.getClass(), "retryOfId", term360956);
        setField(term360814, term360814.getClass(), "paymentType", enum698);
        setField(term360814, term360814.getClass(), "snapshotTrustlineIssuerClassicAddress", "UTSqUDNbRo");
        setField(term360814, term360814.getClass(), "snapshotCurrencyName", "oOEVZNBuPz");
        setField(term360814, term360814.getClass(), "nftIssuingAddress", "ONFMHsmNXv");
        setField(term360814, term360814.getClass(), "nftTaxon", term361002);
        setField(term360814, term360814.getClass(), "frequency", enum699);
        setLongField(term361013, term361013.getClass(), "fastTime", 1355118893997L);
        setField(term361013, term361013.getClass(), "cdate", null);
        setField(term360814, term360814.getClass(), "repeatUntilDate", term361013);
        setField(term360814, term360814.getClass(), "email", "cCGTfMQirP");
        setBooleanField(term360814, term360814.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isGlobalIdVerified", argTypes, term360814, args);
    }

};


