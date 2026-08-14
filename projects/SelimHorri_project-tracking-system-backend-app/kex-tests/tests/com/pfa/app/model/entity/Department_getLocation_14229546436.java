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

public class Department_getLocation_14229546436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9236;

    public Department_getLocation_14229546436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9237 = new Integer(777492093);
        Integer term9252 = new Integer(1414025609);
        HashMap term9291 = new HashMap();
        Set<Object> term9350 =  ((Map) term9291).keySet();
        HashSet term9290 = new HashSet((Collection<? extends Object>) term9350);
        HashMap term9298 = new HashMap();
        Set<Object> term9351 =  ((Map) term9298).keySet();
        HashSet term9297 = new HashSet((Collection<? extends Object>) term9351);
        term9236 = newInstance(Class.forName("com.pfa.app.model.entity.Department"));
        Object term9251 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term9236, term9236.getClass(), "departmentId", term9237);
        setField(term9236, term9236.getClass(), "departmentName", "IXZCeVwvBM");
        setField(term9251, term9251.getClass(), "locationId", term9252);
        setField(term9251, term9251.getClass(), "adr", "ElTdyUVQYi");
        setField(term9251, term9251.getClass(), "postalCode", "KkgJnxXxVl");
        setField(term9251, term9251.getClass(), "city", "TGnzPlGFMb");
        setField(term9251, term9251.getClass(), "departments", term9290);
        setField(term9236, term9236.getClass(), "location", term9251);
        setField(term9236, term9236.getClass(), "employees", term9297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocation", argTypes, term9236, args);
    }

};


