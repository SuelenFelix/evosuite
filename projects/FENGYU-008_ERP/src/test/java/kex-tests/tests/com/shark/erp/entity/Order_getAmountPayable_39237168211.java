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

public class Order_getAmountPayable_39237168211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4315;

    public Order_getAmountPayable_39237168211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4315 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term4315, term4315.getClass(), "id", -1122880881);
        setIntField(term4315, term4315.getClass(), "goodsId", -542712742);
        setField(term4315, term4315.getClass(), "goodsName", "OYbzXylRWW");
        setIntField(term4315, term4315.getClass(), "customerId", -1254072822);
        setIntField(term4315, term4315.getClass(), "quantity", -1111249833);
        setDoubleField(term4315, term4315.getClass(), "amountPayable", 0.6397214730945112);
        setDoubleField(term4315, term4315.getClass(), "amountPaid", 0.25937345430928016);
        setDoubleField(term4315, term4315.getClass(), "change", 0.5873228247510078);
        setIntField(term4315, term4315.getClass(), "point", -1692331299);
        setField(term4315, term4315.getClass(), "salesTime", "DSNsTGYXDF");
        setField(term4315, term4315.getClass(), "state", "sQvGcVjdEx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAmountPayable", argTypes, term4315, args);
    }

};


