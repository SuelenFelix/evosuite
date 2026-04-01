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

public class Order_getId_5201764901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3535;

    public Order_getId_5201764901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3535 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term3535, term3535.getClass(), "id", 1557431527);
        setIntField(term3535, term3535.getClass(), "goodsId", -1504890659);
        setField(term3535, term3535.getClass(), "goodsName", "VMeAzAHwZj");
        setIntField(term3535, term3535.getClass(), "customerId", 1358829571);
        setIntField(term3535, term3535.getClass(), "quantity", 991356662);
        setDoubleField(term3535, term3535.getClass(), "amountPayable", 0.1374549299694151);
        setDoubleField(term3535, term3535.getClass(), "amountPaid", 0.7031006357544823);
        setDoubleField(term3535, term3535.getClass(), "change", 0.9527281779865117);
        setIntField(term3535, term3535.getClass(), "point", -506958186);
        setField(term3535, term3535.getClass(), "salesTime", "PznxWXsZME");
        setField(term3535, term3535.getClass(), "state", "ZzIujlwVsw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3535, args);
    }

};


