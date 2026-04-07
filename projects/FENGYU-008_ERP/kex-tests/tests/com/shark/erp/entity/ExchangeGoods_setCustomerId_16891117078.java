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

public class ExchangeGoods_setCustomerId_16891117078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524;
     Object term565;

    public ExchangeGoods_setCustomerId_16891117078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term524 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term524, term524.getClass(), "id", -203030934);
        setIntField(term524, term524.getClass(), "goodsId", -1179120542);
        setField(term524, term524.getClass(), "goodsName", "xOEqzGAmDU");
        setIntField(term524, term524.getClass(), "customerId", -73683645);
        setIntField(term524, term524.getClass(), "orderId", -226514366);
        setField(term524, term524.getClass(), "exchangeTime", "eZFUvlxvGV");
        setField(term524, term524.getClass(), "state", "BYqFIqCKAV");
        term565 = new Integer(1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term565;
        callMethod(klass, "setCustomerId", argTypes, term524, args);
    }

};


