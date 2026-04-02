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

public class Order_getPoint_123188581117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4771;

    public Order_getPoint_123188581117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4771 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term4771, term4771.getClass(), "id", 1743683601);
        setIntField(term4771, term4771.getClass(), "goodsId", -945116798);
        setField(term4771, term4771.getClass(), "goodsName", "JppkknKVOw");
        setIntField(term4771, term4771.getClass(), "customerId", 1593461795);
        setIntField(term4771, term4771.getClass(), "quantity", 515182546);
        setDoubleField(term4771, term4771.getClass(), "amountPayable", 0.11179067076100713);
        setDoubleField(term4771, term4771.getClass(), "amountPaid", 0.5306473989087822);
        setDoubleField(term4771, term4771.getClass(), "change", 0.022483645678509023);
        setIntField(term4771, term4771.getClass(), "point", -936895502);
        setField(term4771, term4771.getClass(), "salesTime", "iljANwuEjk");
        setField(term4771, term4771.getClass(), "state", "kNqaJKIATy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term4771, args);
    }

};


