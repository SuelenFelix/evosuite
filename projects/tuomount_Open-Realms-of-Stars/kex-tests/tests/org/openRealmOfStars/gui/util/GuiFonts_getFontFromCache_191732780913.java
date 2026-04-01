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

public class GuiFonts_getFontFromCache_191732780913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2341;
     Object term2385;
     Object term2387;

    public GuiFonts_getFontFromCache_191732780913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2341 = newInstance(Class.forName("java.net.URL"));
        Object term2383 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term2341, term2341.getClass(), "protocol", "http");
        setField(term2341, term2341.getClass(), "host", "www.yahoo.com");
        setIntField(term2341, term2341.getClass(), "port", -1);
        setField(term2341, term2341.getClass(), "file", "");
        setField(term2341, term2341.getClass(), "query", null);
        setField(term2341, term2341.getClass(), "authority", "www.yahoo.com");
        setField(term2341, term2341.getClass(), "path", "");
        setField(term2341, term2341.getClass(), "userInfo", null);
        setField(term2341, term2341.getClass(), "ref", null);
        setField(term2341, term2341.getClass(), "hostAddress", null);
        setField(term2383, term2383.getClass(), "proxy", null);
        setIntField(term2383, term2383.getClass(), "proxyPort", -1);
        setField(term2341, term2341.getClass(), "handler", term2383);
        setField(term2341, term2341.getClass(), "tempState", null);
        term2385 = new Float(0.2857073F);
        term2387 = new Float(0.6880585F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.util.GuiFonts");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = float.class;
        argTypes[2] = float.class;
        Object[] args = new Object[3];
        args[0] = term2341;
        args[1] = term2385;
        args[2] = term2387;
        callMethod(klass, "getFontFromCache", argTypes, null, args);
    }

};


