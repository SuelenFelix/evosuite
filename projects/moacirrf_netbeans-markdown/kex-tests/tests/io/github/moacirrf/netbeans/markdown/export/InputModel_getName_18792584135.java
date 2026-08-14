package io.github.moacirrf.netbeans.markdown.export;

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
import static io.github.moacirrf.netbeans.markdown.export.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class InputModel_getName_18792584135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4272;

    public InputModel_getName_18792584135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4332 = Class.forName((String) "java.io.File$PathStatus");
        Field term4331 = ((Class) term4332).getDeclaredField((String) "INVALID");
        ((Field) term4331).setAccessible(true);
        Object enum20 = ((Field) term4331).get((Object) null);
        term4272 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term4285 = newInstance(Class.forName("java.io.File"));
        setField(term4272, term4272.getClass(), "name", "hCWPJQKpdc");
        setField(term4285, term4285.getClass(), "path", "WzMEhMXkKx");
        setField(term4285, term4285.getClass(), "status", enum20);
        setIntField(term4285, term4285.getClass(), "prefixLength", -1476117762);
        setField(term4285, term4285.getClass(), "filePath", null);
        setField(term4272, term4272.getClass(), "file", term4285);
        setIntField(term4272, term4272.getClass(), "order", -341962980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term4272, args);
    }

};


