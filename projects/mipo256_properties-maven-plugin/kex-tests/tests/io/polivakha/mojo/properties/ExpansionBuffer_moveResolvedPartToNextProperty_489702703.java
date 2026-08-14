package io.polivakha.mojo.properties;

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
import static io.polivakha.mojo.properties.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExpansionBuffer_moveResolvedPartToNextProperty_489702703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1245;

    public ExpansionBuffer_moveResolvedPartToNextProperty_489702703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1245 = newInstance(Class.forName("io.polivakha.mojo.properties.ExpansionBuffer"));
        Object term1247 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1248 = (byte[]) newByteArray(16);
        setBooleanField(term1245, term1245.getClass(), "isFullyResolved", false);
        setField(term1247, term1247.getClass(), "value", term1248);
        setByteField(term1247, term1247.getClass(), "coder", (byte) 89);
        setIntField(term1247, term1247.getClass(), "count", -817164822);
        setField(term1245, term1245.getClass(), "resolved", term1247);
        setField(term1245, term1245.getClass(), "unresolved", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.ExpansionBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "moveResolvedPartToNextProperty", argTypes, term1245, args);
    }

};


