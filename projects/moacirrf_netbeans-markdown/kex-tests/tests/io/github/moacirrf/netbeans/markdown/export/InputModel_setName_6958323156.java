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

public class InputModel_setName_6958323156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4474;

    public InputModel_setName_6958323156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4546 = Class.forName((String) "java.io.File$PathStatus");
        Field term4545 = ((Class) term4546).getDeclaredField((String) "CHECKED");
        ((Field) term4545).setAccessible(true);
        Object enum21 = ((Field) term4545).get((Object) null);
        term4474 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term4487 = newInstance(Class.forName("java.io.File"));
        setField(term4474, term4474.getClass(), "name", "XOiDvlDhdc");
        setField(term4487, term4487.getClass(), "path", "AdxvLJhNLe");
        setField(term4487, term4487.getClass(), "status", enum21);
        setIntField(term4487, term4487.getClass(), "prefixLength", 1532716628);
        setField(term4487, term4487.getClass(), "filePath", null);
        setField(term4474, term4474.getClass(), "file", term4487);
        setIntField(term4474, term4474.getClass(), "order", -1801760683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lHfTrWKMPk";
        callMethod(klass, "setName", argTypes, term4474, args);
    }

};


