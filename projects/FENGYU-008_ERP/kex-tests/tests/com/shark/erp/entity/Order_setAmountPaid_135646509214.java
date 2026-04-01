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

public class Order_setAmountPaid_135646509214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4542;
     Object term4587;

    public Order_setAmountPaid_135646509214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4542 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term4542, term4542.getClass(), "id", 1743224434);
        setIntField(term4542, term4542.getClass(), "goodsId", 842904495);
        setField(term4542, term4542.getClass(), "goodsName", "JmcmxoGhIK");
        setIntField(term4542, term4542.getClass(), "customerId", 1008080511);
        setIntField(term4542, term4542.getClass(), "quantity", 1935707624);
        setDoubleField(term4542, term4542.getClass(), "amountPayable", 0.8454723071922143);
        setDoubleField(term4542, term4542.getClass(), "amountPaid", 0.8566567697571895);
        setDoubleField(term4542, term4542.getClass(), "change", 0.9203805380592256);
        setIntField(term4542, term4542.getClass(), "point", 1507074215);
        setField(term4542, term4542.getClass(), "salesTime", "jXzmYyrnnT");
        setField(term4542, term4542.getClass(), "state", "igCAtimmYB");
        term4587 = new Double(0.5804948995371725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term4587;
        callMethod(klass, "setAmountPaid", argTypes, term4542, args);
    }

};


