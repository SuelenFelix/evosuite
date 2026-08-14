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
import java.util.HashMap;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedHashMap;

public class DataImporter_importCourses_4674690336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2547;
     Object term2608;
     Object term2683;

    public DataImporter_importCourses_4674690336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2548 = new HashMap();
        HashMap term2560 = new HashMap();
        HashMap term2572 = new HashMap();
        HashMap term2584 = new HashMap();
        HashMap term2596 = new HashMap();
        term2547 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term2547, term2547.getClass(), "serviceFactory", null);
        setField(term2547, term2547.getClass(), "sectionIdMap", term2548);
        setField(term2547, term2547.getClass(), "classIdMap", term2560);
        setField(term2547, term2547.getClass(), "semesterIdMap", term2572);
        setField(term2547, term2547.getClass(), "departmentIdMap", term2584);
        setField(term2547, term2547.getClass(), "majorIdMap", term2596);
        Class<? extends Object> term2748 = Class.forName((String) "cn.edu.sustech.cs307.dto.Course$CourseGrading");
        Field term2747 = ((Class) term2748).getDeclaredField((String) "HUNDRED_MARK_SCORE");
        ((Field) term2747).setAccessible(true);
        Object enum4 = ((Field) term2747).get((Object) null);
        Object term2611 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Course"));
        setField(term2611, term2611.getClass(), "id", "sHMXNUzNeM");
        setField(term2611, term2611.getClass(), "name", "gPzGDOEPPw");
        setIntField(term2611, term2611.getClass(), "credit", -1420269858);
        setIntField(term2611, term2611.getClass(), "classHour", -2119545015);
        setField(term2611, term2611.getClass(), "grading", enum4);
        Class<? extends Object> term3034 = Class.forName((String) "cn.edu.sustech.cs307.dto.Course$CourseGrading");
        Field term3033 = ((Class) term3034).getDeclaredField((String) "HUNDRED_MARK_SCORE");
        ((Field) term3033).setAccessible(true);
        Object enum5 = ((Field) term3033).get((Object) null);
        Object term2642 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Course"));
        setField(term2642, term2642.getClass(), "id", "");
        setField(term2642, term2642.getClass(), "name", "");
        setIntField(term2642, term2642.getClass(), "credit", 1272542218);
        setIntField(term2642, term2642.getClass(), "classHour", 1209799204);
        setField(term2642, term2642.getClass(), "grading", enum5);
        Object term2650 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Course"));
        setField(term2650, term2650.getClass(), "id", null);
        setField(term2650, term2650.getClass(), "name", null);
        setIntField(term2650, term2650.getClass(), "credit", 1094107751);
        setIntField(term2650, term2650.getClass(), "classHour", 844222656);
        setField(term2650, term2650.getClass(), "grading", enum4);
        term2608 = new LinkedList();
        ((LinkedList) term2608).add(term2611);
        ((LinkedList) term2608).add(term2642);
        ((LinkedList) term2608).add(term2650);
        ((LinkedList) term2608).add((Object)null);
        ((LinkedList) term2608).add((Object)null);
        term2683 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.Map");
        Object[] args = new Object[2];
        args[0] = term2608;
        args[1] = term2683;
        callMethod(klass, "importCourses", argTypes, term2547, args);
    }

};


