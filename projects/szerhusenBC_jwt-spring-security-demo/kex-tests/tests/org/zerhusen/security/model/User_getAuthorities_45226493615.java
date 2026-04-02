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

public class User_getAuthorities_45226493615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1952;

    public User_getAuthorities_45226493615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1953 = new Long(-872011222785455006L);
        HashMap term2017 = new HashMap();
        Set<Object> term2072 =  ((Map) term2017).keySet();
        HashSet term2016 = new HashSet((Collection<? extends Object>) term2072);
        term1952 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term1952, term1952.getClass(), "id", term1953);
        setField(term1952, term1952.getClass(), "username", "VgZnGoIFwQ");
        setField(term1952, term1952.getClass(), "password", "jUbSRrkrYZ");
        setField(term1952, term1952.getClass(), "firstname", "bWWfajKbEX");
        setField(term1952, term1952.getClass(), "lastname", "cAPeiZHKGJ");
        setField(term1952, term1952.getClass(), "email", "LvJFtLBaxj");
        setBooleanField(term1952, term1952.getClass(), "activated", false);
        setField(term1952, term1952.getClass(), "authorities", term2016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthorities", argTypes, term1952, args);
    }

};


