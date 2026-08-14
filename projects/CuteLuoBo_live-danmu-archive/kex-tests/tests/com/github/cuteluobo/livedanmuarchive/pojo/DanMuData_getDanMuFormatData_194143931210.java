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

public class DanMuData_getDanMuFormatData_194143931210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3571;

    public DanMuData_getDanMuFormatData_194143931210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3615 = new Long(-8885298608300233488L);
        term3571 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term3572 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term3609 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term3572, term3572.getClass(), "uid", "TwfWVQGiIj");
        setField(term3572, term3572.getClass(), "nickName", "gUvcueTURF");
        setField(term3571, term3571.getClass(), "userIfo", term3572);
        setField(term3571, term3571.getClass(), "content", "EwQBhZjCIT");
        setIntField(term3609, term3609.getClass(), "fontColor", -6029667);
        setIntField(term3609, term3609.getClass(), "fontSize", 25);
        setIntField(term3609, term3609.getClass(), "textSpeed", -2068769794);
        setIntField(term3609, term3609.getClass(), "transitionType", 1);
        setIntField(term3609, term3609.getClass(), "popupStyle", -117576464);
        setField(term3571, term3571.getClass(), "danMuFormatData", term3609);
        setField(term3571, term3571.getClass(), "timestamp", term3615);
        setField(term3571, term3571.getClass(), "msgType", "aSkmSwTnEw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDanMuFormatData", argTypes, term3571, args);
    }

};


