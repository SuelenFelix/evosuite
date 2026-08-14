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

public class ExporterConfig_setOutputFileName_166320217410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3209;

    public ExporterConfig_setOutputFileName_166320217410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3300 = Class.forName((String) "java.io.File$PathStatus");
        Field term3299 = ((Class) term3300).getDeclaredField((String) "INVALID");
        ((Field) term3299).setAccessible(true);
        Object enum15 = ((Field) term3299).get((Object) null);
        Object term3237 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term3239 = newInstance(Class.forName("java.io.File"));
        setField(term3237, term3237.getClass(), "name", "");
        setField(term3239, term3239.getClass(), "path", null);
        setField(term3239, term3239.getClass(), "status", null);
        setIntField(term3239, term3239.getClass(), "prefixLength", -1772434990);
        setField(term3239, term3239.getClass(), "filePath", null);
        setField(term3237, term3237.getClass(), "file", term3239);
        setIntField(term3237, term3237.getClass(), "order", -1845499264);
        Object term3242 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term3244 = newInstance(Class.forName("java.io.File"));
        setField(term3242, term3242.getClass(), "name", "");
        setField(term3244, term3244.getClass(), "path", null);
        setField(term3244, term3244.getClass(), "status", enum15);
        setIntField(term3244, term3244.getClass(), "prefixLength", -505439934);
        setField(term3244, term3244.getClass(), "filePath", null);
        setField(term3242, term3242.getClass(), "file", term3244);
        setIntField(term3242, term3242.getClass(), "order", -344842608);
        Object term3247 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term3249 = newInstance(Class.forName("java.io.File"));
        setField(term3247, term3247.getClass(), "name", "");
        setField(term3249, term3249.getClass(), "path", null);
        setField(term3249, term3249.getClass(), "status", null);
        setIntField(term3249, term3249.getClass(), "prefixLength", 941650513);
        setField(term3249, term3249.getClass(), "filePath", null);
        setField(term3247, term3247.getClass(), "file", term3249);
        setIntField(term3247, term3247.getClass(), "order", 444029505);
        Object term3252 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term3254 = newInstance(Class.forName("java.io.File"));
        setField(term3252, term3252.getClass(), "name", "");
        setField(term3254, term3254.getClass(), "path", null);
        setField(term3254, term3254.getClass(), "status", enum15);
        setIntField(term3254, term3254.getClass(), "prefixLength", -1034506028);
        setField(term3254, term3254.getClass(), "filePath", null);
        setField(term3252, term3252.getClass(), "file", term3254);
        setIntField(term3252, term3252.getClass(), "order", -1263114719);
        Object term3257 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term3259 = newInstance(Class.forName("java.io.File"));
        setField(term3257, term3257.getClass(), "name", "");
        setField(term3259, term3259.getClass(), "path", null);
        setField(term3259, term3259.getClass(), "status", enum15);
        setIntField(term3259, term3259.getClass(), "prefixLength", -894662986);
        setField(term3259, term3259.getClass(), "filePath", null);
        setField(term3257, term3257.getClass(), "file", term3259);
        setIntField(term3257, term3257.getClass(), "order", 304775596);
        ArrayList term3235 = new ArrayList();
        ((ArrayList) term3235).add(term3237);
        ((ArrayList) term3235).add(term3242);
        ((ArrayList) term3235).add(term3247);
        ((ArrayList) term3235).add(term3252);
        ((ArrayList) term3235).add(term3257);
        term3209 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig"));
        Object term3210 = newInstance(Class.forName("java.io.File"));
        setField(term3210, term3210.getClass(), "path", "sEccwbJKYE");
        setField(term3210, term3210.getClass(), "status", enum15);
        setIntField(term3210, term3210.getClass(), "prefixLength", -556405712);
        setField(term3210, term3210.getClass(), "filePath", null);
        setField(term3209, term3209.getClass(), "destinyFolder", term3210);
        setField(term3209, term3209.getClass(), "mdfiles", term3235);
        setBooleanField(term3209, term3209.getClass(), "uniqueFile", true);
        setField(term3209, term3209.getClass(), "outputFileName", "OEXDRUKcFl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RYdKCNNMBR";
        callMethod(klass, "setOutputFileName", argTypes, term3209, args);
    }

};


