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

public class User_setPassword_126636661210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1129;

    public User_setPassword_126636661210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1179 = new HashMap();
        Set<Object> term1236 =  ((Map) term1179).keySet();
        HashSet term1178 = new HashSet((Collection<? extends Object>) term1236);
        term1129 = newInstance(Class.forName("com.sigma.auth.models.User"));
        setField(term1129, term1129.getClass(), "id", "xLbjWUgOIL");
        setField(term1129, term1129.getClass(), "username", "jDtqGUpnZN");
        setField(term1129, term1129.getClass(), "email", "nGKItKLYNC");
        setField(term1129, term1129.getClass(), "password", "UiUYnPrcCi");
        setField(term1129, term1129.getClass(), "roles", term1178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.models.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UoYtihxVaS";
        callMethod(klass, "setPassword", argTypes, term1129, args);
    }

};


