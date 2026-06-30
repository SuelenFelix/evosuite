package com.selimhorri.pack.model;

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
import static com.selimhorri.pack.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Employee_setDepartment_15154909878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1983;
     Object term2051;

    public Employee_setDepartment_15154909878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2046 = new HashMap();
        Set<Object> term2141 =  ((Map) term2046).keySet();
        HashSet term2045 = new HashSet((Collection<? extends Object>) term2141);
        term1983 = newInstance(Class.forName("com.selimhorri.pack.model.Employee"));
        Object term2020 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term1983, term1983.getClass(), "id", "IbxeAMwLVt");
        setField(term1983, term1983.getClass(), "fname", "bShlAqoTmZ");
        setField(term1983, term1983.getClass(), "lname", "nOKlKlNhtU");
        setField(term2020, term2020.getClass(), "id", "gXFNBHJSey");
        setField(term2020, term2020.getClass(), "departmentName", "wUcSfItZgv");
        setField(term2020, term2020.getClass(), "employees", term2045);
        setField(term1983, term1983.getClass(), "department", term2020);
        HashMap term2077 = new HashMap();
        Set<Object> term2162 =  ((Map) term2077).keySet();
        HashSet term2076 = new HashSet((Collection<? extends Object>) term2162);
        term2051 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term2051, term2051.getClass(), "id", "rOfPCPHmtJ");
        setField(term2051, term2051.getClass(), "departmentName", "EnmiAvfpJv");
        setField(term2051, term2051.getClass(), "employees", term2076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.selimhorri.pack.model.Department");
        Object[] args = new Object[1];
        args[0] = term2051;
        callMethod(klass, "setDepartment", argTypes, term1983, args);
    }

};


