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

public class ReturnGoods_setId_19177172417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3462;
     Object term3467;

    public ReturnGoods_setId_19177172417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3462 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term3462, term3462.getClass(), "id", 0);
        setIntField(term3462, term3462.getClass(), "goodsId", 0);
        setField(term3462, term3462.getClass(), "goodsName", null);
        setIntField(term3462, term3462.getClass(), "customerId", 0);
        setIntField(term3462, term3462.getClass(), "orderId", 0);
        setField(term3462, term3462.getClass(), "returnTime", null);
        setField(term3462, term3462.getClass(), "state", null);
        term3467 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3467;
        callMethod(klass, "setId", argTypes, term3462, args);
    }

};


