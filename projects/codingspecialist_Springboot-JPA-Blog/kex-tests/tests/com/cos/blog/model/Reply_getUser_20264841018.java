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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class Reply_getUser_20264841018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4092;

    public Reply_getUser_20264841018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4286 = Class.forName((String) "com.cos.blog.model.RoleType");
        Field term4285 = ((Class) term4286).getDeclaredField((String) "ADMIN");
        ((Field) term4285).setAccessible(true);
        Object enum7 = ((Field) term4285).get((Object) null);
        Object term4191 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term4191, term4191.getClass(), "id", 107945604);
        setField(term4191, term4191.getClass(), "content", null);
        setField(term4191, term4191.getClass(), "board", null);
        setField(term4191, term4191.getClass(), "user", null);
        setField(term4191, term4191.getClass(), "createDate", null);
        Object term4193 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term4193, term4193.getClass(), "id", -1697741339);
        setField(term4193, term4193.getClass(), "content", null);
        setField(term4193, term4193.getClass(), "board", null);
        setField(term4193, term4193.getClass(), "user", null);
        setField(term4193, term4193.getClass(), "createDate", null);
        Object term4195 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term4195, term4195.getClass(), "id", 0);
        setField(term4195, term4195.getClass(), "content", null);
        setField(term4195, term4195.getClass(), "board", null);
        setField(term4195, term4195.getClass(), "user", null);
        setField(term4195, term4195.getClass(), "createDate", null);
        Object term4197 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term4197, term4197.getClass(), "id", -1565502840);
        setField(term4197, term4197.getClass(), "content", null);
        setField(term4197, term4197.getClass(), "board", null);
        setField(term4197, term4197.getClass(), "user", null);
        setField(term4197, term4197.getClass(), "createDate", null);
        Object term4199 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        setIntField(term4199, term4199.getClass(), "id", 1555897383);
        setField(term4199, term4199.getClass(), "content", null);
        setField(term4199, term4199.getClass(), "board", null);
        setField(term4199, term4199.getClass(), "user", null);
        setField(term4199, term4199.getClass(), "createDate", null);
        ArrayList term4189 = new ArrayList();
        ((ArrayList) term4189).add(term4191);
        ((ArrayList) term4189).add(term4193);
        ((ArrayList) term4189).add(term4195);
        ((ArrayList) term4189).add(term4195);
        ((ArrayList) term4189).add(term4197);
        ((ArrayList) term4189).add(term4199);
        term4092 = newInstance(Class.forName("com.cos.blog.model.Reply"));
        Object term4106 = newInstance(Class.forName("com.cos.blog.model.Board"));
        Object term4133 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term4186 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4203 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4204 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4208 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4213 = newInstance(Class.forName("com.cos.blog.model.User"));
        Object term4215 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4216 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4220 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4092, term4092.getClass(), "id", -2015854073);
        setField(term4092, term4092.getClass(), "content", "UKAReurpHG");
        setIntField(term4106, term4106.getClass(), "id", 538259104);
        setField(term4106, term4106.getClass(), "title", "WVRMUmrljA");
        setField(term4106, term4106.getClass(), "content", "NTlKJDDWlk");
        setIntField(term4106, term4106.getClass(), "count", 96566506);
        setIntField(term4133, term4133.getClass(), "id", -343325701);
        setField(term4133, term4133.getClass(), "username", "vOuMEpOQAg");
        setField(term4133, term4133.getClass(), "password", "SIODFGaQhr");
        setField(term4133, term4133.getClass(), "email", "qYzsiuXOgS");
        setField(term4133, term4133.getClass(), "role", enum7);
        setField(term4133, term4133.getClass(), "oauth", "bxrCBbrrct");
        setIntField(term4186, term4186.getClass(), "nanos", 956000000);
        setLongField(term4186, term4186.getClass(), "fastTime", 1739406992000L);
        setField(term4186, term4186.getClass(), "cdate", null);
        setField(term4133, term4133.getClass(), "createDate", term4186);
        setField(term4106, term4106.getClass(), "user", term4133);
        setField(term4106, term4106.getClass(), "replys", term4189);
        setIntField(term4204, term4204.getClass(), "year", 2022);
        setShortField(term4204, term4204.getClass(), "month", (short) 6);
        setShortField(term4204, term4204.getClass(), "day", (short) 20);
        setField(term4203, term4203.getClass(), "date", term4204);
        setByteField(term4208, term4208.getClass(), "hour", (byte) 7);
        setByteField(term4208, term4208.getClass(), "minute", (byte) 57);
        setByteField(term4208, term4208.getClass(), "second", (byte) 37);
        setIntField(term4208, term4208.getClass(), "nano", 90374877);
        setField(term4203, term4203.getClass(), "time", term4208);
        setField(term4106, term4106.getClass(), "createDate", term4203);
        setField(term4092, term4092.getClass(), "board", term4106);
        setIntField(term4213, term4213.getClass(), "id", 0);
        setField(term4213, term4213.getClass(), "username", null);
        setField(term4213, term4213.getClass(), "password", null);
        setField(term4213, term4213.getClass(), "email", null);
        setField(term4213, term4213.getClass(), "role", null);
        setField(term4213, term4213.getClass(), "oauth", null);
        setField(term4213, term4213.getClass(), "createDate", null);
        setField(term4092, term4092.getClass(), "user", term4213);
        setIntField(term4216, term4216.getClass(), "year", 2023);
        setShortField(term4216, term4216.getClass(), "month", (short) 2);
        setShortField(term4216, term4216.getClass(), "day", (short) 16);
        setField(term4215, term4215.getClass(), "date", term4216);
        setByteField(term4220, term4220.getClass(), "hour", (byte) 3);
        setByteField(term4220, term4220.getClass(), "minute", (byte) 18);
        setByteField(term4220, term4220.getClass(), "second", (byte) 56);
        setIntField(term4220, term4220.getClass(), "nano", 733017887);
        setField(term4215, term4215.getClass(), "time", term4220);
        setField(term4092, term4092.getClass(), "createDate", term4215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.model.Reply");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term4092, args);
    }

};


