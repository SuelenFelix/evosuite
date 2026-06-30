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

public class PaymentsChange_PaymentsChangeBuilder_dropRequestId_11920945081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338003;
     Object term338037;

    public PaymentsChange_PaymentsChangeBuilder_dropRequestId_11920945081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term338004 = new Long(9105566407535624519L);
        Object term338020 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338020, term338020.getClass(), "toClassicAddress", "");
        setField(term338020, term338020.getClass(), "amount", "");
        Object term338023 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338023, term338023.getClass(), "toClassicAddress", "");
        setField(term338023, term338023.getClass(), "amount", "");
        Object term338026 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338026, term338026.getClass(), "toClassicAddress", "");
        setField(term338026, term338026.getClass(), "amount", "");
        Object term338029 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338029, term338029.getClass(), "toClassicAddress", "");
        setField(term338029, term338029.getClass(), "amount", "");
        Object term338032 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338032, term338032.getClass(), "toClassicAddress", "");
        setField(term338032, term338032.getClass(), "amount", "");
        ArrayList term338018 = new ArrayList();
        ((ArrayList) term338018).add(term338020);
        ((ArrayList) term338018).add(term338023);
        ((ArrayList) term338018).add(term338026);
        ((ArrayList) term338018).add(term338029);
        ((ArrayList) term338018).add(term338032);
        term338003 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange$PaymentsChangeBuilder"));
        setField(term338003, term338003.getClass(), "dropRequestId", term338004);
        setField(term338003, term338003.getClass(), "privateKey", "itHxInHLQD");
        setField(term338003, term338003.getClass(), "paymentAmountChanges", term338018);
        term338037 = new Long(8850312777693707693L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange$PaymentsChangeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term338037;
        callMethod(klass, "dropRequestId", argTypes, term338003, args);
    }

};


