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

public class User2VO_setIntroduce_103574626828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27950;

    public User2VO_setIntroduce_103574626828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27951 = new Integer(-1415256843);
        Integer term28025 = new Integer(612177768);
        Class<? extends Object> term28209 = Class.forName((String) "java.io.File$PathStatus");
        Field term28208 = ((Class) term28209).getDeclaredField((String) "CHECKED");
        ((Field) term28208).setAccessible(true);
        Object enum28 = ((Field) term28208).get((Object) null);
        ArrayList term28112 = new ArrayList();
        term27950 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term28039 = newInstance(Class.forName("java.io.File"));
        setField(term27950, term27950.getClass(), "id", term27951);
        setField(term27950, term27950.getClass(), "email", "VZRLekBSXz");
        setField(term27950, term27950.getClass(), "password", "XfdYCOWEXZ");
        setField(term27950, term27950.getClass(), "username", "aPbJKoMxFL");
        setField(term27950, term27950.getClass(), "power", "FgtqUFBPnP");
        setField(term27950, term27950.getClass(), "nickname", "NUkHqaKZhA");
        setField(term27950, term27950.getClass(), "sex", "kHSkpGasYO");
        setField(term27950, term27950.getClass(), "age", term28025);
        setField(term27950, term27950.getClass(), "phone", "OvTdHngAsq");
        setField(term28039, term28039.getClass(), "path", "dlLhtWVZjw");
        setField(term28039, term28039.getClass(), "status", enum28);
        setIntField(term28039, term28039.getClass(), "prefixLength", -1275173084);
        setField(term28039, term28039.getClass(), "filePath", null);
        setField(term27950, term27950.getClass(), "facePic", term28039);
        setField(term27950, term27950.getClass(), "faceUrl", "bGfglrDSXT");
        setField(term27950, term27950.getClass(), "headUrl", "sIrqbajnbs");
        setField(term27950, term27950.getClass(), "introduce", "AaxFofoThl");
        setField(term27950, term27950.getClass(), "ip", "ukaqYcLsKW");
        setField(term27950, term27950.getClass(), "partnames", term28112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EZLBboYbhD";
        callMethod(klass, "setIntroduce", argTypes, term27950, args);
    }

};


