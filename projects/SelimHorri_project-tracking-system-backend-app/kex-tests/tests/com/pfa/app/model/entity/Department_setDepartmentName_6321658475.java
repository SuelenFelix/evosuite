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

public class Department_setDepartmentName_6321658475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9105;

    public Department_setDepartmentName_6321658475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9106 = new Integer(401512128);
        Integer term9121 = new Integer(-2069930777);
        HashMap term9160 = new HashMap();
        Set<Object> term9224 =  ((Map) term9160).keySet();
        HashSet term9159 = new HashSet((Collection<? extends Object>) term9224);
        HashMap term9167 = new HashMap();
        Set<Object> term9225 =  ((Map) term9167).keySet();
        HashSet term9166 = new HashSet((Collection<? extends Object>) term9225);
        term9105 = newInstance(Class.forName("com.pfa.app.model.entity.Department"));
        Object term9120 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term9105, term9105.getClass(), "departmentId", term9106);
        setField(term9105, term9105.getClass(), "departmentName", "fzzIOVxKdF");
        setField(term9120, term9120.getClass(), "locationId", term9121);
        setField(term9120, term9120.getClass(), "adr", "cdvmxZaBEK");
        setField(term9120, term9120.getClass(), "postalCode", "QHYZiyDyPC");
        setField(term9120, term9120.getClass(), "city", "kcHMyiheuH");
        setField(term9120, term9120.getClass(), "departments", term9159);
        setField(term9105, term9105.getClass(), "location", term9120);
        setField(term9105, term9105.getClass(), "employees", term9166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Department");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UsCZaSgXzI";
        callMethod(klass, "setDepartmentName", argTypes, term9105, args);
    }

};


