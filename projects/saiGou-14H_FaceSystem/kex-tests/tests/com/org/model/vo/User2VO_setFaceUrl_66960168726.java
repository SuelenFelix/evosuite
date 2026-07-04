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

public class User2VO_setFaceUrl_66960168726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26762;

    public User2VO_setFaceUrl_66960168726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26763 = new Integer(-355469363);
        Integer term26837 = new Integer(1465188553);
        Class<? extends Object> term27117 = Class.forName((String) "java.io.File$PathStatus");
        Field term27116 = ((Class) term27117).getDeclaredField((String) "INVALID");
        ((Field) term27116).setAccessible(true);
        Object enum26 = ((Field) term27116).get((Object) null);
        ArrayList term26924 = new ArrayList();
        ((ArrayList) term26924).add("CLVzSrhOjS");
        ((ArrayList) term26924).add("OrrgHDCMip");
        ((ArrayList) term26924).add("mEYsXJvgdv");
        ((ArrayList) term26924).add("JKbmIUKwNm");
        ((ArrayList) term26924).add("rftaOUctkN");
        ((ArrayList) term26924).add("BqodsrSZso");
        ((ArrayList) term26924).add("APQYHLBKit");
        ((ArrayList) term26924).add("tIucnzigbY");
        term26762 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term26851 = newInstance(Class.forName("java.io.File"));
        setField(term26762, term26762.getClass(), "id", term26763);
        setField(term26762, term26762.getClass(), "email", "DNeKwjPiYD");
        setField(term26762, term26762.getClass(), "password", "jxryzEuKJL");
        setField(term26762, term26762.getClass(), "username", "EPCordSkfF");
        setField(term26762, term26762.getClass(), "power", "TdSezgsZkW");
        setField(term26762, term26762.getClass(), "nickname", "aJlxWEbXVP");
        setField(term26762, term26762.getClass(), "sex", "pxpYGruvWy");
        setField(term26762, term26762.getClass(), "age", term26837);
        setField(term26762, term26762.getClass(), "phone", "BMskFMPoeb");
        setField(term26851, term26851.getClass(), "path", "LdfzgJfEqK");
        setField(term26851, term26851.getClass(), "status", enum26);
        setIntField(term26851, term26851.getClass(), "prefixLength", 590364439);
        setField(term26851, term26851.getClass(), "filePath", null);
        setField(term26762, term26762.getClass(), "facePic", term26851);
        setField(term26762, term26762.getClass(), "faceUrl", "YdzBhsGATX");
        setField(term26762, term26762.getClass(), "headUrl", "IxrOGCWNvM");
        setField(term26762, term26762.getClass(), "introduce", "ixwssTuJbB");
        setField(term26762, term26762.getClass(), "ip", "IXdiuaFyFC");
        setField(term26762, term26762.getClass(), "partnames", term26924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SMZbMLuReo";
        callMethod(klass, "setFaceUrl", argTypes, term26762, args);
    }

};


