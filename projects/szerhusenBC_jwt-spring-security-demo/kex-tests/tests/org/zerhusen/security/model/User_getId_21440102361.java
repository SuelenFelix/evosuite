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

public class User_getId_21440102361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144;

    public User_getId_21440102361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term145 = new Long(2442117782898005296L);
        HashMap term209 = new HashMap();
        Set<Object> term264 =  ((Map) term209).keySet();
        HashSet term208 = new HashSet((Collection<? extends Object>) term264);
        term144 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term144, term144.getClass(), "id", term145);
        setField(term144, term144.getClass(), "username", "SzjVpOQTyS");
        setField(term144, term144.getClass(), "password", "MjGYSRKTNF");
        setField(term144, term144.getClass(), "firstname", "hRNSzYYIrc");
        setField(term144, term144.getClass(), "lastname", "RMFIsYGgne");
        setField(term144, term144.getClass(), "email", "NRdvgJlhkX");
        setBooleanField(term144, term144.getClass(), "activated", false);
        setField(term144, term144.getClass(), "authorities", term208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term144, args);
    }

};


