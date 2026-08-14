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

public class DataImporter_mapClassId_13237956872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2295;
     Object term2356;

    public DataImporter_mapClassId_13237956872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2296 = new HashMap();
        HashMap term2308 = new HashMap();
        HashMap term2320 = new HashMap();
        HashMap term2332 = new HashMap();
        HashMap term2344 = new HashMap();
        term2295 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term2295, term2295.getClass(), "serviceFactory", null);
        setField(term2295, term2295.getClass(), "sectionIdMap", term2296);
        setField(term2295, term2295.getClass(), "classIdMap", term2308);
        setField(term2295, term2295.getClass(), "semesterIdMap", term2320);
        setField(term2295, term2295.getClass(), "departmentIdMap", term2332);
        setField(term2295, term2295.getClass(), "majorIdMap", term2344);
        term2356 = new Integer(-1268314569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2356;
        callMethod(klass, "mapClassId", argTypes, term2295, args);
    }

};


