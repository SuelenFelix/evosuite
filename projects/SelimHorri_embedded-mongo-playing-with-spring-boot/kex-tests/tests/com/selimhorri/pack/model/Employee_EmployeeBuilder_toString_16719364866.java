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

public class Employee_EmployeeBuilder_toString_16719364866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term680;

    public Employee_EmployeeBuilder_toString_16719364866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term743 = new HashMap();
        Set<Object> term799 =  ((Map) term743).keySet();
        HashSet term742 = new HashSet((Collection<? extends Object>) term799);
        term680 = newInstance(Class.forName("com.selimhorri.pack.model.Employee$EmployeeBuilder"));
        Object term717 = newInstance(Class.forName("com.selimhorri.pack.model.Department"));
        setField(term680, term680.getClass(), "id", "iikZEapDlu");
        setField(term680, term680.getClass(), "fname", "nhoHrZfnIN");
        setField(term680, term680.getClass(), "lname", "ZkMALXpEAZ");
        setField(term717, term717.getClass(), "id", "tXfQjSqDzN");
        setField(term717, term717.getClass(), "departmentName", "BjugTaMcxJ");
        setField(term717, term717.getClass(), "employees", term742);
        setField(term680, term680.getClass(), "department", term717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Employee$EmployeeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term680, args);
    }

};


