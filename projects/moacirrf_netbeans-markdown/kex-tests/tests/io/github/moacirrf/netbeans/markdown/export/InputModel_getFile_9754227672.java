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

public class InputModel_getFile_9754227672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3664;

    public InputModel_getFile_9754227672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3724 = Class.forName((String) "java.io.File$PathStatus");
        Field term3723 = ((Class) term3724).getDeclaredField((String) "INVALID");
        ((Field) term3723).setAccessible(true);
        Object enum17 = ((Field) term3723).get((Object) null);
        term3664 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term3677 = newInstance(Class.forName("java.io.File"));
        setField(term3664, term3664.getClass(), "name", "MvRIxilFMJ");
        setField(term3677, term3677.getClass(), "path", "iNwOJRBEjp");
        setField(term3677, term3677.getClass(), "status", enum17);
        setIntField(term3677, term3677.getClass(), "prefixLength", 683666002);
        setField(term3677, term3677.getClass(), "filePath", null);
        setField(term3664, term3664.getClass(), "file", term3677);
        setIntField(term3664, term3664.getClass(), "order", 1596213415);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFile", argTypes, term3664, args);
    }

};


