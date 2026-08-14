package com.pfa.app.model.entity;

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
import static com.pfa.app.model.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Department_getDepartmentId_13338181962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8751;

    public Department_getDepartmentId_13338181962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8752 = new Integer(-1972033388);
        Integer term8767 = new Integer(-1005024758);
        HashMap term8806 = new HashMap();
        Set<Object> term8869 =  ((Map) term8806).keySet();
        HashSet term8805 = new HashSet((Collection<? extends Object>) term8869);
        HashMap term8813 = new HashMap();
        Set<Object> term8870 =  ((Map) term8813).keySet();
        HashSet term8812 = new HashSet((Collection<? extends Object>) term8870);
        term8751 = newInstance(Class.forName("com.pfa.app.model.entity.Department"));
        Object term8766 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term8751, term8751.getClass(), "departmentId", term8752);
        setField(term8751, term8751.getClass(), "departmentName", "VUVgiQvSYa");
        setField(term8766, term8766.getClass(), "locationId", term8767);
        setField(term8766, term8766.getClass(), "adr", "sEGgJJplmE");
        setField(term8766, term8766.getClass(), "postalCode", "jyexiarswN");
        setField(term8766, term8766.getClass(), "city", "ZBLFNFVEHD");
        setField(term8766, term8766.getClass(), "departments", term8805);
        setField(term8751, term8751.getClass(), "location", term8766);
        setField(term8751, term8751.getClass(), "employees", term8812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDepartmentId", argTypes, term8751, args);
    }

};


