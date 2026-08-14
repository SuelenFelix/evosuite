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

public class DataImporter_mapDepartmentId_21146968114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2421;
     Object term2482;

    public DataImporter_mapDepartmentId_21146968114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2422 = new HashMap();
        HashMap term2434 = new HashMap();
        HashMap term2446 = new HashMap();
        HashMap term2458 = new HashMap();
        HashMap term2470 = new HashMap();
        term2421 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term2421, term2421.getClass(), "serviceFactory", null);
        setField(term2421, term2421.getClass(), "sectionIdMap", term2422);
        setField(term2421, term2421.getClass(), "classIdMap", term2434);
        setField(term2421, term2421.getClass(), "semesterIdMap", term2446);
        setField(term2421, term2421.getClass(), "departmentIdMap", term2458);
        setField(term2421, term2421.getClass(), "majorIdMap", term2470);
        term2482 = new Integer(-1332748804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2482;
        callMethod(klass, "mapDepartmentId", argTypes, term2421, args);
    }

};


