package org.zerhusen.security.model;

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
import static org.zerhusen.security.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class User_setId_17139684782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265;
     Object term335;

    public User_setId_17139684782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term266 = new Long(6375119433582206027L);
        HashMap term330 = new HashMap();
        Set<Object> term387 =  ((Map) term330).keySet();
        HashSet term329 = new HashSet((Collection<? extends Object>) term387);
        term265 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term265, term265.getClass(), "id", term266);
        setField(term265, term265.getClass(), "username", "uuaPigETmJ");
        setField(term265, term265.getClass(), "password", "MxlszYVzRf");
        setField(term265, term265.getClass(), "firstname", "LQFpaHEwXR");
        setField(term265, term265.getClass(), "lastname", "oVcInYnLWB");
        setField(term265, term265.getClass(), "email", "aJlieCFVtF");
        setBooleanField(term265, term265.getClass(), "activated", false);
        setField(term265, term265.getClass(), "authorities", term329);
        term335 = new Long(-8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term335;
        callMethod(klass, "setId", argTypes, term265, args);
    }

};


