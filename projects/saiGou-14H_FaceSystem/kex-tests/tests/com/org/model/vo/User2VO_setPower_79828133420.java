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

public class User2VO_setPower_79828133420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23172;

    public User2VO_setPower_79828133420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23173 = new Integer(1973060703);
        Integer term23247 = new Integer(-138239905);
        Class<? extends Object> term23491 = Class.forName((String) "java.io.File$PathStatus");
        Field term23490 = ((Class) term23491).getDeclaredField((String) "INVALID");
        ((Field) term23490).setAccessible(true);
        Object enum19 = ((Field) term23490).get((Object) null);
        ArrayList term23334 = new ArrayList();
        ((ArrayList) term23334).add("bLKLlXYEeh");
        ((ArrayList) term23334).add("amltyOnIBK");
        ((ArrayList) term23334).add("hjGlJibBAS");
        ((ArrayList) term23334).add("vinKDMUJMl");
        ((ArrayList) term23334).add("MgjVPQNbcu");
        term23172 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term23261 = newInstance(Class.forName("java.io.File"));
        setField(term23172, term23172.getClass(), "id", term23173);
        setField(term23172, term23172.getClass(), "email", "cgHejOgcDW");
        setField(term23172, term23172.getClass(), "password", "QYNTEJcWIQ");
        setField(term23172, term23172.getClass(), "username", "SbdSVclvuX");
        setField(term23172, term23172.getClass(), "power", "QpoSxHFuJh");
        setField(term23172, term23172.getClass(), "nickname", "GLAJgnHQMo");
        setField(term23172, term23172.getClass(), "sex", "nDzlNeexNi");
        setField(term23172, term23172.getClass(), "age", term23247);
        setField(term23172, term23172.getClass(), "phone", "XhILAYdtGS");
        setField(term23261, term23261.getClass(), "path", "ZRWORAfStn");
        setField(term23261, term23261.getClass(), "status", enum19);
        setIntField(term23261, term23261.getClass(), "prefixLength", 1048535127);
        setField(term23261, term23261.getClass(), "filePath", null);
        setField(term23172, term23172.getClass(), "facePic", term23261);
        setField(term23172, term23172.getClass(), "faceUrl", "loCxNBoGfW");
        setField(term23172, term23172.getClass(), "headUrl", "PGVYUjJrZh");
        setField(term23172, term23172.getClass(), "introduce", "OHliEqVque");
        setField(term23172, term23172.getClass(), "ip", "kQWmmbQQqu");
        setField(term23172, term23172.getClass(), "partnames", term23334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QNYLGZGxNy";
        callMethod(klass, "setPower", argTypes, term23172, args);
    }

};


