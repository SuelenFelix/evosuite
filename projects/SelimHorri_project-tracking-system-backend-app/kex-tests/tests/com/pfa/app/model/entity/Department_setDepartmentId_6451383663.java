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

public class Department_setDepartmentId_6451383663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8871;
     Object term8949;

    public Department_setDepartmentId_6451383663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8872 = new Integer(-344907703);
        Integer term8887 = new Integer(824341437);
        HashMap term8926 = new HashMap();
        Set<Object> term8991 =  ((Map) term8926).keySet();
        HashSet term8925 = new HashSet((Collection<? extends Object>) term8991);
        HashMap term8933 = new HashMap();
        Set<Object> term8992 =  ((Map) term8933).keySet();
        HashSet term8932 = new HashSet((Collection<? extends Object>) term8992);
        term8871 = newInstance(Class.forName("com.pfa.app.model.entity.Department"));
        Object term8886 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term8871, term8871.getClass(), "departmentId", term8872);
        setField(term8871, term8871.getClass(), "departmentName", "XMArCaVAEc");
        setField(term8886, term8886.getClass(), "locationId", term8887);
        setField(term8886, term8886.getClass(), "adr", "URWnZtbrQH");
        setField(term8886, term8886.getClass(), "postalCode", "hpTAdtnQku");
        setField(term8886, term8886.getClass(), "city", "GdMAXFBAtl");
        setField(term8886, term8886.getClass(), "departments", term8925);
        setField(term8871, term8871.getClass(), "location", term8886);
        setField(term8871, term8871.getClass(), "employees", term8932);
        term8949 = new Integer(1470349147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Department");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term8949;
        callMethod(klass, "setDepartmentId", argTypes, term8871, args);
    }

};


