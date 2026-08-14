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
import java.lang.Integer;

public class DataImporter_mapDepartmentId_211469681121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4230;
     Object term4231;

    public DataImporter_mapDepartmentId_211469681121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4230 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term4230, term4230.getClass(), "serviceFactory", null);
        setField(term4230, term4230.getClass(), "sectionIdMap", null);
        setField(term4230, term4230.getClass(), "classIdMap", null);
        setField(term4230, term4230.getClass(), "semesterIdMap", null);
        setField(term4230, term4230.getClass(), "departmentIdMap", null);
        setField(term4230, term4230.getClass(), "majorIdMap", null);
        term4231 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4231;
        callMethod(klass, "mapDepartmentId", argTypes, term4230, args);
    }

};


