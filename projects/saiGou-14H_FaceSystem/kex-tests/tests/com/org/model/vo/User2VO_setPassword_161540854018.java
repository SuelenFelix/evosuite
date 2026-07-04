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

public class User2VO_setPassword_161540854018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21918;

    public User2VO_setPassword_161540854018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term21919 = new Integer(279384872);
        Integer term21993 = new Integer(1427305953);
        Class<? extends Object> term22273 = Class.forName((String) "java.io.File$PathStatus");
        Field term22272 = ((Class) term22273).getDeclaredField((String) "CHECKED");
        ((Field) term22272).setAccessible(true);
        Object enum17 = ((Field) term22272).get((Object) null);
        ArrayList term22080 = new ArrayList();
        ((ArrayList) term22080).add("MFSosHURtm");
        ((ArrayList) term22080).add("hIBYlJpYye");
        ((ArrayList) term22080).add("LNendOzJhj");
        ((ArrayList) term22080).add("ZwcevQDgzv");
        ((ArrayList) term22080).add("rzkENrHYBI");
        ((ArrayList) term22080).add("ylJjmNVzzt");
        ((ArrayList) term22080).add("nwKTRDmHWk");
        ((ArrayList) term22080).add("UueEixdrss");
        term21918 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term22007 = newInstance(Class.forName("java.io.File"));
        setField(term21918, term21918.getClass(), "id", term21919);
        setField(term21918, term21918.getClass(), "email", "mvOJAtEcWR");
        setField(term21918, term21918.getClass(), "password", "QybezBkmJu");
        setField(term21918, term21918.getClass(), "username", "uWIrREgpjs");
        setField(term21918, term21918.getClass(), "power", "TmEdDFXkTZ");
        setField(term21918, term21918.getClass(), "nickname", "DjjdYbIhNY");
        setField(term21918, term21918.getClass(), "sex", "AGaeaoutjJ");
        setField(term21918, term21918.getClass(), "age", term21993);
        setField(term21918, term21918.getClass(), "phone", "oHWSUbpGiK");
        setField(term22007, term22007.getClass(), "path", "RreVzKmtxf");
        setField(term22007, term22007.getClass(), "status", enum17);
        setIntField(term22007, term22007.getClass(), "prefixLength", -1456670397);
        setField(term22007, term22007.getClass(), "filePath", null);
        setField(term21918, term21918.getClass(), "facePic", term22007);
        setField(term21918, term21918.getClass(), "faceUrl", "xHBCsghEAi");
        setField(term21918, term21918.getClass(), "headUrl", "BVlqqUSYbB");
        setField(term21918, term21918.getClass(), "introduce", "hhGHcwcBqB");
        setField(term21918, term21918.getClass(), "ip", "WIVENkFxNU");
        setField(term21918, term21918.getClass(), "partnames", term22080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ceafBXJyBB";
        callMethod(klass, "setPassword", argTypes, term21918, args);
    }

};


