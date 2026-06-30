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

public class PaymentsChange_setDropRequestId_179577083011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11061;
     Object term11107;

    public PaymentsChange_setDropRequestId_179577083011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11062 = new Long(-4920224193275732920L);
        Object term11078 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11078, term11078.getClass(), "toClassicAddress", "");
        setField(term11078, term11078.getClass(), "amount", "");
        Object term11081 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11081, term11081.getClass(), "toClassicAddress", "");
        setField(term11081, term11081.getClass(), "amount", "");
        Object term11084 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11084, term11084.getClass(), "toClassicAddress", "");
        setField(term11084, term11084.getClass(), "amount", "");
        Object term11087 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11087, term11087.getClass(), "toClassicAddress", "");
        setField(term11087, term11087.getClass(), "amount", "");
        Object term11090 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11090, term11090.getClass(), "toClassicAddress", "");
        setField(term11090, term11090.getClass(), "amount", "");
        Object term11093 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11093, term11093.getClass(), "toClassicAddress", "");
        setField(term11093, term11093.getClass(), "amount", "");
        Object term11096 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11096, term11096.getClass(), "toClassicAddress", "");
        setField(term11096, term11096.getClass(), "amount", "");
        Object term11099 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11099, term11099.getClass(), "toClassicAddress", "");
        setField(term11099, term11099.getClass(), "amount", "");
        Object term11102 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term11102, term11102.getClass(), "toClassicAddress", "");
        setField(term11102, term11102.getClass(), "amount", "");
        ArrayList term11076 = new ArrayList();
        ((ArrayList) term11076).add(term11078);
        ((ArrayList) term11076).add(term11081);
        ((ArrayList) term11076).add(term11084);
        ((ArrayList) term11076).add(term11087);
        ((ArrayList) term11076).add(term11090);
        ((ArrayList) term11076).add(term11093);
        ((ArrayList) term11076).add(term11096);
        ((ArrayList) term11076).add(term11099);
        ((ArrayList) term11076).add(term11102);
        term11061 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange"));
        setField(term11061, term11061.getClass(), "dropRequestId", term11062);
        setField(term11061, term11061.getClass(), "privateKey", "VGizxZnyHX");
        setField(term11061, term11061.getClass(), "paymentAmountChanges", term11076);
        term11107 = new Long(8428634514691209827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term11107;
        callMethod(klass, "setDropRequestId", argTypes, term11061, args);
    }

};


