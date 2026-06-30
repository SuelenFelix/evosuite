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

public class User_toString_170807940419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2460;

    public User_toString_170807940419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2461 = new Long(-4920224193275732920L);
        HashMap term2525 = new HashMap();
        Set<Object> term2580 =  ((Map) term2525).keySet();
        HashSet term2524 = new HashSet((Collection<? extends Object>) term2580);
        term2460 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term2460, term2460.getClass(), "id", term2461);
        setField(term2460, term2460.getClass(), "username", "xBsXSDjXYK");
        setField(term2460, term2460.getClass(), "password", "sEnIVFtZuQ");
        setField(term2460, term2460.getClass(), "firstname", "ZVecLZMLHF");
        setField(term2460, term2460.getClass(), "lastname", "fztQhjqwdP");
        setField(term2460, term2460.getClass(), "email", "eVpkWxjuki");
        setBooleanField(term2460, term2460.getClass(), "activated", false);
        setField(term2460, term2460.getClass(), "authorities", term2524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2460, args);
    }

};


