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

public class HtmlExporter_getHtml_13455339103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432;
     Object term433;

    public HtmlExporter_getHtml_13455339103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term432 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.HtmlExporter"));
        Class<? extends Object> term469 = Class.forName((String) "java.io.File$PathStatus");
        Field term468 = ((Class) term469).getDeclaredField((String) "CHECKED");
        ((Field) term468).setAccessible(true);
        Object enum2 = ((Field) term468).get((Object) null);
        term433 = newInstance(Class.forName("java.io.File"));
        setField(term433, term433.getClass(), "path", "oVcInYnLWB");
        setField(term433, term433.getClass(), "status", enum2);
        setIntField(term433, term433.getClass(), "prefixLength", -883034806);
        setField(term433, term433.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.HtmlExporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term433;
        callMethod(klass, "getHtml", argTypes, term432, args);
    }

};


