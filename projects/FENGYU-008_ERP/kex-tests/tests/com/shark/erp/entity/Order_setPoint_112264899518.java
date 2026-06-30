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

public class Order_setPoint_112264899518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4846;
     Object term4891;

    public Order_setPoint_112264899518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4846 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term4846, term4846.getClass(), "id", -129547140);
        setIntField(term4846, term4846.getClass(), "goodsId", 199287428);
        setField(term4846, term4846.getClass(), "goodsName", "vKQukfbJUd");
        setIntField(term4846, term4846.getClass(), "customerId", -1195339592);
        setIntField(term4846, term4846.getClass(), "quantity", -376422566);
        setDoubleField(term4846, term4846.getClass(), "amountPayable", 0.025133051616627267);
        setDoubleField(term4846, term4846.getClass(), "amountPaid", 0.016575281023182953);
        setDoubleField(term4846, term4846.getClass(), "change", 0.5308350402051779);
        setIntField(term4846, term4846.getClass(), "point", 306847454);
        setField(term4846, term4846.getClass(), "salesTime", "lFRJFUMVbx");
        setField(term4846, term4846.getClass(), "state", "sZdUNdggUW");
        term4891 = new Integer(1745276158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4891;
        callMethod(klass, "setPoint", argTypes, term4846, args);
    }

};


