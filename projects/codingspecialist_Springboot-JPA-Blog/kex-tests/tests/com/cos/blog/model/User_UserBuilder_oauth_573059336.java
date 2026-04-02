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

public class User_UserBuilder_oauth_573059336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12834;

    public User_UserBuilder_oauth_573059336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12939 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term12938 = ((Class) term12939).getDeclaredField((String) "ADMIN");
        ((Field) term12938).setAccessible(true);
        Object enum27 = ((Field) term12938).get((Object) null);
        term12834 = newInstance(Class.forName("com.cos.blog.model.User$UserBuilder"));
        Object term12893 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term12834, term12834.getClass(), "id", -828982065);
        setField(term12834, term12834.getClass(), "username", "vQJUCtuYpK");
        setField(term12834, term12834.getClass(), "password", "GHtOeztAdz");
        setField(term12834, term12834.getClass(), "email", "gSAtqakaLY");
        setField(term12834, term12834.getClass(), "role", enum27);
        setField(term12834, term12834.getClass(), "oauth", "taPBiMFNEZ");
        setIntField(term12893, term12893.getClass(), "nanos", 492000000);
        setLongField(term12893, term12893.getClass(), "fastTime", 1870018035000L);
        setField(term12893, term12893.getClass(), "cdate", null);
        setField(term12834, term12834.getClass(), "createDate", term12893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NoAFAfGyYL";
        callMethod(klass, "oauth", argTypes, term12834, args);
    }

};


