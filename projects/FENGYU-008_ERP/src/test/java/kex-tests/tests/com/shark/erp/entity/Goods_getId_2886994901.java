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

public class Goods_getId_2886994901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5755;

    public Goods_getId_2886994901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5755 = newInstance(Class.forName("com.shark.erp.entity.Goods"));
        setIntField(term5755, term5755.getClass(), "id", -648200466);
        setField(term5755, term5755.getClass(), "category", "PCipZnmBOF");
        setField(term5755, term5755.getClass(), "goodsName", "zcorEihhLK");
        setField(term5755, term5755.getClass(), "productionTime", "GrqozDKFOk");
        setField(term5755, term5755.getClass(), "purchaseTime", "CFyoseFGLF");
        setField(term5755, term5755.getClass(), "expirationTime", "SFqCrhEWLm");
        setDoubleField(term5755, term5755.getClass(), "unitPrice", 0.8924855581421237);
        setIntField(term5755, term5755.getClass(), "inventory", 2007134147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.shark.erp.entity.Goods");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term5755, args);
    }

};


