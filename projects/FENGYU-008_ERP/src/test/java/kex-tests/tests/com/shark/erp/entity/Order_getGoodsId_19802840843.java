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

public class Order_getGoodsId_19802840843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3687;

    public Order_getGoodsId_19802840843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3687 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term3687, term3687.getClass(), "id", 584893196);
        setIntField(term3687, term3687.getClass(), "goodsId", 497269071);
        setField(term3687, term3687.getClass(), "goodsName", "pXOkjyeIRb");
        setIntField(term3687, term3687.getClass(), "customerId", -1899301124);
        setIntField(term3687, term3687.getClass(), "quantity", -1882480155);
        setDoubleField(term3687, term3687.getClass(), "amountPayable", 0.7332741045694002);
        setDoubleField(term3687, term3687.getClass(), "amountPaid", 0.4569171842750229);
        setDoubleField(term3687, term3687.getClass(), "change", 0.8598297828918529);
        setIntField(term3687, term3687.getClass(), "point", -1410220680);
        setField(term3687, term3687.getClass(), "salesTime", "GgZWSjxjyE");
        setField(term3687, term3687.getClass(), "state", "EeBVbzjcCI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGoodsId", argTypes, term3687, args);
    }

};


