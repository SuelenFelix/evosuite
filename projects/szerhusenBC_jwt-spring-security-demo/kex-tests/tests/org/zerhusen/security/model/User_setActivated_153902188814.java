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
import java.lang.Boolean;

public class User_setActivated_153902188814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1829;
     Object term1899;

    public User_setActivated_153902188814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1830 = new Long(-5476826692763582090L);
        HashMap term1894 = new HashMap();
        Set<Object> term1951 =  ((Map) term1894).keySet();
        HashSet term1893 = new HashSet((Collection<? extends Object>) term1951);
        term1829 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term1829, term1829.getClass(), "id", term1830);
        setField(term1829, term1829.getClass(), "username", "oVgzLbrsFr");
        setField(term1829, term1829.getClass(), "password", "vQVyKLdtaz");
        setField(term1829, term1829.getClass(), "firstname", "OWKQODBLzb");
        setField(term1829, term1829.getClass(), "lastname", "wGmYcqUkgE");
        setField(term1829, term1829.getClass(), "email", "idgaQsnJpQ");
        setBooleanField(term1829, term1829.getClass(), "activated", true);
        setField(term1829, term1829.getClass(), "authorities", term1893);
        term1899 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1899;
        callMethod(klass, "setActivated", argTypes, term1829, args);
    }

};


