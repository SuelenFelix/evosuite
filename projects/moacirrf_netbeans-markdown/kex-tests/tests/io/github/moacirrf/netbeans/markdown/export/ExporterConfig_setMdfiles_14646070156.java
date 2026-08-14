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
import java.util.LinkedList;

public class ExporterConfig_setMdfiles_14646070156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2099;
     Object term2152;

    public ExporterConfig_setMdfiles_14646070156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2214 = Class.forName((String) "java.io.File$PathStatus");
        Field term2213 = ((Class) term2214).getDeclaredField((String) "INVALID");
        ((Field) term2213).setAccessible(true);
        Object enum10 = ((Field) term2213).get((Object) null);
        Object term2127 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term2129 = newInstance(Class.forName("java.io.File"));
        setField(term2127, term2127.getClass(), "name", "");
        setField(term2129, term2129.getClass(), "path", null);
        setField(term2129, term2129.getClass(), "status", enum10);
        setIntField(term2129, term2129.getClass(), "prefixLength", 1876565163);
        setField(term2129, term2129.getClass(), "filePath", null);
        setField(term2127, term2127.getClass(), "file", term2129);
        setIntField(term2127, term2127.getClass(), "order", -817164822);
        Object term2132 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term2134 = newInstance(Class.forName("java.io.File"));
        setField(term2132, term2132.getClass(), "name", "");
        setField(term2134, term2134.getClass(), "path", null);
        setField(term2134, term2134.getClass(), "status", null);
        setIntField(term2134, term2134.getClass(), "prefixLength", -1016503459);
        setField(term2134, term2134.getClass(), "filePath", null);
        setField(term2132, term2132.getClass(), "file", term2134);
        setIntField(term2132, term2132.getClass(), "order", -1968847291);
        ArrayList term2125 = new ArrayList();
        ((ArrayList) term2125).add(term2127);
        ((ArrayList) term2125).add(term2132);
        term2099 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig"));
        Object term2100 = newInstance(Class.forName("java.io.File"));
        setField(term2100, term2100.getClass(), "path", "UiUYnPrcCi");
        setField(term2100, term2100.getClass(), "status", enum10);
        setIntField(term2100, term2100.getClass(), "prefixLength", -157887805);
        setField(term2100, term2100.getClass(), "filePath", null);
        setField(term2099, term2099.getClass(), "destinyFolder", term2100);
        setField(term2099, term2099.getClass(), "mdfiles", term2125);
        setBooleanField(term2099, term2099.getClass(), "uniqueFile", true);
        setField(term2099, term2099.getClass(), "outputFileName", "ffYhPOzlUs");
        Class<? extends Object> term2377 = Class.forName((String) "java.io.File$PathStatus");
        Field term2376 = ((Class) term2377).getDeclaredField((String) "INVALID");
        ((Field) term2376).setAccessible(true);
        Object enum11 = ((Field) term2376).get((Object) null);
        Object term2155 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term2168 = newInstance(Class.forName("java.io.File"));
        setField(term2155, term2155.getClass(), "name", "MLqYREekMl");
        setField(term2168, term2168.getClass(), "path", "");
        setField(term2168, term2168.getClass(), "status", enum11);
        setIntField(term2168, term2168.getClass(), "prefixLength", 579005622);
        setField(term2168, term2168.getClass(), "filePath", null);
        setField(term2155, term2155.getClass(), "file", term2168);
        setIntField(term2155, term2155.getClass(), "order", -14890619);
        Object term2175 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term2177 = newInstance(Class.forName("java.io.File"));
        setField(term2175, term2175.getClass(), "name", "");
        setField(term2177, term2177.getClass(), "path", null);
        setField(term2177, term2177.getClass(), "status", enum11);
        setIntField(term2177, term2177.getClass(), "prefixLength", 1632125673);
        setField(term2177, term2177.getClass(), "filePath", null);
        setField(term2175, term2175.getClass(), "file", term2177);
        setIntField(term2175, term2175.getClass(), "order", 454281060);
        Object term2181 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        setField(term2181, term2181.getClass(), "name", null);
        setField(term2181, term2181.getClass(), "file", null);
        setIntField(term2181, term2181.getClass(), "order", 2055867847);
        term2152 = new LinkedList();
        ((LinkedList) term2152).add(term2155);
        ((LinkedList) term2152).add(term2175);
        ((LinkedList) term2152).add(term2181);
        ((LinkedList) term2152).add((Object)null);
        ((LinkedList) term2152).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2152;
        callMethod(klass, "setMdfiles", argTypes, term2099, args);
    }

};


