package com.shark.erp.entity;

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
import static com.shark.erp.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class Order_setAmountPayable_59275180212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4390;
     Object term4435;

    public Order_setAmountPayable_59275180212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4390 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term4390, term4390.getClass(), "id", 479531250);
        setIntField(term4390, term4390.getClass(), "goodsId", 1320570890);
        setField(term4390, term4390.getClass(), "goodsName", "rLHAoqXgPh");
        setIntField(term4390, term4390.getClass(), "customerId", -130649791);
        setIntField(term4390, term4390.getClass(), "quantity", 534834644);
        setDoubleField(term4390, term4390.getClass(), "amountPayable", 0.8823181080774973);
        setDoubleField(term4390, term4390.getClass(), "amountPaid", 0.2192450926212024);
        setDoubleField(term4390, term4390.getClass(), "change", 0.7591353014991907);
        setIntField(term4390, term4390.getClass(), "point", 1959097203);
        setField(term4390, term4390.getClass(), "salesTime", "zUlRdimJtU");
        setField(term4390, term4390.getClass(), "state", "vwbEQQNQrx");
        term4435 = new Double(0.791695029600875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term4435;
        callMethod(klass, "setAmountPayable", argTypes, term4390, args);
    }

};


