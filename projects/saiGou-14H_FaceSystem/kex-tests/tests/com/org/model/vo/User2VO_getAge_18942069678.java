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

public class User2VO_getAge_18942069678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16570;

    public User2VO_getAge_18942069678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16571 = new Integer(1692937831);
        Integer term16645 = new Integer(-1539747985);
        Class<? extends Object> term16817 = Class.forName((String) "java.io.File$PathStatus");
        Field term16816 = ((Class) term16817).getDeclaredField((String) "CHECKED");
        ((Field) term16816).setAccessible(true);
        Object enum7 = ((Field) term16816).get((Object) null);
        ArrayList term16732 = new ArrayList();
        term16570 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term16659 = newInstance(Class.forName("java.io.File"));
        setField(term16570, term16570.getClass(), "id", term16571);
        setField(term16570, term16570.getClass(), "email", "lowANLpXCV");
        setField(term16570, term16570.getClass(), "password", "orjiIcUIcD");
        setField(term16570, term16570.getClass(), "username", "lGzFueHQqZ");
        setField(term16570, term16570.getClass(), "power", "cjiDFHGGlp");
        setField(term16570, term16570.getClass(), "nickname", "XLjtkfroHJ");
        setField(term16570, term16570.getClass(), "sex", "hdqypaATat");
        setField(term16570, term16570.getClass(), "age", term16645);
        setField(term16570, term16570.getClass(), "phone", "yXrHDHEipD");
        setField(term16659, term16659.getClass(), "path", "pbqIeikQzp");
        setField(term16659, term16659.getClass(), "status", enum7);
        setIntField(term16659, term16659.getClass(), "prefixLength", -2038273078);
        setField(term16659, term16659.getClass(), "filePath", null);
        setField(term16570, term16570.getClass(), "facePic", term16659);
        setField(term16570, term16570.getClass(), "faceUrl", "baLJgqNNUx");
        setField(term16570, term16570.getClass(), "headUrl", "GlPSGqVaBj");
        setField(term16570, term16570.getClass(), "introduce", "jieMNXAAbL");
        setField(term16570, term16570.getClass(), "ip", "NbmTxmqOjh");
        setField(term16570, term16570.getClass(), "partnames", term16732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAge", argTypes, term16570, args);
    }

};


