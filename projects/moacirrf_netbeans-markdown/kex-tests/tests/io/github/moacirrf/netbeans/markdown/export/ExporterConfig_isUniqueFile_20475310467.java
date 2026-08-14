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

public class ExporterConfig_isUniqueFile_20475310467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2519;

    public ExporterConfig_isUniqueFile_20475310467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2608 = Class.forName((String) "java.io.File$PathStatus");
        Field term2607 = ((Class) term2608).getDeclaredField((String) "INVALID");
        ((Field) term2607).setAccessible(true);
        Object enum12 = ((Field) term2607).get((Object) null);
        Object term2547 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term2549 = newInstance(Class.forName("java.io.File"));
        setField(term2547, term2547.getClass(), "name", "");
        setField(term2549, term2549.getClass(), "path", null);
        setField(term2549, term2549.getClass(), "status", null);
        setIntField(term2549, term2549.getClass(), "prefixLength", 1328271830);
        setField(term2549, term2549.getClass(), "filePath", null);
        setField(term2547, term2547.getClass(), "file", term2549);
        setIntField(term2547, term2547.getClass(), "order", 1596070772);
        Object term2552 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term2554 = newInstance(Class.forName("java.io.File"));
        setField(term2552, term2552.getClass(), "name", "");
        setField(term2554, term2554.getClass(), "path", null);
        setField(term2554, term2554.getClass(), "status", null);
        setIntField(term2554, term2554.getClass(), "prefixLength", 97029295);
        setField(term2554, term2554.getClass(), "filePath", null);
        setField(term2552, term2552.getClass(), "file", term2554);
        setIntField(term2552, term2552.getClass(), "order", -1371869594);
        Object term2557 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term2559 = newInstance(Class.forName("java.io.File"));
        setField(term2557, term2557.getClass(), "name", "");
        setField(term2559, term2559.getClass(), "path", null);
        setField(term2559, term2559.getClass(), "status", null);
        setIntField(term2559, term2559.getClass(), "prefixLength", -2095575670);
        setField(term2559, term2559.getClass(), "filePath", null);
        setField(term2557, term2557.getClass(), "file", term2559);
        setIntField(term2557, term2557.getClass(), "order", 1225272962);
        Object term2562 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term2564 = newInstance(Class.forName("java.io.File"));
        setField(term2562, term2562.getClass(), "name", "");
        setField(term2564, term2564.getClass(), "path", null);
        setField(term2564, term2564.getClass(), "status", null);
        setIntField(term2564, term2564.getClass(), "prefixLength", 1324040357);
        setField(term2564, term2564.getClass(), "filePath", null);
        setField(term2562, term2562.getClass(), "file", term2564);
        setIntField(term2562, term2562.getClass(), "order", -1588772968);
        Object term2567 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term2569 = newInstance(Class.forName("java.io.File"));
        setField(term2567, term2567.getClass(), "name", "");
        setField(term2569, term2569.getClass(), "path", null);
        setField(term2569, term2569.getClass(), "status", enum12);
        setIntField(term2569, term2569.getClass(), "prefixLength", -93135961);
        setField(term2569, term2569.getClass(), "filePath", null);
        setField(term2567, term2567.getClass(), "file", term2569);
        setIntField(term2567, term2567.getClass(), "order", -112921587);
        Object term2572 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term2574 = newInstance(Class.forName("java.io.File"));
        setField(term2572, term2572.getClass(), "name", "");
        setField(term2574, term2574.getClass(), "path", null);
        setField(term2574, term2574.getClass(), "status", enum12);
        setIntField(term2574, term2574.getClass(), "prefixLength", 933028652);
        setField(term2574, term2574.getClass(), "filePath", null);
        setField(term2572, term2572.getClass(), "file", term2574);
        setIntField(term2572, term2572.getClass(), "order", 287287233);
        Object term2577 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term2579 = newInstance(Class.forName("java.io.File"));
        setField(term2577, term2577.getClass(), "name", "");
        setField(term2579, term2579.getClass(), "path", null);
        setField(term2579, term2579.getClass(), "status", enum12);
        setIntField(term2579, term2579.getClass(), "prefixLength", 962840079);
        setField(term2579, term2579.getClass(), "filePath", null);
        setField(term2577, term2577.getClass(), "file", term2579);
        setIntField(term2577, term2577.getClass(), "order", 1540719661);
        ArrayList term2545 = new ArrayList();
        ((ArrayList) term2545).add(term2547);
        ((ArrayList) term2545).add(term2552);
        ((ArrayList) term2545).add(term2557);
        ((ArrayList) term2545).add(term2562);
        ((ArrayList) term2545).add(term2567);
        ((ArrayList) term2545).add(term2572);
        ((ArrayList) term2545).add(term2577);
        term2519 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig"));
        Object term2520 = newInstance(Class.forName("java.io.File"));
        setField(term2520, term2520.getClass(), "path", "TJmVBGfTML");
        setField(term2520, term2520.getClass(), "status", enum12);
        setIntField(term2520, term2520.getClass(), "prefixLength", 493620644);
        setField(term2520, term2520.getClass(), "filePath", null);
        setField(term2519, term2519.getClass(), "destinyFolder", term2520);
        setField(term2519, term2519.getClass(), "mdfiles", term2545);
        setBooleanField(term2519, term2519.getClass(), "uniqueFile", true);
        setField(term2519, term2519.getClass(), "outputFileName", "jUbSRrkrYZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUniqueFile", argTypes, term2519, args);
    }

};


