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

public class _Ref_of_17110123661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916;

    public _Ref_of_17110123661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916 = newInstance(Class.forName("java.net.URI"));
        setField(term4916, term4916.getClass(), "scheme", "telnet");
        setField(term4916, term4916.getClass(), "fragment", null);
        setField(term4916, term4916.getClass(), "authority", "192.0.2.16:80");
        setField(term4916, term4916.getClass(), "userInfo", null);
        setField(term4916, term4916.getClass(), "host", "192.0.2.16");
        setIntField(term4916, term4916.getClass(), "port", 80);
        setField(term4916, term4916.getClass(), "path", "/");
        setField(term4916, term4916.getClass(), "query", null);
        setField(term4916, term4916.getClass(), "schemeSpecificPart", null);
        setIntField(term4916, term4916.getClass(), "hash", 0);
        setField(term4916, term4916.getClass(), "decodedUserInfo", null);
        setField(term4916, term4916.getClass(), "decodedAuthority", null);
        setField(term4916, term4916.getClass(), "decodedPath", null);
        setField(term4916, term4916.getClass(), "decodedQuery", null);
        setField(term4916, term4916.getClass(), "decodedFragment", null);
        setField(term4916, term4916.getClass(), "decodedSchemeSpecificPart", null);
        setField(term4916, term4916.getClass(), "string", "telnet://192.0.2.16:80/");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$Ref");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.net.URI");
        Object[] args = new Object[2];
        args[0] = "ZiaGIbnzTs";
        args[1] = term4916;
        callMethod(klass, "of", argTypes, null, args);
    }

};


