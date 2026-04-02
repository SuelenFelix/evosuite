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

public class PaymentsChange_setPrivateKey_140898758212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11119;

    public PaymentsChange_setPrivateKey_140898758212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11120 = new Long(-2585684163342970173L);
        Object term11136 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11136, term11136.getClass(), "toClassicAddress", "");
        setField(term11136, term11136.getClass(), "amount", "");
        Object term11139 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11139, term11139.getClass(), "toClassicAddress", "");
        setField(term11139, term11139.getClass(), "amount", "");
        Object term11142 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11142, term11142.getClass(), "toClassicAddress", "");
        setField(term11142, term11142.getClass(), "amount", "");
        ArrayList term11134 = new ArrayList();
        ((ArrayList) term11134).add(term11136);
        ((ArrayList) term11134).add(term11139);
        ((ArrayList) term11134).add(term11142);
        term11119 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange"));
        setField(term11119, term11119.getClass(), "dropRequestId", term11120);
        setField(term11119, term11119.getClass(), "privateKey", "iikZEapDlu");
        setField(term11119, term11119.getClass(), "paymentAmountChanges", term11134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AZdLeSugwv";
        callMethod(klass, "setPrivateKey", argTypes, term11119, args);
    }

};


