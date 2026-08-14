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

public class CourseTable_CourseTableEntry_hashCode_9387745445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2573;

    public CourseTable_CourseTableEntry_hashCode_9387745445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2573 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseTable$CourseTableEntry"));
        setField(term2573, term2573.getClass(), "courseFullName", null);
        setField(term2573, term2573.getClass(), "instructor", null);
        setShortField(term2573, term2573.getClass(), "classBegin", (short) 0);
        setShortField(term2573, term2573.getClass(), "classEnd", (short) 0);
        setField(term2573, term2573.getClass(), "location", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.CourseTable$CourseTableEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2573, args);
    }

};


