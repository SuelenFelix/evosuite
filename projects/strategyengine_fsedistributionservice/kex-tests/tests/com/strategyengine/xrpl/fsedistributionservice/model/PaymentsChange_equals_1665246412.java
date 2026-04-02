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

public class PaymentsChange_equals_1665246412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10751;
     Object term10782;

    public PaymentsChange_equals_1665246412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10752 = new Long(-8885298608300233488L);
        Object term10768 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10768, term10768.getClass(), "toClassicAddress", "");
        setField(term10768, term10768.getClass(), "amount", "");
        Object term10771 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10771, term10771.getClass(), "toClassicAddress", "");
        setField(term10771, term10771.getClass(), "amount", "");
        Object term10774 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10774, term10774.getClass(), "toClassicAddress", "");
        setField(term10774, term10774.getClass(), "amount", "");
        Object term10777 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10777, term10777.getClass(), "toClassicAddress", "");
        setField(term10777, term10777.getClass(), "amount", "");
        ArrayList term10766 = new ArrayList();
        ((ArrayList) term10766).add(term10768);
        ((ArrayList) term10766).add(term10771);
        ((ArrayList) term10766).add(term10774);
        ((ArrayList) term10766).add(term10777);
        term10751 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange"));
        setField(term10751, term10751.getClass(), "dropRequestId", term10752);
        setField(term10751, term10751.getClass(), "privateKey", "hCWPJQKpdc");
        setField(term10751, term10751.getClass(), "paymentAmountChanges", term10766);
        term10782 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10782;
        callMethod(klass, "equals", argTypes, term10751, args);
    }

};


