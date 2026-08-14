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
import java.util.ArrayList;
import java.lang.Boolean;

public class ExporterConfig_setUniqueFile_12546929368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2760;
     Object term2808;

    public ExporterConfig_setUniqueFile_12546929368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2821 = Class.forName((String) "java.io.File$PathStatus");
        Field term2820 = ((Class) term2821).getDeclaredField((String) "CHECKED");
        ((Field) term2820).setAccessible(true);
        Object enum13 = ((Field) term2820).get((Object) null);
        Object term2788 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term2790 = newInstance(Class.forName("java.io.File"));
        setField(term2788, term2788.getClass(), "name", "");
        setField(term2790, term2790.getClass(), "path", null);
        setField(term2790, term2790.getClass(), "status", enum13);
        setIntField(term2790, term2790.getClass(), "prefixLength", 335112684);
        setField(term2790, term2790.getClass(), "filePath", null);
        setField(term2788, term2788.getClass(), "file", term2790);
        setIntField(term2788, term2788.getClass(), "order", 1551099402);
        ArrayList term2786 = new ArrayList();
        ((ArrayList) term2786).add(term2788);
        term2760 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig"));
        Object term2761 = newInstance(Class.forName("java.io.File"));
        setField(term2761, term2761.getClass(), "path", "bWWfajKbEX");
        setField(term2761, term2761.getClass(), "status", enum13);
        setIntField(term2761, term2761.getClass(), "prefixLength", 1265463001);
        setField(term2761, term2761.getClass(), "filePath", null);
        setField(term2760, term2760.getClass(), "destinyFolder", term2761);
        setField(term2760, term2760.getClass(), "mdfiles", term2786);
        setBooleanField(term2760, term2760.getClass(), "uniqueFile", true);
        setField(term2760, term2760.getClass(), "outputFileName", "PHvxnGHptP");
        term2808 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2808;
        callMethod(klass, "setUniqueFile", argTypes, term2760, args);
    }

};


