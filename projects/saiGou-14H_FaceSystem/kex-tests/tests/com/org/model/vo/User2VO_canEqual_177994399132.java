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

public class User2VO_canEqual_177994399132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30024;
     Object term30262;

    public User2VO_canEqual_177994399132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30025 = new Integer(1801052257);
        Integer term30099 = new Integer(-2110556060);
        Class<? extends Object> term30344 = Class.forName((String) "java.io.File$PathStatus");
        Field term30343 = ((Class) term30344).getDeclaredField((String) "CHECKED");
        ((Field) term30343).setAccessible(true);
        Object enum32 = ((Field) term30343).get((Object) null);
        ArrayList term30186 = new ArrayList();
        ((ArrayList) term30186).add("vuGxdvURpp");
        ((ArrayList) term30186).add("zUgAERZZFZ");
        ((ArrayList) term30186).add("QhkdVFKaoy");
        ((ArrayList) term30186).add("WCQDPwVjsS");
        ((ArrayList) term30186).add("XkZOYFvTGI");
        ((ArrayList) term30186).add("NifhlBZIDF");
        term30024 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term30113 = newInstance(Class.forName("java.io.File"));
        setField(term30024, term30024.getClass(), "id", term30025);
        setField(term30024, term30024.getClass(), "email", "IAlXRzFnsw");
        setField(term30024, term30024.getClass(), "password", "QGWHwsqzqh");
        setField(term30024, term30024.getClass(), "username", "HToXzWGnjh");
        setField(term30024, term30024.getClass(), "power", "ymGhnCkAFG");
        setField(term30024, term30024.getClass(), "nickname", "JYQEoThPjD");
        setField(term30024, term30024.getClass(), "sex", "uUYeaeRaCx");
        setField(term30024, term30024.getClass(), "age", term30099);
        setField(term30024, term30024.getClass(), "phone", "oCpxzVdxcV");
        setField(term30113, term30113.getClass(), "path", "PzNtQwCbTD");
        setField(term30113, term30113.getClass(), "status", enum32);
        setIntField(term30113, term30113.getClass(), "prefixLength", -73683645);
        setField(term30113, term30113.getClass(), "filePath", null);
        setField(term30024, term30024.getClass(), "facePic", term30113);
        setField(term30024, term30024.getClass(), "faceUrl", "wQAefimNLh");
        setField(term30024, term30024.getClass(), "headUrl", "NDFbtxRRgi");
        setField(term30024, term30024.getClass(), "introduce", "vasBXGWtux");
        setField(term30024, term30024.getClass(), "ip", "UfUIICYJWk");
        setField(term30024, term30024.getClass(), "partnames", term30186);
        term30262 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30262;
        callMethod(klass, "canEqual", argTypes, term30024, args);
    }

};


