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

public class User2VO_setNickname_60185586321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23733;

    public User2VO_setNickname_60185586321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23734 = new Integer(1709474063);
        Integer term23808 = new Integer(1406617209);
        Class<? extends Object> term24064 = Class.forName((String) "java.io.File$PathStatus");
        Field term24063 = ((Class) term24064).getDeclaredField((String) "CHECKED");
        ((Field) term24063).setAccessible(true);
        Object enum20 = ((Field) term24063).get((Object) null);
        ArrayList term23895 = new ArrayList();
        ((ArrayList) term23895).add("CvbqWuRute");
        ((ArrayList) term23895).add("yuvBFZQJBJ");
        ((ArrayList) term23895).add("prymoiXBsv");
        ((ArrayList) term23895).add("XVkgypnsVx");
        ((ArrayList) term23895).add("TwXzbEYFtG");
        ((ArrayList) term23895).add("mRdoimcRwz");
        term23733 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term23822 = newInstance(Class.forName("java.io.File"));
        setField(term23733, term23733.getClass(), "id", term23734);
        setField(term23733, term23733.getClass(), "email", "BrECRdedgj");
        setField(term23733, term23733.getClass(), "password", "lktYSRAAkX");
        setField(term23733, term23733.getClass(), "username", "KmbCndAIRO");
        setField(term23733, term23733.getClass(), "power", "LfLWkWgTGE");
        setField(term23733, term23733.getClass(), "nickname", "uleoYrEbgk");
        setField(term23733, term23733.getClass(), "sex", "JINAWGBEol");
        setField(term23733, term23733.getClass(), "age", term23808);
        setField(term23733, term23733.getClass(), "phone", "HZRzxVDGhV");
        setField(term23822, term23822.getClass(), "path", "wOWOSBOjln");
        setField(term23822, term23822.getClass(), "status", enum20);
        setIntField(term23822, term23822.getClass(), "prefixLength", -655067527);
        setField(term23822, term23822.getClass(), "filePath", null);
        setField(term23733, term23733.getClass(), "facePic", term23822);
        setField(term23733, term23733.getClass(), "faceUrl", "iVXUeGctUB");
        setField(term23733, term23733.getClass(), "headUrl", "bmLiVLNmZC");
        setField(term23733, term23733.getClass(), "introduce", "ORExcUfatr");
        setField(term23733, term23733.getClass(), "ip", "cUonKmQWCB");
        setField(term23733, term23733.getClass(), "partnames", term23895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dxJDKuPPPM";
        callMethod(klass, "setNickname", argTypes, term23733, args);
    }

};


