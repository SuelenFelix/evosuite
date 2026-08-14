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

public class DataImporter_importDepartments_154428545226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4239;

    public DataImporter_importDepartments_154428545226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4239 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term4239, term4239.getClass(), "serviceFactory", null);
        setField(term4239, term4239.getClass(), "sectionIdMap", null);
        setField(term4239, term4239.getClass(), "classIdMap", null);
        setField(term4239, term4239.getClass(), "semesterIdMap", null);
        setField(term4239, term4239.getClass(), "departmentIdMap", null);
        setField(term4239, term4239.getClass(), "majorIdMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "importDepartments", argTypes, term4239, args);
    }

};


