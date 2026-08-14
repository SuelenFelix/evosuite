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

public class InputModel_getOrder_11460200653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3866;

    public InputModel_getOrder_11460200653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3926 = Class.forName((String) "java.io.File$PathStatus");
        Field term3925 = ((Class) term3926).getDeclaredField((String) "INVALID");
        ((Field) term3925).setAccessible(true);
        Object enum18 = ((Field) term3925).get((Object) null);
        term3866 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term3879 = newInstance(Class.forName("java.io.File"));
        setField(term3866, term3866.getClass(), "name", "XylxrMBraH");
        setField(term3879, term3879.getClass(), "path", "pORebkoRdD");
        setField(term3879, term3879.getClass(), "status", enum18);
        setIntField(term3879, term3879.getClass(), "prefixLength", -268815336);
        setField(term3879, term3879.getClass(), "filePath", null);
        setField(term3866, term3866.getClass(), "file", term3879);
        setIntField(term3866, term3866.getClass(), "order", -1210583429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrder", argTypes, term3866, args);
    }

};


