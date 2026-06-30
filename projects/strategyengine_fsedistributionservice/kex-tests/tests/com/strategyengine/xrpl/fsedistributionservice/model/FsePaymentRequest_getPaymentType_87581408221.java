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

public class FsePaymentRequest_getPaymentType_87581408221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364449;

    public FsePaymentRequest_getPaymentType_87581408221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term364498 = new ArrayList();
        ((ArrayList) term364498).add("ckvWshDuZV");
        ((ArrayList) term364498).add("WsZSiTmUAb");
        ((ArrayList) term364498).add("unlHlivihq");
        ((ArrayList) term364498).add("SpWXYUYOyr");
        ((ArrayList) term364498).add("HEFcNDOCWd");
        Long term364627 = new Long(8447690702287486582L);
        Class<? extends Object> term364840 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term364839 = ((Class) term364840).getDeclaredField((String) "FLAT");
        ((Field) term364839).setAccessible(true);
        Object enum704 = ((Field) term364839).get((Object) null);
        Long term364673 = new Long(6553325891603936420L);
        Class<? extends Object> term365244 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term365243 = ((Class) term365244).getDeclaredField((String) "DAILY");
        ((Field) term365243).setAccessible(true);
        Object enum705 = ((Field) term365243).get((Object) null);
        term364449 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term364574 = newInstance(Class.forName("java.util.Date"));
        Object term364684 = newInstance(Class.forName("java.util.Date"));
        setField(term364449, term364449.getClass(), "memo", "auhFemTfIs");
        setField(term364449, term364449.getClass(), "fromClassicAddress", "IhxGrgSVtO");
        setField(term364449, term364449.getClass(), "fromSigningPublicKey", "SoHyyXooNj");
        setField(term364449, term364449.getClass(), "fromPrivateKey", "ewsxMpzQJL");
        setField(term364449, term364449.getClass(), "toClassicAddresses", term364498);
        setField(term364449, term364449.getClass(), "amount", "uGtmSuLIbe");
        setLongField(term364574, term364574.getClass(), "fastTime", 1339088205799L);
        setField(term364574, term364574.getClass(), "cdate", null);
        setField(term364449, term364449.getClass(), "startTime", term364574);
        setField(term364449, term364449.getClass(), "destinationTag", "jXprxniQLh");
        setField(term364449, term364449.getClass(), "trustlineIssuerClassicAddress", "qpyqWqBXuI");
        setField(term364449, term364449.getClass(), "currencyName", "VmcHOGdUdL");
        setBooleanField(term364449, term364449.getClass(), "agreeFee", false);
        setField(term364449, term364449.getClass(), "maxXrpFeePerTransaction", "jMjdEiZGZp");
        setBooleanField(term364449, term364449.getClass(), "globalIdVerified", false);
        setBooleanField(term364449, term364449.getClass(), "useBlacklist", true);
        setField(term364449, term364449.getClass(), "retryOfId", term364627);
        setField(term364449, term364449.getClass(), "paymentType", enum704);
        setField(term364449, term364449.getClass(), "snapshotTrustlineIssuerClassicAddress", "efxUIvyTyg");
        setField(term364449, term364449.getClass(), "snapshotCurrencyName", "YJcfqsYvpK");
        setField(term364449, term364449.getClass(), "nftIssuingAddress", "DuTBCYJBrz");
        setField(term364449, term364449.getClass(), "nftTaxon", term364673);
        setField(term364449, term364449.getClass(), "frequency", enum705);
        setLongField(term364684, term364684.getClass(), "fastTime", 1274416785563L);
        setField(term364684, term364684.getClass(), "cdate", null);
        setField(term364449, term364449.getClass(), "repeatUntilDate", term364684);
        setField(term364449, term364449.getClass(), "email", "yztwwqDqge");
        setBooleanField(term364449, term364449.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPaymentType", argTypes, term364449, args);
    }

};


