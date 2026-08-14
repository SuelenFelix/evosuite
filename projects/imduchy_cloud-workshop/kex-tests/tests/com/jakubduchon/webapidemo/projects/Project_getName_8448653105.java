package com.jakubduchon.webapidemo.projects;

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
import static com.jakubduchon.webapidemo.projects.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Project_getName_8448653105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435;

    public Project_getName_8448653105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term436 = new Long(846579494941632714L);
        HashMap term463 = new HashMap();
        Set<Object> term497 =  ((Map) term463).keySet();
        HashSet term462 = new HashSet((Collection<? extends Object>) term497);
        term435 = newInstance(Class.forName("com.jakubduchon.webapidemo.projects.Project"));
        setField(term435, term435.getClass(), "id", term436);
        setField(term435, term435.getClass(), "name", "smnHEqRFRx");
        setField(term435, term435.getClass(), "description", "XYtryyobou");
        setField(term435, term435.getClass(), "enrolledEmployees", term462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.jakubduchon.webapidemo.projects.Project");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term435, args);
    }

};


