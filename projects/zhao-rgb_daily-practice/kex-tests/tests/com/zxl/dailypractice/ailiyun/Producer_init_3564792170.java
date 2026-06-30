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

public class Producer_init_3564792170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207;

    public Producer_init_3564792170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207 = newInstance(Class.forName("com.zxl.dailypractice.ailiyun.Resource"));
        Object term208 = newInstance(Class.forName("com.zxl.dailypractice.ailiyun.Computer"));
        setField(term208, term208.getClass(), "name", "RMFIsYGgne");
        setDoubleField(term208, term208.getClass(), "price", 0.13238746331190498);
        setField(term207, term207.getClass(), "computer", term208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.ailiyun.Producer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.zxl.dailypractice.ailiyun.Resource");
        Object[] args = new Object[1];
        args[0] = term207;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


