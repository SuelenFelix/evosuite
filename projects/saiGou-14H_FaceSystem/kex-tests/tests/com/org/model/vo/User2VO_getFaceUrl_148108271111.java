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

public class User2VO_getFaceUrl_148108271111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18033;

    public User2VO_getFaceUrl_148108271111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18034 = new Integer(-1622760744);
        Integer term18108 = new Integer(2068435279);
        Class<? extends Object> term18316 = Class.forName((String) "java.io.File$PathStatus");
        Field term18315 = ((Class) term18316).getDeclaredField((String) "INVALID");
        ((Field) term18315).setAccessible(true);
        Object enum10 = ((Field) term18315).get((Object) null);
        ArrayList term18195 = new ArrayList();
        ((ArrayList) term18195).add("WVQqsFGJMw");
        ((ArrayList) term18195).add("TIPSlmidwP");
        ((ArrayList) term18195).add("SRYeqWJJkR");
        term18033 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term18122 = newInstance(Class.forName("java.io.File"));
        setField(term18033, term18033.getClass(), "id", term18034);
        setField(term18033, term18033.getClass(), "email", "WHpoLWpffz");
        setField(term18033, term18033.getClass(), "password", "axiXBkomuw");
        setField(term18033, term18033.getClass(), "username", "nhByIXwUpO");
        setField(term18033, term18033.getClass(), "power", "vVySvQZVok");
        setField(term18033, term18033.getClass(), "nickname", "fDVzkGiHev");
        setField(term18033, term18033.getClass(), "sex", "CanAbWJNgt");
        setField(term18033, term18033.getClass(), "age", term18108);
        setField(term18033, term18033.getClass(), "phone", "tFRLUuSeUt");
        setField(term18122, term18122.getClass(), "path", "KcKxvbBAHa");
        setField(term18122, term18122.getClass(), "status", enum10);
        setIntField(term18122, term18122.getClass(), "prefixLength", 1725571209);
        setField(term18122, term18122.getClass(), "filePath", null);
        setField(term18033, term18033.getClass(), "facePic", term18122);
        setField(term18033, term18033.getClass(), "faceUrl", "NbFVXCPmxn");
        setField(term18033, term18033.getClass(), "headUrl", "ovYlGvhKKO");
        setField(term18033, term18033.getClass(), "introduce", "JvoSiMCDAb");
        setField(term18033, term18033.getClass(), "ip", "JANJXHGMsv");
        setField(term18033, term18033.getClass(), "partnames", term18195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFaceUrl", argTypes, term18033, args);
    }

};


