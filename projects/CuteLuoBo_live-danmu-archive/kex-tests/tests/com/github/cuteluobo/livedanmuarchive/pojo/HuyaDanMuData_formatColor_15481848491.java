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

public class HuyaDanMuData_formatColor_15481848491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5751;

    public HuyaDanMuData_formatColor_15481848491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5795 = new Long(-6573104506744284592L);
        term5751 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuyaDanMuData"));
        Object term5752 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuUserInfo"));
        Object term5789 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setField(term5752, term5752.getClass(), "uid", "nRvKihUSPj");
        setField(term5752, term5752.getClass(), "nickName", "BbNeQJpYPr");
        setField(term5751, term5751.getClass(), "userIfo", term5752);
        setField(term5751, term5751.getClass(), "content", "riMtzCoxNj");
        setIntField(term5789, term5789.getClass(), "fontColor", -602026508);
        setIntField(term5789, term5789.getClass(), "fontSize", 25);
        setIntField(term5789, term5789.getClass(), "textSpeed", -157887805);
        setIntField(term5789, term5789.getClass(), "transitionType", 1);
        setIntField(term5789, term5789.getClass(), "popupStyle", 1876565163);
        setField(term5751, term5751.getClass(), "danMuFormatData", term5789);
        setField(term5751, term5751.getClass(), "timestamp", term5795);
        setField(term5751, term5751.getClass(), "msgType", "YAXkVjQZcV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.HuyaDanMuData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "formatColor", argTypes, term5751, args);
    }

};


