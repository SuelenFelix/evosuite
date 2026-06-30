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

public class PaymentsChange_PaymentsChangeBuilder_privateKey_5017024082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338049;

    public PaymentsChange_PaymentsChangeBuilder_privateKey_5017024082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term338050 = new Long(1038272501243892514L);
        Object term338066 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338066, term338066.getClass(), "toClassicAddress", "");
        setField(term338066, term338066.getClass(), "amount", "");
        Object term338069 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338069, term338069.getClass(), "toClassicAddress", "");
        setField(term338069, term338069.getClass(), "amount", "");
        Object term338072 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338072, term338072.getClass(), "toClassicAddress", "");
        setField(term338072, term338072.getClass(), "amount", "");
        Object term338075 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338075, term338075.getClass(), "toClassicAddress", "");
        setField(term338075, term338075.getClass(), "amount", "");
        Object term338078 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338078, term338078.getClass(), "toClassicAddress", "");
        setField(term338078, term338078.getClass(), "amount", "");
        Object term338081 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338081, term338081.getClass(), "toClassicAddress", "");
        setField(term338081, term338081.getClass(), "amount", "");
        Object term338084 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338084, term338084.getClass(), "toClassicAddress", "");
        setField(term338084, term338084.getClass(), "amount", "");
        Object term338087 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term338087, term338087.getClass(), "toClassicAddress", "");
        setField(term338087, term338087.getClass(), "amount", "");
        ArrayList term338064 = new ArrayList();
        ((ArrayList) term338064).add(term338066);
        ((ArrayList) term338064).add(term338069);
        ((ArrayList) term338064).add(term338072);
        ((ArrayList) term338064).add(term338075);
        ((ArrayList) term338064).add(term338078);
        ((ArrayList) term338064).add(term338081);
        ((ArrayList) term338064).add(term338084);
        ((ArrayList) term338064).add(term338087);
        term338049 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange$PaymentsChangeBuilder"));
        setField(term338049, term338049.getClass(), "dropRequestId", term338050);
        setField(term338049, term338049.getClass(), "privateKey", "hxSnnaHCFY");
        setField(term338049, term338049.getClass(), "paymentAmountChanges", term338064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange$PaymentsChangeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RMAILvTevE";
        callMethod(klass, "privateKey", argTypes, term338049, args);
    }

};


