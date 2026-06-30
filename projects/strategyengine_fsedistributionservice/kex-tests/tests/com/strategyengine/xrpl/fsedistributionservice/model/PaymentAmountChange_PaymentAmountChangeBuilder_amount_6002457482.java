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

public class PaymentAmountChange_PaymentAmountChangeBuilder_amount_6002457482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414683;

    public PaymentAmountChange_PaymentAmountChangeBuilder_amount_6002457482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term414683 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange$PaymentAmountChangeBuilder"));
        setField(term414683, term414683.getClass(), "toClassicAddress", "ELjGrPDZKe");
        setField(term414683, term414683.getClass(), "amount", "MRdGOIOvoM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange$PaymentAmountChangeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CrDChgXZIs";
        callMethod(klass, "amount", argTypes, term414683, args);
    }

};


