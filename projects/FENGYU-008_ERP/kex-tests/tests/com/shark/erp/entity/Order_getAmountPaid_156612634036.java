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

public class Order_getAmountPaid_156612634036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5385;

    public Order_getAmountPaid_156612634036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5385 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term5385, term5385.getClass(), "id", 0);
        setIntField(term5385, term5385.getClass(), "goodsId", 0);
        setField(term5385, term5385.getClass(), "goodsName", null);
        setIntField(term5385, term5385.getClass(), "customerId", 0);
        setIntField(term5385, term5385.getClass(), "quantity", 0);
        setDoubleField(term5385, term5385.getClass(), "amountPayable", 0.0);
        setDoubleField(term5385, term5385.getClass(), "amountPaid", 0.0);
        setDoubleField(term5385, term5385.getClass(), "change", 0.0);
        setIntField(term5385, term5385.getClass(), "point", 0);
        setField(term5385, term5385.getClass(), "salesTime", null);
        setField(term5385, term5385.getClass(), "state", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAmountPaid", argTypes, term5385, args);
    }

};


