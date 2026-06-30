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

public class User_getUsername_19828052603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388;

    public User_getUsername_19828052603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term389 = new Long(-8400487765614892086L);
        HashMap term453 = new HashMap();
        Set<Object> term508 =  ((Map) term453).keySet();
        HashSet term452 = new HashSet((Collection<? extends Object>) term508);
        term388 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term388, term388.getClass(), "id", term389);
        setField(term388, term388.getClass(), "username", "ZiaGIbnzTs");
        setField(term388, term388.getClass(), "password", "tbcdzjIfER");
        setField(term388, term388.getClass(), "firstname", "HyxfbSQYBe");
        setField(term388, term388.getClass(), "lastname", "pCTimMblYc");
        setField(term388, term388.getClass(), "email", "hNxWaHcfhY");
        setBooleanField(term388, term388.getClass(), "activated", false);
        setField(term388, term388.getClass(), "authorities", term452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term388, args);
    }

};


