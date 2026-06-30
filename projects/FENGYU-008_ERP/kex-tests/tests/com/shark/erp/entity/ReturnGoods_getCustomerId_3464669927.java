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

public class ReturnGoods_getCustomerId_3464669927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2841;

    public ReturnGoods_getCustomerId_3464669927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2841 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term2841, term2841.getClass(), "id", 1555897383);
        setIntField(term2841, term2841.getClass(), "goodsId", 202001407);
        setField(term2841, term2841.getClass(), "goodsName", "SJiQaLvSKv");
        setIntField(term2841, term2841.getClass(), "customerId", 158873461);
        setIntField(term2841, term2841.getClass(), "orderId", -430151637);
        setField(term2841, term2841.getClass(), "returnTime", "OEXDRUKcFl");
        setField(term2841, term2841.getClass(), "state", "RYdKCNNMBR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomerId", argTypes, term2841, args);
    }

};


