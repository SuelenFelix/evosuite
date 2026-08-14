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

public class ProjectJudge_testEnrollCourse_27857622220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2222;

    public ProjectJudge_testEnrollCourse_27857622220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2222 = newInstance(Class.forName("cn.edu.sustech.cs307.util.ProjectJudge"));
        setField(term2222, term2222.getClass(), "serviceFactory", null);
        setField(term2222, term2222.getClass(), "courseService", null);
        setField(term2222, term2222.getClass(), "departmentService", null);
        setField(term2222, term2222.getClass(), "semesterService", null);
        setField(term2222, term2222.getClass(), "studentService", null);
        setField(term2222, term2222.getClass(), "userService", null);
        setField(term2222, term2222.getClass(), "importer", null);
        setField(term2222, term2222.getClass(), "errorCourseList", null);
        setField(term2222, term2222.getClass(), "errorTable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.ProjectJudge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "testEnrollCourse", argTypes, term2222, args);
    }

};


