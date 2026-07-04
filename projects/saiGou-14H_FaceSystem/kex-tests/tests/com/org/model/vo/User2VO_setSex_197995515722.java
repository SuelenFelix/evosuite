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

public class User2VO_setSex_197995515722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24316;

    public User2VO_setSex_197995515722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term24317 = new Integer(1706047059);
        Integer term24391 = new Integer(590451710);
        Class<? extends Object> term24647 = Class.forName((String) "java.io.File$PathStatus");
        Field term24646 = ((Class) term24647).getDeclaredField((String) "CHECKED");
        ((Field) term24646).setAccessible(true);
        Object enum21 = ((Field) term24646).get((Object) null);
        ArrayList term24478 = new ArrayList();
        ((ArrayList) term24478).add("mUCxMstoOT");
        ((ArrayList) term24478).add("LroMhmrHbv");
        ((ArrayList) term24478).add("nUWkEhozFC");
        ((ArrayList) term24478).add("cZOLUZUhxQ");
        ((ArrayList) term24478).add("fXCybRqtsq");
        ((ArrayList) term24478).add("gPhmseJiob");
        term24316 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term24405 = newInstance(Class.forName("java.io.File"));
        setField(term24316, term24316.getClass(), "id", term24317);
        setField(term24316, term24316.getClass(), "email", "rXBuuDWXsm");
        setField(term24316, term24316.getClass(), "password", "VSvKttZYSC");
        setField(term24316, term24316.getClass(), "username", "bbwxScASWL");
        setField(term24316, term24316.getClass(), "power", "BXJdQmJvFh");
        setField(term24316, term24316.getClass(), "nickname", "bsPTRsievL");
        setField(term24316, term24316.getClass(), "sex", "LPLRACmzWM");
        setField(term24316, term24316.getClass(), "age", term24391);
        setField(term24316, term24316.getClass(), "phone", "DfdUvykRzo");
        setField(term24405, term24405.getClass(), "path", "TWPJmzPTXg");
        setField(term24405, term24405.getClass(), "status", enum21);
        setIntField(term24405, term24405.getClass(), "prefixLength", -6029667);
        setField(term24405, term24405.getClass(), "filePath", null);
        setField(term24316, term24316.getClass(), "facePic", term24405);
        setField(term24316, term24316.getClass(), "faceUrl", "frPgAZBkug");
        setField(term24316, term24316.getClass(), "headUrl", "AAzuYrqTRq");
        setField(term24316, term24316.getClass(), "introduce", "cUQuwEPzJb");
        setField(term24316, term24316.getClass(), "ip", "sqPZeXSusM");
        setField(term24316, term24316.getClass(), "partnames", term24478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dgpHJUBySN";
        callMethod(klass, "setSex", argTypes, term24316, args);
    }

};


