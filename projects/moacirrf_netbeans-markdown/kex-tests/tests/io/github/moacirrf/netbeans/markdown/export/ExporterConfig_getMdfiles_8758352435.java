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

public class ExporterConfig_getMdfiles_8758352435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1863;

    public ExporterConfig_getMdfiles_8758352435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1947 = Class.forName((String) "java.io.File$PathStatus");
        Field term1946 = ((Class) term1947).getDeclaredField((String) "INVALID");
        ((Field) term1946).setAccessible(true);
        Object enum9 = ((Field) term1946).get((Object) null);
        Object term1891 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term1893 = newInstance(Class.forName("java.io.File"));
        setField(term1891, term1891.getClass(), "name", "");
        setField(term1893, term1893.getClass(), "path", null);
        setField(term1893, term1893.getClass(), "status", null);
        setIntField(term1893, term1893.getClass(), "prefixLength", -1179120542);
        setField(term1893, term1893.getClass(), "filePath", null);
        setField(term1891, term1891.getClass(), "file", term1893);
        setIntField(term1891, term1891.getClass(), "order", -73683645);
        Object term1896 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term1898 = newInstance(Class.forName("java.io.File"));
        setField(term1896, term1896.getClass(), "name", "");
        setField(term1898, term1898.getClass(), "path", null);
        setField(term1898, term1898.getClass(), "status", null);
        setIntField(term1898, term1898.getClass(), "prefixLength", -226514366);
        setField(term1898, term1898.getClass(), "filePath", null);
        setField(term1896, term1896.getClass(), "file", term1898);
        setIntField(term1896, term1896.getClass(), "order", 1193880199);
        Object term1901 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term1903 = newInstance(Class.forName("java.io.File"));
        setField(term1901, term1901.getClass(), "name", "");
        setField(term1903, term1903.getClass(), "path", null);
        setField(term1903, term1903.getClass(), "status", null);
        setIntField(term1903, term1903.getClass(), "prefixLength", -1087774327);
        setField(term1903, term1903.getClass(), "filePath", null);
        setField(term1901, term1901.getClass(), "file", term1903);
        setIntField(term1901, term1901.getClass(), "order", -1530420153);
        Object term1906 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term1908 = newInstance(Class.forName("java.io.File"));
        setField(term1906, term1906.getClass(), "name", "");
        setField(term1908, term1908.getClass(), "path", null);
        setField(term1908, term1908.getClass(), "status", null);
        setIntField(term1908, term1908.getClass(), "prefixLength", -469968304);
        setField(term1908, term1908.getClass(), "filePath", null);
        setField(term1906, term1906.getClass(), "file", term1908);
        setIntField(term1906, term1906.getClass(), "order", -1145578966);
        Object term1911 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term1913 = newInstance(Class.forName("java.io.File"));
        setField(term1911, term1911.getClass(), "name", "");
        setField(term1913, term1913.getClass(), "path", null);
        setField(term1913, term1913.getClass(), "status", null);
        setIntField(term1913, term1913.getClass(), "prefixLength", 679763016);
        setField(term1913, term1913.getClass(), "filePath", null);
        setField(term1911, term1911.getClass(), "file", term1913);
        setIntField(term1911, term1911.getClass(), "order", 1962444399);
        Object term1916 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term1918 = newInstance(Class.forName("java.io.File"));
        setField(term1916, term1916.getClass(), "name", "");
        setField(term1918, term1918.getClass(), "path", null);
        setField(term1918, term1918.getClass(), "status", enum9);
        setIntField(term1918, term1918.getClass(), "prefixLength", 767834723);
        setField(term1918, term1918.getClass(), "filePath", null);
        setField(term1916, term1916.getClass(), "file", term1918);
        setIntField(term1916, term1916.getClass(), "order", -602026508);
        ArrayList term1889 = new ArrayList();
        ((ArrayList) term1889).add(term1891);
        ((ArrayList) term1889).add(term1896);
        ((ArrayList) term1889).add(term1901);
        ((ArrayList) term1889).add(term1906);
        ((ArrayList) term1889).add(term1911);
        ((ArrayList) term1889).add(term1916);
        term1863 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig"));
        Object term1864 = newInstance(Class.forName("java.io.File"));
        setField(term1864, term1864.getClass(), "path", "IDCWpPLRkE");
        setField(term1864, term1864.getClass(), "status", enum9);
        setIntField(term1864, term1864.getClass(), "prefixLength", -203030934);
        setField(term1864, term1864.getClass(), "filePath", null);
        setField(term1863, term1863.getClass(), "destinyFolder", term1864);
        setField(term1863, term1863.getClass(), "mdfiles", term1889);
        setBooleanField(term1863, term1863.getClass(), "uniqueFile", false);
        setField(term1863, term1863.getClass(), "outputFileName", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMdfiles", argTypes, term1863, args);
    }

};


