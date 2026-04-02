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
import java.lang.Integer;

public class User_setId_883193508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27104;
     Object term27165;

    public User_setId_883193508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27198 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term27197 = ((Class) term27198).getDeclaredField((String) "USER");
        ((Field) term27197).setAccessible(true);
        Object enum60 = ((Field) term27197).get((Object) null);
        term27104 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term27162 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term27104, term27104.getClass(), "id", -1130401612);
        setField(term27104, term27104.getClass(), "username", "TQgECVDMEf");
        setField(term27104, term27104.getClass(), "password", "KIBOVYItqe");
        setField(term27104, term27104.getClass(), "email", "GUztJeVeCc");
        setField(term27104, term27104.getClass(), "role", enum60);
        setField(term27104, term27104.getClass(), "oauth", "YNXFGgstqj");
        setIntField(term27162, term27162.getClass(), "nanos", 917000000);
        setLongField(term27162, term27162.getClass(), "fastTime", 1439695359000L);
        setField(term27162, term27162.getClass(), "cdate", null);
        setField(term27104, term27104.getClass(), "createDate", term27162);
        term27165 = new Integer(-316771104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term27165;
        callMethod(klass, "setId", argTypes, term27104, args);
    }

};


