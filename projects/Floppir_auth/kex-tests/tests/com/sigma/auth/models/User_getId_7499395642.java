package com.sigma.auth.models;

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
import static com.sigma.auth.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class User_getId_7499395642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295;

    public User_getId_7499395642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term345 = new HashMap();
        Set<Object> term390 =  ((Map) term345).keySet();
        HashSet term344 = new HashSet((Collection<? extends Object>) term390);
        term295 = newInstance(Class.forName("com.sigma.auth.models.User"));
        setField(term295, term295.getClass(), "id", "LQFpaHEwXR");
        setField(term295, term295.getClass(), "username", "oVcInYnLWB");
        setField(term295, term295.getClass(), "email", "aJlieCFVtF");
        setField(term295, term295.getClass(), "password", "ZiaGIbnzTs");
        setField(term295, term295.getClass(), "roles", term344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.models.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term295, args);
    }

};


