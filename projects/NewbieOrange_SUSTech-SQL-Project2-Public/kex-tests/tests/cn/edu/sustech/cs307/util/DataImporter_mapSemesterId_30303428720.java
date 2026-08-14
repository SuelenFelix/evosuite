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

public class DataImporter_mapSemesterId_30303428720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4227;
     Object term4228;

    public DataImporter_mapSemesterId_30303428720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4227 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term4227, term4227.getClass(), "serviceFactory", null);
        setField(term4227, term4227.getClass(), "sectionIdMap", null);
        setField(term4227, term4227.getClass(), "classIdMap", null);
        setField(term4227, term4227.getClass(), "semesterIdMap", null);
        setField(term4227, term4227.getClass(), "departmentIdMap", null);
        setField(term4227, term4227.getClass(), "majorIdMap", null);
        term4228 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4228;
        callMethod(klass, "mapSemesterId", argTypes, term4227, args);
    }

};


