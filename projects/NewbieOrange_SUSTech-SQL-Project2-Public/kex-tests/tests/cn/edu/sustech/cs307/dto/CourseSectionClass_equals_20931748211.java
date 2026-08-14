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

public class CourseSectionClass_equals_20931748211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term67;

    public CourseSectionClass_equals_20931748211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term31 = new HashMap();
        Set<Object> term87 =  ((Map) term31).keySet();
        HashSet term30 = new HashSet((Collection<? extends Object>) term87);
        term1 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSectionClass"));
        Object term3 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Instructor"));
        Object term17 = newInstance(Class.forName("java.time.DayOfWeek"));
        setIntField(term1, term1.getClass(), "id", 568599855);
        setIntField(term3, term3.getClass(), "id", 1162663216);
        setField(term3, term3.getClass(), "fullName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "instructor", term3);
        setField(term17, term17.getClass(), "name", "WEDNESDAY");
        setIntField(term17, term17.getClass(), "ordinal", 2);
        setField(term1, term1.getClass(), "dayOfWeek", term17);
        setField(term1, term1.getClass(), "weekList", term30);
        setShortField(term1, term1.getClass(), "classBegin", (short) 9519);
        setShortField(term1, term1.getClass(), "classEnd", (short) -10960);
        setField(term1, term1.getClass(), "location", "sjlJAEtRrb");
        term67 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.CourseSectionClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term67;
        callMethod(klass, "equals", argTypes, term1, args);
    }

};


