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

public class Department_setLocation_9099464717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9352;
     Object term9430;

    public Department_setLocation_9099464717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9353 = new Integer(1010721666);
        Integer term9368 = new Integer(27043781);
        HashMap term9407 = new HashMap();
        Set<Object> term9528 =  ((Map) term9407).keySet();
        HashSet term9406 = new HashSet((Collection<? extends Object>) term9528);
        HashMap term9414 = new HashMap();
        Set<Object> term9529 =  ((Map) term9414).keySet();
        HashSet term9413 = new HashSet((Collection<? extends Object>) term9529);
        term9352 = newInstance(Class.forName("com.pfa.app.model.entity.Department"));
        Object term9367 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term9352, term9352.getClass(), "departmentId", term9353);
        setField(term9352, term9352.getClass(), "departmentName", "arrHHpXCBD");
        setField(term9367, term9367.getClass(), "locationId", term9368);
        setField(term9367, term9367.getClass(), "adr", "zzfzxQYlis");
        setField(term9367, term9367.getClass(), "postalCode", "TJJQwVEzxz");
        setField(term9367, term9367.getClass(), "city", "kHtEHBrsFo");
        setField(term9367, term9367.getClass(), "departments", term9406);
        setField(term9352, term9352.getClass(), "location", term9367);
        setField(term9352, term9352.getClass(), "employees", term9413);
        Integer term9431 = new Integer(-497534255);
        HashMap term9470 = new HashMap();
        Set<Object> term9560 =  ((Map) term9470).keySet();
        HashSet term9469 = new HashSet((Collection<? extends Object>) term9560);
        term9430 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term9430, term9430.getClass(), "locationId", term9431);
        setField(term9430, term9430.getClass(), "adr", "lsQrIFMkgZ");
        setField(term9430, term9430.getClass(), "postalCode", "VgAyBhgBhq");
        setField(term9430, term9430.getClass(), "city", "nhpssUKjpK");
        setField(term9430, term9430.getClass(), "departments", term9469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Department");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pfa.app.model.entity.Location");
        Object[] args = new Object[1];
        args[0] = term9430;
        callMethod(klass, "setLocation", argTypes, term9352, args);
    }

};


