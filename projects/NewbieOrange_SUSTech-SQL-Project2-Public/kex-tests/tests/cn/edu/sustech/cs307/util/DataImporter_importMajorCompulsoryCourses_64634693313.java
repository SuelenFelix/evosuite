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

public class DataImporter_importMajorCompulsoryCourses_64634693313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3841;
     Object term3902;

    public DataImporter_importMajorCompulsoryCourses_64634693313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3842 = new HashMap();
        HashMap term3854 = new HashMap();
        HashMap term3866 = new HashMap();
        HashMap term3878 = new HashMap();
        HashMap term3890 = new HashMap();
        term3841 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term3841, term3841.getClass(), "serviceFactory", null);
        setField(term3841, term3841.getClass(), "sectionIdMap", term3842);
        setField(term3841, term3841.getClass(), "classIdMap", term3854);
        setField(term3841, term3841.getClass(), "semesterIdMap", term3866);
        setField(term3841, term3841.getClass(), "departmentIdMap", term3878);
        setField(term3841, term3841.getClass(), "majorIdMap", term3890);
        term3902 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term3902;
        callMethod(klass, "importMajorCompulsoryCourses", argTypes, term3841, args);
    }

};


