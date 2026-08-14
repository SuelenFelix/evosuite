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

public class User_canEqual_62117282216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29250;
     Object term29311;

    public User_canEqual_62117282216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29343 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term29342 = ((Class) term29343).getDeclaredField((String) "USER");
        ((Field) term29342).setAccessible(true);
        Object enum68 = ((Field) term29342).get((Object) null);
        term29250 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term29308 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term29250, term29250.getClass(), "id", -890538258);
        setField(term29250, term29250.getClass(), "username", "xneQCADwGB");
        setField(term29250, term29250.getClass(), "password", "luSCmxphxi");
        setField(term29250, term29250.getClass(), "email", "OGEDwuJhjV");
        setField(term29250, term29250.getClass(), "role", enum68);
        setField(term29250, term29250.getClass(), "oauth", "vepOtOxlWM");
        setIntField(term29308, term29308.getClass(), "nanos", 447000000);
        setLongField(term29308, term29308.getClass(), "fastTime", 1889588747000L);
        setField(term29308, term29308.getClass(), "cdate", null);
        setField(term29250, term29250.getClass(), "createDate", term29308);
        term29311 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term29311;
        callMethod(klass, "canEqual", argTypes, term29250, args);
    }

};


