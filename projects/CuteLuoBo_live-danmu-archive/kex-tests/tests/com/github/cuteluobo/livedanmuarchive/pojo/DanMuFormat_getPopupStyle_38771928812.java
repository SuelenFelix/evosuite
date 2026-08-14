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

public class DanMuFormat_getPopupStyle_38771928812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30295;

    public DanMuFormat_getPopupStyle_38771928812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30295 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setIntField(term30295, term30295.getClass(), "fontColor", -1563700756);
        setIntField(term30295, term30295.getClass(), "fontSize", 25);
        setIntField(term30295, term30295.getClass(), "textSpeed", -208314837);
        setIntField(term30295, term30295.getClass(), "transitionType", 1);
        setIntField(term30295, term30295.getClass(), "popupStyle", 697841387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPopupStyle", argTypes, term30295, args);
    }

};


