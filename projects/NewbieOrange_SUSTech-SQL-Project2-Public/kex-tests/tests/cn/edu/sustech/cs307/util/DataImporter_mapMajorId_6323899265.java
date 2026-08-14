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

public class DataImporter_mapMajorId_6323899265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2484;
     Object term2545;

    public DataImporter_mapMajorId_6323899265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2485 = new HashMap();
        HashMap term2497 = new HashMap();
        HashMap term2509 = new HashMap();
        HashMap term2521 = new HashMap();
        HashMap term2533 = new HashMap();
        term2484 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term2484, term2484.getClass(), "serviceFactory", null);
        setField(term2484, term2484.getClass(), "sectionIdMap", term2485);
        setField(term2484, term2484.getClass(), "classIdMap", term2497);
        setField(term2484, term2484.getClass(), "semesterIdMap", term2509);
        setField(term2484, term2484.getClass(), "departmentIdMap", term2521);
        setField(term2484, term2484.getClass(), "majorIdMap", term2533);
        term2545 = new Integer(1774507971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2545;
        callMethod(klass, "mapMajorId", argTypes, term2484, args);
    }

};


