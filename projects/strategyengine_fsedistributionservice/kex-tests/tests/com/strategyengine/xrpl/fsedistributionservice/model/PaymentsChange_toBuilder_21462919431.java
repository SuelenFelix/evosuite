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

public class PaymentsChange_toBuilder_21462919431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10707;

    public PaymentsChange_toBuilder_21462919431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10708 = new Long(-2813493605142626659L);
        Object term10724 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10724, term10724.getClass(), "toClassicAddress", "");
        setField(term10724, term10724.getClass(), "amount", "");
        Object term10727 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10727, term10727.getClass(), "toClassicAddress", "");
        setField(term10727, term10727.getClass(), "amount", "");
        Object term10730 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10730, term10730.getClass(), "toClassicAddress", "");
        setField(term10730, term10730.getClass(), "amount", "");
        Object term10733 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10733, term10733.getClass(), "toClassicAddress", "");
        setField(term10733, term10733.getClass(), "amount", "");
        Object term10736 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10736, term10736.getClass(), "toClassicAddress", "");
        setField(term10736, term10736.getClass(), "amount", "");
        ArrayList term10722 = new ArrayList();
        ((ArrayList) term10722).add(term10724);
        ((ArrayList) term10722).add(term10727);
        ((ArrayList) term10722).add(term10730);
        ((ArrayList) term10722).add(term10733);
        ((ArrayList) term10722).add(term10736);
        term10707 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange"));
        setField(term10707, term10707.getClass(), "dropRequestId", term10708);
        setField(term10707, term10707.getClass(), "privateKey", "eVpkWxjuki");
        setField(term10707, term10707.getClass(), "paymentAmountChanges", term10722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term10707, args);
    }

};


