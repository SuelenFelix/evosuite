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

public class DanMuData_getUserIfo_20632260176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3112;

    public DanMuData_getUserIfo_20632260176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3156 = new Long(6811161968424632369L);
        term3112 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData"));
        Object term3113 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term3150 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term3113, term3113.getClass(), "uid", "RMsXuyzKJV");
        setField(term3113, term3113.getClass(), "nickName", "FwPbDZcHmB");
        setField(term3112, term3112.getClass(), "userIfo", term3113);
        setField(term3112, term3112.getClass(), "content", "hOncybyCAH");
        setIntField(term3150, term3150.getClass(), "fontColor", -1339778481);
        setIntField(term3150, term3150.getClass(), "fontSize", 25);
        setIntField(term3150, term3150.getClass(), "textSpeed", 1725571209);
        setIntField(term3150, term3150.getClass(), "transitionType", 1);
        setIntField(term3150, term3150.getClass(), "popupStyle", -522618178);
        setField(term3112, term3112.getClass(), "danMuFormatData", term3150);
        setField(term3112, term3112.getClass(), "timestamp", term3156);
        setField(term3112, term3112.getClass(), "msgType", "QduALnDSVo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserIfo", argTypes, term3112, args);
    }

};


