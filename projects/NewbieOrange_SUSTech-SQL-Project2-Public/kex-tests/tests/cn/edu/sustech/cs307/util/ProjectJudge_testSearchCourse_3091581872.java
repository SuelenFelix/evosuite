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
import java.util.HashSet;
import java.util.LinkedList;

public class ProjectJudge_testSearchCourse_3091581872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333;
     Object term417;

    public ProjectJudge_testSearchCourse_3091581872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term335 = new HashMap();
        HashMap term347 = new HashMap();
        HashMap term359 = new HashMap();
        HashMap term371 = new HashMap();
        HashMap term383 = new HashMap();
        HashSet term405 = new HashSet();
        ArrayList term406 = new ArrayList();
        ((ArrayList) term406).add((Object)null);
        ((ArrayList) term406).add((Object)null);
        Object term397 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSearchEntry"));
        Object term398 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Course"));
        Object term401 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSection"));
        setField(term398, term398.getClass(), "id", null);
        setField(term398, term398.getClass(), "name", null);
        setIntField(term398, term398.getClass(), "credit", -1530420153);
        setIntField(term398, term398.getClass(), "classHour", -469968304);
        setField(term398, term398.getClass(), "grading", null);
        setField(term397, term397.getClass(), "course", term398);
        setIntField(term401, term401.getClass(), "id", -1145578966);
        setField(term401, term401.getClass(), "name", null);
        setIntField(term401, term401.getClass(), "totalCapacity", 679763016);
        setIntField(term401, term401.getClass(), "leftCapacity", 1962444399);
        setField(term397, term397.getClass(), "section", term401);
        setField(term397, term397.getClass(), "sectionClasses", term405);
        setField(term397, term397.getClass(), "conflictCourseNames", term406);
        ArrayList term395 = new ArrayList();
        ((ArrayList) term395).add(term397);
        HashMap term412 = new HashMap();
        term333 = newInstance(Class.forName("cn.edu.sustech.cs307.util.ProjectJudge"));
        Object term334 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        Object term411 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseTable"));
        setField(term333, term333.getClass(), "serviceFactory", null);
        setField(term333, term333.getClass(), "courseService", null);
        setField(term333, term333.getClass(), "departmentService", null);
        setField(term333, term333.getClass(), "semesterService", null);
        setField(term333, term333.getClass(), "studentService", null);
        setField(term333, term333.getClass(), "userService", null);
        setField(term334, term334.getClass(), "serviceFactory", null);
        setField(term334, term334.getClass(), "sectionIdMap", term335);
        setField(term334, term334.getClass(), "classIdMap", term347);
        setField(term334, term334.getClass(), "semesterIdMap", term359);
        setField(term334, term334.getClass(), "departmentIdMap", term371);
        setField(term334, term334.getClass(), "majorIdMap", term383);
        setField(term333, term333.getClass(), "importer", term334);
        setField(term333, term333.getClass(), "errorCourseList", term395);
        setField(term411, term411.getClass(), "table", term412);
        setField(term333, term333.getClass(), "errorTable", term411);
        term417 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.ProjectJudge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term417;
        callMethod(klass, "testSearchCourse", argTypes, term333, args);
    }

};


