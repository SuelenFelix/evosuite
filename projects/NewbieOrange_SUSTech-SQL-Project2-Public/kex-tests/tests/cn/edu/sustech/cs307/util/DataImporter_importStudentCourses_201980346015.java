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
import java.util.LinkedHashMap;

public class DataImporter_importStudentCourses_201980346015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4074;
     Object term4135;

    public DataImporter_importStudentCourses_201980346015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4075 = new HashMap();
        HashMap term4087 = new HashMap();
        HashMap term4099 = new HashMap();
        HashMap term4111 = new HashMap();
        HashMap term4123 = new HashMap();
        term4074 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term4074, term4074.getClass(), "serviceFactory", null);
        setField(term4074, term4074.getClass(), "sectionIdMap", term4075);
        setField(term4074, term4074.getClass(), "classIdMap", term4087);
        setField(term4074, term4074.getClass(), "semesterIdMap", term4099);
        setField(term4074, term4074.getClass(), "departmentIdMap", term4111);
        setField(term4074, term4074.getClass(), "majorIdMap", term4123);
        term4135 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term4135;
        callMethod(klass, "importStudentCourses", argTypes, term4074, args);
    }

};


