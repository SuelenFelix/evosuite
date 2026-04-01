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
     Object term129659;
     Object term129707;
     Object term129709;

    public MComponent_scaleIcon_14145443201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129659 = newInstance(Class.forName("java.net.URL"));
        Object term129704 = newInstance(Class.forName("sun.net.www.protocol.https.Handler"));
        setField(term129659, term129659.getClass(), "protocol", "https");
        setField(term129659, term129659.getClass(), "host", "www.github.com");
        setIntField(term129659, term129659.getClass(), "port", -1);
        setField(term129659, term129659.getClass(), "file", "");
        setField(term129659, term129659.getClass(), "query", null);
        setField(term129659, term129659.getClass(), "authority", "www.github.com");
        setField(term129659, term129659.getClass(), "path", "");
        setField(term129659, term129659.getClass(), "userInfo", null);
        setField(term129659, term129659.getClass(), "ref", null);
        setField(term129659, term129659.getClass(), "hostAddress", null);
        setField(term129704, term129704.getClass(), "proxy", null);
        setIntField(term129704, term129704.getClass(), "proxyPort", -1);
        setField(term129659, term129659.getClass(), "handler", term129704);
        setField(term129659, term129659.getClass(), "tempState", null);
        term129707 = new Integer(-680627153);
        term129709 = new Integer(722519669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.utils.MComponent");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term129659;
        args[1] = term129707;
        args[2] = term129709;
        callMethod(klass, "scaleIcon", argTypes, null, args);
    }

};


