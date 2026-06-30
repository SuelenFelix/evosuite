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

public class User_setLastname_74407460710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1301;

    public User_setLastname_74407460710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1302 = new Long(-2813493605142626659L);
        HashMap term1366 = new HashMap();
        Set<Object> term1433 =  ((Map) term1366).keySet();
        HashSet term1365 = new HashSet((Collection<? extends Object>) term1433);
        term1301 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term1301, term1301.getClass(), "id", term1302);
        setField(term1301, term1301.getClass(), "username", "onpbIeEKoi");
        setField(term1301, term1301.getClass(), "password", "YRHGsAkhxb");
        setField(term1301, term1301.getClass(), "firstname", "ffYhPOzlUs");
        setField(term1301, term1301.getClass(), "lastname", "MLqYREekMl");
        setField(term1301, term1301.getClass(), "email", "ytSBIKXogI");
        setBooleanField(term1301, term1301.getClass(), "activated", true);
        setField(term1301, term1301.getClass(), "authorities", term1365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nHXjMycHlU";
        callMethod(klass, "setLastname", argTypes, term1301, args);
    }

};


