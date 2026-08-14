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

public class _Ref_getURI_102000936915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9197;

    public _Ref_getURI_102000936915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9197 = newInstance(Class.forName("io.zenwave360.jsonrefparser.$Ref"));
        setField(term9197, term9197.getClass(), "ref", null);
        setField(term9197, term9197.getClass(), "refFormat", null);
        setField(term9197, term9197.getClass(), "uri", null);
        setField(term9197, term9197.getClass(), "path", null);
        setField(term9197, term9197.getClass(), "referencingFileURI", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$Ref");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getURI", argTypes, term9197, args);
    }

};


