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
import java.util.LinkedList;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class PaymentsChangeServiceImpl_addNewPayments_12026047875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5078;
     Object term5081;
     Object term5112;

    public PaymentsChangeServiceImpl_addNewPayments_12026047875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5078 = new LinkedList();
        Long term5082 = new Long(8059786003080744426L);
        Object term5098 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term5098, term5098.getClass(), "toClassicAddress", "");
        setField(term5098, term5098.getClass(), "amount", "");
        Object term5101 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term5101, term5101.getClass(), "toClassicAddress", "");
        setField(term5101, term5101.getClass(), "amount", "");
        Object term5104 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term5104, term5104.getClass(), "toClassicAddress", "");
        setField(term5104, term5104.getClass(), "amount", "");
        Object term5107 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term5107, term5107.getClass(), "toClassicAddress", "");
        setField(term5107, term5107.getClass(), "amount", "");
        ArrayList term5096 = new ArrayList();
        ((ArrayList) term5096).add(term5098);
        ((ArrayList) term5096).add(term5101);
        ((ArrayList) term5096).add(term5104);
        ((ArrayList) term5096).add(term5107);
        term5081 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange"));
        setField(term5081, term5081.getClass(), "dropRequestId", term5082);
        setField(term5081, term5081.getClass(), "privateKey", "IgRJUzaCwW");
        setField(term5081, term5081.getClass(), "paymentAmountChanges", term5096);
        term5112 = new Long(-4365849114644724155L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.PaymentsChangeServiceImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange");
        argTypes[2] = Class.forName("java.lang.Long");
        Object[] args = new Object[3];
        args[0] = term5078;
        args[1] = term5081;
        args[2] = term5112;
        callMethod(klass, "addNewPayments", argTypes, null, args);
    }

};


