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

public class PaymentsChange_hashCode_2821620344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10832;

    public PaymentsChange_hashCode_2821620344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10833 = new Long(2535595959091595249L);
        Object term10849 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10849, term10849.getClass(), "toClassicAddress", "");
        setField(term10849, term10849.getClass(), "amount", "");
        Object term10852 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10852, term10852.getClass(), "toClassicAddress", "");
        setField(term10852, term10852.getClass(), "amount", "");
        Object term10855 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10855, term10855.getClass(), "toClassicAddress", "");
        setField(term10855, term10855.getClass(), "amount", "");
        Object term10858 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentAmountChange"));
        setField(term10858, term10858.getClass(), "toClassicAddress", "");
        setField(term10858, term10858.getClass(), "amount", "");
        ArrayList term10847 = new ArrayList();
        ((ArrayList) term10847).add(term10849);
        ((ArrayList) term10847).add(term10852);
        ((ArrayList) term10847).add(term10855);
        ((ArrayList) term10847).add(term10858);
        term10832 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange"));
        setField(term10832, term10832.getClass(), "dropRequestId", term10833);
        setField(term10832, term10832.getClass(), "privateKey", "VMeAzAHwZj");
        setField(term10832, term10832.getClass(), "paymentAmountChanges", term10847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.PaymentsChange");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term10832, args);
    }

};


