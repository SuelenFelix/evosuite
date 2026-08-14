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

public class DanMuData_setDanMuFormatData_98630194211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3669;
     Object term3727;

    public DanMuData_setDanMuFormatData_98630194211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3713 = new Long(-4325723315152823407L);
        term3669 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term3670 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term3707 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term3670, term3670.getClass(), "uid", "xvkbvaEGYd");
        setField(term3670, term3670.getClass(), "nickName", "HBGNxdNURv");
        setField(term3669, term3669.getClass(), "userIfo", term3670);
        setField(term3669, term3669.getClass(), "content", "mfCpTPPQQm");
        setIntField(term3707, term3707.getClass(), "fontColor", -1007160944);
        setIntField(term3707, term3707.getClass(), "fontSize", 25);
        setIntField(term3707, term3707.getClass(), "textSpeed", 1135664017);
        setIntField(term3707, term3707.getClass(), "transitionType", 1);
        setIntField(term3707, term3707.getClass(), "popupStyle", 590364439);
        setField(term3669, term3669.getClass(), "danMuFormatData", term3707);
        setField(term3669, term3669.getClass(), "timestamp", term3713);
        setField(term3669, term3669.getClass(), "msgType", "OcJCIDNIXA");
        term3727 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setIntField(term3727, term3727.getClass(), "fontColor", 865208305);
        setIntField(term3727, term3727.getClass(), "fontSize", 25);
        setIntField(term3727, term3727.getClass(), "textSpeed", -1275173084);
        setIntField(term3727, term3727.getClass(), "transitionType", 1);
        setIntField(term3727, term3727.getClass(), "popupStyle", -244121226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat");
        Object[] args = new Object[1];
        args[0] = term3727;
        callMethod(klass, "setDanMuFormatData", argTypes, term3669, args);
    }

};


