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

public class User2VO_getNickname_21067689936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15426;

    public User2VO_getNickname_21067689936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term15427 = new Integer(1956590498);
        Integer term15501 = new Integer(1467356494);
        Class<? extends Object> term15769 = Class.forName((String) "java.io.File$PathStatus");
        Field term15768 = ((Class) term15769).getDeclaredField((String) "CHECKED");
        ((Field) term15768).setAccessible(true);
        Object enum5 = ((Field) term15768).get((Object) null);
        ArrayList term15588 = new ArrayList();
        ((ArrayList) term15588).add("OfXdotjbuM");
        ((ArrayList) term15588).add("DNkENYBesD");
        ((ArrayList) term15588).add("TSogTVVlxc");
        ((ArrayList) term15588).add("kWEJlReukq");
        ((ArrayList) term15588).add("jkCUxevJxb");
        ((ArrayList) term15588).add("WqobQIRpLc");
        ((ArrayList) term15588).add("jesZbitPYU");
        ((ArrayList) term15588).add("oIbEvXxpda");
        term15426 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term15515 = newInstance(Class.forName("java.io.File"));
        setField(term15426, term15426.getClass(), "id", term15427);
        setField(term15426, term15426.getClass(), "email", "tsYXZxQtLG");
        setField(term15426, term15426.getClass(), "password", "JUAWRJdehl");
        setField(term15426, term15426.getClass(), "username", "fFslDwqqzQ");
        setField(term15426, term15426.getClass(), "power", "oyTybTkTFd");
        setField(term15426, term15426.getClass(), "nickname", "NNjMZLPIcc");
        setField(term15426, term15426.getClass(), "sex", "fAcvTHLHOa");
        setField(term15426, term15426.getClass(), "age", term15501);
        setField(term15426, term15426.getClass(), "phone", "QavvcNVesW");
        setField(term15515, term15515.getClass(), "path", "JmFxhkDeIA");
        setField(term15515, term15515.getClass(), "status", enum5);
        setIntField(term15515, term15515.getClass(), "prefixLength", -616727354);
        setField(term15515, term15515.getClass(), "filePath", null);
        setField(term15426, term15426.getClass(), "facePic", term15515);
        setField(term15426, term15426.getClass(), "faceUrl", "XcJqDBnnMZ");
        setField(term15426, term15426.getClass(), "headUrl", "SchXFoqYFy");
        setField(term15426, term15426.getClass(), "introduce", "MnHKbTZBTr");
        setField(term15426, term15426.getClass(), "ip", "xCNDHQZBKx");
        setField(term15426, term15426.getClass(), "partnames", term15588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNickname", argTypes, term15426, args);
    }

};


