package tech.jiayezheng.miniJuliaSonar;

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
import static tech.jiayezheng.miniJuliaSonar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class __copyResourcesRecursively_31280008017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65172;
     Object term65218;

    public __copyResourcesRecursively_31280008017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65172 = newInstance(Class.forName("java.net.URL"));
        Object term65216 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        setField(term65172, term65172.getClass(), "protocol", "http");
        setField(term65172, term65172.getClass(), "host", "www.oracle.com");
        setIntField(term65172, term65172.getClass(), "port", -1);
        setField(term65172, term65172.getClass(), "file", "");
        setField(term65172, term65172.getClass(), "query", null);
        setField(term65172, term65172.getClass(), "authority", "www.oracle.com");
        setField(term65172, term65172.getClass(), "path", "");
        setField(term65172, term65172.getClass(), "userInfo", null);
        setField(term65172, term65172.getClass(), "ref", null);
        setField(term65172, term65172.getClass(), "hostAddress", null);
        setField(term65216, term65216.getClass(), "proxy", null);
        setIntField(term65216, term65216.getClass(), "proxyPort", -1);
        setField(term65172, term65172.getClass(), "handler", term65216);
        setField(term65172, term65172.getClass(), "tempState", null);
        Class<? extends Object> term65286 = Class.forName((String) "java.io.File$PathStatus");
        Field term65285 = ((Class) term65286).getDeclaredField((String) "CHECKED");
        ((Field) term65285).setAccessible(true);
        Object enum210 = ((Field) term65285).get((Object) null);
        term65218 = newInstance(Class.forName("java.io.File"));
        setField(term65218, term65218.getClass(), "path", "VUVgiQvSYa");
        setField(term65218, term65218.getClass(), "status", enum210);
        setIntField(term65218, term65218.getClass(), "prefixLength", -146054762);
        setField(term65218, term65218.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.$");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.net.URL");
        argTypes[1] = Class.forName("java.io.File");
        Object[] args = new Object[2];
        args[0] = term65172;
        args[1] = term65218;
        callMethod(klass, "copyResourcesRecursively", argTypes, null, args);
    }

};


