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

public class FsePaymentRequest_setDestinationTag_28062462839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385363;

    public FsePaymentRequest_setDestinationTag_28062462839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term385412 = new ArrayList();
        ((ArrayList) term385412).add("eJLBbWRDRk");
        ((ArrayList) term385412).add("EREdbSLmio");
        ((ArrayList) term385412).add("fnnUVrmaXG");
        Long term385517 = new Long(-6669406542315322596L);
        Class<? extends Object> term385732 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term385731 = ((Class) term385732).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term385731).setAccessible(true);
        Object enum738 = ((Field) term385731).get((Object) null);
        Long term385571 = new Long(607455009844232907L);
        Class<? extends Object> term386160 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term386159 = ((Class) term386160).getDeclaredField((String) "MONTHLY");
        ((Field) term386159).setAccessible(true);
        Object enum739 = ((Field) term386159).get((Object) null);
        term385363 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term385464 = newInstance(Class.forName("java.util.Date"));
        Object term385584 = newInstance(Class.forName("java.util.Date"));
        setField(term385363, term385363.getClass(), "memo", "RxhYQyihmS");
        setField(term385363, term385363.getClass(), "fromClassicAddress", "JYhhBZSIiK");
        setField(term385363, term385363.getClass(), "fromSigningPublicKey", "jAjlzIxoaM");
        setField(term385363, term385363.getClass(), "fromPrivateKey", "PKfzqTdjtP");
        setField(term385363, term385363.getClass(), "toClassicAddresses", term385412);
        setField(term385363, term385363.getClass(), "amount", "MDHWoNRyfV");
        setLongField(term385464, term385464.getClass(), "fastTime", 1804062451288L);
        setField(term385464, term385464.getClass(), "cdate", null);
        setField(term385363, term385363.getClass(), "startTime", term385464);
        setField(term385363, term385363.getClass(), "destinationTag", "yAuFGfiEiN");
        setField(term385363, term385363.getClass(), "trustlineIssuerClassicAddress", "EtOSnELQvg");
        setField(term385363, term385363.getClass(), "currencyName", "dkQQxXUxmC");
        setBooleanField(term385363, term385363.getClass(), "agreeFee", true);
        setField(term385363, term385363.getClass(), "maxXrpFeePerTransaction", "SsuEoOzBgE");
        setBooleanField(term385363, term385363.getClass(), "globalIdVerified", true);
        setBooleanField(term385363, term385363.getClass(), "useBlacklist", false);
        setField(term385363, term385363.getClass(), "retryOfId", term385517);
        setField(term385363, term385363.getClass(), "paymentType", enum738);
        setField(term385363, term385363.getClass(), "snapshotTrustlineIssuerClassicAddress", "EcvJGrLPRz");
        setField(term385363, term385363.getClass(), "snapshotCurrencyName", "XtIfJsUuvC");
        setField(term385363, term385363.getClass(), "nftIssuingAddress", "WhLgjfGIGf");
        setField(term385363, term385363.getClass(), "nftTaxon", term385571);
        setField(term385363, term385363.getClass(), "frequency", enum739);
        setLongField(term385584, term385584.getClass(), "fastTime", 1673866437565L);
        setField(term385584, term385584.getClass(), "cdate", null);
        setField(term385363, term385363.getClass(), "repeatUntilDate", term385584);
        setField(term385363, term385363.getClass(), "email", "EhUQbbAhWQ");
        setBooleanField(term385363, term385363.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iIlZyBWPsg";
        callMethod(klass, "setDestinationTag", argTypes, term385363, args);
    }

};


