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

public class ReturnGoods_setId_1917717242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2460;
     Object term2501;

    public ReturnGoods_setId_1917717242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2460 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term2460, term2460.getClass(), "id", 568954359);
        setIntField(term2460, term2460.getClass(), "goodsId", 53410913);
        setField(term2460, term2460.getClass(), "goodsName", "DfISiziTgG");
        setIntField(term2460, term2460.getClass(), "customerId", -375014958);
        setIntField(term2460, term2460.getClass(), "orderId", 1107176718);
        setField(term2460, term2460.getClass(), "returnTime", "XqgfKFvPSD");
        setField(term2460, term2460.getClass(), "state", "JiVRgTZvKc");
        term2501 = new Integer(480137250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2501;
        callMethod(klass, "setId", argTypes, term2460, args);
    }

};


