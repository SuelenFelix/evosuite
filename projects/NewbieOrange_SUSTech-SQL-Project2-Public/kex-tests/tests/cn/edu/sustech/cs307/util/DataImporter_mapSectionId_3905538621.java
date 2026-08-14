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

public class DataImporter_mapSectionId_3905538621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2232;
     Object term2293;

    public DataImporter_mapSectionId_3905538621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2233 = new HashMap();
        HashMap term2245 = new HashMap();
        HashMap term2257 = new HashMap();
        HashMap term2269 = new HashMap();
        HashMap term2281 = new HashMap();
        term2232 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term2232, term2232.getClass(), "serviceFactory", null);
        setField(term2232, term2232.getClass(), "sectionIdMap", term2233);
        setField(term2232, term2232.getClass(), "classIdMap", term2245);
        setField(term2232, term2232.getClass(), "semesterIdMap", term2257);
        setField(term2232, term2232.getClass(), "departmentIdMap", term2269);
        setField(term2232, term2232.getClass(), "majorIdMap", term2281);
        term2293 = new Integer(-288604325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2293;
        callMethod(klass, "mapSectionId", argTypes, term2232, args);
    }

};


