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

public class ReturnGoods_setOrderId_102895145810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3056;
     Object term3097;

    public ReturnGoods_setOrderId_102895145810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3056 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term3056, term3056.getClass(), "id", 1953277050);
        setIntField(term3056, term3056.getClass(), "goodsId", 1283079251);
        setField(term3056, term3056.getClass(), "goodsName", "dpNsDgfPso");
        setIntField(term3056, term3056.getClass(), "customerId", -523949691);
        setIntField(term3056, term3056.getClass(), "orderId", 1398204340);
        setField(term3056, term3056.getClass(), "returnTime", "hCWPJQKpdc");
        setField(term3056, term3056.getClass(), "state", "WzMEhMXkKx");
        term3097 = new Integer(229204365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3097;
        callMethod(klass, "setOrderId", argTypes, term3056, args);
    }

};


