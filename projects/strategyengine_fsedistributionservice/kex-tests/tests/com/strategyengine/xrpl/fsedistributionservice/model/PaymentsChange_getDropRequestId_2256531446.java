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

public class PaymentsChange_getDropRequestId_2256531446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10905;

    public PaymentsChange_getDropRequestId_2256531446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10906 = new Long(-872011222785455006L);
        Object term10922 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10922, term10922.getClass(), "toClassicAddress", "");
        setField(term10922, term10922.getClass(), "amount", "");
        Object term10925 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10925, term10925.getClass(), "toClassicAddress", "");
        setField(term10925, term10925.getClass(), "amount", "");
        Object term10928 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10928, term10928.getClass(), "toClassicAddress", "");
        setField(term10928, term10928.getClass(), "amount", "");
        Object term10931 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10931, term10931.getClass(), "toClassicAddress", "");
        setField(term10931, term10931.getClass(), "amount", "");
        Object term10934 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10934, term10934.getClass(), "toClassicAddress", "");
        setField(term10934, term10934.getClass(), "amount", "");
        Object term10937 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10937, term10937.getClass(), "toClassicAddress", "");
        setField(term10937, term10937.getClass(), "amount", "");
        ArrayList term10920 = new ArrayList();
        ((ArrayList) term10920).add(term10922);
        ((ArrayList) term10920).add(term10925);
        ((ArrayList) term10920).add(term10928);
        ((ArrayList) term10920).add(term10931);
        ((ArrayList) term10920).add(term10934);
        ((ArrayList) term10920).add(term10937);
        term10905 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange"));
        setField(term10905, term10905.getClass(), "dropRequestId", term10906);
        setField(term10905, term10905.getClass(), "privateKey", "HzqpegHiRq");
        setField(term10905, term10905.getClass(), "paymentAmountChanges", term10920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDropRequestId", argTypes, term10905, args);
    }

};


