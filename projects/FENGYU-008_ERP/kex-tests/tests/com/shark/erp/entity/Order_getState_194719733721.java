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

public class Order_getState_194719733721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5095;

    public Order_getState_194719733721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5095 = newInstance(Class.forName("com.shark.erp.entity.Order"));
        setIntField(term5095, term5095.getClass(), "id", -916335264);
        setIntField(term5095, term5095.getClass(), "goodsId", -919416536);
        setField(term5095, term5095.getClass(), "goodsName", "HDaezxQfQR");
        setIntField(term5095, term5095.getClass(), "customerId", -43417861);
        setIntField(term5095, term5095.getClass(), "quantity", -1533843432);
        setDoubleField(term5095, term5095.getClass(), "amountPayable", 0.6767213143579776);
        setDoubleField(term5095, term5095.getClass(), "amountPaid", 0.48862955528902696);
        setDoubleField(term5095, term5095.getClass(), "change", 0.426231085465289);
        setIntField(term5095, term5095.getClass(), "point", -123338791);
        setField(term5095, term5095.getClass(), "salesTime", "iikZEapDlu");
        setField(term5095, term5095.getClass(), "state", "nhoHrZfnIN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term5095, args);
    }

};


