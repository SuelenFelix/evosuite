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

public class _RefParser_init_1213327861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3947;

    public _RefParser_init_1213327861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3947 = newInstance(Class.forName("java.net.URI"));
        setField(term3947, term3947.getClass(), "scheme", "mailto");
        setField(term3947, term3947.getClass(), "fragment", null);
        setField(term3947, term3947.getClass(), "authority", null);
        setField(term3947, term3947.getClass(), "userInfo", null);
        setField(term3947, term3947.getClass(), "host", null);
        setIntField(term3947, term3947.getClass(), "port", -1);
        setField(term3947, term3947.getClass(), "path", null);
        setField(term3947, term3947.getClass(), "query", null);
        setField(term3947, term3947.getClass(), "schemeSpecificPart", "John.Doe@example.com");
        setIntField(term3947, term3947.getClass(), "hash", 0);
        setField(term3947, term3947.getClass(), "decodedUserInfo", null);
        setField(term3947, term3947.getClass(), "decodedAuthority", null);
        setField(term3947, term3947.getClass(), "decodedPath", null);
        setField(term3947, term3947.getClass(), "decodedQuery", null);
        setField(term3947, term3947.getClass(), "decodedFragment", null);
        setField(term3947, term3947.getClass(), "decodedSchemeSpecificPart", null);
        setField(term3947, term3947.getClass(), "string", "mailto:John.Doe@example.com");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$RefParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URI");
        Object[] args = new Object[1];
        args[0] = term3947;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


