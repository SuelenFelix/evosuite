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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class CourseSectionClass_hashCode_16444881462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98;

    public CourseSectionClass_hashCode_16444881462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term125 = new HashMap();
        Set<Object> term173 =  ((Map) term125).keySet();
        HashSet term124 = new HashSet((Collection<? extends Object>) term173);
        term98 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSectionClass"));
        Object term100 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Instructor"));
        Object term114 = newInstance(Class.forName("java.time.DayOfWeek"));
        setIntField(term98, term98.getClass(), "id", 1484323161);
        setIntField(term100, term100.getClass(), "id", 391863371);
        setField(term100, term100.getClass(), "fullName", "MuLcgQHgqz");
        setField(term98, term98.getClass(), "instructor", term100);
        setField(term114, term114.getClass(), "name", "FRIDAY");
        setIntField(term114, term114.getClass(), "ordinal", 4);
        setField(term98, term98.getClass(), "dayOfWeek", term114);
        setField(term98, term98.getClass(), "weekList", term124);
        setShortField(term98, term98.getClass(), "classBegin", (short) -1703);
        setShortField(term98, term98.getClass(), "classEnd", (short) 23627);
        setField(term98, term98.getClass(), "location", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.CourseSectionClass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term98, args);
    }

};


