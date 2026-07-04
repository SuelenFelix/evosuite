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

public class User2VO_setHeadUrl_207266970827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27389;

    public User2VO_setHeadUrl_207266970827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27390 = new Integer(1633913667);
        Integer term27464 = new Integer(1292332296);
        Class<? extends Object> term27708 = Class.forName((String) "java.io.File$PathStatus");
        Field term27707 = ((Class) term27708).getDeclaredField((String) "INVALID");
        ((Field) term27707).setAccessible(true);
        Object enum27 = ((Field) term27707).get((Object) null);
        ArrayList term27551 = new ArrayList();
        ((ArrayList) term27551).add("GrrqChmbDB");
        ((ArrayList) term27551).add("AOUZgesZGu");
        ((ArrayList) term27551).add("RApShxzpug");
        ((ArrayList) term27551).add("aygFZPbIko");
        ((ArrayList) term27551).add("hUhlDCVWIF");
        term27389 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term27478 = newInstance(Class.forName("java.io.File"));
        setField(term27389, term27389.getClass(), "id", term27390);
        setField(term27389, term27389.getClass(), "email", "YNXNgIokRz");
        setField(term27389, term27389.getClass(), "password", "XRDgUBBIlB");
        setField(term27389, term27389.getClass(), "username", "kWMQGdvKwx");
        setField(term27389, term27389.getClass(), "power", "zRwnGNjqEc");
        setField(term27389, term27389.getClass(), "nickname", "PadBNsKGSM");
        setField(term27389, term27389.getClass(), "sex", "BqLgONTWcn");
        setField(term27389, term27389.getClass(), "age", term27464);
        setField(term27389, term27389.getClass(), "phone", "QyyvfuUsSl");
        setField(term27478, term27478.getClass(), "path", "urXLfQoyuc");
        setField(term27478, term27478.getClass(), "status", enum27);
        setIntField(term27478, term27478.getClass(), "prefixLength", 865208305);
        setField(term27478, term27478.getClass(), "filePath", null);
        setField(term27389, term27389.getClass(), "facePic", term27478);
        setField(term27389, term27389.getClass(), "faceUrl", "KoWkwRBvcY");
        setField(term27389, term27389.getClass(), "headUrl", "kqDHOsurKa");
        setField(term27389, term27389.getClass(), "introduce", "NCqNKzmHkE");
        setField(term27389, term27389.getClass(), "ip", "eFSnWGCXQK");
        setField(term27389, term27389.getClass(), "partnames", term27551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GjzKvoPaBR";
        callMethod(klass, "setHeadUrl", argTypes, term27389, args);
    }

};


