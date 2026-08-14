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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;

public class HtmlExporter_mergeMd_18974943092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255;
     Object term256;

    public HtmlExporter_mergeMd_18974943092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.HtmlExporter"));
        Class<? extends Object> term290 = Class.forName((String) "java.io.File$PathStatus");
        Field term289 = ((Class) term290).getDeclaredField((String) "INVALID");
        ((Field) term289).setAccessible(true);
        Object enum1 = ((Field) term289).get((Object) null);
        Object term259 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term272 = newInstance(Class.forName("java.io.File"));
        setField(term259, term259.getClass(), "name", "MxlszYVzRf");
        setField(term272, term272.getClass(), "path", "");
        setField(term272, term272.getClass(), "status", enum1);
        setIntField(term272, term272.getClass(), "prefixLength", -522618178);
        setField(term272, term272.getClass(), "filePath", null);
        setField(term259, term259.getClass(), "file", term272);
        setIntField(term259, term259.getClass(), "order", 1134449235);
        term256 = new LinkedList();
        ((LinkedList) term256).add(term259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.HtmlExporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term256;
        callMethod(klass, "mergeMd", argTypes, term255, args);
    }

};


