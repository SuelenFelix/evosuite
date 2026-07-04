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

public class User2VO_setPhone_100581793324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25440;

    public User2VO_setPhone_100581793324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25441 = new Integer(5603560);
        Integer term25515 = new Integer(-1079020032);
        Class<? extends Object> term25807 = Class.forName((String) "java.io.File$PathStatus");
        Field term25806 = ((Class) term25807).getDeclaredField((String) "CHECKED");
        ((Field) term25806).setAccessible(true);
        Object enum23 = ((Field) term25806).get((Object) null);
        ArrayList term25602 = new ArrayList();
        ((ArrayList) term25602).add("xxswizwuwy");
        ((ArrayList) term25602).add("QbkfeBvHco");
        ((ArrayList) term25602).add("lLaCGEQqCV");
        ((ArrayList) term25602).add("bYFQVigzOV");
        ((ArrayList) term25602).add("TXKwwgcTVt");
        ((ArrayList) term25602).add("FgaHDSytdu");
        ((ArrayList) term25602).add("cmIDVqeLNI");
        ((ArrayList) term25602).add("XoYlWxsjIF");
        ((ArrayList) term25602).add("xkIacuRHpE");
        term25440 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term25529 = newInstance(Class.forName("java.io.File"));
        setField(term25440, term25440.getClass(), "id", term25441);
        setField(term25440, term25440.getClass(), "email", "kWDcKMrObe");
        setField(term25440, term25440.getClass(), "password", "yQIuIaxdRt");
        setField(term25440, term25440.getClass(), "username", "mppqyavbHE");
        setField(term25440, term25440.getClass(), "power", "XRhNVGJlMP");
        setField(term25440, term25440.getClass(), "nickname", "OGvydrXtac");
        setField(term25440, term25440.getClass(), "sex", "SaPfgULGFp");
        setField(term25440, term25440.getClass(), "age", term25515);
        setField(term25440, term25440.getClass(), "phone", "olLmzJWshP");
        setField(term25529, term25529.getClass(), "path", "VbgHjUqRYR");
        setField(term25529, term25529.getClass(), "status", enum23);
        setIntField(term25529, term25529.getClass(), "prefixLength", -117576464);
        setField(term25529, term25529.getClass(), "filePath", null);
        setField(term25440, term25440.getClass(), "facePic", term25529);
        setField(term25440, term25440.getClass(), "faceUrl", "qZzSujRYqy");
        setField(term25440, term25440.getClass(), "headUrl", "IJXeeXjhgd");
        setField(term25440, term25440.getClass(), "introduce", "QTDAUOmsVV");
        setField(term25440, term25440.getClass(), "ip", "ODrpsXzKlX");
        setField(term25440, term25440.getClass(), "partnames", term25602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xFULXQCABK";
        callMethod(klass, "setPhone", argTypes, term25440, args);
    }

};


