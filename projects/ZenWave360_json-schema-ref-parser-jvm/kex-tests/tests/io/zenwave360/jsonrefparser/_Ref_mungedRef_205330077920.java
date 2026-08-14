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

public class _Ref_mungedRef_205330077920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9202;

    public _Ref_mungedRef_205330077920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9202 = newInstance(Class.forName("io.zenwave360.jsonrefparser.$Ref"));
        setField(term9202, term9202.getClass(), "ref", null);
        setField(term9202, term9202.getClass(), "refFormat", null);
        setField(term9202, term9202.getClass(), "uri", null);
        setField(term9202, term9202.getClass(), "path", null);
        setField(term9202, term9202.getClass(), "referencingFileURI", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$Ref");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mungedRef", argTypes, term9202, args);
    }

};


