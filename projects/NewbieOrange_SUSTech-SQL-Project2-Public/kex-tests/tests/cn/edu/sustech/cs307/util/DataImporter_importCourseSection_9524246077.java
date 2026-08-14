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

public class DataImporter_importCourseSection_9524246077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3319;
     Object term3380;

    public DataImporter_importCourseSection_9524246077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3320 = new HashMap();
        HashMap term3332 = new HashMap();
        HashMap term3344 = new HashMap();
        HashMap term3356 = new HashMap();
        HashMap term3368 = new HashMap();
        term3319 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term3319, term3319.getClass(), "serviceFactory", null);
        setField(term3319, term3319.getClass(), "sectionIdMap", term3320);
        setField(term3319, term3319.getClass(), "classIdMap", term3332);
        setField(term3319, term3319.getClass(), "semesterIdMap", term3344);
        setField(term3319, term3319.getClass(), "departmentIdMap", term3356);
        setField(term3319, term3319.getClass(), "majorIdMap", term3368);
        term3380 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term3380;
        callMethod(klass, "importCourseSection", argTypes, term3319, args);
    }

};


