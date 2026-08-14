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

public class DataImporter_importCourseSection_95242460724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4237;

    public DataImporter_importCourseSection_95242460724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4237 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term4237, term4237.getClass(), "serviceFactory", null);
        setField(term4237, term4237.getClass(), "sectionIdMap", null);
        setField(term4237, term4237.getClass(), "classIdMap", null);
        setField(term4237, term4237.getClass(), "semesterIdMap", null);
        setField(term4237, term4237.getClass(), "departmentIdMap", null);
        setField(term4237, term4237.getClass(), "majorIdMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "importCourseSection", argTypes, term4237, args);
    }

};


