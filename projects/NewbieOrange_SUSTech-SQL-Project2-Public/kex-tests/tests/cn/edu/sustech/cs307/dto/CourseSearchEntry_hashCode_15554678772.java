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

public class CourseSearchEntry_hashCode_15554678772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1616;

    public CourseSearchEntry_hashCode_15554678772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1770 = Class.forName((String) "cn.edu.sustech.cs307.dto.Course$CourseGrading");
        Field term1769 = ((Class) term1770).getDeclaredField((String) "PASS_OR_FAIL");
        ((Field) term1769).setAccessible(true);
        Object enum3 = ((Field) term1769).get((Object) null);
        HashMap term1677 = new HashMap();
        Set<Object> term2047 =  ((Map) term1677).keySet();
        HashSet term1676 = new HashSet((Collection<? extends Object>) term2047);
        ArrayList term1685 = new ArrayList();
        ((ArrayList) term1685).add("LvtrsXUliU");
        ((ArrayList) term1685).add("xLbjWUgOIL");
        ((ArrayList) term1685).add("jDtqGUpnZN");
        ((ArrayList) term1685).add("nGKItKLYNC");
        ((ArrayList) term1685).add("UiUYnPrcCi");
        term1616 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSearchEntry"));
        Object term1617 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Course"));
        Object term1660 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSection"));
        setField(term1617, term1617.getClass(), "id", "gGSMzuGICf");
        setField(term1617, term1617.getClass(), "name", "hxCBltsObl");
        setIntField(term1617, term1617.getClass(), "credit", -226514366);
        setIntField(term1617, term1617.getClass(), "classHour", 1193880199);
        setField(term1617, term1617.getClass(), "grading", enum3);
        setField(term1616, term1616.getClass(), "course", term1617);
        setIntField(term1660, term1660.getClass(), "id", -1087774327);
        setField(term1660, term1660.getClass(), "name", "BndsHwAFMv");
        setIntField(term1660, term1660.getClass(), "totalCapacity", -1530420153);
        setIntField(term1660, term1660.getClass(), "leftCapacity", -469968304);
        setField(term1616, term1616.getClass(), "section", term1660);
        setField(term1616, term1616.getClass(), "sectionClasses", term1676);
        setField(term1616, term1616.getClass(), "conflictCourseNames", term1685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.CourseSearchEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1616, args);
    }

};


