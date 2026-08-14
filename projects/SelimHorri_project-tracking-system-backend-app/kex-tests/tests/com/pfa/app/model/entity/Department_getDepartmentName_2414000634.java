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

public class Department_getDepartmentName_2414000634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8993;

    public Department_getDepartmentName_2414000634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8994 = new Integer(-255317272);
        Integer term9009 = new Integer(-706253892);
        HashMap term9048 = new HashMap();
        Set<Object> term9103 =  ((Map) term9048).keySet();
        HashSet term9047 = new HashSet((Collection<? extends Object>) term9103);
        HashMap term9055 = new HashMap();
        Set<Object> term9104 =  ((Map) term9055).keySet();
        HashSet term9054 = new HashSet((Collection<? extends Object>) term9104);
        term8993 = newInstance(Class.forName("com.pfa.app.model.entity.Department"));
        Object term9008 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term8993, term8993.getClass(), "departmentId", term8994);
        setField(term8993, term8993.getClass(), "departmentName", "XnZHOhTfxL");
        setField(term9008, term9008.getClass(), "locationId", term9009);
        setField(term9008, term9008.getClass(), "adr", "oFBhNamtAs");
        setField(term9008, term9008.getClass(), "postalCode", "YURcpRjwSt");
        setField(term9008, term9008.getClass(), "city", "SXMdNSGPog");
        setField(term9008, term9008.getClass(), "departments", term9047);
        setField(term8993, term8993.getClass(), "location", term9008);
        setField(term8993, term8993.getClass(), "employees", term9054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDepartmentName", argTypes, term8993, args);
    }

};


