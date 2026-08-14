package com.zxl.dailypractice.ailiyun;

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
import static com.zxl.dailypractice.ailiyun.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Consumer_init_2743601070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417;

    public Consumer_init_2743601070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term417 = newInstance(Class.forName("com.zxl.dailypractice.ailiyun.Resource"));
        Object term418 = newInstance(Class.forName("com.zxl.dailypractice.ailiyun.Computer"));
        setField(term418, term418.getClass(), "name", "HyxfbSQYBe");
        setDoubleField(term418, term418.getClass(), "price", 0.5523635872663106);
        setField(term417, term417.getClass(), "computer", term418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.ailiyun.Consumer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.ailiyun.Resource");
        Object[] args = new Object[1];
        args[0] = term417;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


