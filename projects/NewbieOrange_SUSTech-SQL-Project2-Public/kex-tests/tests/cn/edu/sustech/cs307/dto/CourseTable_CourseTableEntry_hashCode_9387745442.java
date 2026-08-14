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

public class CourseTable_CourseTableEntry_hashCode_9387745442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2499;

    public CourseTable_CourseTableEntry_hashCode_9387745442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2499 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseTable$CourseTableEntry"));
        Object term2512 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Instructor"));
        setField(term2499, term2499.getClass(), "courseFullName", "uWHnvSvaPl");
        setIntField(term2512, term2512.getClass(), "id", 292681826);
        setField(term2512, term2512.getClass(), "fullName", "kBdSllIBVz");
        setField(term2499, term2499.getClass(), "instructor", term2512);
        setShortField(term2499, term2499.getClass(), "classBegin", (short) -406);
        setShortField(term2499, term2499.getClass(), "classEnd", (short) 3170);
        setField(term2499, term2499.getClass(), "location", "TJmVBGfTML");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.CourseTable$CourseTableEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2499, args);
    }

};


