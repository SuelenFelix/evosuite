package com.zxl.dailypractice.card.two.october.october10;

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
import static com.zxl.dailypractice.card.two.october.october10.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Student_getOriginalFileName_14545754706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465;

    public Student_getOriginalFileName_14545754706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term478 = new Integer(-2038273078);
        term465 = newInstance(Class.forName("com.zxl.dailypractice.card.two.october.october10.Student"));
        setField(term465, term465.getClass(), "taskid", "hNxWaHcfhY");
        setField(term465, term465.getClass(), "seq", term478);
        setField(term465, term465.getClass(), "originalFileName", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.two.october.october10.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOriginalFileName", argTypes, term465, args);
    }

};


