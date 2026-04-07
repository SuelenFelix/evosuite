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

public class Order_getCustomerId_11728152567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4011;

    public Order_getCustomerId_11728152567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4011 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term4011, term4011.getClass(), "id", 548228925);
        setIntField(term4011, term4011.getClass(), "goodsId", -749861210);
        setField(term4011, term4011.getClass(), "goodsName", "HHmNoYxIGj");
        setIntField(term4011, term4011.getClass(), "customerId", 1694224101);
        setIntField(term4011, term4011.getClass(), "quantity", 937859191);
        setDoubleField(term4011, term4011.getClass(), "amountPayable", 0.6805867182029153);
        setDoubleField(term4011, term4011.getClass(), "amountPaid", 0.2852810965221698);
        setDoubleField(term4011, term4011.getClass(), "change", 0.6300849762307866);
        setIntField(term4011, term4011.getClass(), "point", -916584829);
        setField(term4011, term4011.getClass(), "salesTime", "PtirvZmsGt");
        setField(term4011, term4011.getClass(), "state", "HWkpTmtlrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomerId", argTypes, term4011, args);
    }

};


