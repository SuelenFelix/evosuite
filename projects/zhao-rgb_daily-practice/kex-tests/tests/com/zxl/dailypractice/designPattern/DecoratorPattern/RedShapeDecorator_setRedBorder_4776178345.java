package com.zxl.dailypractice.designPattern.DecoratorPattern;

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
import static com.zxl.dailypractice.designPattern.DecoratorPattern.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RedShapeDecorator_setRedBorder_4776178345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8;

    public RedShapeDecorator_setRedBorder_4776178345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8 = newInstance(Class.forName("com.zxl.dailypractice.designPattern.DecoratorPattern.RedShapeDecorator"));
        setField(term8, term8.getClass(), "decoratedShape", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.designPattern.DecoratorPattern.RedShapeDecorator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.designPattern.DecoratorPattern.Shape");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRedBorder", argTypes, term8, args);
    }

};


