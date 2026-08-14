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
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.String;

public class ProjectJudge_testCourseTables_10156178667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1216;
     Object term1288;

    public ProjectJudge_testCourseTables_10156178667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1218 = new HashMap();
        HashMap term1230 = new HashMap();
        HashMap term1242 = new HashMap();
        HashMap term1254 = new HashMap();
        HashMap term1266 = new HashMap();
        ArrayList term1278 = new ArrayList();
        HashMap term1283 = new HashMap();
        term1216 = newInstance(Class.forName("cn.edu.sustech.cs307.util.ProjectJudge"));
        Object term1217 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        Object term1282 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseTable"));
        setField(term1216, term1216.getClass(), "serviceFactory", null);
        setField(term1216, term1216.getClass(), "courseService", null);
        setField(term1216, term1216.getClass(), "departmentService", null);
        setField(term1216, term1216.getClass(), "semesterService", null);
        setField(term1216, term1216.getClass(), "studentService", null);
        setField(term1216, term1216.getClass(), "userService", null);
        setField(term1217, term1217.getClass(), "serviceFactory", null);
        setField(term1217, term1217.getClass(), "sectionIdMap", term1218);
        setField(term1217, term1217.getClass(), "classIdMap", term1230);
        setField(term1217, term1217.getClass(), "semesterIdMap", term1242);
        setField(term1217, term1217.getClass(), "departmentIdMap", term1254);
        setField(term1217, term1217.getClass(), "majorIdMap", term1266);
        setField(term1216, term1216.getClass(), "importer", term1217);
        setField(term1216, term1216.getClass(), "errorCourseList", term1278);
        setField(term1282, term1282.getClass(), "table", term1283);
        setField(term1216, term1216.getClass(), "errorTable", term1282);
        Class<? extends Object> term1324 = Class.forName((String) "java.io.File$PathStatus");
        Field term1323 = ((Class) term1324).getDeclaredField((String) "INVALID");
        ((Field) term1323).setAccessible(true);
        Object enum2 = ((Field) term1323).get((Object) null);
        term1288 = newInstance(Class.forName("java.io.File"));
        setField(term1288, term1288.getClass(), "path", "ypEdrstygY");
        setField(term1288, term1288.getClass(), "status", enum2);
        setIntField(term1288, term1288.getClass(), "prefixLength", 982388293);
        setField(term1288, term1288.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.ProjectJudge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term1288;
        callMethod(klass, "testCourseTables", argTypes, term1216, args);
    }

};


