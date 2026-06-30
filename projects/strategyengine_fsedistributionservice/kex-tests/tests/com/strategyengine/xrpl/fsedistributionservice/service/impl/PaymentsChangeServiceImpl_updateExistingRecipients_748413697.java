package com.strategyengine.xrpl.fsedistributionservice.service.impl;

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
import static com.strategyengine.xrpl.fsedistributionservice.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class PaymentsChangeServiceImpl_updateExistingRecipients_748413697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6234;
     Object term6237;

    public PaymentsChangeServiceImpl_updateExistingRecipients_748413697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6234 = new LinkedList();
        Long term6238 = new Long(5262507301787091109L);
        Object term6254 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term6254, term6254.getClass(), "toClassicAddress", "");
        setField(term6254, term6254.getClass(), "amount", "");
        Object term6257 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term6257, term6257.getClass(), "toClassicAddress", "");
        setField(term6257, term6257.getClass(), "amount", "");
        ArrayList term6252 = new ArrayList();
        ((ArrayList) term6252).add(term6254);
        ((ArrayList) term6252).add(term6257);
        term6237 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange"));
        setField(term6237, term6237.getClass(), "dropRequestId", term6238);
        setField(term6237, term6237.getClass(), "privateKey", "xBsXSDjXYK");
        setField(term6237, term6237.getClass(), "paymentAmountChanges", term6252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.PaymentsChangeServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange");
        Object[] args = new Object[2];
        args[0] = term6234;
        args[1] = term6237;
        callMethod(klass, "updateExistingRecipients", argTypes, null, args);
    }

};


