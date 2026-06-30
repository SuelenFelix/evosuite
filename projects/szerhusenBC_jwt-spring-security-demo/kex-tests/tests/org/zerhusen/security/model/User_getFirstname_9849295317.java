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

public class User_getFirstname_9849295317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term916;

    public User_getFirstname_9849295317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term917 = new Long(6811161968424632369L);
        HashMap term981 = new HashMap();
        Set<Object> term1036 =  ((Map) term981).keySet();
        HashSet term980 = new HashSet((Collection<? extends Object>) term1036);
        term916 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term916, term916.getClass(), "id", term917);
        setField(term916, term916.getClass(), "username", "nyiiPDVjAc");
        setField(term916, term916.getClass(), "password", "aKnKipADSo");
        setField(term916, term916.getClass(), "firstname", "wSQxaModmm");
        setField(term916, term916.getClass(), "lastname", "UlajhuVLaP");
        setField(term916, term916.getClass(), "email", "gGSMzuGICf");
        setBooleanField(term916, term916.getClass(), "activated", true);
        setField(term916, term916.getClass(), "authorities", term980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstname", argTypes, term916, args);
    }

};


