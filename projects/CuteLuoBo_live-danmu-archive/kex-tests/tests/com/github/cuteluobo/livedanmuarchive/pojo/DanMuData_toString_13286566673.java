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

public class DanMuData_toString_13286566673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2847;

    public DanMuData_toString_13286566673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2891 = new Long(6375119433582206027L);
        term2847 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term2848 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term2885 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term2848, term2848.getClass(), "uid", "XJJNClzHRf");
        setField(term2848, term2848.getClass(), "nickName", "HDaezxQfQR");
        setField(term2847, term2847.getClass(), "userIfo", term2848);
        setField(term2847, term2847.getClass(), "content", "iikZEapDlu");
        setIntField(term2885, term2885.getClass(), "fontColor", 391863371);
        setIntField(term2885, term2885.getClass(), "fontSize", 25);
        setIntField(term2885, term2885.getClass(), "textSpeed", -1922583790);
        setIntField(term2885, term2885.getClass(), "transitionType", 1);
        setIntField(term2885, term2885.getClass(), "popupStyle", -616727354);
        setField(term2847, term2847.getClass(), "danMuFormatData", term2885);
        setField(term2847, term2847.getClass(), "timestamp", term2891);
        setField(term2847, term2847.getClass(), "msgType", "nhoHrZfnIN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2847, args);
    }

};


