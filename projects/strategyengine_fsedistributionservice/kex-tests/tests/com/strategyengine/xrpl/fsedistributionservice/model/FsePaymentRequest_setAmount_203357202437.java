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

public class FsePaymentRequest_setAmount_203357202437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382843;

    public FsePaymentRequest_setAmount_203357202437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term382892 = new ArrayList();
        ((ArrayList) term382892).add("NbsoEyxgdC");
        ((ArrayList) term382892).add("ycLbhblhxr");
        ((ArrayList) term382892).add("TeMgqKBBmJ");
        ((ArrayList) term382892).add("NMKQfAoNiL");
        ((ArrayList) term382892).add("QkEnJzkqzt");
        Long term383021 = new Long(4923049398658802749L);
        Class<? extends Object> term383247 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term383246 = ((Class) term383247).getDeclaredField((String) "FLAT");
        ((Field) term383246).setAccessible(true);
        Object enum734 = ((Field) term383246).get((Object) null);
        Long term383067 = new Long(-6994512078037182768L);
        Class<? extends Object> term383651 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term383650 = ((Class) term383651).getDeclaredField((String) "WEEKLY");
        ((Field) term383650).setAccessible(true);
        Object enum735 = ((Field) term383650).get((Object) null);
        term382843 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term382968 = newInstance(Class.forName("java.util.Date"));
        Object term383079 = newInstance(Class.forName("java.util.Date"));
        setField(term382843, term382843.getClass(), "memo", "mQlNexCpvc");
        setField(term382843, term382843.getClass(), "fromClassicAddress", "afdMUXeCXp");
        setField(term382843, term382843.getClass(), "fromSigningPublicKey", "raSUkLBDic");
        setField(term382843, term382843.getClass(), "fromPrivateKey", "kkhrNXKLUh");
        setField(term382843, term382843.getClass(), "toClassicAddresses", term382892);
        setField(term382843, term382843.getClass(), "amount", "EXjflggRNx");
        setLongField(term382968, term382968.getClass(), "fastTime", 1837854973493L);
        setField(term382968, term382968.getClass(), "cdate", null);
        setField(term382843, term382843.getClass(), "startTime", term382968);
        setField(term382843, term382843.getClass(), "destinationTag", "PgMPqpnlSJ");
        setField(term382843, term382843.getClass(), "trustlineIssuerClassicAddress", "SxfQzUVFcM");
        setField(term382843, term382843.getClass(), "currencyName", "KcuTYTFMUf");
        setBooleanField(term382843, term382843.getClass(), "agreeFee", true);
        setField(term382843, term382843.getClass(), "maxXrpFeePerTransaction", "duoDGJxDsp");
        setBooleanField(term382843, term382843.getClass(), "globalIdVerified", false);
        setBooleanField(term382843, term382843.getClass(), "useBlacklist", true);
        setField(term382843, term382843.getClass(), "retryOfId", term383021);
        setField(term382843, term382843.getClass(), "paymentType", enum734);
        setField(term382843, term382843.getClass(), "snapshotTrustlineIssuerClassicAddress", "WGJVyGNNwV");
        setField(term382843, term382843.getClass(), "snapshotCurrencyName", "dqaCYPfqWF");
        setField(term382843, term382843.getClass(), "nftIssuingAddress", "vGGvtGbfze");
        setField(term382843, term382843.getClass(), "nftTaxon", term383067);
        setField(term382843, term382843.getClass(), "frequency", enum735);
        setLongField(term383079, term383079.getClass(), "fastTime", 1391602026527L);
        setField(term383079, term383079.getClass(), "cdate", null);
        setField(term382843, term382843.getClass(), "repeatUntilDate", term383079);
        setField(term382843, term382843.getClass(), "email", "jWmpFQNuJp");
        setBooleanField(term382843, term382843.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dQGTDrUjmt";
        callMethod(klass, "setAmount", argTypes, term382843, args);
    }

};


