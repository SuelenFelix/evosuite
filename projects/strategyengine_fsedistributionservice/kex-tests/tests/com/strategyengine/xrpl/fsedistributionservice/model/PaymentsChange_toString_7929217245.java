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

public class PaymentsChange_toString_7929217245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10873;

    public PaymentsChange_toString_7929217245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10874 = new Long(-5476826692763582090L);
        Object term10890 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10890, term10890.getClass(), "toClassicAddress", "");
        setField(term10890, term10890.getClass(), "amount", "");
        ArrayList term10888 = new ArrayList();
        ((ArrayList) term10888).add(term10890);
        term10873 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange"));
        setField(term10873, term10873.getClass(), "dropRequestId", term10874);
        setField(term10873, term10873.getClass(), "privateKey", "UfQtPRyWRC");
        setField(term10873, term10873.getClass(), "paymentAmountChanges", term10888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10873, args);
    }

};


