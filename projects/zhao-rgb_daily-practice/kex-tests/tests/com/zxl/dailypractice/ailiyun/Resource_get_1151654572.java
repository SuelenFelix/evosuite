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

public class Resource_get_1151654572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term498;

    public Resource_get_1151654572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term498 = newInstance(Class.forName("com.zxl.dailypractice.ailiyun.Resource"));
        Object term499 = newInstance(Class.forName("com.zxl.dailypractice.ailiyun.Computer"));
        setField(term499, term499.getClass(), "name", "RkybSrpybU");
        setDoubleField(term499, term499.getClass(), "price", 0.40176586625454525);
        setField(term498, term498.getClass(), "computer", term499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.ailiyun.Resource");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "get", argTypes, term498, args);
    }

};


