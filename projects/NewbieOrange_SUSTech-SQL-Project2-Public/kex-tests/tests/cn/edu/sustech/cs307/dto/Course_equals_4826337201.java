package cn.edu.sustech.cs307.dto;

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
import static cn.edu.sustech.cs307.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Course_equals_4826337201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309;
     Object term352;

    public Course_equals_4826337201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term412 = Class.forName((String) "cn.edu.sustech.cs307.dto.Course$CourseGrading");
        Field term411 = ((Class) term412).getDeclaredField((String) "PASS_OR_FAIL");
        ((Field) term411).setAccessible(true);
        Object enum0 = ((Field) term411).get((Object) null);
        term309 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Course"));
        setField(term309, term309.getClass(), "id", "hRNSzYYIrc");
        setField(term309, term309.getClass(), "name", "RMFIsYGgne");
        setIntField(term309, term309.getClass(), "credit", -1922583790);
        setIntField(term309, term309.getClass(), "classHour", -616727354);
        setField(term309, term309.getClass(), "grading", enum0);
        term352 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.Course");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term352;
        callMethod(klass, "equals", argTypes, term309, args);
    }

};


