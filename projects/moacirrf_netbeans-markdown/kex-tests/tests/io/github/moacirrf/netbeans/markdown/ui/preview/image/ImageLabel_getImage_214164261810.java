package io.github.moacirrf.netbeans.markdown.ui.preview.image;

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
import static io.github.moacirrf.netbeans.markdown.ui.preview.image.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ImageLabel_getImage_214164261810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1770;

    public ImageLabel_getImage_214164261810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1770 = newInstance(Class.forName("java.net.URL"));
        Object term1815 = newInstance(Class.forName("sun.net.www.protocol.https.Handler"));
        setField(term1770, term1770.getClass(), "protocol", "https");
        setField(term1770, term1770.getClass(), "host", "www.github.com");
        setIntField(term1770, term1770.getClass(), "port", -1);
        setField(term1770, term1770.getClass(), "file", "");
        setField(term1770, term1770.getClass(), "query", null);
        setField(term1770, term1770.getClass(), "authority", "www.github.com");
        setField(term1770, term1770.getClass(), "path", "");
        setField(term1770, term1770.getClass(), "userInfo", null);
        setField(term1770, term1770.getClass(), "ref", null);
        setField(term1770, term1770.getClass(), "hostAddress", null);
        setField(term1815, term1815.getClass(), "proxy", null);
        setIntField(term1815, term1815.getClass(), "proxyPort", -1);
        setField(term1770, term1770.getClass(), "handler", term1815);
        setField(term1770, term1770.getClass(), "tempState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = term1770;
        callMethod(klass, "getImage", argTypes, null, args);
    }

};


