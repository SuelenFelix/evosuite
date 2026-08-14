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
import java.lang.String;

public class ProjectJudge_testSearchCourses_12697736021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term133;

    public ProjectJudge_testSearchCourses_12697736021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3 = new HashMap();
        HashMap term15 = new HashMap();
        HashMap term27 = new HashMap();
        HashMap term39 = new HashMap();
        HashMap term51 = new HashMap();
        HashSet term73 = new HashSet();
        ArrayList term74 = new ArrayList();
        ((ArrayList) term74).add((Object)null);
        ((ArrayList) term74).add((Object)null);
        Object term65 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSearchEntry"));
        Object term66 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Course"));
        Object term69 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSection"));
        setField(term66, term66.getClass(), "id", null);
        setField(term66, term66.getClass(), "name", null);
        setIntField(term66, term66.getClass(), "credit", 568599855);
        setIntField(term66, term66.getClass(), "classHour", 1162663216);
        setField(term66, term66.getClass(), "grading", null);
        setField(term65, term65.getClass(), "course", term66);
        setIntField(term69, term69.getClass(), "id", 1484323161);
        setField(term69, term69.getClass(), "name", null);
        setIntField(term69, term69.getClass(), "totalCapacity", 391863371);
        setIntField(term69, term69.getClass(), "leftCapacity", -1922583790);
        setField(term65, term65.getClass(), "section", term69);
        setField(term65, term65.getClass(), "sectionClasses", term73);
        setField(term65, term65.getClass(), "conflictCourseNames", term74);
        HashSet term85 = new HashSet();
        ArrayList term86 = new ArrayList();
        ((ArrayList) term86).add((Object)null);
        ((ArrayList) term86).add((Object)null);
        ((ArrayList) term86).add((Object)null);
        Object term77 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSearchEntry"));
        Object term78 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Course"));
        Object term81 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSection"));
        setField(term78, term78.getClass(), "id", null);
        setField(term78, term78.getClass(), "name", null);
        setIntField(term78, term78.getClass(), "credit", -1339778481);
        setIntField(term78, term78.getClass(), "classHour", 1725571209);
        setField(term78, term78.getClass(), "grading", null);
        setField(term77, term77.getClass(), "course", term78);
        setIntField(term81, term81.getClass(), "id", -522618178);
        setField(term81, term81.getClass(), "name", null);
        setIntField(term81, term81.getClass(), "totalCapacity", 1134449235);
        setIntField(term81, term81.getClass(), "leftCapacity", -883034806);
        setField(term77, term77.getClass(), "section", term81);
        setField(term77, term77.getClass(), "sectionClasses", term85);
        setField(term77, term77.getClass(), "conflictCourseNames", term86);
        HashSet term97 = new HashSet();
        ArrayList term98 = new ArrayList();
        Object term89 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSearchEntry"));
        Object term90 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Course"));
        Object term93 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSection"));
        setField(term90, term90.getClass(), "id", null);
        setField(term90, term90.getClass(), "name", null);
        setIntField(term90, term90.getClass(), "credit", -655067527);
        setIntField(term90, term90.getClass(), "classHour", -6029667);
        setField(term90, term90.getClass(), "grading", null);
        setField(term89, term89.getClass(), "course", term90);
        setIntField(term93, term93.getClass(), "id", -2068769794);
        setField(term93, term93.getClass(), "name", null);
        setIntField(term93, term93.getClass(), "totalCapacity", -117576464);
        setIntField(term93, term93.getClass(), "leftCapacity", -1007160944);
        setField(term89, term89.getClass(), "section", term93);
        setField(term89, term89.getClass(), "sectionClasses", term97);
        setField(term89, term89.getClass(), "conflictCourseNames", term98);
        HashSet term109 = new HashSet();
        ArrayList term110 = new ArrayList();
        ((ArrayList) term110).add((Object)null);
        ((ArrayList) term110).add((Object)null);
        ((ArrayList) term110).add((Object)null);
        ((ArrayList) term110).add((Object)null);
        ((ArrayList) term110).add((Object)null);
        ((ArrayList) term110).add((Object)null);
        ((ArrayList) term110).add((Object)null);
        ((ArrayList) term110).add((Object)null);
        Object term101 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSearchEntry"));
        Object term102 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Course"));
        Object term105 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSection"));
        setField(term102, term102.getClass(), "id", null);
        setField(term102, term102.getClass(), "name", null);
        setIntField(term102, term102.getClass(), "credit", 1135664017);
        setIntField(term102, term102.getClass(), "classHour", 590364439);
        setField(term102, term102.getClass(), "grading", null);
        setField(term101, term101.getClass(), "course", term102);
        setIntField(term105, term105.getClass(), "id", 865208305);
        setField(term105, term105.getClass(), "name", null);
        setIntField(term105, term105.getClass(), "totalCapacity", -1275173084);
        setIntField(term105, term105.getClass(), "leftCapacity", -244121226);
        setField(term101, term101.getClass(), "section", term105);
        setField(term101, term101.getClass(), "sectionClasses", term109);
        setField(term101, term101.getClass(), "conflictCourseNames", term110);
        HashSet term121 = new HashSet();
        ArrayList term122 = new ArrayList();
        ((ArrayList) term122).add((Object)null);
        ((ArrayList) term122).add((Object)null);
        Object term113 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSearchEntry"));
        Object term114 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Course"));
        Object term117 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSection"));
        setField(term114, term114.getClass(), "id", null);
        setField(term114, term114.getClass(), "name", null);
        setIntField(term114, term114.getClass(), "credit", -203030934);
        setIntField(term114, term114.getClass(), "classHour", -1179120542);
        setField(term114, term114.getClass(), "grading", null);
        setField(term113, term113.getClass(), "course", term114);
        setIntField(term117, term117.getClass(), "id", -73683645);
        setField(term117, term117.getClass(), "name", null);
        setIntField(term117, term117.getClass(), "totalCapacity", -226514366);
        setIntField(term117, term117.getClass(), "leftCapacity", 1193880199);
        setField(term113, term113.getClass(), "section", term117);
        setField(term113, term113.getClass(), "sectionClasses", term121);
        setField(term113, term113.getClass(), "conflictCourseNames", term122);
        ArrayList term63 = new ArrayList();
        ((ArrayList) term63).add(term65);
        ((ArrayList) term63).add(term77);
        ((ArrayList) term63).add(term89);
        ((ArrayList) term63).add(term101);
        ((ArrayList) term63).add(term113);
        HashMap term128 = new HashMap();
        term1 = newInstance(Class.forName("cn.edu.sustech.cs307.util.ProjectJudge"));
        Object term2 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        Object term127 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseTable"));
        setField(term1, term1.getClass(), "serviceFactory", null);
        setField(term1, term1.getClass(), "courseService", null);
        setField(term1, term1.getClass(), "departmentService", null);
        setField(term1, term1.getClass(), "semesterService", null);
        setField(term1, term1.getClass(), "studentService", null);
        setField(term1, term1.getClass(), "userService", null);
        setField(term2, term2.getClass(), "serviceFactory", null);
        setField(term2, term2.getClass(), "sectionIdMap", term3);
        setField(term2, term2.getClass(), "classIdMap", term15);
        setField(term2, term2.getClass(), "semesterIdMap", term27);
        setField(term2, term2.getClass(), "departmentIdMap", term39);
        setField(term2, term2.getClass(), "majorIdMap", term51);
        setField(term1, term1.getClass(), "importer", term2);
        setField(term1, term1.getClass(), "errorCourseList", term63);
        setField(term127, term127.getClass(), "table", term128);
        setField(term1, term1.getClass(), "errorTable", term127);
        Class<? extends Object> term191 = Class.forName((String) "java.io.File$PathStatus");
        Field term190 = ((Class) term191).getDeclaredField((String) "INVALID");
        ((Field) term190).setAccessible(true);
        Object enum0 = ((Field) term190).get((Object) null);
        term133 = newInstance(Class.forName("java.io.File"));
        setField(term133, term133.getClass(), "path", "wSQxaModmm");
        setField(term133, term133.getClass(), "status", enum0);
        setIntField(term133, term133.getClass(), "prefixLength", -1087774327);
        setField(term133, term133.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.ProjectJudge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term133;
        callMethod(klass, "testSearchCourses", argTypes, term1, args);
    }

};


