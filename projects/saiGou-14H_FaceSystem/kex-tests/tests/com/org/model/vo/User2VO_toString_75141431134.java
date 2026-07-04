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

public class User2VO_toString_75141431134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31081;

    public User2VO_toString_75141431134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31082 = new Integer(-1674430871);
        Integer term31156 = new Integer(794352120);
        Class<? extends Object> term31328 = Class.forName((String) "java.io.File$PathStatus");
        Field term31327 = ((Class) term31328).getDeclaredField((String) "INVALID");
        ((Field) term31327).setAccessible(true);
        Object enum34 = ((Field) term31327).get((Object) null);
        ArrayList term31243 = new ArrayList();
        term31081 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term31170 = newInstance(Class.forName("java.io.File"));
        setField(term31081, term31081.getClass(), "id", term31082);
        setField(term31081, term31081.getClass(), "email", "atajdBiCpk");
        setField(term31081, term31081.getClass(), "password", "iZkNHOfNWw");
        setField(term31081, term31081.getClass(), "username", "SxvlCppquX");
        setField(term31081, term31081.getClass(), "power", "KXtTCHHVWr");
        setField(term31081, term31081.getClass(), "nickname", "ylbTmYKeKr");
        setField(term31081, term31081.getClass(), "sex", "iyKZenGXgC");
        setField(term31081, term31081.getClass(), "age", term31156);
        setField(term31081, term31081.getClass(), "phone", "jgPUpbSRNf");
        setField(term31170, term31170.getClass(), "path", "GHKReaUGqB");
        setField(term31170, term31170.getClass(), "status", enum34);
        setIntField(term31170, term31170.getClass(), "prefixLength", 1193880199);
        setField(term31170, term31170.getClass(), "filePath", null);
        setField(term31081, term31081.getClass(), "facePic", term31170);
        setField(term31081, term31081.getClass(), "faceUrl", "oWFgLqbhiK");
        setField(term31081, term31081.getClass(), "headUrl", "gyLdvdOJQs");
        setField(term31081, term31081.getClass(), "introduce", "PASAYkwcOc");
        setField(term31081, term31081.getClass(), "ip", "aeiojdusXr");
        setField(term31081, term31081.getClass(), "partnames", term31243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term31081, args);
    }

};


