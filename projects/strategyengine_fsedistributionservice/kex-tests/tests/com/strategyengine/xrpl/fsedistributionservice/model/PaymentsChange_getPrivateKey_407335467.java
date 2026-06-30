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

public class PaymentsChange_getPrivateKey_407335467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10952;

    public PaymentsChange_getPrivateKey_407335467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10953 = new Long(-316468845751588286L);
        Object term10969 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10969, term10969.getClass(), "toClassicAddress", "");
        setField(term10969, term10969.getClass(), "amount", "");
        Object term10972 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10972, term10972.getClass(), "toClassicAddress", "");
        setField(term10972, term10972.getClass(), "amount", "");
        ArrayList term10967 = new ArrayList();
        ((ArrayList) term10967).add(term10969);
        ((ArrayList) term10967).add(term10972);
        term10952 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange"));
        setField(term10952, term10952.getClass(), "dropRequestId", term10953);
        setField(term10952, term10952.getClass(), "privateKey", "BRIVNtfUWU");
        setField(term10952, term10952.getClass(), "paymentAmountChanges", term10967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrivateKey", argTypes, term10952, args);
    }

};


