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

public class Order_setGoodsName_19724573996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3914;

    public Order_setGoodsName_19724573996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3914 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term3914, term3914.getClass(), "id", -571169753);
        setIntField(term3914, term3914.getClass(), "goodsId", 318591690);
        setField(term3914, term3914.getClass(), "goodsName", "MwwjNtdOFT");
        setIntField(term3914, term3914.getClass(), "customerId", -165587447);
        setIntField(term3914, term3914.getClass(), "quantity", -1347358701);
        setDoubleField(term3914, term3914.getClass(), "amountPayable", 0.10667076642995188);
        setDoubleField(term3914, term3914.getClass(), "amountPaid", 0.11493000848982304);
        setDoubleField(term3914, term3914.getClass(), "change", 0.37161417339133307);
        setIntField(term3914, term3914.getClass(), "point", 806595993);
        setField(term3914, term3914.getClass(), "salesTime", "VYkqXKVlAJ");
        setField(term3914, term3914.getClass(), "state", "XkIoWJRNwN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aNWLJdrZMq";
        callMethod(klass, "setGoodsName", argTypes, term3914, args);
    }

};


