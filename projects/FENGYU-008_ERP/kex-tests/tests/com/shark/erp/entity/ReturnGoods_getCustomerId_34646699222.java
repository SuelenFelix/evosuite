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

public class ReturnGoods_getCustomerId_34646699222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3491;

    public ReturnGoods_getCustomerId_34646699222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3491 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term3491, term3491.getClass(), "id", 0);
        setIntField(term3491, term3491.getClass(), "goodsId", 0);
        setField(term3491, term3491.getClass(), "goodsName", null);
        setIntField(term3491, term3491.getClass(), "customerId", 0);
        setIntField(term3491, term3491.getClass(), "orderId", 0);
        setField(term3491, term3491.getClass(), "returnTime", null);
        setField(term3491, term3491.getClass(), "state", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomerId", argTypes, term3491, args);
    }

};


