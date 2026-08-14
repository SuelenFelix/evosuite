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

public class ExporterConfig_getOutputFileName_12724363909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2973;

    public ExporterConfig_getOutputFileName_12724363909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3057 = Class.forName((String) "java.io.File$PathStatus");
        Field term3056 = ((Class) term3057).getDeclaredField((String) "INVALID");
        ((Field) term3056).setAccessible(true);
        Object enum14 = ((Field) term3056).get((Object) null);
        Object term3001 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term3003 = newInstance(Class.forName("java.io.File"));
        setField(term3001, term3001.getClass(), "name", "");
        setField(term3003, term3003.getClass(), "path", null);
        setField(term3003, term3003.getClass(), "status", null);
        setIntField(term3003, term3003.getClass(), "prefixLength", 1063420942);
        setField(term3003, term3003.getClass(), "filePath", null);
        setField(term3001, term3001.getClass(), "file", term3003);
        setIntField(term3001, term3001.getClass(), "order", 1375330971);
        Object term3006 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term3008 = newInstance(Class.forName("java.io.File"));
        setField(term3006, term3006.getClass(), "name", "");
        setField(term3008, term3008.getClass(), "path", null);
        setField(term3008, term3008.getClass(), "status", null);
        setIntField(term3008, term3008.getClass(), "prefixLength", -478195677);
        setField(term3008, term3008.getClass(), "filePath", null);
        setField(term3006, term3006.getClass(), "file", term3008);
        setIntField(term3006, term3006.getClass(), "order", 972867650);
        Object term3011 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term3013 = newInstance(Class.forName("java.io.File"));
        setField(term3011, term3011.getClass(), "name", "");
        setField(term3013, term3013.getClass(), "path", null);
        setField(term3013, term3013.getClass(), "status", null);
        setIntField(term3013, term3013.getClass(), "prefixLength", 1655935355);
        setField(term3013, term3013.getClass(), "filePath", null);
        setField(term3011, term3011.getClass(), "file", term3013);
        setIntField(term3011, term3011.getClass(), "order", -481533957);
        Object term3016 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term3018 = newInstance(Class.forName("java.io.File"));
        setField(term3016, term3016.getClass(), "name", "");
        setField(term3018, term3018.getClass(), "path", null);
        setField(term3018, term3018.getClass(), "status", enum14);
        setIntField(term3018, term3018.getClass(), "prefixLength", 1240914516);
        setField(term3018, term3018.getClass(), "filePath", null);
        setField(term3016, term3016.getClass(), "file", term3018);
        setIntField(term3016, term3016.getClass(), "order", -1465035361);
        Object term3021 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term3023 = newInstance(Class.forName("java.io.File"));
        setField(term3021, term3021.getClass(), "name", "");
        setField(term3023, term3023.getClass(), "path", null);
        setField(term3023, term3023.getClass(), "status", null);
        setIntField(term3023, term3023.getClass(), "prefixLength", 1090617576);
        setField(term3023, term3023.getClass(), "filePath", null);
        setField(term3021, term3021.getClass(), "file", term3023);
        setIntField(term3021, term3021.getClass(), "order", -1547384488);
        Object term3026 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term3028 = newInstance(Class.forName("java.io.File"));
        setField(term3026, term3026.getClass(), "name", "");
        setField(term3028, term3028.getClass(), "path", null);
        setField(term3028, term3028.getClass(), "status", enum14);
        setIntField(term3028, term3028.getClass(), "prefixLength", 1442160736);
        setField(term3028, term3028.getClass(), "filePath", null);
        setField(term3026, term3026.getClass(), "file", term3028);
        setIntField(term3026, term3026.getClass(), "order", 1114000454);
        ArrayList term2999 = new ArrayList();
        ((ArrayList) term2999).add(term3001);
        ((ArrayList) term2999).add(term3006);
        ((ArrayList) term2999).add(term3011);
        ((ArrayList) term2999).add(term3016);
        ((ArrayList) term2999).add(term3021);
        ((ArrayList) term2999).add(term3026);
        term2973 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig"));
        Object term2974 = newInstance(Class.forName("java.io.File"));
        setField(term2974, term2974.getClass(), "path", "TimdotUuNC");
        setField(term2974, term2974.getClass(), "status", enum14);
        setIntField(term2974, term2974.getClass(), "prefixLength", -2027534003);
        setField(term2974, term2974.getClass(), "filePath", null);
        setField(term2973, term2973.getClass(), "destinyFolder", term2974);
        setField(term2973, term2973.getClass(), "mdfiles", term2999);
        setBooleanField(term2973, term2973.getClass(), "uniqueFile", false);
        setField(term2973, term2973.getClass(), "outputFileName", "SPpkrGcPRr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOutputFileName", argTypes, term2973, args);
    }

};


