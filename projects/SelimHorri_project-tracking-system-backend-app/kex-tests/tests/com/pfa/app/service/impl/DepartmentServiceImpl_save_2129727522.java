package com.pfa.app.service.impl;

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
import static com.pfa.app.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class DepartmentServiceImpl_save_2129727522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3520;

    public DepartmentServiceImpl_save_2129727522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3521 = new Integer(-310528004);
        Integer term3536 = new Integer(-634976996);
        HashMap term3575 = new HashMap();
        Set<Object> term3632 =  ((Map) term3575).keySet();
        HashSet term3574 = new HashSet((Collection<? extends Object>) term3632);
        HashMap term3582 = new HashMap();
        Set<Object> term3633 =  ((Map) term3582).keySet();
        HashSet term3581 = new HashSet((Collection<? extends Object>) term3633);
        term3520 = newInstance(Class.forName("com.pfa.app.model.entity.Department"));
        Object term3535 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term3520, term3520.getClass(), "departmentId", term3521);
        setField(term3520, term3520.getClass(), "departmentName", "FlxVmiMYKP");
        setField(term3535, term3535.getClass(), "locationId", term3536);
        setField(term3535, term3535.getClass(), "adr", "fgOpAWlGYN");
        setField(term3535, term3535.getClass(), "postalCode", "PNzNzzjSXM");
        setField(term3535, term3535.getClass(), "city", "ktKcSZiuGM");
        setField(term3535, term3535.getClass(), "departments", term3574);
        setField(term3520, term3520.getClass(), "location", term3535);
        setField(term3520, term3520.getClass(), "employees", term3581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.service.impl.DepartmentServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pfa.app.model.entity.Department");
        Object[] args = new Object[1];
        args[0] = term3520;
        callMethod(klass, "save", argTypes, null, args);
    }

};


