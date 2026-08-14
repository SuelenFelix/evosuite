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

public class _RefParserOptions_withOnMissing_9383526957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11392;

    public _RefParserOptions_withOnMissing_9383526957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11392 = newInstance(Class.forName("io.zenwave360.jsonrefparser.$RefParserOptions"));
        setField(term11392, term11392.getClass(), "onCircular", null);
        setField(term11392, term11392.getClass(), "onMissing", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$RefParserOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.zenwave360.jsonrefparser.$RefParserOptions$OnMissing");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "withOnMissing", argTypes, term11392, args);
    }

};


