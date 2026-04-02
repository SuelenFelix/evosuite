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

public class Order_setQuantity_115772893210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4238;
     Object term4283;

    public Order_setQuantity_115772893210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4238 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term4238, term4238.getClass(), "id", -1476644457);
        setIntField(term4238, term4238.getClass(), "goodsId", 1270666529);
        setField(term4238, term4238.getClass(), "goodsName", "PapWxkhEWe");
        setIntField(term4238, term4238.getClass(), "customerId", -1146679443);
        setIntField(term4238, term4238.getClass(), "quantity", -860131894);
        setDoubleField(term4238, term4238.getClass(), "amountPayable", 0.22651340641904605);
        setDoubleField(term4238, term4238.getClass(), "amountPaid", 0.8878841294187743);
        setDoubleField(term4238, term4238.getClass(), "change", 0.6588948704887806);
        setIntField(term4238, term4238.getClass(), "point", -1022990421);
        setField(term4238, term4238.getClass(), "salesTime", "smnHEqRFRx");
        setField(term4238, term4238.getClass(), "state", "XYtryyobou");
        term4283 = new Integer(1045547089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4283;
        callMethod(klass, "setQuantity", argTypes, term4238, args);
    }

};


