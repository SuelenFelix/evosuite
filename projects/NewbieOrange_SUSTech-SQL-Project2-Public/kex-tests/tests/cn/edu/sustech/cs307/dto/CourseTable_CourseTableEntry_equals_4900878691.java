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

public class CourseTable_CourseTableEntry_equals_4900878691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2427;
     Object term2468;

    public CourseTable_CourseTableEntry_equals_4900878691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2427 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseTable$CourseTableEntry"));
        Object term2440 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Instructor"));
        setField(term2427, term2427.getClass(), "courseFullName", "hoicvmsovO");
        setIntField(term2440, term2440.getClass(), "id", -1048298087);
        setField(term2440, term2440.getClass(), "fullName", "eqJfYWRaEL");
        setField(term2427, term2427.getClass(), "instructor", term2440);
        setShortField(term2427, term2427.getClass(), "classBegin", (short) 26404);
        setShortField(term2427, term2427.getClass(), "classEnd", (short) 374);
        setField(term2427, term2427.getClass(), "location", "fhkbdRViHi");
        term2468 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.CourseTable$CourseTableEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2468;
        callMethod(klass, "equals", argTypes, term2427, args);
    }

};


