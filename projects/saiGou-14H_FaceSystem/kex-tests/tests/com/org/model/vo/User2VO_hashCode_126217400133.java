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

public class User2VO_hashCode_126217400133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30586;

    public User2VO_hashCode_126217400133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30587 = new Integer(313459791);
        Integer term30661 = new Integer(752615112);
        Class<? extends Object> term30869 = Class.forName((String) "java.io.File$PathStatus");
        Field term30868 = ((Class) term30869).getDeclaredField((String) "CHECKED");
        ((Field) term30868).setAccessible(true);
        Object enum33 = ((Field) term30868).get((Object) null);
        ArrayList term30748 = new ArrayList();
        ((ArrayList) term30748).add("UYWsaWaOUS");
        ((ArrayList) term30748).add("oOxKzvqxUJ");
        ((ArrayList) term30748).add("tjqgiPrtgj");
        term30586 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term30675 = newInstance(Class.forName("java.io.File"));
        setField(term30586, term30586.getClass(), "id", term30587);
        setField(term30586, term30586.getClass(), "email", "vKEgtSbaYp");
        setField(term30586, term30586.getClass(), "password", "FnjEwOlAkC");
        setField(term30586, term30586.getClass(), "username", "ZsGqLnRMml");
        setField(term30586, term30586.getClass(), "power", "BTXsqJgjjs");
        setField(term30586, term30586.getClass(), "nickname", "OjFRpvsLzi");
        setField(term30586, term30586.getClass(), "sex", "kugZgYRWcG");
        setField(term30586, term30586.getClass(), "age", term30661);
        setField(term30586, term30586.getClass(), "phone", "OzucqAMebQ");
        setField(term30675, term30675.getClass(), "path", "VecourIOHN");
        setField(term30675, term30675.getClass(), "status", enum33);
        setIntField(term30675, term30675.getClass(), "prefixLength", -226514366);
        setField(term30675, term30675.getClass(), "filePath", null);
        setField(term30586, term30586.getClass(), "facePic", term30675);
        setField(term30586, term30586.getClass(), "faceUrl", "tZiwBSETUL");
        setField(term30586, term30586.getClass(), "headUrl", "fmecFLYSIi");
        setField(term30586, term30586.getClass(), "introduce", "bjjsWtQeyp");
        setField(term30586, term30586.getClass(), "ip", "CoPgTYdcst");
        setField(term30586, term30586.getClass(), "partnames", term30748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term30586, args);
    }

};


