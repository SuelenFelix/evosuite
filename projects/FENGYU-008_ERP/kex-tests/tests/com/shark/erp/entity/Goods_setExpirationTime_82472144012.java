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

public class Goods_setExpirationTime_82472144012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7099;

    public Goods_setExpirationTime_82472144012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7099 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term7099, term7099.getClass(), "id", 1922684808);
        setField(term7099, term7099.getClass(), "category", "zaloBqlrSo");
        setField(term7099, term7099.getClass(), "goodsName", "vvoLrMGCoN");
        setField(term7099, term7099.getClass(), "productionTime", "pXdglvyrQe");
        setField(term7099, term7099.getClass(), "purchaseTime", "OcfNzHYdki");
        setField(term7099, term7099.getClass(), "expirationTime", "uPuCVuZYOI");
        setDoubleField(term7099, term7099.getClass(), "unitPrice", 0.5412182593116958);
        setIntField(term7099, term7099.getClass(), "inventory", -2005784375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TweMFhxNdj";
        callMethod(klass, "setExpirationTime", argTypes, term7099, args);
    }

};


