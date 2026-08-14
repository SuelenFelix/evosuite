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
import java.util.LinkedList;

public class DataImporter_importUsers_145119951511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3713;
     Object term3774;

    public DataImporter_importUsers_145119951511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3714 = new HashMap();
        HashMap term3726 = new HashMap();
        HashMap term3738 = new HashMap();
        HashMap term3750 = new HashMap();
        HashMap term3762 = new HashMap();
        term3713 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term3713, term3713.getClass(), "serviceFactory", null);
        setField(term3713, term3713.getClass(), "sectionIdMap", term3714);
        setField(term3713, term3713.getClass(), "classIdMap", term3726);
        setField(term3713, term3713.getClass(), "semesterIdMap", term3738);
        setField(term3713, term3713.getClass(), "departmentIdMap", term3750);
        setField(term3713, term3713.getClass(), "majorIdMap", term3762);
        term3774 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3774;
        callMethod(klass, "importUsers", argTypes, term3713, args);
    }

};


