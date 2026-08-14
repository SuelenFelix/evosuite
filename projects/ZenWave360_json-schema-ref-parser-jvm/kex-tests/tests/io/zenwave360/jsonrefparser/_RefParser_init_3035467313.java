package io.zenwave360.jsonrefparser;

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
import static io.zenwave360.jsonrefparser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class _RefParser_init_3035467313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4096;

    public _RefParser_init_3035467313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4096 = newInstance(Class.forName("java.net.URI"));
        setField(term4096, term4096.getClass(), "scheme", "http");
        setField(term4096, term4096.getClass(), "fragment", null);
        setField(term4096, term4096.getClass(), "authority", "www.ietf.org");
        setField(term4096, term4096.getClass(), "userInfo", null);
        setField(term4096, term4096.getClass(), "host", "www.ietf.org");
        setIntField(term4096, term4096.getClass(), "port", -1);
        setField(term4096, term4096.getClass(), "path", "/rfc/rfc2396.txt");
        setField(term4096, term4096.getClass(), "query", null);
        setField(term4096, term4096.getClass(), "schemeSpecificPart", null);
        setIntField(term4096, term4096.getClass(), "hash", 0);
        setField(term4096, term4096.getClass(), "decodedUserInfo", null);
        setField(term4096, term4096.getClass(), "decodedAuthority", null);
        setField(term4096, term4096.getClass(), "decodedPath", null);
        setField(term4096, term4096.getClass(), "decodedQuery", null);
        setField(term4096, term4096.getClass(), "decodedFragment", null);
        setField(term4096, term4096.getClass(), "decodedSchemeSpecificPart", null);
        setField(term4096, term4096.getClass(), "string", "http://www.ietf.org/rfc/rfc2396.txt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$RefParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.net.URI");
        Object[] args = new Object[2];
        args[0] = "LQFpaHEwXR";
        args[1] = term4096;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


