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

public class ReturnGoods_getGoodsName_6159325915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2677;

    public ReturnGoods_getGoodsName_6159325915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2677 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term2677, term2677.getClass(), "id", -2015048153);
        setIntField(term2677, term2677.getClass(), "goodsId", -2063457669);
        setField(term2677, term2677.getClass(), "goodsName", "QXzGXbEXMu");
        setIntField(term2677, term2677.getClass(), "customerId", -1222006000);
        setIntField(term2677, term2677.getClass(), "orderId", 2095798786);
        setField(term2677, term2677.getClass(), "returnTime", "qxSDVejjiY");
        setField(term2677, term2677.getClass(), "state", "xBsXSDjXYK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGoodsName", argTypes, term2677, args);
    }

};


