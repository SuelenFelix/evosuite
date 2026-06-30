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

public class Goods_setCategory_19884410264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6099;

    public Goods_setCategory_19884410264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6099 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term6099, term6099.getClass(), "id", -1560631747);
        setField(term6099, term6099.getClass(), "category", "aSkmSwTnEw");
        setField(term6099, term6099.getClass(), "goodsName", "xvkbvaEGYd");
        setField(term6099, term6099.getClass(), "productionTime", "HBGNxdNURv");
        setField(term6099, term6099.getClass(), "purchaseTime", "mfCpTPPQQm");
        setField(term6099, term6099.getClass(), "expirationTime", "OcJCIDNIXA");
        setDoubleField(term6099, term6099.getClass(), "unitPrice", 0.146431486357265);
        setIntField(term6099, term6099.getClass(), "inventory", 1215150180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XfRABIFVEp";
        callMethod(klass, "setCategory", argTypes, term6099, args);
    }

};


