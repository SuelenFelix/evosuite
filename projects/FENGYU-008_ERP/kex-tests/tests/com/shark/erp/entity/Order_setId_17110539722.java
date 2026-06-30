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

public class Order_setId_17110539722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3610;
     Object term3655;

    public Order_setId_17110539722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3610 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term3610, term3610.getClass(), "id", -507387516);
        setIntField(term3610, term3610.getClass(), "goodsId", -1970452551);
        setField(term3610, term3610.getClass(), "goodsName", "LWyEaeIyAo");
        setIntField(term3610, term3610.getClass(), "customerId", -1896376975);
        setIntField(term3610, term3610.getClass(), "quantity", 729658803);
        setDoubleField(term3610, term3610.getClass(), "amountPayable", 0.9828442029246764);
        setDoubleField(term3610, term3610.getClass(), "amountPaid", 0.2779719046761513);
        setDoubleField(term3610, term3610.getClass(), "change", 0.6436713023569729);
        setIntField(term3610, term3610.getClass(), "point", 114754804);
        setField(term3610, term3610.getClass(), "salesTime", "yVMkkQhvmN");
        setField(term3610, term3610.getClass(), "state", "mvrkADEgpp");
        term3655 = new Integer(1687361082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3655;
        callMethod(klass, "setId", argTypes, term3610, args);
    }

};


