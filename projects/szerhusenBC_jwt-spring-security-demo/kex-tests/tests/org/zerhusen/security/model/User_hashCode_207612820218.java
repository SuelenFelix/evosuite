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

public class User_hashCode_207612820218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2339;

    public User_hashCode_207612820218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2340 = new Long(-6573104506744284592L);
        HashMap term2404 = new HashMap();
        Set<Object> term2459 =  ((Map) term2404).keySet();
        HashSet term2403 = new HashSet((Collection<? extends Object>) term2459);
        term2339 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term2339, term2339.getClass(), "id", term2340);
        setField(term2339, term2339.getClass(), "username", "sEccwbJKYE");
        setField(term2339, term2339.getClass(), "password", "AWRooQKkdW");
        setField(term2339, term2339.getClass(), "firstname", "vjxIhXHxGR");
        setField(term2339, term2339.getClass(), "lastname", "QXzGXbEXMu");
        setField(term2339, term2339.getClass(), "email", "qxSDVejjiY");
        setBooleanField(term2339, term2339.getClass(), "activated", false);
        setField(term2339, term2339.getClass(), "authorities", term2403);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2339, args);
    }

};


