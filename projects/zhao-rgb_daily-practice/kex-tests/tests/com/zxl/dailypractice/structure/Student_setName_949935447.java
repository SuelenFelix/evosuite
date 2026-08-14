package com.zxl.dailypractice.structure;

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
import static com.zxl.dailypractice.structure.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Student_setName_949935447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1066;

    public Student_setName_949935447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1066 = newInstance(Class.forName("com.zxl.dailypractice.structure.Student"));
        setField(term1066, term1066.getClass(), "id", "xLbjWUgOIL");
        setField(term1066, term1066.getClass(), "name", "jDtqGUpnZN");
        setField(term1066, term1066.getClass(), "gender", "nGKItKLYNC");
        setField(term1066, term1066.getClass(), "age", "UiUYnPrcCi");
        setField(term1066, term1066.getClass(), "zy", "UoYtihxVaS");
        setField(term1066, term1066.getClass(), "score", "JDswTTCZHV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.structure.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "onpbIeEKoi";
        callMethod(klass, "setName", argTypes, term1066, args);
    }

};


