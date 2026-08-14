package com.github.cuteluobo.livedanmuarchive.pojo;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class DanMuData_getContent_8629971988 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3353;

    public DanMuData_getContent_8629971988() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3397 = new Long(6967924379644551255L);
        term3353 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term3354 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term3391 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term3354, term3354.getClass(), "uid", "CFyoseFGLF");
        setField(term3354, term3354.getClass(), "nickName", "SFqCrhEWLm");
        setField(term3353, term3353.getClass(), "userIfo", term3354);
        setField(term3353, term3353.getClass(), "content", "GZdcJyZntS");
        setIntField(term3391, term3391.getClass(), "fontColor", 597278769);
        setIntField(term3391, term3391.getClass(), "fontSize", 25);
        setIntField(term3391, term3391.getClass(), "textSpeed", -1685132342);
        setIntField(term3391, term3391.getClass(), "transitionType", 1);
        setIntField(term3391, term3391.getClass(), "popupStyle", -1456670397);
        setField(term3353, term3353.getClass(), "danMuFormatData", term3391);
        setField(term3353, term3353.getClass(), "timestamp", term3397);
        setField(term3353, term3353.getClass(), "msgType", "OIHoJeysUi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContent", argTypes, term3353, args);
    }

};


