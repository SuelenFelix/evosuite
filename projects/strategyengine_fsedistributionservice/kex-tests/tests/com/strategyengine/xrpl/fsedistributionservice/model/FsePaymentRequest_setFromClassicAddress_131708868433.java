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

public class FsePaymentRequest_setFromClassicAddress_131708868433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377686;

    public FsePaymentRequest_setFromClassicAddress_131708868433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term377735 = new ArrayList();
        ((ArrayList) term377735).add("eJqUXvnJbF");
        ((ArrayList) term377735).add("VpXwMHTEPK");
        ((ArrayList) term377735).add("zZfVQCDLcL");
        ((ArrayList) term377735).add("qwucImMziW");
        ((ArrayList) term377735).add("rzKUhEsySj");
        ((ArrayList) term377735).add("wZFZRaxcNf");
        ((ArrayList) term377735).add("ZXeOtTJTEw");
        ((ArrayList) term377735).add("QLiujmKpbl");
        ((ArrayList) term377735).add("urWFjQWEsN");
        Long term377912 = new Long(-8129901089598682226L);
        Class<? extends Object> term378178 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term378177 = ((Class) term378178).getDeclaredField((String) "FLAT");
        ((Field) term378177).setAccessible(true);
        Object enum726 = ((Field) term378177).get((Object) null);
        Long term377958 = new Long(-2740731095268174775L);
        Class<? extends Object> term378582 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term378581 = ((Class) term378582).getDeclaredField((String) "WEEKLY");
        ((Field) term378581).setAccessible(true);
        Object enum727 = ((Field) term378581).get((Object) null);
        term377686 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term377859 = newInstance(Class.forName("java.util.Date"));
        Object term377970 = newInstance(Class.forName("java.util.Date"));
        setField(term377686, term377686.getClass(), "memo", "YIdiDKXHaS");
        setField(term377686, term377686.getClass(), "fromClassicAddress", "oyvSGEURIT");
        setField(term377686, term377686.getClass(), "fromSigningPublicKey", "rzYOCnTVlX");
        setField(term377686, term377686.getClass(), "fromPrivateKey", "NjVoiqLfus");
        setField(term377686, term377686.getClass(), "toClassicAddresses", term377735);
        setField(term377686, term377686.getClass(), "amount", "yRqmckDaWQ");
        setLongField(term377859, term377859.getClass(), "fastTime", 1627004574434L);
        setField(term377859, term377859.getClass(), "cdate", null);
        setField(term377686, term377686.getClass(), "startTime", term377859);
        setField(term377686, term377686.getClass(), "destinationTag", "NyLoSaVRpL");
        setField(term377686, term377686.getClass(), "trustlineIssuerClassicAddress", "hmPyuzYKXU");
        setField(term377686, term377686.getClass(), "currencyName", "KhhKtlPkUq");
        setBooleanField(term377686, term377686.getClass(), "agreeFee", false);
        setField(term377686, term377686.getClass(), "maxXrpFeePerTransaction", "GfrUvQyuXI");
        setBooleanField(term377686, term377686.getClass(), "globalIdVerified", false);
        setBooleanField(term377686, term377686.getClass(), "useBlacklist", false);
        setField(term377686, term377686.getClass(), "retryOfId", term377912);
        setField(term377686, term377686.getClass(), "paymentType", enum726);
        setField(term377686, term377686.getClass(), "snapshotTrustlineIssuerClassicAddress", "PLhGFeYSpm");
        setField(term377686, term377686.getClass(), "snapshotCurrencyName", "VGBjXtYbqH");
        setField(term377686, term377686.getClass(), "nftIssuingAddress", "ANFGUfOYmw");
        setField(term377686, term377686.getClass(), "nftTaxon", term377958);
        setField(term377686, term377686.getClass(), "frequency", enum727);
        setLongField(term377970, term377970.getClass(), "fastTime", 1576191814059L);
        setField(term377970, term377970.getClass(), "cdate", null);
        setField(term377686, term377686.getClass(), "repeatUntilDate", term377970);
        setField(term377686, term377686.getClass(), "email", "NUUMwMAxia");
        setBooleanField(term377686, term377686.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aQGVzRXubV";
        callMethod(klass, "setFromClassicAddress", argTypes, term377686, args);
    }

};


