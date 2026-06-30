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

public class ReturnGoods_getId_203945873816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3457;

    public ReturnGoods_getId_203945873816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3457 = newInstance(Class.forName("com.shark.erp.entity.ReturnGoods"));
        setIntField(term3457, term3457.getClass(), "id", 0);
        setIntField(term3457, term3457.getClass(), "goodsId", 0);
        setField(term3457, term3457.getClass(), "goodsName", null);
        setIntField(term3457, term3457.getClass(), "customerId", 0);
        setIntField(term3457, term3457.getClass(), "orderId", 0);
        setField(term3457, term3457.getClass(), "returnTime", null);
        setField(term3457, term3457.getClass(), "state", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ReturnGoods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3457, args);
    }

};


