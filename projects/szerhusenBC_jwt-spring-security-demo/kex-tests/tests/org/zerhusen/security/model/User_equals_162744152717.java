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

public class User_equals_162744152717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2217;
     Object term2287;

    public User_equals_162744152717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2218 = new Long(5127676408959197577L);
        HashMap term2282 = new HashMap();
        Set<Object> term2338 =  ((Map) term2282).keySet();
        HashSet term2281 = new HashSet((Collection<? extends Object>) term2338);
        term2217 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term2217, term2217.getClass(), "id", term2218);
        setField(term2217, term2217.getClass(), "username", "XqgfKFvPSD");
        setField(term2217, term2217.getClass(), "password", "JiVRgTZvKc");
        setField(term2217, term2217.getClass(), "firstname", "XPKmummaqg");
        setField(term2217, term2217.getClass(), "lastname", "BKLfkLiZTH");
        setField(term2217, term2217.getClass(), "email", "SPpkrGcPRr");
        setBooleanField(term2217, term2217.getClass(), "activated", true);
        setField(term2217, term2217.getClass(), "authorities", term2281);
        term2287 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2287;
        callMethod(klass, "equals", argTypes, term2217, args);
    }

};


