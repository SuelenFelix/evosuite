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

public class DataImporter_importSemesters_52481588612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3777;
     Object term3838;

    public DataImporter_importSemesters_52481588612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3778 = new HashMap();
        HashMap term3790 = new HashMap();
        HashMap term3802 = new HashMap();
        HashMap term3814 = new HashMap();
        HashMap term3826 = new HashMap();
        term3777 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term3777, term3777.getClass(), "serviceFactory", null);
        setField(term3777, term3777.getClass(), "sectionIdMap", term3778);
        setField(term3777, term3777.getClass(), "classIdMap", term3790);
        setField(term3777, term3777.getClass(), "semesterIdMap", term3802);
        setField(term3777, term3777.getClass(), "departmentIdMap", term3814);
        setField(term3777, term3777.getClass(), "majorIdMap", term3826);
        term3838 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3838;
        callMethod(klass, "importSemesters", argTypes, term3777, args);
    }

};


