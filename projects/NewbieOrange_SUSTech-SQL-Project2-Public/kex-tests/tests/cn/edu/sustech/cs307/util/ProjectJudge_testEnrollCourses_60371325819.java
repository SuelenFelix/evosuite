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

public class ProjectJudge_testEnrollCourses_60371325819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2221;

    public ProjectJudge_testEnrollCourses_60371325819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2221 = newInstance(Class.forName("cn.edu.sustech.cs307.util.ProjectJudge"));
        setField(term2221, term2221.getClass(), "serviceFactory", null);
        setField(term2221, term2221.getClass(), "courseService", null);
        setField(term2221, term2221.getClass(), "departmentService", null);
        setField(term2221, term2221.getClass(), "semesterService", null);
        setField(term2221, term2221.getClass(), "studentService", null);
        setField(term2221, term2221.getClass(), "userService", null);
        setField(term2221, term2221.getClass(), "importer", null);
        setField(term2221, term2221.getClass(), "errorCourseList", null);
        setField(term2221, term2221.getClass(), "errorTable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.ProjectJudge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "testEnrollCourses", argTypes, term2221, args);
    }

};


