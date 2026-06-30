package core.utils;

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
import static core.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class MComponent_scaleIcon_14145443201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term47;
     Object term49;

    public MComponent_scaleIcon_14145443201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.net.URL"));
        Object term45 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term1, term1.getClass(), "protocol", "http");
        setField(term1, term1.getClass(), "host", "www.oracle.com");
        setIntField(term1, term1.getClass(), "port", -1);
        setField(term1, term1.getClass(), "file", "");
        setField(term1, term1.getClass(), "query", null);
        setField(term1, term1.getClass(), "authority", "www.oracle.com");
        setField(term1, term1.getClass(), "path", "");
        setField(term1, term1.getClass(), "userInfo", null);
        setField(term1, term1.getClass(), "ref", null);
        setField(term1, term1.getClass(), "hostAddress", null);
        setField(term45, term45.getClass(), "proxy", null);
        setIntField(term45, term45.getClass(), "proxyPort", -1);
        setField(term1, term1.getClass(), "handler", term45);
        setField(term1, term1.getClass(), "tempState", null);
        term47 = new Integer(568599855);
        term49 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.utils.MComponent");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = term47;
        args[2] = term49;
        callMethod(klass, "scaleIcon", argTypes, null, args);
    }

};


