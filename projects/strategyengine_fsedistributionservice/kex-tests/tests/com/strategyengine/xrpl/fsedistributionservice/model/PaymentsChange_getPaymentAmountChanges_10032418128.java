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

public class PaymentsChange_getPaymentAmountChanges_10032418128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10987;

    public PaymentsChange_getPaymentAmountChanges_10032418128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10988 = new Long(5127676408959197577L);
        Object term11004 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11004, term11004.getClass(), "toClassicAddress", "");
        setField(term11004, term11004.getClass(), "amount", "");
        Object term11007 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11007, term11007.getClass(), "toClassicAddress", "");
        setField(term11007, term11007.getClass(), "amount", "");
        Object term11010 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11010, term11010.getClass(), "toClassicAddress", "");
        setField(term11010, term11010.getClass(), "amount", "");
        Object term11013 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11013, term11013.getClass(), "toClassicAddress", "");
        setField(term11013, term11013.getClass(), "amount", "");
        Object term11016 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11016, term11016.getClass(), "toClassicAddress", "");
        setField(term11016, term11016.getClass(), "amount", "");
        Object term11019 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11019, term11019.getClass(), "toClassicAddress", "");
        setField(term11019, term11019.getClass(), "amount", "");
        ArrayList term11002 = new ArrayList();
        ((ArrayList) term11002).add(term11004);
        ((ArrayList) term11002).add(term11007);
        ((ArrayList) term11002).add(term11010);
        ((ArrayList) term11002).add(term11013);
        ((ArrayList) term11002).add(term11016);
        ((ArrayList) term11002).add(term11019);
        term10987 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange"));
        setField(term10987, term10987.getClass(), "dropRequestId", term10988);
        setField(term10987, term10987.getClass(), "privateKey", "XYtryyobou");
        setField(term10987, term10987.getClass(), "paymentAmountChanges", term11002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPaymentAmountChanges", argTypes, term10987, args);
    }

};


