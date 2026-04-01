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

public class Order_setState_152352892122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5170;

    public Order_setState_152352892122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5170 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term5170, term5170.getClass(), "id", -1467089634);
        setIntField(term5170, term5170.getClass(), "goodsId", 413548937);
        setField(term5170, term5170.getClass(), "goodsName", "ZkMALXpEAZ");
        setIntField(term5170, term5170.getClass(), "customerId", 1901317214);
        setIntField(term5170, term5170.getClass(), "quantity", 1166710220);
        setDoubleField(term5170, term5170.getClass(), "amountPayable", 0.0027299293098262956);
        setDoubleField(term5170, term5170.getClass(), "amountPaid", 0.29874017652881824);
        setDoubleField(term5170, term5170.getClass(), "change", 0.32554480512985284);
        setIntField(term5170, term5170.getClass(), "point", -1070592289);
        setField(term5170, term5170.getClass(), "salesTime", "tXfQjSqDzN");
        setField(term5170, term5170.getClass(), "state", "BjugTaMcxJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vGiuZVPJNH";
        callMethod(klass, "setState", argTypes, term5170, args);
    }

};


