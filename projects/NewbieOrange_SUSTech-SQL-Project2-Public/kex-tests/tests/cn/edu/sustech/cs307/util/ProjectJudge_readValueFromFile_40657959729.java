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

public class ProjectJudge_readValueFromFile_40657959729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2231;

    public ProjectJudge_readValueFromFile_40657959729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2231 = newInstance(Class.forName("cn.edu.sustech.cs307.util.ProjectJudge"));
        setField(term2231, term2231.getClass(), "serviceFactory", null);
        setField(term2231, term2231.getClass(), "courseService", null);
        setField(term2231, term2231.getClass(), "departmentService", null);
        setField(term2231, term2231.getClass(), "semesterService", null);
        setField(term2231, term2231.getClass(), "studentService", null);
        setField(term2231, term2231.getClass(), "userService", null);
        setField(term2231, term2231.getClass(), "importer", null);
        setField(term2231, term2231.getClass(), "errorCourseList", null);
        setField(term2231, term2231.getClass(), "errorTable", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.ProjectJudge");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "readValueFromFile", argTypes, term2231, args);
    }

};


