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
import java.lang.Integer;

public class ReturnGoods_setCustomerId_12608467708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2912;
     Object term2953;

    public ReturnGoods_setCustomerId_12608467708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2912 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term2912, term2912.getClass(), "id", -1697741339);
        setIntField(term2912, term2912.getClass(), "goodsId", 98922530);
        setField(term2912, term2912.getClass(), "goodsName", "yGtHPyvYiQ");
        setIntField(term2912, term2912.getClass(), "customerId", -1388471422);
        setIntField(term2912, term2912.getClass(), "orderId", -1498296052);
        setField(term2912, term2912.getClass(), "returnTime", "MvRIxilFMJ");
        setField(term2912, term2912.getClass(), "state", "iNwOJRBEjp");
        term2953 = new Integer(2098647989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2953;
        callMethod(klass, "setCustomerId", argTypes, term2912, args);
    }

};


