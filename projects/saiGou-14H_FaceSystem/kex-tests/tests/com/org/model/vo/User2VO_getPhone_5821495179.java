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

public class User2VO_getPhone_5821495179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16999;

    public User2VO_getPhone_5821495179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term17000 = new Integer(-1982489643);
        Integer term17074 = new Integer(550892835);
        Class<? extends Object> term17270 = Class.forName((String) "java.io.File$PathStatus");
        Field term17269 = ((Class) term17270).getDeclaredField((String) "INVALID");
        ((Field) term17269).setAccessible(true);
        Object enum8 = ((Field) term17269).get((Object) null);
        ArrayList term17161 = new ArrayList();
        ((ArrayList) term17161).add("TxymnVINZF");
        ((ArrayList) term17161).add("fkBfmixBEh");
        term16999 = newInstance(Class.forName("com.org.model.vo.User2VO"));
        Object term17088 = newInstance(Class.forName("java.io.File"));
        setField(term16999, term16999.getClass(), "id", term17000);
        setField(term16999, term16999.getClass(), "email", "rLDmBbcLaC");
        setField(term16999, term16999.getClass(), "password", "tUKcXglBlG");
        setField(term16999, term16999.getClass(), "username", "ZGptycjjRq");
        setField(term16999, term16999.getClass(), "power", "kXJaxapFer");
        setField(term16999, term16999.getClass(), "nickname", "OEeAVwVwuj");
        setField(term16999, term16999.getClass(), "sex", "WEgFuDZsxi");
        setField(term16999, term16999.getClass(), "age", term17074);
        setField(term16999, term16999.getClass(), "phone", "kvcaSGNTHd");
        setField(term17088, term17088.getClass(), "path", "opXkGeBDoI");
        setField(term17088, term17088.getClass(), "status", enum8);
        setIntField(term17088, term17088.getClass(), "prefixLength", 1227103734);
        setField(term17088, term17088.getClass(), "filePath", null);
        setField(term16999, term16999.getClass(), "facePic", term17088);
        setField(term16999, term16999.getClass(), "faceUrl", "UHxidCtatV");
        setField(term16999, term16999.getClass(), "headUrl", "LRzADDSjVT");
        setField(term16999, term16999.getClass(), "introduce", "lpFCMaAYxj");
        setField(term16999, term16999.getClass(), "ip", "fzHVMNSLii");
        setField(term16999, term16999.getClass(), "partnames", term17161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.User2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term16999, args);
    }

};


