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

public class Purchase_getPurchasePrice_17658421059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1567;

    public Purchase_getPurchasePrice_17658421059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1567 = newInstance(Class.forName("com.shark.erp.entity.Purchase"));
        setIntField(term1567, term1567.getClass(), "id", 1442160736);
        setIntField(term1567, term1567.getClass(), "goodsId", 1114000454);
        setField(term1567, term1567.getClass(), "supplier", "hoicvmsovO");
        setIntField(term1567, term1567.getClass(), "quantity", -556405712);
        setDoubleField(term1567, term1567.getClass(), "purchasePrice", 0.6076495596892013);
        setField(term1567, term1567.getClass(), "purchaseTime", "eqJfYWRaEL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Purchase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPurchasePrice", argTypes, term1567, args);
    }

};


