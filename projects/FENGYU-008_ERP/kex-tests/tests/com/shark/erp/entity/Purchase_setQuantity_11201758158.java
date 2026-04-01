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

public class Purchase_setQuantity_11201758158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1516;
     Object term1545;

    public Purchase_setQuantity_11201758158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1516 = newInstance(Class.forName("com.shark.erp.entity.Purchase"));
        setIntField(term1516, term1516.getClass(), "id", 1240914516);
        setIntField(term1516, term1516.getClass(), "goodsId", -1465035361);
        setField(term1516, term1516.getClass(), "supplier", "ieCtQFdkii");
        setIntField(term1516, term1516.getClass(), "quantity", 1090617576);
        setDoubleField(term1516, term1516.getClass(), "purchasePrice", 0.36923381893433327);
        setField(term1516, term1516.getClass(), "purchaseTime", "dEnhdmILtU");
        term1545 = new Integer(-1547384488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Purchase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1545;
        callMethod(klass, "setQuantity", argTypes, term1516, args);
    }

};


