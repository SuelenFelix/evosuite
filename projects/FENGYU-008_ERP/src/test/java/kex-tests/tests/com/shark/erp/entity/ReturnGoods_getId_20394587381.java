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

public class ReturnGoods_getId_20394587381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2389;

    public ReturnGoods_getId_20394587381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2389 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term2389, term2389.getClass(), "id", 1386130016);
        setIntField(term2389, term2389.getClass(), "goodsId", 1072005683);
        setField(term2389, term2389.getClass(), "goodsName", "GVizqqzXpy");
        setIntField(term2389, term2389.getClass(), "customerId", 1861318859);
        setIntField(term2389, term2389.getClass(), "orderId", 1474524152);
        setField(term2389, term2389.getClass(), "returnTime", "JqXGgAhZPl");
        setField(term2389, term2389.getClass(), "state", "jiKYgYHqIS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2389, args);
    }

};


