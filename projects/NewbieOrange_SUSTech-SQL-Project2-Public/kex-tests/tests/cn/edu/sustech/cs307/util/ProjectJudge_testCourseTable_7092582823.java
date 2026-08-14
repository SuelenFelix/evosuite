package cn.edu.sustech.cs307.util;

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
import static cn.edu.sustech.cs307.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProjectJudge_testCourseTable_7092582823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2225;

    public ProjectJudge_testCourseTable_7092582823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2225 = newInstance(Class.forName("cn.edu.sustech.cs307.util.ProjectJudge"));
        setField(term2225, term2225.getClass(), "serviceFactory", null);
        setField(term2225, term2225.getClass(), "courseService", null);
        setField(term2225, term2225.getClass(), "departmentService", null);
        setField(term2225, term2225.getClass(), "semesterService", null);
        setField(term2225, term2225.getClass(), "studentService", null);
        setField(term2225, term2225.getClass(), "userService", null);
        setField(term2225, term2225.getClass(), "importer", null);
        setField(term2225, term2225.getClass(), "errorCourseList", null);
        setField(term2225, term2225.getClass(), "errorTable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.ProjectJudge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "testCourseTable", argTypes, term2225, args);
    }

};


