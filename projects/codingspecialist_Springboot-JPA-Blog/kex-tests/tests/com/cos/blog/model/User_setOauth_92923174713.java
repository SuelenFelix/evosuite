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

public class User_setOauth_92923174713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28455;

    public User_setOauth_92923174713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28559 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term28558 = ((Class) term28559).getDeclaredField((String) "USER");
        ((Field) term28558).setAccessible(true);
        Object enum65 = ((Field) term28558).get((Object) null);
        term28455 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term28513 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term28455, term28455.getClass(), "id", 454242689);
        setField(term28455, term28455.getClass(), "username", "YIDNFdhfGO");
        setField(term28455, term28455.getClass(), "password", "adNbqunmox");
        setField(term28455, term28455.getClass(), "email", "ImSBmTIdsP");
        setField(term28455, term28455.getClass(), "role", enum65);
        setField(term28455, term28455.getClass(), "oauth", "KDKQhbiclt");
        setIntField(term28513, term28513.getClass(), "nanos", 924000000);
        setLongField(term28513, term28513.getClass(), "fastTime", 1407915818000L);
        setField(term28513, term28513.getClass(), "cdate", null);
        setField(term28455, term28455.getClass(), "createDate", term28513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "diWnDDpNWl";
        callMethod(klass, "setOauth", argTypes, term28455, args);
    }

};


