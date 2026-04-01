package org.openRealmOfStars.gui.util;

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
import static org.openRealmOfStars.gui.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Float;

public class GuiFonts_getFontFromCache_206563657312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2261;
     Object term2307;

    public GuiFonts_getFontFromCache_206563657312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2261 = newInstance(Class.forName("java.net.URL"));
        Object term2305 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term2261, term2261.getClass(), "protocol", "http");
        setField(term2261, term2261.getClass(), "host", "www.google.com");
        setIntField(term2261, term2261.getClass(), "port", -1);
        setField(term2261, term2261.getClass(), "file", "");
        setField(term2261, term2261.getClass(), "query", null);
        setField(term2261, term2261.getClass(), "authority", "www.google.com");
        setField(term2261, term2261.getClass(), "path", "");
        setField(term2261, term2261.getClass(), "userInfo", null);
        setField(term2261, term2261.getClass(), "ref", null);
        setField(term2261, term2261.getClass(), "hostAddress", null);
        setField(term2305, term2305.getClass(), "proxy", null);
        setIntField(term2305, term2305.getClass(), "proxyPort", -1);
        setField(term2261, term2261.getClass(), "handler", term2305);
        setField(term2261, term2261.getClass(), "tempState", null);
        term2307 = new Float(0.5254275F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GuiFonts");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term2261;
        args[1] = term2307;
        callMethod(klass, "getFontFromCache", argTypes, null, args);
    }

};


