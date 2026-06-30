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

public class ReturnGoods_getGoodsId_7954009643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2533;

    public ReturnGoods_getGoodsId_7954009643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2533 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term2533, term2533.getClass(), "id", -341152642);
        setIntField(term2533, term2533.getClass(), "goodsId", -2015854073);
        setField(term2533, term2533.getClass(), "goodsName", "XPKmummaqg");
        setIntField(term2533, term2533.getClass(), "customerId", 538259104);
        setIntField(term2533, term2533.getClass(), "orderId", 96566506);
        setField(term2533, term2533.getClass(), "returnTime", "BKLfkLiZTH");
        setField(term2533, term2533.getClass(), "state", "SPpkrGcPRr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGoodsId", argTypes, term2533, args);
    }

};


