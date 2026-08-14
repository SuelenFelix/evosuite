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

public class DataImporter_importMajors_72515440910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3649;
     Object term3710;

    public DataImporter_importMajors_72515440910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3650 = new HashMap();
        HashMap term3662 = new HashMap();
        HashMap term3674 = new HashMap();
        HashMap term3686 = new HashMap();
        HashMap term3698 = new HashMap();
        term3649 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term3649, term3649.getClass(), "serviceFactory", null);
        setField(term3649, term3649.getClass(), "sectionIdMap", term3650);
        setField(term3649, term3649.getClass(), "classIdMap", term3662);
        setField(term3649, term3649.getClass(), "semesterIdMap", term3674);
        setField(term3649, term3649.getClass(), "departmentIdMap", term3686);
        setField(term3649, term3649.getClass(), "majorIdMap", term3698);
        term3710 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3710;
        callMethod(klass, "importMajors", argTypes, term3649, args);
    }

};


