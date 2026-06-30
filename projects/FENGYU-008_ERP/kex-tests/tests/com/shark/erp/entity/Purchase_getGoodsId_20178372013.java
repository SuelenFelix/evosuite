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

public class Purchase_getGoodsId_20178372013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1247;

    public Purchase_getGoodsId_20178372013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1247 = newInstance(Class.forName("com.shark.erp.entity.Purchase"));
        setIntField(term1247, term1247.getClass(), "id", -93135961);
        setIntField(term1247, term1247.getClass(), "goodsId", -112921587);
        setField(term1247, term1247.getClass(), "supplier", "jDtqGUpnZN");
        setIntField(term1247, term1247.getClass(), "quantity", 933028652);
        setDoubleField(term1247, term1247.getClass(), "purchasePrice", 0.5523635872663106);
        setField(term1247, term1247.getClass(), "purchaseTime", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Purchase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGoodsId", argTypes, term1247, args);
    }

};


