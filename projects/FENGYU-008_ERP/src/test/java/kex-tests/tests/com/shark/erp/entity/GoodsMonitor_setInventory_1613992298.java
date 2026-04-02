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

public class GoodsMonitor_setInventory_1613992298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5689;
     Object term5705;

    public GoodsMonitor_setInventory_1613992298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5689 = newInstance(Class.forName("com.shark.erp.entity.GoodsMonitor"));
        setIntField(term5689, term5689.getClass(), "id", 954660603);
        setField(term5689, term5689.getClass(), "goodsName", "tlQSNgTkQX");
        setIntField(term5689, term5689.getClass(), "timeDiff", -1351605385);
        setIntField(term5689, term5689.getClass(), "inventory", 278355793);
        term5705 = new Integer(-310648604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.GoodsMonitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5705;
        callMethod(klass, "setInventory", argTypes, term5689, args);
    }

};


