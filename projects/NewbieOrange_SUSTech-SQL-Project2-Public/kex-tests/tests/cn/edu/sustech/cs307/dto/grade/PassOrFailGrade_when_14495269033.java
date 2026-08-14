package cn.edu.sustech.cs307.dto.grade;

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
import static cn.edu.sustech.cs307.dto.grade.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class PassOrFailGrade_when_14495269033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public PassOrFailGrade_when_14495269033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65 = Class.forName((String) "cn.edu.sustech.cs307.dto.grade.PassOrFailGrade");
        Field term64 = ((Class) term65).getDeclaredField((String) "PASS");
        ((Field) term64).setAccessible(true);
        enum0 = ((Field) term64).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.grade.PassOrFailGrade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("cn.edu.sustech.cs307.dto.grade.Grade$Cases");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "when", argTypes, enum0, args);
    }

};


