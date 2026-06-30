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

public class ReturnGoods_setGoodsId_7572189184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2604;
     Object term2645;

    public ReturnGoods_setGoodsId_7572189184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2604 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term2604, term2604.getClass(), "id", -343325701);
        setIntField(term2604, term2604.getClass(), "goodsId", 107945604);
        setField(term2604, term2604.getClass(), "goodsName", "sEccwbJKYE");
        setIntField(term2604, term2604.getClass(), "customerId", -1963464809);
        setIntField(term2604, term2604.getClass(), "orderId", 71190297);
        setField(term2604, term2604.getClass(), "returnTime", "AWRooQKkdW");
        setField(term2604, term2604.getClass(), "state", "vjxIhXHxGR");
        term2645 = new Integer(1202361360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2645;
        callMethod(klass, "setGoodsId", argTypes, term2604, args);
    }

};


