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

public class User2VO_getPartnames_114565566715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20211;

    public User2VO_getPartnames_114565566715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term20212 = new Integer(-1220630391);
        Integer term20286 = new Integer(-995822131);
        Class<? extends Object> term20518 = Class.forName((String) "java.io.File$PathStatus");
        Field term20517 = ((Class) term20518).getDeclaredField((String) "INVALID");
        ((Field) term20517).setAccessible(true);
        Object enum14 = ((Field) term20517).get((Object) null);
        ArrayList term20373 = new ArrayList();
        ((ArrayList) term20373).add("BmnUezUoWz");
        ((ArrayList) term20373).add("QqeCgeRpIS");
        ((ArrayList) term20373).add("xVwossmLda");
        ((ArrayList) term20373).add("EvSQeALexj");
        ((ArrayList) term20373).add("VuprBjhWdI");
        term20211 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term20300 = newInstance(Class.forName("java.io.File"));
        setField(term20211, term20211.getClass(), "id", term20212);
        setField(term20211, term20211.getClass(), "email", "urBahuOkUQ");
        setField(term20211, term20211.getClass(), "password", "zHcZrTMdOT");
        setField(term20211, term20211.getClass(), "username", "zIAIXHeKXt");
        setField(term20211, term20211.getClass(), "power", "fVkSkOqFEO");
        setField(term20211, term20211.getClass(), "nickname", "DLfgyAqDDu");
        setField(term20211, term20211.getClass(), "sex", "ryuQaXtwNj");
        setField(term20211, term20211.getClass(), "age", term20286);
        setField(term20211, term20211.getClass(), "phone", "OutjKNDSgR");
        setField(term20300, term20300.getClass(), "path", "brfLLGXcwA");
        setField(term20300, term20300.getClass(), "status", enum14);
        setIntField(term20300, term20300.getClass(), "prefixLength", 1585847225);
        setField(term20300, term20300.getClass(), "filePath", null);
        setField(term20211, term20211.getClass(), "facePic", term20300);
        setField(term20211, term20211.getClass(), "faceUrl", "zoVKwYYMOI");
        setField(term20211, term20211.getClass(), "headUrl", "DGCeQsmIOU");
        setField(term20211, term20211.getClass(), "introduce", "otcpSHwkzG");
        setField(term20211, term20211.getClass(), "ip", "BixZhUjVme");
        setField(term20211, term20211.getClass(), "partnames", term20373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPartnames", argTypes, term20211, args);
    }

};


