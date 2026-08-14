package com.dmatik.orefalerts.entity;

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
import static com.dmatik.orefalerts.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CurrentAlert_setDesc_1550691899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4492;

    public CurrentAlert_setDesc_1550691899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4492 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term4529 = (Object[]) newArray("java.lang.String", 2);
        setField(term4492, term4492.getClass(), "id", "XJJNClzHRf");
        setField(term4492, term4492.getClass(), "cat", "HDaezxQfQR");
        setField(term4492, term4492.getClass(), "title", "iikZEapDlu");
        setElement(term4529, 0, "nhoHrZfnIN");
        setElement(term4529, 1, "ZkMALXpEAZ");
        setField(term4492, term4492.getClass(), "data", term4529);
        setField(term4492, term4492.getClass(), "desc", "tXfQjSqDzN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlert");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BjugTaMcxJ";
        callMethod(klass, "setDesc", argTypes, term4492, args);
    }

};


