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

public class ExporterConfig_getDestinyFolder_18738757713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1248;

    public ExporterConfig_getDestinyFolder_18738757713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1322 = Class.forName((String) "java.io.File$PathStatus");
        Field term1321 = ((Class) term1322).getDeclaredField((String) "CHECKED");
        ((Field) term1321).setAccessible(true);
        Object enum6 = ((Field) term1321).get((Object) null);
        Object term1276 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term1278 = newInstance(Class.forName("java.io.File"));
        setField(term1276, term1276.getClass(), "name", "");
        setField(term1278, term1278.getClass(), "path", null);
        setField(term1278, term1278.getClass(), "status", null);
        setIntField(term1278, term1278.getClass(), "prefixLength", 1622346318);
        setField(term1278, term1278.getClass(), "filePath", null);
        setField(term1276, term1276.getClass(), "file", term1278);
        setIntField(term1276, term1276.getClass(), "order", 1048535127);
        Object term1281 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term1283 = newInstance(Class.forName("java.io.File"));
        setField(term1281, term1281.getClass(), "name", "");
        setField(term1283, term1283.getClass(), "path", null);
        setField(term1283, term1283.getClass(), "status", enum6);
        setIntField(term1283, term1283.getClass(), "prefixLength", -655067527);
        setField(term1283, term1283.getClass(), "filePath", null);
        setField(term1281, term1281.getClass(), "file", term1283);
        setIntField(term1281, term1281.getClass(), "order", -6029667);
        Object term1286 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term1288 = newInstance(Class.forName("java.io.File"));
        setField(term1286, term1286.getClass(), "name", "");
        setField(term1288, term1288.getClass(), "path", null);
        setField(term1288, term1288.getClass(), "status", null);
        setIntField(term1288, term1288.getClass(), "prefixLength", -2068769794);
        setField(term1288, term1288.getClass(), "filePath", null);
        setField(term1286, term1286.getClass(), "file", term1288);
        setIntField(term1286, term1286.getClass(), "order", -117576464);
        Object term1291 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term1293 = newInstance(Class.forName("java.io.File"));
        setField(term1291, term1291.getClass(), "name", "");
        setField(term1293, term1293.getClass(), "path", null);
        setField(term1293, term1293.getClass(), "status", null);
        setIntField(term1293, term1293.getClass(), "prefixLength", -1007160944);
        setField(term1293, term1293.getClass(), "filePath", null);
        setField(term1291, term1291.getClass(), "file", term1293);
        setIntField(term1291, term1291.getClass(), "order", 1135664017);
        ArrayList term1274 = new ArrayList();
        ((ArrayList) term1274).add(term1276);
        ((ArrayList) term1274).add(term1281);
        ((ArrayList) term1274).add(term1286);
        ((ArrayList) term1274).add(term1291);
        term1248 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig"));
        Object term1249 = newInstance(Class.forName("java.io.File"));
        setField(term1249, term1249.getClass(), "path", "xOEqzGAmDU");
        setField(term1249, term1249.getClass(), "status", enum6);
        setIntField(term1249, term1249.getClass(), "prefixLength", -1456670397);
        setField(term1249, term1249.getClass(), "filePath", null);
        setField(term1248, term1248.getClass(), "destinyFolder", term1249);
        setField(term1248, term1248.getClass(), "mdfiles", term1274);
        setBooleanField(term1248, term1248.getClass(), "uniqueFile", false);
        setField(term1248, term1248.getClass(), "outputFileName", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDestinyFolder", argTypes, term1248, args);
    }

};


