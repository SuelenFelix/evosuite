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

public class FsePaymentRequest_getFrequency_121719890526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370514;

    public FsePaymentRequest_getFrequency_121719890526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term370563 = new ArrayList();
        ((ArrayList) term370563).add("fVdLejYqxd");
        ((ArrayList) term370563).add("cRmXUJxIrJ");
        ((ArrayList) term370563).add("EoLbvbBEMP");
        ((ArrayList) term370563).add("btsaaRMdBp");
        ((ArrayList) term370563).add("ItCoFoogyQ");
        ((ArrayList) term370563).add("nepnhlILBS");
        ((ArrayList) term370563).add("huaIuyRHxW");
        ((ArrayList) term370563).add("ogERhHtdmR");
        Long term370728 = new Long(-1368803674967453727L);
        Class<? extends Object> term370972 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term370971 = ((Class) term370972).getDeclaredField((String) "FLAT");
        ((Field) term370971).setAccessible(true);
        Object enum714 = ((Field) term370971).get((Object) null);
        Long term370774 = new Long(-1596516630146686041L);
        Class<? extends Object> term371376 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term371375 = ((Class) term371376).getDeclaredField((String) "WEEKLY");
        ((Field) term371375).setAccessible(true);
        Object enum715 = ((Field) term371375).get((Object) null);
        term370514 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term370675 = newInstance(Class.forName("java.util.Date"));
        Object term370786 = newInstance(Class.forName("java.util.Date"));
        setField(term370514, term370514.getClass(), "memo", "dxknmmbwXv");
        setField(term370514, term370514.getClass(), "fromClassicAddress", "MNrIwQpgeA");
        setField(term370514, term370514.getClass(), "fromSigningPublicKey", "MPrLDVhNce");
        setField(term370514, term370514.getClass(), "fromPrivateKey", "tXidIUmzlF");
        setField(term370514, term370514.getClass(), "toClassicAddresses", term370563);
        setField(term370514, term370514.getClass(), "amount", "ChbSEsWapt");
        setLongField(term370675, term370675.getClass(), "fastTime", 1287722515006L);
        setField(term370675, term370675.getClass(), "cdate", null);
        setField(term370514, term370514.getClass(), "startTime", term370675);
        setField(term370514, term370514.getClass(), "destinationTag", "bQISZgxxwm");
        setField(term370514, term370514.getClass(), "trustlineIssuerClassicAddress", "GTtXOBrgdi");
        setField(term370514, term370514.getClass(), "currencyName", "YYhXdHIurl");
        setBooleanField(term370514, term370514.getClass(), "agreeFee", true);
        setField(term370514, term370514.getClass(), "maxXrpFeePerTransaction", "CkrdSBVicO");
        setBooleanField(term370514, term370514.getClass(), "globalIdVerified", false);
        setBooleanField(term370514, term370514.getClass(), "useBlacklist", true);
        setField(term370514, term370514.getClass(), "retryOfId", term370728);
        setField(term370514, term370514.getClass(), "paymentType", enum714);
        setField(term370514, term370514.getClass(), "snapshotTrustlineIssuerClassicAddress", "msqTjDOpSS");
        setField(term370514, term370514.getClass(), "snapshotCurrencyName", "pwskCNsTJJ");
        setField(term370514, term370514.getClass(), "nftIssuingAddress", "QTKtugVjKE");
        setField(term370514, term370514.getClass(), "nftTaxon", term370774);
        setField(term370514, term370514.getClass(), "frequency", enum715);
        setLongField(term370786, term370786.getClass(), "fastTime", 1495040730024L);
        setField(term370786, term370786.getClass(), "cdate", null);
        setField(term370514, term370514.getClass(), "repeatUntilDate", term370786);
        setField(term370514, term370514.getClass(), "email", "NTbKSHXEkV");
        setBooleanField(term370514, term370514.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrequency", argTypes, term370514, args);
    }

};


