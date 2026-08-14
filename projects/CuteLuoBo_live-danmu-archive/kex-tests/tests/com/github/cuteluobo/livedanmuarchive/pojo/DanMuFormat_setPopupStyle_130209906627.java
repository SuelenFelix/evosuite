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
import java.lang.Integer;

public class DanMuFormat_setPopupStyle_130209906627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30389;
     Object term30395;

    public DanMuFormat_setPopupStyle_130209906627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30389 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setIntField(term30389, term30389.getClass(), "fontColor", 0);
        setIntField(term30389, term30389.getClass(), "fontSize", 0);
        setIntField(term30389, term30389.getClass(), "textSpeed", 0);
        setIntField(term30389, term30389.getClass(), "transitionType", 0);
        setIntField(term30389, term30389.getClass(), "popupStyle", 0);
        term30395 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30395;
        callMethod(klass, "setPopupStyle", argTypes, term30389, args);
    }

};


