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

public class DanMuData_setTimestamp_162534982013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3871;
     Object term3929;

    public DanMuData_setTimestamp_162534982013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3915 = new Long(-5476826692763582090L);
        term3871 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term3872 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term3909 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term3872, term3872.getClass(), "uid", "pJbnHTYrxn");
        setField(term3872, term3872.getClass(), "nickName", "iIRsCSYqXH");
        setField(term3871, term3871.getClass(), "userIfo", term3872);
        setField(term3871, term3871.getClass(), "content", "nghfqDXyCG");
        setIntField(term3909, term3909.getClass(), "fontColor", -226514366);
        setIntField(term3909, term3909.getClass(), "fontSize", 25);
        setIntField(term3909, term3909.getClass(), "textSpeed", 1193880199);
        setIntField(term3909, term3909.getClass(), "transitionType", 1);
        setIntField(term3909, term3909.getClass(), "popupStyle", -1087774327);
        setField(term3871, term3871.getClass(), "danMuFormatData", term3909);
        setField(term3871, term3871.getClass(), "timestamp", term3915);
        setField(term3871, term3871.getClass(), "msgType", "WBAOTqErtm");
        term3929 = new Long(-872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3929;
        callMethod(klass, "setTimestamp", argTypes, term3871, args);
    }

};


