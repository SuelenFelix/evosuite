package org.openRealmOfStars.utilities.FileIo;

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
import static org.openRealmOfStars.utilities.FileIo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IOUtilities_loadImage_18493832212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393;

    public IOUtilities_loadImage_18493832212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term393 = newInstance(Class.forName("java.net.URL"));
        Object term437 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term393, term393.getClass(), "protocol", "http");
        setField(term393, term393.getClass(), "host", "www.oracle.com");
        setIntField(term393, term393.getClass(), "port", -1);
        setField(term393, term393.getClass(), "file", "");
        setField(term393, term393.getClass(), "query", null);
        setField(term393, term393.getClass(), "authority", "www.oracle.com");
        setField(term393, term393.getClass(), "path", "");
        setField(term393, term393.getClass(), "userInfo", null);
        setField(term393, term393.getClass(), "ref", null);
        setField(term393, term393.getClass(), "hostAddress", null);
        setField(term437, term437.getClass(), "proxy", null);
        setIntField(term437, term437.getClass(), "proxyPort", -1);
        setField(term393, term393.getClass(), "handler", term437);
        setField(term393, term393.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.FileIo.IOUtilities");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = term393;
        callMethod(klass, "loadImage", argTypes, null, args);
    }

};


