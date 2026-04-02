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

public class FsePaymentRequest_FsePaymentRequestBuilder_maxXrpFeePerTransaction_58975684912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581028;

    public FsePaymentRequest_FsePaymentRequestBuilder_maxXrpFeePerTransaction_58975684912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term581077 = new ArrayList();
        ((ArrayList) term581077).add("obVHSLzFkr");
        ((ArrayList) term581077).add("qPqtpUGEBt");
        ((ArrayList) term581077).add("LjpmgLxxAN");
        ((ArrayList) term581077).add("axbOsAnkgV");
        ((ArrayList) term581077).add("mNmYtNfYWV");
        ((ArrayList) term581077).add("yIaDArVQip");
        ((ArrayList) term581077).add("QoFWtaCVyb");
        ((ArrayList) term581077).add("HjAPJUaLTX");
        Long term581242 = new Long(-6245769757887186092L);
        Class<? extends Object> term581497 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term581496 = ((Class) term581497).getDeclaredField((String) "FLAT");
        ((Field) term581496).setAccessible(true);
        Object enum1094 = ((Field) term581496).get((Object) null);
        Long term581288 = new Long(-180231083568368234L);
        Class<? extends Object> term581901 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term581900 = ((Class) term581901).getDeclaredField((String) "DAILY");
        ((Field) term581900).setAccessible(true);
        Object enum1095 = ((Field) term581900).get((Object) null);
        term581028 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term581189 = newInstance(Class.forName("java.util.Date"));
        Object term581299 = newInstance(Class.forName("java.util.Date"));
        setField(term581028, term581028.getClass(), "memo", "SNxxiwGooS");
        setField(term581028, term581028.getClass(), "fromClassicAddress", "uACfzGuzLf");
        setField(term581028, term581028.getClass(), "fromSigningPublicKey", "GhNtnTcGqj");
        setField(term581028, term581028.getClass(), "fromPrivateKey", "llQSWhVMIU");
        setField(term581028, term581028.getClass(), "toClassicAddresses", term581077);
        setField(term581028, term581028.getClass(), "amount", "DNZRxHzfUW");
        setLongField(term581189, term581189.getClass(), "fastTime", 1681398211562L);
        setField(term581189, term581189.getClass(), "cdate", null);
        setField(term581028, term581028.getClass(), "startTime", term581189);
        setField(term581028, term581028.getClass(), "destinationTag", "RFTLcXaXOf");
        setField(term581028, term581028.getClass(), "trustlineIssuerClassicAddress", "RdDqdChRRF");
        setField(term581028, term581028.getClass(), "currencyName", "pchpUleqKe");
        setBooleanField(term581028, term581028.getClass(), "agreeFee", true);
        setField(term581028, term581028.getClass(), "maxXrpFeePerTransaction", "VICIPgrdFz");
        setBooleanField(term581028, term581028.getClass(), "globalIdVerified", false);
        setBooleanField(term581028, term581028.getClass(), "useBlacklist", false);
        setField(term581028, term581028.getClass(), "retryOfId", term581242);
        setField(term581028, term581028.getClass(), "paymentType", enum1094);
        setField(term581028, term581028.getClass(), "snapshotTrustlineIssuerClassicAddress", "JKiUJuSwov");
        setField(term581028, term581028.getClass(), "snapshotCurrencyName", "axHXnsAsPO");
        setField(term581028, term581028.getClass(), "nftIssuingAddress", "QYbbRPmFfv");
        setField(term581028, term581028.getClass(), "nftTaxon", term581288);
        setField(term581028, term581028.getClass(), "frequency", enum1095);
        setLongField(term581299, term581299.getClass(), "fastTime", 1526655892385L);
        setField(term581299, term581299.getClass(), "cdate", null);
        setField(term581028, term581028.getClass(), "repeatUntilDate", term581299);
        setField(term581028, term581028.getClass(), "email", "jHkmYGgAnp");
        setBooleanField(term581028, term581028.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TICBysdfuB";
        callMethod(klass, "maxXrpFeePerTransaction", argTypes, term581028, args);
    }

};


