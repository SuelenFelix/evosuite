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

public class Goods_setInventory_177988380916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7579;
     Object term7643;

    public Goods_setInventory_177988380916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7579 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term7579, term7579.getClass(), "id", -2119545015);
        setField(term7579, term7579.getClass(), "category", "dJGPlmSRnz");
        setField(term7579, term7579.getClass(), "goodsName", "DPskuFUobI");
        setField(term7579, term7579.getClass(), "productionTime", "wBGfLpNNiZ");
        setField(term7579, term7579.getClass(), "purchaseTime", "yUGCjlqgJE");
        setField(term7579, term7579.getClass(), "expirationTime", "PXdVZyoJyC");
        setDoubleField(term7579, term7579.getClass(), "unitPrice", 0.09067063848644474);
        setIntField(term7579, term7579.getClass(), "inventory", 1272542218);
        term7643 = new Integer(1209799204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7643;
        callMethod(klass, "setInventory", argTypes, term7579, args);
    }

};


