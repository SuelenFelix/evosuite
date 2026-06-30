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

public class Goods_getInventory_74697453715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7465;

    public Goods_getInventory_74697453715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7465 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term7465, term7465.getClass(), "id", 1774507971);
        setField(term7465, term7465.getClass(), "category", "vKitydDVnM");
        setField(term7465, term7465.getClass(), "goodsName", "urCiQnUFBM");
        setField(term7465, term7465.getClass(), "productionTime", "EKjQdtKxAM");
        setField(term7465, term7465.getClass(), "purchaseTime", "TXZAIPQJHt");
        setField(term7465, term7465.getClass(), "expirationTime", "DIbeDHICho");
        setDoubleField(term7465, term7465.getClass(), "unitPrice", 0.5617009352394552);
        setIntField(term7465, term7465.getClass(), "inventory", -1420269858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInventory", argTypes, term7465, args);
    }

};


