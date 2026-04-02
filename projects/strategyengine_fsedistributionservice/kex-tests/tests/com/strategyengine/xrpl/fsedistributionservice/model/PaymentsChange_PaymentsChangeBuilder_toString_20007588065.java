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

public class PaymentsChange_PaymentsChangeBuilder_toString_20007588065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338319;

    public PaymentsChange_PaymentsChangeBuilder_toString_20007588065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term338320 = new Long(-480743639677441412L);
        Object term338336 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338336, term338336.getClass(), "toClassicAddress", "");
        setField(term338336, term338336.getClass(), "amount", "");
        Object term338339 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338339, term338339.getClass(), "toClassicAddress", "");
        setField(term338339, term338339.getClass(), "amount", "");
        ArrayList term338334 = new ArrayList();
        ((ArrayList) term338334).add(term338336);
        ((ArrayList) term338334).add(term338339);
        term338319 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange$PaymentsChangeBuilder"));
        setField(term338319, term338319.getClass(), "dropRequestId", term338320);
        setField(term338319, term338319.getClass(), "privateKey", "PkFqFUDNRB");
        setField(term338319, term338319.getClass(), "paymentAmountChanges", term338334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange$PaymentsChangeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term338319, args);
    }

};


