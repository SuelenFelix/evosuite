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

public class User_getPassword_9275989935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652;

    public User_getPassword_9275989935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term653 = new Long(7411271909051562686L);
        HashMap term717 = new HashMap();
        Set<Object> term772 =  ((Map) term717).keySet();
        HashSet term716 = new HashSet((Collection<? extends Object>) term772);
        term652 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term652, term652.getClass(), "id", term653);
        setField(term652, term652.getClass(), "username", "OclPbYPkcH");
        setField(term652, term652.getClass(), "password", "IoAlmYsBwc");
        setField(term652, term652.getClass(), "firstname", "TEParAifyi");
        setField(term652, term652.getClass(), "lastname", "OWDIEULEFu");
        setField(term652, term652.getClass(), "email", "dWRymuLBtr");
        setBooleanField(term652, term652.getClass(), "activated", true);
        setField(term652, term652.getClass(), "authorities", term716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term652, args);
    }

};


