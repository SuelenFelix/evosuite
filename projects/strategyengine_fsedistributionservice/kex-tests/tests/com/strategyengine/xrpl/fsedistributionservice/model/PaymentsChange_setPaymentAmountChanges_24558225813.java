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
import java.util.LinkedList;

public class PaymentsChange_setPaymentAmountChanges_24558225813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11179;
     Object term11219;

    public PaymentsChange_setPaymentAmountChanges_24558225813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11180 = new Long(8059786003080744426L);
        Object term11196 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11196, term11196.getClass(), "toClassicAddress", "");
        setField(term11196, term11196.getClass(), "amount", "");
        Object term11199 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11199, term11199.getClass(), "toClassicAddress", "");
        setField(term11199, term11199.getClass(), "amount", "");
        Object term11202 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11202, term11202.getClass(), "toClassicAddress", "");
        setField(term11202, term11202.getClass(), "amount", "");
        Object term11205 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11205, term11205.getClass(), "toClassicAddress", "");
        setField(term11205, term11205.getClass(), "amount", "");
        Object term11208 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11208, term11208.getClass(), "toClassicAddress", "");
        setField(term11208, term11208.getClass(), "amount", "");
        Object term11211 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11211, term11211.getClass(), "toClassicAddress", "");
        setField(term11211, term11211.getClass(), "amount", "");
        Object term11214 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11214, term11214.getClass(), "toClassicAddress", "");
        setField(term11214, term11214.getClass(), "amount", "");
        ArrayList term11194 = new ArrayList();
        ((ArrayList) term11194).add(term11196);
        ((ArrayList) term11194).add(term11199);
        ((ArrayList) term11194).add(term11202);
        ((ArrayList) term11194).add(term11205);
        ((ArrayList) term11194).add(term11208);
        ((ArrayList) term11194).add(term11211);
        ((ArrayList) term11194).add(term11214);
        term11179 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange"));
        setField(term11179, term11179.getClass(), "dropRequestId", term11180);
        setField(term11179, term11179.getClass(), "privateKey", "RMsXuyzKJV");
        setField(term11179, term11179.getClass(), "paymentAmountChanges", term11194);
        term11219 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term11219;
        callMethod(klass, "setPaymentAmountChanges", argTypes, term11179, args);
    }

};


