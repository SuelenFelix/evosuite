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
import java.util.LinkedHashMap;

public class ProjectJudge_testDropCourses_12062938339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1670;
     Object term1778;

    public ProjectJudge_testDropCourses_12062938339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1672 = new HashMap();
        HashMap term1684 = new HashMap();
        HashMap term1696 = new HashMap();
        HashMap term1708 = new HashMap();
        HashMap term1720 = new HashMap();
        HashSet term1742 = new HashSet();
        ArrayList term1743 = new ArrayList();
        ((ArrayList) term1743).add((Object)null);
        ((ArrayList) term1743).add((Object)null);
        ((ArrayList) term1743).add((Object)null);
        ((ArrayList) term1743).add((Object)null);
        ((ArrayList) term1743).add((Object)null);
        ((ArrayList) term1743).add((Object)null);
        Object term1734 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSearchEntry"));
        Object term1735 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Course"));
        Object term1738 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSection"));
        setField(term1735, term1735.getClass(), "id", null);
        setField(term1735, term1735.getClass(), "name", null);
        setIntField(term1735, term1735.getClass(), "credit", 1236004505);
        setIntField(term1735, term1735.getClass(), "classHour", 1050765721);
        setField(term1735, term1735.getClass(), "grading", null);
        setField(term1734, term1734.getClass(), "course", term1735);
        setIntField(term1738, term1738.getClass(), "id", 474518942);
        setField(term1738, term1738.getClass(), "name", null);
        setIntField(term1738, term1738.getClass(), "totalCapacity", -1656687479);
        setIntField(term1738, term1738.getClass(), "leftCapacity", -249614216);
        setField(term1734, term1734.getClass(), "section", term1738);
        setField(term1734, term1734.getClass(), "sectionClasses", term1742);
        setField(term1734, term1734.getClass(), "conflictCourseNames", term1743);
        HashSet term1754 = new HashSet();
        ArrayList term1755 = new ArrayList();
        ((ArrayList) term1755).add((Object)null);
        ((ArrayList) term1755).add((Object)null);
        ((ArrayList) term1755).add((Object)null);
        ((ArrayList) term1755).add((Object)null);
        Object term1746 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSearchEntry"));
        Object term1747 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Course"));
        Object term1750 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSection"));
        setField(term1747, term1747.getClass(), "id", null);
        setField(term1747, term1747.getClass(), "name", null);
        setIntField(term1747, term1747.getClass(), "credit", -919416536);
        setIntField(term1747, term1747.getClass(), "classHour", -43417861);
        setField(term1747, term1747.getClass(), "grading", null);
        setField(term1746, term1746.getClass(), "course", term1747);
        setIntField(term1750, term1750.getClass(), "id", -1533843432);
        setField(term1750, term1750.getClass(), "name", null);
        setIntField(term1750, term1750.getClass(), "totalCapacity", -123338791);
        setIntField(term1750, term1750.getClass(), "leftCapacity", -1467089634);
        setField(term1746, term1746.getClass(), "section", term1750);
        setField(term1746, term1746.getClass(), "sectionClasses", term1754);
        setField(term1746, term1746.getClass(), "conflictCourseNames", term1755);
        HashSet term1766 = new HashSet();
        ArrayList term1767 = new ArrayList();
        ((ArrayList) term1767).add((Object)null);
        ((ArrayList) term1767).add((Object)null);
        Object term1758 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSearchEntry"));
        Object term1759 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Course"));
        Object term1762 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSection"));
        setField(term1759, term1759.getClass(), "id", null);
        setField(term1759, term1759.getClass(), "name", null);
        setIntField(term1759, term1759.getClass(), "credit", 1901317214);
        setIntField(term1759, term1759.getClass(), "classHour", 1166710220);
        setField(term1759, term1759.getClass(), "grading", null);
        setField(term1758, term1758.getClass(), "course", term1759);
        setIntField(term1762, term1762.getClass(), "id", -1070592289);
        setField(term1762, term1762.getClass(), "name", null);
        setIntField(term1762, term1762.getClass(), "totalCapacity", -1464172784);
        setIntField(term1762, term1762.getClass(), "leftCapacity", 32185364);
        setField(term1758, term1758.getClass(), "section", term1762);
        setField(term1758, term1758.getClass(), "sectionClasses", term1766);
        setField(term1758, term1758.getClass(), "conflictCourseNames", term1767);
        ArrayList term1732 = new ArrayList();
        ((ArrayList) term1732).add(term1734);
        ((ArrayList) term1732).add(term1746);
        ((ArrayList) term1732).add(term1758);
        HashMap term1773 = new HashMap();
        term1670 = newInstance(Class.forName("cn.edu.sustech.cs307.util.ProjectJudge"));
        Object term1671 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        Object term1772 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseTable"));
        setField(term1670, term1670.getClass(), "serviceFactory", null);
        setField(term1670, term1670.getClass(), "courseService", null);
        setField(term1670, term1670.getClass(), "departmentService", null);
        setField(term1670, term1670.getClass(), "semesterService", null);
        setField(term1670, term1670.getClass(), "studentService", null);
        setField(term1670, term1670.getClass(), "userService", null);
        setField(term1671, term1671.getClass(), "serviceFactory", null);
        setField(term1671, term1671.getClass(), "sectionIdMap", term1672);
        setField(term1671, term1671.getClass(), "classIdMap", term1684);
        setField(term1671, term1671.getClass(), "semesterIdMap", term1696);
        setField(term1671, term1671.getClass(), "departmentIdMap", term1708);
        setField(term1671, term1671.getClass(), "majorIdMap", term1720);
        setField(term1670, term1670.getClass(), "importer", term1671);
        setField(term1670, term1670.getClass(), "errorCourseList", term1732);
        setField(term1772, term1772.getClass(), "table", term1773);
        setField(term1670, term1670.getClass(), "errorTable", term1772);
        term1778 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.ProjectJudge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term1778;
        callMethod(klass, "testDropCourses", argTypes, term1670, args);
    }

};


