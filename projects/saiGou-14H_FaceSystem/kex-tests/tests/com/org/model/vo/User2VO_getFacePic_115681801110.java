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

public class User2VO_getFacePic_115681801110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17472;

    public User2VO_getFacePic_115681801110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term17473 = new Integer(1237549886);
        Integer term17547 = new Integer(-1945635750);
        Class<? extends Object> term17791 = Class.forName((String) "java.io.File$PathStatus");
        Field term17790 = ((Class) term17791).getDeclaredField((String) "CHECKED");
        ((Field) term17790).setAccessible(true);
        Object enum9 = ((Field) term17790).get((Object) null);
        ArrayList term17634 = new ArrayList();
        ((ArrayList) term17634).add("MIDoqNmCoh");
        ((ArrayList) term17634).add("yrOIMfdQSI");
        ((ArrayList) term17634).add("PhtNZAacut");
        ((ArrayList) term17634).add("xbPAqsSBBS");
        ((ArrayList) term17634).add("ivxMfASKCB");
        ((ArrayList) term17634).add("JbksMMXXzT");
        term17472 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term17561 = newInstance(Class.forName("java.io.File"));
        setField(term17472, term17472.getClass(), "id", term17473);
        setField(term17472, term17472.getClass(), "email", "SWbairdDKL");
        setField(term17472, term17472.getClass(), "password", "AibUFEALwF");
        setField(term17472, term17472.getClass(), "username", "eXOUrXTrdW");
        setField(term17472, term17472.getClass(), "power", "aomDEETHep");
        setField(term17472, term17472.getClass(), "nickname", "GTMrlIYfIM");
        setField(term17472, term17472.getClass(), "sex", "eiDqCOWbLE");
        setField(term17472, term17472.getClass(), "age", term17547);
        setField(term17472, term17472.getClass(), "phone", "OBbbsrFNxC");
        setField(term17561, term17561.getClass(), "path", "mvdZyohjrq");
        setField(term17561, term17561.getClass(), "status", enum9);
        setIntField(term17561, term17561.getClass(), "prefixLength", -1339778481);
        setField(term17561, term17561.getClass(), "filePath", null);
        setField(term17472, term17472.getClass(), "facePic", term17561);
        setField(term17472, term17472.getClass(), "faceUrl", "hXsByefZqZ");
        setField(term17472, term17472.getClass(), "headUrl", "PfWKdFFgbz");
        setField(term17472, term17472.getClass(), "introduce", "rgmFLfFmTW");
        setField(term17472, term17472.getClass(), "ip", "GHvFvelXFv");
        setField(term17472, term17472.getClass(), "partnames", term17634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFacePic", argTypes, term17472, args);
    }

};


