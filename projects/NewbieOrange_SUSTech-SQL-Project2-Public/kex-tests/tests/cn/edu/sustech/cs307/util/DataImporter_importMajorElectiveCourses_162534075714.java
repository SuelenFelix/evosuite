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

public class DataImporter_importMajorElectiveCourses_162534075714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3957;
     Object term4018;

    public DataImporter_importMajorElectiveCourses_162534075714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3958 = new HashMap();
        HashMap term3970 = new HashMap();
        HashMap term3982 = new HashMap();
        HashMap term3994 = new HashMap();
        HashMap term4006 = new HashMap();
        term3957 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term3957, term3957.getClass(), "serviceFactory", null);
        setField(term3957, term3957.getClass(), "sectionIdMap", term3958);
        setField(term3957, term3957.getClass(), "classIdMap", term3970);
        setField(term3957, term3957.getClass(), "semesterIdMap", term3982);
        setField(term3957, term3957.getClass(), "departmentIdMap", term3994);
        setField(term3957, term3957.getClass(), "majorIdMap", term4006);
        term4018 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term4018;
        callMethod(klass, "importMajorElectiveCourses", argTypes, term3957, args);
    }

};


