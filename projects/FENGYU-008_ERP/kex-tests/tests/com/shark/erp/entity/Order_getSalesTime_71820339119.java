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

public class Order_getSalesTime_71820339119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4923;

    public Order_getSalesTime_71820339119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4923 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term4923, term4923.getClass(), "id", 2009020256);
        setIntField(term4923, term4923.getClass(), "goodsId", 2049577015);
        setField(term4923, term4923.getClass(), "goodsName", "OqbwYQfvAe");
        setIntField(term4923, term4923.getClass(), "customerId", 1236004505);
        setIntField(term4923, term4923.getClass(), "quantity", 1050765721);
        setDoubleField(term4923, term4923.getClass(), "amountPayable", 0.7154795600170818);
        setDoubleField(term4923, term4923.getClass(), "amountPaid", 0.6355029654528058);
        setDoubleField(term4923, term4923.getClass(), "change", 0.0022646783892913414);
        setIntField(term4923, term4923.getClass(), "point", 474518942);
        setField(term4923, term4923.getClass(), "salesTime", "tRxZafjqIx");
        setField(term4923, term4923.getClass(), "state", "DhjNLmRMCu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSalesTime", argTypes, term4923, args);
    }

};


