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

public class ExchangeGoods_setId_11532370952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term113;

    public ExchangeGoods_setId_11532370952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term72, term72.getClass(), "id", -1922583790);
        setIntField(term72, term72.getClass(), "goodsId", -616727354);
        setField(term72, term72.getClass(), "goodsName", "xxtlPwDYFs");
        setIntField(term72, term72.getClass(), "customerId", -1955890973);
        setIntField(term72, term72.getClass(), "orderId", -2038273078);
        setField(term72, term72.getClass(), "exchangeTime", "jJCZpVmanW");
        setField(term72, term72.getClass(), "state", "EGtDIRbSSb");
        term113 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term113;
        callMethod(klass, "setId", argTypes, term72, args);
    }

};


