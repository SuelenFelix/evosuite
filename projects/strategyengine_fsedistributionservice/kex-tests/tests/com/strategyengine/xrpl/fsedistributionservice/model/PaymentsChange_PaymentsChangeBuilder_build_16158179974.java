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
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class PaymentsChange_PaymentsChangeBuilder_build_16158179974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338263;

    public PaymentsChange_PaymentsChangeBuilder_build_16158179974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term338264 = new Long(-2214621750590649821L);
        Object term338280 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338280, term338280.getClass(), "toClassicAddress", "");
        setField(term338280, term338280.getClass(), "amount", "");
        Object term338283 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338283, term338283.getClass(), "toClassicAddress", "");
        setField(term338283, term338283.getClass(), "amount", "");
        Object term338286 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338286, term338286.getClass(), "toClassicAddress", "");
        setField(term338286, term338286.getClass(), "amount", "");
        Object term338289 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338289, term338289.getClass(), "toClassicAddress", "");
        setField(term338289, term338289.getClass(), "amount", "");
        Object term338292 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338292, term338292.getClass(), "toClassicAddress", "");
        setField(term338292, term338292.getClass(), "amount", "");
        Object term338295 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338295, term338295.getClass(), "toClassicAddress", "");
        setField(term338295, term338295.getClass(), "amount", "");
        Object term338298 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338298, term338298.getClass(), "toClassicAddress", "");
        setField(term338298, term338298.getClass(), "amount", "");
        Object term338301 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338301, term338301.getClass(), "toClassicAddress", "");
        setField(term338301, term338301.getClass(), "amount", "");
        Object term338304 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338304, term338304.getClass(), "toClassicAddress", "");
        setField(term338304, term338304.getClass(), "amount", "");
        ArrayList term338278 = new ArrayList();
        ((ArrayList) term338278).add(term338280);
        ((ArrayList) term338278).add(term338283);
        ((ArrayList) term338278).add(term338286);
        ((ArrayList) term338278).add(term338289);
        ((ArrayList) term338278).add(term338292);
        ((ArrayList) term338278).add(term338295);
        ((ArrayList) term338278).add(term338298);
        ((ArrayList) term338278).add(term338301);
        ((ArrayList) term338278).add(term338304);
        term338263 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange$PaymentsChangeBuilder"));
        setField(term338263, term338263.getClass(), "dropRequestId", term338264);
        setField(term338263, term338263.getClass(), "privateKey", "NwQXMulIlF");
        setField(term338263, term338263.getClass(), "paymentAmountChanges", term338278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange$PaymentsChangeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term338263, args);
    }

};


