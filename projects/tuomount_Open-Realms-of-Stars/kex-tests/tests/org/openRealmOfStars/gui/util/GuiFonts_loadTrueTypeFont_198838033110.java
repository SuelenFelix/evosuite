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

public class GuiFonts_loadTrueTypeFont_198838033110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2159;

    public GuiFonts_loadTrueTypeFont_198838033110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2159 = newInstance(Class.forName("java.net.URL"));
        Object term2203 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term2159, term2159.getClass(), "protocol", "http");
        setField(term2159, term2159.getClass(), "host", "www.oracle.com");
        setIntField(term2159, term2159.getClass(), "port", -1);
        setField(term2159, term2159.getClass(), "file", "");
        setField(term2159, term2159.getClass(), "query", null);
        setField(term2159, term2159.getClass(), "authority", "www.oracle.com");
        setField(term2159, term2159.getClass(), "path", "");
        setField(term2159, term2159.getClass(), "userInfo", null);
        setField(term2159, term2159.getClass(), "ref", null);
        setField(term2159, term2159.getClass(), "hostAddress", null);
        setField(term2203, term2203.getClass(), "proxy", null);
        setIntField(term2203, term2203.getClass(), "proxyPort", -1);
        setField(term2159, term2159.getClass(), "handler", term2203);
        setField(term2159, term2159.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GuiFonts");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = term2159;
        callMethod(klass, "loadTrueTypeFont", argTypes, null, args);
    }

};


