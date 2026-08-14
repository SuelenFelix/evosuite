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

public class DataImporter_readValueFromFile_88203037933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4246;

    public DataImporter_readValueFromFile_88203037933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4246 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term4246, term4246.getClass(), "serviceFactory", null);
        setField(term4246, term4246.getClass(), "sectionIdMap", null);
        setField(term4246, term4246.getClass(), "classIdMap", null);
        setField(term4246, term4246.getClass(), "semesterIdMap", null);
        setField(term4246, term4246.getClass(), "departmentIdMap", null);
        setField(term4246, term4246.getClass(), "majorIdMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "readValueFromFile", argTypes, term4246, args);
    }

};


