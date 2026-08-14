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

public class User_UserBuilder_password_13823959773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11851;

    public User_UserBuilder_password_13823959773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11956 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term11955 = ((Class) term11956).getDeclaredField((String) "ADMIN");
        ((Field) term11955).setAccessible(true);
        Object enum23 = ((Field) term11955).get((Object) null);
        term11851 = newInstance(Class.forName("com.cos.blog.model.User$UserBuilder"));
        Object term11910 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term11851, term11851.getClass(), "id", -233024044);
        setField(term11851, term11851.getClass(), "username", "vjNPcTSqmS");
        setField(term11851, term11851.getClass(), "password", "fFhdWuJbdC");
        setField(term11851, term11851.getClass(), "email", "JlgLIHPabR");
        setField(term11851, term11851.getClass(), "role", enum23);
        setField(term11851, term11851.getClass(), "oauth", "LHnkeoNwHq");
        setIntField(term11910, term11910.getClass(), "nanos", 597000000);
        setLongField(term11910, term11910.getClass(), "fastTime", 1758762464000L);
        setField(term11910, term11910.getClass(), "cdate", null);
        setField(term11851, term11851.getClass(), "createDate", term11910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gVnDVbSyKa";
        callMethod(klass, "password", argTypes, term11851, args);
    }

};


