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
import java.lang.Integer;

public class DataImporter_mapSemesterId_3030342873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2358;
     Object term2419;

    public DataImporter_mapSemesterId_3030342873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2359 = new HashMap();
        HashMap term2371 = new HashMap();
        HashMap term2383 = new HashMap();
        HashMap term2395 = new HashMap();
        HashMap term2407 = new HashMap();
        term2358 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term2358, term2358.getClass(), "serviceFactory", null);
        setField(term2358, term2358.getClass(), "sectionIdMap", term2359);
        setField(term2358, term2358.getClass(), "classIdMap", term2371);
        setField(term2358, term2358.getClass(), "semesterIdMap", term2383);
        setField(term2358, term2358.getClass(), "departmentIdMap", term2395);
        setField(term2358, term2358.getClass(), "majorIdMap", term2407);
        term2419 = new Integer(877649659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2419;
        callMethod(klass, "mapSemesterId", argTypes, term2358, args);
    }

};


