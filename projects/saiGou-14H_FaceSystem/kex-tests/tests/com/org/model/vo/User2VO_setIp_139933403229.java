package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class User2VO_setIp_139933403229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28401;

    public User2VO_setIp_139933403229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28402 = new Integer(-1626451656);
        Integer term28476 = new Integer(173952451);
        Class<? extends Object> term28684 = Class.forName((String) "java.io.File$PathStatus");
        Field term28683 = ((Class) term28684).getDeclaredField((String) "CHECKED");
        ((Field) term28683).setAccessible(true);
        Object enum29 = ((Field) term28683).get((Object) null);
        ArrayList term28563 = new ArrayList();
        ((ArrayList) term28563).add("NkOntrweCo");
        ((ArrayList) term28563).add("hVtvnBKztu");
        term28401 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term28490 = newInstance(Class.forName("java.io.File"));
        setField(term28401, term28401.getClass(), "id", term28402);
        setField(term28401, term28401.getClass(), "email", "bZISImXSTe");
        setField(term28401, term28401.getClass(), "password", "yrKoMMHHHY");
        setField(term28401, term28401.getClass(), "username", "JqDCwLjqnp");
        setField(term28401, term28401.getClass(), "power", "FHqHhmdJat");
        setField(term28401, term28401.getClass(), "nickname", "QvpedpvzkV");
        setField(term28401, term28401.getClass(), "sex", "hSWpWtRQyH");
        setField(term28401, term28401.getClass(), "age", term28476);
        setField(term28401, term28401.getClass(), "phone", "DgHnOCKjBN");
        setField(term28490, term28490.getClass(), "path", "nSSytCAuBk");
        setField(term28490, term28490.getClass(), "status", enum29);
        setIntField(term28490, term28490.getClass(), "prefixLength", -244121226);
        setField(term28490, term28490.getClass(), "filePath", null);
        setField(term28401, term28401.getClass(), "facePic", term28490);
        setField(term28401, term28401.getClass(), "faceUrl", "XiZyOHXnNC");
        setField(term28401, term28401.getClass(), "headUrl", "gQlDPvSqrX");
        setField(term28401, term28401.getClass(), "introduce", "EnYnZHmIml");
        setField(term28401, term28401.getClass(), "ip", "jvhvoAISsw");
        setField(term28401, term28401.getClass(), "partnames", term28563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VOpwlWudOv";
        callMethod(klass, "setIp", argTypes, term28401, args);
    }

};


