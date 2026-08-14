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

public class ProjectJudge_benchmark_114869515126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2228;

    public ProjectJudge_benchmark_114869515126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2228 = newInstance(Class.forName("cn.edu.sustech.cs307.util.ProjectJudge"));
        setField(term2228, term2228.getClass(), "serviceFactory", null);
        setField(term2228, term2228.getClass(), "courseService", null);
        setField(term2228, term2228.getClass(), "departmentService", null);
        setField(term2228, term2228.getClass(), "semesterService", null);
        setField(term2228, term2228.getClass(), "studentService", null);
        setField(term2228, term2228.getClass(), "userService", null);
        setField(term2228, term2228.getClass(), "importer", null);
        setField(term2228, term2228.getClass(), "errorCourseList", null);
        setField(term2228, term2228.getClass(), "errorTable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.ProjectJudge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "benchmark", argTypes, term2228, args);
    }

};


