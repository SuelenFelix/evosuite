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

public class Consumer_run_14575303641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442;

    public Consumer_run_14575303641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442 = newInstance(Class.forName("com.zxl.dailypractice.ailiyun.Consumer"));
        Object term443 = newInstance(Class.forName("com.zxl.dailypractice.ailiyun.Resource"));
        Object term444 = newInstance(Class.forName("com.zxl.dailypractice.ailiyun.Computer"));
        setField(term444, term444.getClass(), "name", "pCTimMblYc");
        setDoubleField(term444, term444.getClass(), "price", 0.544608645520025);
        setField(term443, term443.getClass(), "computer", term444);
        setField(term442, term442.getClass(), "resource", term443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.ailiyun.Consumer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term442, args);
    }

};


