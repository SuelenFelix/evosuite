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
import java.lang.String;
import java.lang.Object;

public class _RefParser_init_16712308410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3747;

    public _RefParser_init_16712308410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3805 = Class.forName((String) "java.io.File$PathStatus");
        Field term3804 = ((Class) term3805).getDeclaredField((String) "INVALID");
        ((Field) term3804).setAccessible(true);
        Object enum10 = ((Field) term3804).get((Object) null);
        term3747 = newInstance(Class.forName("java.io.File"));
        setField(term3747, term3747.getClass(), "path", "uuaPigETmJ");
        setField(term3747, term3747.getClass(), "status", enum10);
        setIntField(term3747, term3747.getClass(), "prefixLength", 568599855);
        setField(term3747, term3747.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$RefParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term3747;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


