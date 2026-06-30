package com.strategyengine.xrpl.fsedistributionservice.service.impl;

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
import static com.strategyengine.xrpl.fsedistributionservice.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;

public class PaymentServiceImpl_allowPaymentNoPersist_5257902283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9142;
     Object term9353;

    public PaymentServiceImpl_allowPaymentNoPersist_5257902283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9191 = new ArrayList();
        ((ArrayList) term9191).add("VeDtgDzGAN");
        Long term9272 = new Long(4178434741742309755L);
        Class<? extends Object> term9547 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term9546 = ((Class) term9547).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term9546).setAccessible(true);
        Object enum15 = ((Field) term9546).get((Object) null);
        Long term9326 = new Long(-2068172595987555756L);
        Class<? extends Object> term9975 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term9974 = ((Class) term9975).getDeclaredField((String) "WEEKLY");
        ((Field) term9974).setAccessible(true);
        Object enum16 = ((Field) term9974).get((Object) null);
        term9142 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term9219 = newInstance(Class.forName("java.util.Date"));
        Object term9338 = newInstance(Class.forName("java.util.Date"));
        setField(term9142, term9142.getClass(), "memo", "HHmNoYxIGj");
        setField(term9142, term9142.getClass(), "fromClassicAddress", "PtirvZmsGt");
        setField(term9142, term9142.getClass(), "fromSigningPublicKey", "HWkpTmtlrc");
        setField(term9142, term9142.getClass(), "fromPrivateKey", "hMmaoREuCK");
        setField(term9142, term9142.getClass(), "toClassicAddresses", term9191);
        setField(term9142, term9142.getClass(), "amount", "aWYOWZFyaX");
        setLongField(term9219, term9219.getClass(), "fastTime", 1538078916394L);
        setField(term9219, term9219.getClass(), "cdate", null);
        setField(term9142, term9142.getClass(), "startTime", term9219);
        setField(term9142, term9142.getClass(), "destinationTag", "BRIVNtfUWU");
        setField(term9142, term9142.getClass(), "trustlineIssuerClassicAddress", "DbiCVtPPCT");
        setField(term9142, term9142.getClass(), "currencyName", "WzFopsaDuG");
        setBooleanField(term9142, term9142.getClass(), "agreeFee", false);
        setField(term9142, term9142.getClass(), "maxXrpFeePerTransaction", "PapWxkhEWe");
        setBooleanField(term9142, term9142.getClass(), "globalIdVerified", true);
        setBooleanField(term9142, term9142.getClass(), "useBlacklist", false);
        setField(term9142, term9142.getClass(), "retryOfId", term9272);
        setField(term9142, term9142.getClass(), "paymentType", enum15);
        setField(term9142, term9142.getClass(), "snapshotTrustlineIssuerClassicAddress", "smnHEqRFRx");
        setField(term9142, term9142.getClass(), "snapshotCurrencyName", "XYtryyobou");
        setField(term9142, term9142.getClass(), "nftIssuingAddress", "OYbzXylRWW");
        setField(term9142, term9142.getClass(), "nftTaxon", term9326);
        setField(term9142, term9142.getClass(), "frequency", enum16);
        setLongField(term9338, term9338.getClass(), "fastTime", 1744090065937L);
        setField(term9338, term9338.getClass(), "cdate", null);
        setField(term9142, term9142.getClass(), "repeatUntilDate", term9338);
        setField(term9142, term9142.getClass(), "email", "DSNsTGYXDF");
        setBooleanField(term9142, term9142.getClass(), "autoApprove", true);
        Long term9354 = new Long(-6292278961887936280L);
        Class<? extends Object> term10385 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term10384 = ((Class) term10385).getDeclaredField((String) "FAILED");
        ((Field) term10384).setAccessible(true);
        Object enum17 = ((Field) term10384).get((Object) null);
        Integer term9406 = new Integer(1227103734);
        Long term9408 = new Long(-6645965768855543712L);
        term9353 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term9368 = newInstance(Class.forName("java.util.Date"));
        Object term9370 = newInstance(Class.forName("java.util.Date"));
        setField(term9353, term9353.getClass(), "id", term9354);
        setField(term9353, term9353.getClass(), "address", "sQvGcVjdEx");
        setLongField(term9368, term9368.getClass(), "fastTime", 1347400561385L);
        setField(term9368, term9368.getClass(), "cdate", null);
        setField(term9353, term9353.getClass(), "createDate", term9368);
        setLongField(term9370, term9370.getClass(), "fastTime", 1502158153899L);
        setField(term9370, term9370.getClass(), "cdate", null);
        setField(term9353, term9353.getClass(), "updateDate", term9370);
        setField(term9353, term9353.getClass(), "status", enum17);
        setField(term9353, term9353.getClass(), "failReason", "rLHAoqXgPh");
        setField(term9353, term9353.getClass(), "code", "zUlRdimJtU");
        setField(term9353, term9353.getClass(), "retryAttempt", term9406);
        setField(term9353, term9353.getClass(), "dropRequestId", term9408);
        setField(term9353, term9353.getClass(), "snapshotBalance", "vwbEQQNQrx");
        setField(term9353, term9353.getClass(), "payAmount", "xtftXXMbem");
        setField(term9353, term9353.getClass(), "ownedNftId", "cudZvLMQon");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.PaymentServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        argTypes[1] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Object[] args = new Object[2];
        args[0] = term9142;
        args[1] = term9353;
        callMethod(klass, "allowPaymentNoPersist", argTypes, null, args);
    }

};


