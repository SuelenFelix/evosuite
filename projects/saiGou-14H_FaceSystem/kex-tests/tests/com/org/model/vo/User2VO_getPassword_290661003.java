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

public class User2VO_getPassword_290661003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14051;

    public User2VO_getPassword_290661003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14052 = new Integer(990883365);
        Integer term14126 = new Integer(633598642);
        Class<? extends Object> term14322 = Class.forName((String) "java.io.File$PathStatus");
        Field term14321 = ((Class) term14322).getDeclaredField((String) "INVALID");
        ((Field) term14321).setAccessible(true);
        Object enum2 = ((Field) term14321).get((Object) null);
        ArrayList term14213 = new ArrayList();
        ((ArrayList) term14213).add("OuZMVgPpoE");
        ((ArrayList) term14213).add("nDUyFfanYp");
        term14051 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term14140 = newInstance(Class.forName("java.io.File"));
        setField(term14051, term14051.getClass(), "id", term14052);
        setField(term14051, term14051.getClass(), "email", "QxSwOpnogl");
        setField(term14051, term14051.getClass(), "password", "wXeTrDfRqa");
        setField(term14051, term14051.getClass(), "username", "QsFsmwqvwM");
        setField(term14051, term14051.getClass(), "power", "pSDSdAjceB");
        setField(term14051, term14051.getClass(), "nickname", "TGMaCYOqml");
        setField(term14051, term14051.getClass(), "sex", "btqCBRPcNd");
        setField(term14051, term14051.getClass(), "age", term14126);
        setField(term14051, term14051.getClass(), "phone", "LEbiLyVKDG");
        setField(term14140, term14140.getClass(), "path", "PzUzEwZhUT");
        setField(term14140, term14140.getClass(), "status", enum2);
        setIntField(term14140, term14140.getClass(), "prefixLength", 1484323161);
        setField(term14140, term14140.getClass(), "filePath", null);
        setField(term14051, term14051.getClass(), "facePic", term14140);
        setField(term14051, term14051.getClass(), "faceUrl", "bJKvwEFeLG");
        setField(term14051, term14051.getClass(), "headUrl", "MQzXbKeQIa");
        setField(term14051, term14051.getClass(), "introduce", "YHDwlXeRTi");
        setField(term14051, term14051.getClass(), "ip", "WIJiLZqEqc");
        setField(term14051, term14051.getClass(), "partnames", term14213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term14051, args);
    }

};


