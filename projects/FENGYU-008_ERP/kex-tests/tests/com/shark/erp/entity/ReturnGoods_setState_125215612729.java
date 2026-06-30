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

public class ReturnGoods_setState_125215612729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3530;

    public ReturnGoods_setState_125215612729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3530 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term3530, term3530.getClass(), "id", 0);
        setIntField(term3530, term3530.getClass(), "goodsId", 0);
        setField(term3530, term3530.getClass(), "goodsName", null);
        setIntField(term3530, term3530.getClass(), "customerId", 0);
        setIntField(term3530, term3530.getClass(), "orderId", 0);
        setField(term3530, term3530.getClass(), "returnTime", null);
        setField(term3530, term3530.getClass(), "state", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setState", argTypes, term3530, args);
    }

};


