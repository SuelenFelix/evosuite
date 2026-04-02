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

public class Order_getChange_151497691215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4619;

    public Order_getChange_151497691215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4619 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term4619, term4619.getClass(), "id", -282881827);
        setIntField(term4619, term4619.getClass(), "goodsId", -1183353915);
        setField(term4619, term4619.getClass(), "goodsName", "DyiXbeYIaN");
        setIntField(term4619, term4619.getClass(), "customerId", -420030135);
        setIntField(term4619, term4619.getClass(), "quantity", 267763294);
        setDoubleField(term4619, term4619.getClass(), "amountPayable", 0.20737514139742264);
        setDoubleField(term4619, term4619.getClass(), "amountPaid", 0.7919370314903882);
        setDoubleField(term4619, term4619.getClass(), "change", 0.2109867221632754);
        setIntField(term4619, term4619.getClass(), "point", -1497710478);
        setField(term4619, term4619.getClass(), "salesTime", "VGizxZnyHX");
        setField(term4619, term4619.getClass(), "state", "kVEZMHmRtR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChange", argTypes, term4619, args);
    }

};


