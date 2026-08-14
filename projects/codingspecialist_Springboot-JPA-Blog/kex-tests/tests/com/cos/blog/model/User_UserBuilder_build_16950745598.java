package com.cos.blog.model;

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
import static com.cos.blog.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class User_UserBuilder_build_16950745598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13373;

    public User_UserBuilder_build_16950745598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13465 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term13464 = ((Class) term13465).getDeclaredField((String) "USER");
        ((Field) term13464).setAccessible(true);
        Object enum29 = ((Field) term13464).get((Object) null);
        term13373 = newInstance(Class.forName("com.cos.blog.model.User$UserBuilder"));
        Object term13431 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term13373, term13373.getClass(), "id", 908108726);
        setField(term13373, term13373.getClass(), "username", "xpbLKEsput");
        setField(term13373, term13373.getClass(), "password", "urlyLwPBVn");
        setField(term13373, term13373.getClass(), "email", "SPQVzOlOzZ");
        setField(term13373, term13373.getClass(), "role", enum29);
        setField(term13373, term13373.getClass(), "oauth", "bOUAgAptAI");
        setIntField(term13431, term13431.getClass(), "nanos", 491000000);
        setLongField(term13431, term13431.getClass(), "fastTime", 1676460842000L);
        setField(term13431, term13431.getClass(), "cdate", null);
        setField(term13373, term13373.getClass(), "createDate", term13431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term13373, args);
    }

};


