package com.selimhorri.app.pack.models.entities;

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
import static com.selimhorri.app.pack.models.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Department_getDname_15322894175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5247;

    public Department_getDname_15322894175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5248 = new Integer(612177768);
        HashMap term5275 = new HashMap();
        Set<Object> term5313 =  ((Map) term5275).keySet();
        HashSet term5274 = new HashSet((Collection<? extends Object>) term5313);
        term5247 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.Department"));
        setField(term5247, term5247.getClass(), "deptno", term5248);
        setField(term5247, term5247.getClass(), "dname", "kEehLMZcOU");
        setField(term5247, term5247.getClass(), "loc", "RhLliqMiOF");
        setField(term5247, term5247.getClass(), "employees", term5274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDname", argTypes, term5247, args);
    }

};


