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

public class Producer_run_8266910401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232;

    public Producer_run_8266910401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term232 = newInstance(Class.forName("com.zxl.dailypractice.ailiyun.Producer"));
        Object term233 = newInstance(Class.forName("com.zxl.dailypractice.ailiyun.Resource"));
        Object term234 = newInstance(Class.forName("com.zxl.dailypractice.ailiyun.Computer"));
        setField(term234, term234.getClass(), "name", "NRdvgJlhkX");
        setDoubleField(term234, term234.getClass(), "price", 0.3455959125047594);
        setField(term233, term233.getClass(), "computer", term234);
        setField(term232, term232.getClass(), "resource", term233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.ailiyun.Producer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "run", argTypes, term232, args);
    }

};


