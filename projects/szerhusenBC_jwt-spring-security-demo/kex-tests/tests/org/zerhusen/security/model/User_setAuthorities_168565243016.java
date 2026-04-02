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

public class User_setAuthorities_168565243016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2073;
     Object term2143;

    public User_setAuthorities_168565243016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2074 = new Long(-316468845751588286L);
        HashMap term2138 = new HashMap();
        Set<Object> term2215 =  ((Map) term2138).keySet();
        HashSet term2137 = new HashSet((Collection<? extends Object>) term2215);
        term2073 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term2073, term2073.getClass(), "id", term2074);
        setField(term2073, term2073.getClass(), "username", "PHvxnGHptP");
        setField(term2073, term2073.getClass(), "password", "TimdotUuNC");
        setField(term2073, term2073.getClass(), "firstname", "PkWMRdJcBb");
        setField(term2073, term2073.getClass(), "lastname", "jSpAteRute");
        setField(term2073, term2073.getClass(), "email", "swZVeJAxjt");
        setBooleanField(term2073, term2073.getClass(), "activated", true);
        setField(term2073, term2073.getClass(), "authorities", term2137);
        HashMap term2144 = new HashMap();
        Set<Object> term2216 =  ((Map) term2144).keySet();
        term2143 = new HashSet((Collection<? extends Object>) term2216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term2143;
        callMethod(klass, "setAuthorities", argTypes, term2073, args);
    }

};


