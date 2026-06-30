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

public class PaymentsChange_canEqual_9706872703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10793;
     Object term10821;

    public PaymentsChange_canEqual_9706872703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10794 = new Long(-4325723315152823407L);
        Object term10810 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10810, term10810.getClass(), "toClassicAddress", "");
        setField(term10810, term10810.getClass(), "amount", "");
        Object term10813 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10813, term10813.getClass(), "toClassicAddress", "");
        setField(term10813, term10813.getClass(), "amount", "");
        Object term10816 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10816, term10816.getClass(), "toClassicAddress", "");
        setField(term10816, term10816.getClass(), "amount", "");
        ArrayList term10808 = new ArrayList();
        ((ArrayList) term10808).add(term10810);
        ((ArrayList) term10808).add(term10813);
        ((ArrayList) term10808).add(term10816);
        term10793 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange"));
        setField(term10793, term10793.getClass(), "dropRequestId", term10794);
        setField(term10793, term10793.getClass(), "privateKey", "OJJtVNPyKZ");
        setField(term10793, term10793.getClass(), "paymentAmountChanges", term10808);
        term10821 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10821;
        callMethod(klass, "canEqual", argTypes, term10793, args);
    }

};


