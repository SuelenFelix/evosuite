package cn.edu.sustech.cs307.dto;

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
import static cn.edu.sustech.cs307.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class CourseSearchEntry_equals_20041545521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1077;
     Object term1246;

    public CourseSearchEntry_equals_20041545521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1268 = Class.forName((String) "cn.edu.sustech.cs307.dto.Course$CourseGrading");
        Field term1267 = ((Class) term1268).getDeclaredField((String) "PASS_OR_FAIL");
        ((Field) term1267).setAccessible(true);
        Object enum2 = ((Field) term1267).get((Object) null);
        HashMap term1138 = new HashMap();
        Set<Object> term1545 =  ((Map) term1138).keySet();
        HashSet term1137 = new HashSet((Collection<? extends Object>) term1545);
        ArrayList term1158 = new ArrayList();
        ((ArrayList) term1158).add("Ghbwtircqb");
        ((ArrayList) term1158).add("xrwlQZdwCp");
        ((ArrayList) term1158).add("IDCWpPLRkE");
        ((ArrayList) term1158).add("nyiiPDVjAc");
        ((ArrayList) term1158).add("aKnKipADSo");
        ((ArrayList) term1158).add("wSQxaModmm");
        ((ArrayList) term1158).add("UlajhuVLaP");
        term1077 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSearchEntry"));
        Object term1078 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Course"));
        Object term1121 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSection"));
        setField(term1078, term1078.getClass(), "id", "oVcInYnLWB");
        setField(term1078, term1078.getClass(), "name", "aJlieCFVtF");
        setIntField(term1078, term1078.getClass(), "credit", 1725571209);
        setIntField(term1078, term1078.getClass(), "classHour", -522618178);
        setField(term1078, term1078.getClass(), "grading", enum2);
        setField(term1077, term1077.getClass(), "course", term1078);
        setIntField(term1121, term1121.getClass(), "id", 1134449235);
        setField(term1121, term1121.getClass(), "name", "ZiaGIbnzTs");
        setIntField(term1121, term1121.getClass(), "totalCapacity", -883034806);
        setIntField(term1121, term1121.getClass(), "leftCapacity", 1585847225);
        setField(term1077, term1077.getClass(), "section", term1121);
        setField(term1077, term1077.getClass(), "sectionClasses", term1137);
        setField(term1077, term1077.getClass(), "conflictCourseNames", term1158);
        term1246 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.CourseSearchEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1246;
        callMethod(klass, "equals", argTypes, term1077, args);
    }

};


