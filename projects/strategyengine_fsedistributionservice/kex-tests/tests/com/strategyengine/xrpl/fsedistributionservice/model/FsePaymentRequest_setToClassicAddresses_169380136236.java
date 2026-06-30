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
import java.util.LinkedList;

public class FsePaymentRequest_setToClassicAddresses_169380136236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381549;
     Object term381798;

    public FsePaymentRequest_setToClassicAddresses_169380136236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term381598 = new ArrayList();
        ((ArrayList) term381598).add("zIHDwkFWvV");
        ((ArrayList) term381598).add("KdiIcRqDFX");
        ((ArrayList) term381598).add("ZaJQogOfKZ");
        ((ArrayList) term381598).add("OiUMzYeuet");
        Long term381715 = new Long(-8520099975744950197L);
        Class<? extends Object> term381990 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term381989 = ((Class) term381990).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term381989).setAccessible(true);
        Object enum732 = ((Field) term381989).get((Object) null);
        Long term381769 = new Long(3505714875198206555L);
        Class<? extends Object> term382418 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term382417 = ((Class) term382418).getDeclaredField((String) "ANNUALLY");
        ((Field) term382417).setAccessible(true);
        Object enum733 = ((Field) term382417).get((Object) null);
        term381549 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term381662 = newInstance(Class.forName("java.util.Date"));
        Object term381783 = newInstance(Class.forName("java.util.Date"));
        setField(term381549, term381549.getClass(), "memo", "IwyNKjdOyh");
        setField(term381549, term381549.getClass(), "fromClassicAddress", "PSpaEkziKZ");
        setField(term381549, term381549.getClass(), "fromSigningPublicKey", "aiShGYDMDb");
        setField(term381549, term381549.getClass(), "fromPrivateKey", "GAKArYpkPT");
        setField(term381549, term381549.getClass(), "toClassicAddresses", term381598);
        setField(term381549, term381549.getClass(), "amount", "ESBgigMjFA");
        setLongField(term381662, term381662.getClass(), "fastTime", 1321552128063L);
        setField(term381662, term381662.getClass(), "cdate", null);
        setField(term381549, term381549.getClass(), "startTime", term381662);
        setField(term381549, term381549.getClass(), "destinationTag", "rdAMzcSTeH");
        setField(term381549, term381549.getClass(), "trustlineIssuerClassicAddress", "GhNJNopkXp");
        setField(term381549, term381549.getClass(), "currencyName", "BuDMkCZWXA");
        setBooleanField(term381549, term381549.getClass(), "agreeFee", true);
        setField(term381549, term381549.getClass(), "maxXrpFeePerTransaction", "CsezPlAELx");
        setBooleanField(term381549, term381549.getClass(), "globalIdVerified", true);
        setBooleanField(term381549, term381549.getClass(), "useBlacklist", true);
        setField(term381549, term381549.getClass(), "retryOfId", term381715);
        setField(term381549, term381549.getClass(), "paymentType", enum732);
        setField(term381549, term381549.getClass(), "snapshotTrustlineIssuerClassicAddress", "YTzeIhnRJF");
        setField(term381549, term381549.getClass(), "snapshotCurrencyName", "PtKdjHiCdR");
        setField(term381549, term381549.getClass(), "nftIssuingAddress", "DhqiNYcpwz");
        setField(term381549, term381549.getClass(), "nftTaxon", term381769);
        setField(term381549, term381549.getClass(), "frequency", enum733);
        setLongField(term381783, term381783.getClass(), "fastTime", 1681108752090L);
        setField(term381783, term381783.getClass(), "cdate", null);
        setField(term381549, term381549.getClass(), "repeatUntilDate", term381783);
        setField(term381549, term381549.getClass(), "email", "fucEyubzVO");
        setBooleanField(term381549, term381549.getClass(), "autoApprove", false);
        term381798 = new LinkedList();
        ((LinkedList) term381798).add("VQZBPbMvYQ");
        ((LinkedList) term381798).add("oHSwzbCFmL");
        ((LinkedList) term381798).add("");
        ((LinkedList) term381798).add((Object)null);
        ((LinkedList) term381798).add((Object)null);
        ((LinkedList) term381798).add((Object)null);
        ((LinkedList) term381798).add((Object)null);
        ((LinkedList) term381798).add((Object)null);
        ((LinkedList) term381798).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term381798;
        callMethod(klass, "setToClassicAddresses", argTypes, term381549, args);
    }

};


