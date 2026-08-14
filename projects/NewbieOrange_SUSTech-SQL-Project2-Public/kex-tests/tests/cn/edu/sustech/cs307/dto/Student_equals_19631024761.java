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
import java.lang.Object;

public class Student_equals_19631024761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2117;
     Object term2161;

    public Student_equals_19631024761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2117 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Student"));
        Object term2118 = newInstance(Class.forName("java.sql.Date"));
        Object term2120 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Major"));
        Object term2134 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Department"));
        setLongField(term2118, term2118.getClass(), "fastTime", 1442639565302L);
        setField(term2118, term2118.getClass(), "cdate", null);
        setField(term2117, term2117.getClass(), "enrolledDate", term2118);
        setIntField(term2120, term2120.getClass(), "id", 1962444399);
        setField(term2120, term2120.getClass(), "name", "UoYtihxVaS");
        setIntField(term2134, term2134.getClass(), "id", 767834723);
        setField(term2134, term2134.getClass(), "name", "JDswTTCZHV");
        setField(term2120, term2120.getClass(), "department", term2134);
        setField(term2117, term2117.getClass(), "major", term2120);
        setIntField(term2117, term2117.getClass(), "id", -602026508);
        setField(term2117, term2117.getClass(), "fullName", "onpbIeEKoi");
        term2161 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2161;
        callMethod(klass, "equals", argTypes, term2117, args);
    }

};


