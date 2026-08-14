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

public class DepartmentServiceImpl_update_18499806443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3634;

    public DepartmentServiceImpl_update_18499806443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3635 = new Integer(-358526505);
        Integer term3650 = new Integer(1843268026);
        HashMap term3689 = new HashMap();
        Set<Object> term3752 =  ((Map) term3689).keySet();
        HashSet term3688 = new HashSet((Collection<? extends Object>) term3752);
        HashMap term3696 = new HashMap();
        Set<Object> term3753 =  ((Map) term3696).keySet();
        HashSet term3695 = new HashSet((Collection<? extends Object>) term3753);
        term3634 = newInstance(Class.forName("com.pfa.app.model.entity.Department"));
        Object term3649 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term3634, term3634.getClass(), "departmentId", term3635);
        setField(term3634, term3634.getClass(), "departmentName", "pMfTuAFXxg");
        setField(term3649, term3649.getClass(), "locationId", term3650);
        setField(term3649, term3649.getClass(), "adr", "XCZmhkblRc");
        setField(term3649, term3649.getClass(), "postalCode", "gFUWMydGCU");
        setField(term3649, term3649.getClass(), "city", "LLegSTfqJt");
        setField(term3649, term3649.getClass(), "departments", term3688);
        setField(term3634, term3634.getClass(), "location", term3649);
        setField(term3634, term3634.getClass(), "employees", term3695);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.service.impl.DepartmentServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.pfa.app.model.entity.Department");
        Object[] args = new Object[1];
        args[0] = term3634;
        callMethod(klass, "update", argTypes, null, args);
    }

};


