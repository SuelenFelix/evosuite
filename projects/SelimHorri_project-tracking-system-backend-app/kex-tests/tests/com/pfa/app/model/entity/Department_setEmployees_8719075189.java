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

public class Department_setEmployees_8719075189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9681;
     Object term9751;

    public Department_setEmployees_8719075189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9682 = new Integer(401203924);
        Integer term9697 = new Integer(-1212399479);
        HashMap term9736 = new HashMap();
        Set<Object> term9831 =  ((Map) term9736).keySet();
        HashSet term9735 = new HashSet((Collection<? extends Object>) term9831);
        HashMap term9743 = new HashMap();
        Set<Object> term9832 =  ((Map) term9743).keySet();
        HashSet term9742 = new HashSet((Collection<? extends Object>) term9832);
        term9681 = newInstance(Class.forName("com.pfa.app.model.entity.Department"));
        Object term9696 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term9681, term9681.getClass(), "departmentId", term9682);
        setField(term9681, term9681.getClass(), "departmentName", "PxGDfPOAFS");
        setField(term9696, term9696.getClass(), "locationId", term9697);
        setField(term9696, term9696.getClass(), "adr", "dZVxzYEeZe");
        setField(term9696, term9696.getClass(), "postalCode", "TnCQRmzwPf");
        setField(term9696, term9696.getClass(), "city", "ZGnUKGTWCn");
        setField(term9696, term9696.getClass(), "departments", term9735);
        setField(term9681, term9681.getClass(), "location", term9696);
        setField(term9681, term9681.getClass(), "employees", term9742);
        HashMap term9752 = new HashMap();
        Set<Object> term9833 =  ((Map) term9752).keySet();
        term9751 = new HashSet((Collection<? extends Object>) term9833);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Department");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term9751;
        callMethod(klass, "setEmployees", argTypes, term9681, args);
    }

};


