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

public class HtmlExporter_getMarkdownContent_8073127974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term611;
     Object term612;

    public HtmlExporter_getMarkdownContent_8073127974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term611 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.HtmlExporter"));
        Class<? extends Object> term648 = Class.forName((String) "java.io.File$PathStatus");
        Field term647 = ((Class) term648).getDeclaredField((String) "INVALID");
        ((Field) term647).setAccessible(true);
        Object enum3 = ((Field) term647).get((Object) null);
        term612 = newInstance(Class.forName("java.io.File"));
        setField(term612, term612.getClass(), "path", "aJlieCFVtF");
        setField(term612, term612.getClass(), "status", enum3);
        setIntField(term612, term612.getClass(), "prefixLength", 1585847225);
        setField(term612, term612.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.HtmlExporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term612;
        callMethod(klass, "getMarkdownContent", argTypes, term611, args);
    }

};


