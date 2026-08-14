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

public class InputModel_compareTo_19310849777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4698;
     Object term4737;

    public InputModel_compareTo_19310849777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4797 = Class.forName((String) "java.io.File$PathStatus");
        Field term4796 = ((Class) term4797).getDeclaredField((String) "CHECKED");
        ((Field) term4796).setAccessible(true);
        Object enum22 = ((Field) term4796).get((Object) null);
        term4698 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term4711 = newInstance(Class.forName("java.io.File"));
        setField(term4698, term4698.getClass(), "name", "JDaAnsVTGV");
        setField(term4711, term4711.getClass(), "path", "mLUZFTfjle");
        setField(term4711, term4711.getClass(), "status", enum22);
        setIntField(term4711, term4711.getClass(), "prefixLength", 1141317871);
        setField(term4711, term4711.getClass(), "filePath", null);
        setField(term4698, term4698.getClass(), "file", term4711);
        setIntField(term4698, term4698.getClass(), "order", 890669485);
        Class<? extends Object> term4960 = Class.forName((String) "java.io.File$PathStatus");
        Field term4959 = ((Class) term4960).getDeclaredField((String) "INVALID");
        ((Field) term4959).setAccessible(true);
        Object enum23 = ((Field) term4959).get((Object) null);
        term4737 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term4750 = newInstance(Class.forName("java.io.File"));
        setField(term4737, term4737.getClass(), "name", "xIeFjkHkOe");
        setField(term4750, term4750.getClass(), "path", "SdCKLMIYnX");
        setField(term4750, term4750.getClass(), "status", enum23);
        setIntField(term4750, term4750.getClass(), "prefixLength", 691577392);
        setField(term4750, term4750.getClass(), "filePath", null);
        setField(term4737, term4737.getClass(), "file", term4750);
        setIntField(term4737, term4737.getClass(), "order", -893623680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel");
        Object[] args = new Object[1];
        args[0] = term4737;
        callMethod(klass, "compareTo", argTypes, term4698, args);
    }

};


