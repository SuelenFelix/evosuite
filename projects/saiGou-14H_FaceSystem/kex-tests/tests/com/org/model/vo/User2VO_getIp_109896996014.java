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

public class User2VO_getIp_109896996014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19716;

    public User2VO_getIp_109896996014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term19717 = new Integer(-1271375703);
        Integer term19791 = new Integer(1136208236);
        Class<? extends Object> term19999 = Class.forName((String) "java.io.File$PathStatus");
        Field term19998 = ((Class) term19999).getDeclaredField((String) "CHECKED");
        ((Field) term19998).setAccessible(true);
        Object enum13 = ((Field) term19998).get((Object) null);
        ArrayList term19878 = new ArrayList();
        ((ArrayList) term19878).add("IKmMfqFPku");
        ((ArrayList) term19878).add("NACnGDmVPl");
        ((ArrayList) term19878).add("SfWiFjkLGW");
        term19716 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term19805 = newInstance(Class.forName("java.io.File"));
        setField(term19716, term19716.getClass(), "id", term19717);
        setField(term19716, term19716.getClass(), "email", "fQVSHtJlDS");
        setField(term19716, term19716.getClass(), "password", "CGdXCWNTxp");
        setField(term19716, term19716.getClass(), "username", "TUBgEnrcjn");
        setField(term19716, term19716.getClass(), "power", "eUhEGNLBOk");
        setField(term19716, term19716.getClass(), "nickname", "UrLisdyvVs");
        setField(term19716, term19716.getClass(), "sex", "VckRXyiShh");
        setField(term19716, term19716.getClass(), "age", term19791);
        setField(term19716, term19716.getClass(), "phone", "ZKwDTklKHb");
        setField(term19805, term19805.getClass(), "path", "tQMlnMStsQ");
        setField(term19805, term19805.getClass(), "status", enum13);
        setIntField(term19805, term19805.getClass(), "prefixLength", -883034806);
        setField(term19805, term19805.getClass(), "filePath", null);
        setField(term19716, term19716.getClass(), "facePic", term19805);
        setField(term19716, term19716.getClass(), "faceUrl", "OYJvKAMFEk");
        setField(term19716, term19716.getClass(), "headUrl", "puNAveVBkA");
        setField(term19716, term19716.getClass(), "introduce", "BcZKUIbuQL");
        setField(term19716, term19716.getClass(), "ip", "YvjPnZyRnw");
        setField(term19716, term19716.getClass(), "partnames", term19878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIp", argTypes, term19716, args);
    }

};


