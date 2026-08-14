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

public class User_setEmail_16993076719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1011;

    public User_setEmail_16993076719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1061 = new HashMap();
        Set<Object> term1118 =  ((Map) term1061).keySet();
        HashSet term1060 = new HashSet((Collection<? extends Object>) term1118);
        term1011 = newInstance(Class.forName("com.sigma.auth.models.User"));
        setField(term1011, term1011.getClass(), "id", "hxCBltsObl");
        setField(term1011, term1011.getClass(), "username", "BndsHwAFMv");
        setField(term1011, term1011.getClass(), "email", "GzFkzHGYFt");
        setField(term1011, term1011.getClass(), "password", "tShwQLRGNe");
        setField(term1011, term1011.getClass(), "roles", term1060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.models.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LvtrsXUliU";
        callMethod(klass, "setEmail", argTypes, term1011, args);
    }

};


