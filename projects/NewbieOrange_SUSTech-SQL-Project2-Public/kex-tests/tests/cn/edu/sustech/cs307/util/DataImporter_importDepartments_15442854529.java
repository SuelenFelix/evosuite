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
import java.lang.Object;

public class DataImporter_importDepartments_15442854529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3529;
     Object term3590;

    public DataImporter_importDepartments_15442854529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3530 = new HashMap();
        HashMap term3542 = new HashMap();
        HashMap term3554 = new HashMap();
        HashMap term3566 = new HashMap();
        HashMap term3578 = new HashMap();
        term3529 = newInstance(Class.forName("cn.edu.sustech.cs307.util.DataImporter"));
        setField(term3529, term3529.getClass(), "serviceFactory", null);
        setField(term3529, term3529.getClass(), "sectionIdMap", term3530);
        setField(term3529, term3529.getClass(), "classIdMap", term3542);
        setField(term3529, term3529.getClass(), "semesterIdMap", term3554);
        setField(term3529, term3529.getClass(), "departmentIdMap", term3566);
        setField(term3529, term3529.getClass(), "majorIdMap", term3578);
        Object term3593 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Department"));
        setIntField(term3593, term3593.getClass(), "id", 1390820006);
        setField(term3593, term3593.getClass(), "name", "BYrGukTyof");
        Object term3608 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Department"));
        setIntField(term3608, term3608.getClass(), "id", -828982065);
        setField(term3608, term3608.getClass(), "name", "");
        Object term3612 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Department"));
        setIntField(term3612, term3612.getClass(), "id", 1221443226);
        setField(term3612, term3612.getClass(), "name", null);
        term3590 = new LinkedList();
        ((LinkedList) term3590).add(term3593);
        ((LinkedList) term3590).add(term3608);
        ((LinkedList) term3590).add(term3612);
        ((LinkedList) term3590).add((Object)null);
        ((LinkedList) term3590).add((Object)null);
        ((LinkedList) term3590).add((Object)null);
        ((LinkedList) term3590).add((Object)null);
        ((LinkedList) term3590).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.util.DataImporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3590;
        callMethod(klass, "importDepartments", argTypes, term3529, args);
    }

};


