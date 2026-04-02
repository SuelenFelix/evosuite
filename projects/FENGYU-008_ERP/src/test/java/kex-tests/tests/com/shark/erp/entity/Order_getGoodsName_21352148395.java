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

public class Order_getGoodsName_21352148395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3839;

    public Order_getGoodsName_21352148395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3839 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term3839, term3839.getClass(), "id", -426764678);
        setIntField(term3839, term3839.getClass(), "goodsId", -1222614956);
        setField(term3839, term3839.getClass(), "goodsName", "HzqpegHiRq");
        setIntField(term3839, term3839.getClass(), "customerId", -1870495012);
        setIntField(term3839, term3839.getClass(), "quantity", -1310015129);
        setDoubleField(term3839, term3839.getClass(), "amountPayable", 0.3800088629986428);
        setDoubleField(term3839, term3839.getClass(), "amountPaid", 0.5840714198152577);
        setDoubleField(term3839, term3839.getClass(), "change", 0.7559240768573477);
        setIntField(term3839, term3839.getClass(), "point", -2104981311);
        setField(term3839, term3839.getClass(), "salesTime", "jwsfVjMoJT");
        setField(term3839, term3839.getClass(), "state", "ZfdXfCCFDf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGoodsName", argTypes, term3839, args);
    }

};


