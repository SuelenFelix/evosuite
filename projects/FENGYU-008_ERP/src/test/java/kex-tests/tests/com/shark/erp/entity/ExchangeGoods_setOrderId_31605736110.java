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

public class ExchangeGoods_setOrderId_31605736110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term668;
     Object term709;

    public ExchangeGoods_setOrderId_31605736110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term668 = newInstance(Class.forName("com.shark.erp.entity.ExchangeGoods"));
        setIntField(term668, term668.getClass(), "id", 679763016);
        setIntField(term668, term668.getClass(), "goodsId", 1962444399);
        setField(term668, term668.getClass(), "goodsName", "IoAlmYsBwc");
        setIntField(term668, term668.getClass(), "customerId", 767834723);
        setIntField(term668, term668.getClass(), "orderId", -602026508);
        setField(term668, term668.getClass(), "exchangeTime", "TEParAifyi");
        setField(term668, term668.getClass(), "state", "OWDIEULEFu");
        term709 = new Integer(-157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.ExchangeGoods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term709;
        callMethod(klass, "setOrderId", argTypes, term668, args);
    }

};


