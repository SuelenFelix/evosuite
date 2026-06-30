package com.kriscfoster.controllertesting;

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
import static com.kriscfoster.controllertesting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ControllerTestingApplication_main_20501965461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;

    public ControllerTestingApplication_main_20501965461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = (Object[]) newArray("java.lang.String", 5);
        setElement(term51, 0, "MuLcgQHgqz");
        setElement(term51, 1, "xxtlPwDYFs");
        setElement(term51, 2, "jJCZpVmanW");
        setElement(term51, 3, "EGtDIRbSSb");
        setElement(term51, 4, "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kriscfoster.controllertesting.ControllerTestingApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term51;
        callMethod(klass, "main", argTypes, null, args);
    }

};


