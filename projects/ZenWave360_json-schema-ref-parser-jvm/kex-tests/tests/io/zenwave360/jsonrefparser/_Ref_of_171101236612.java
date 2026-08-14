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

public class _Ref_of_171101236612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9194;

    public _Ref_of_171101236612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9194 = newInstance(Class.forName("io.zenwave360.jsonrefparser.$Ref"));
        setField(term9194, term9194.getClass(), "ref", null);
        setField(term9194, term9194.getClass(), "refFormat", null);
        setField(term9194, term9194.getClass(), "uri", null);
        setField(term9194, term9194.getClass(), "path", null);
        setField(term9194, term9194.getClass(), "referencingFileURI", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$Ref");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.net.URI");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "of", argTypes, term9194, args);
    }

};


