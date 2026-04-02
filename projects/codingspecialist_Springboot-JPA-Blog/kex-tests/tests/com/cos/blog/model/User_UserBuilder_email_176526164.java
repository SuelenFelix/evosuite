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

public class User_UserBuilder_email_176526164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12132;

    public User_UserBuilder_email_176526164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12237 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term12236 = ((Class) term12237).getDeclaredField((String) "ADMIN");
        ((Field) term12236).setAccessible(true);
        Object enum24 = ((Field) term12236).get((Object) null);
        term12132 = newInstance(Class.forName("com.cos.blog.model.User$UserBuilder"));
        Object term12191 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term12132, term12132.getClass(), "id", 1820784228);
        setField(term12132, term12132.getClass(), "username", "kdCYNMSuoD");
        setField(term12132, term12132.getClass(), "password", "eRYlSLwtvV");
        setField(term12132, term12132.getClass(), "email", "duOyJsARTD");
        setField(term12132, term12132.getClass(), "role", enum24);
        setField(term12132, term12132.getClass(), "oauth", "xPnOHsNlyc");
        setIntField(term12191, term12191.getClass(), "nanos", 295000000);
        setLongField(term12191, term12191.getClass(), "fastTime", 1303878982000L);
        setField(term12191, term12191.getClass(), "cdate", null);
        setField(term12132, term12132.getClass(), "createDate", term12191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OTSPWPJefj";
        callMethod(klass, "email", argTypes, term12132, args);
    }

};


