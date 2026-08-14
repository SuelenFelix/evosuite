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

public class CourseTable_CourseTableEntry_equals_4900878694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2570;

    public CourseTable_CourseTableEntry_equals_4900878694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2570 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseTable$CourseTableEntry"));
        setField(term2570, term2570.getClass(), "courseFullName", null);
        setField(term2570, term2570.getClass(), "instructor", null);
        setShortField(term2570, term2570.getClass(), "classBegin", (short) 0);
        setShortField(term2570, term2570.getClass(), "classEnd", (short) 0);
        setField(term2570, term2570.getClass(), "location", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.CourseTable$CourseTableEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term2570, args);
    }

};


