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

public class Department_toString_21074055121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8636;

    public Department_toString_21074055121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8637 = new Integer(279384872);
        Integer term8652 = new Integer(1427305953);
        HashMap term8691 = new HashMap();
        Set<Object> term8749 =  ((Map) term8691).keySet();
        HashSet term8690 = new HashSet((Collection<? extends Object>) term8749);
        HashMap term8697 = new HashMap();
        Set<Object> term8750 =  ((Map) term8697).keySet();
        HashSet term8696 = new HashSet((Collection<? extends Object>) term8750);
        term8636 = newInstance(Class.forName("com.pfa.app.model.entity.Department"));
        Object term8651 = newInstance(Class.forName("com.pfa.app.model.entity.Location"));
        setField(term8636, term8636.getClass(), "departmentId", term8637);
        setField(term8636, term8636.getClass(), "departmentName", "tYBgGQtkhi");
        setField(term8651, term8651.getClass(), "locationId", term8652);
        setField(term8651, term8651.getClass(), "adr", "PhGPFLIMKH");
        setField(term8651, term8651.getClass(), "postalCode", "pWCYcLhoms");
        setField(term8651, term8651.getClass(), "city", "IWNJVfvTuw");
        setField(term8651, term8651.getClass(), "departments", term8690);
        setField(term8636, term8636.getClass(), "location", term8651);
        setField(term8636, term8636.getClass(), "employees", term8696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.model.entity.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8636, args);
    }

};


