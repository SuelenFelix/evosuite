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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class InputModel_from_5106400310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3484;
     Object term3509;

    public InputModel_from_5106400310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3522 = Class.forName((String) "java.io.File$PathStatus");
        Field term3521 = ((Class) term3522).getDeclaredField((String) "CHECKED");
        ((Field) term3521).setAccessible(true);
        Object enum16 = ((Field) term3521).get((Object) null);
        term3484 = newInstance(Class.forName("java.io.File"));
        setField(term3484, term3484.getClass(), "path", "yGtHPyvYiQ");
        setField(term3484, term3484.getClass(), "status", enum16);
        setIntField(term3484, term3484.getClass(), "prefixLength", -1347665717);
        setField(term3484, term3484.getClass(), "filePath", null);
        term3509 = new Integer(-1888585309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3484;
        args[1] = term3509;
        callMethod(klass, "from", argTypes, null, args);
    }

};


