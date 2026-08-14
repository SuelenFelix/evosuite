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

public class HtmlExporter_export_14907519221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public HtmlExporter_export_14907519221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.HtmlExporter"));
        Class<? extends Object> term103 = Class.forName((String) "java.io.File$PathStatus");
        Field term102 = ((Class) term103).getDeclaredField((String) "INVALID");
        ((Field) term102).setAccessible(true);
        Object enum0 = ((Field) term102).get((Object) null);
        Object term30 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term32 = newInstance(Class.forName("java.io.File"));
        setField(term30, term30.getClass(), "name", "");
        setField(term32, term32.getClass(), "path", null);
        setField(term32, term32.getClass(), "status", enum0);
        setIntField(term32, term32.getClass(), "prefixLength", 1162663216);
        setField(term32, term32.getClass(), "filePath", null);
        setField(term30, term30.getClass(), "file", term32);
        setIntField(term30, term30.getClass(), "order", 1484323161);
        Object term35 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term37 = newInstance(Class.forName("java.io.File"));
        setField(term35, term35.getClass(), "name", "");
        setField(term37, term37.getClass(), "path", null);
        setField(term37, term37.getClass(), "status", enum0);
        setIntField(term37, term37.getClass(), "prefixLength", 391863371);
        setField(term37, term37.getClass(), "filePath", null);
        setField(term35, term35.getClass(), "file", term37);
        setIntField(term35, term35.getClass(), "order", -1922583790);
        Object term40 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term42 = newInstance(Class.forName("java.io.File"));
        setField(term40, term40.getClass(), "name", "");
        setField(term42, term42.getClass(), "path", null);
        setField(term42, term42.getClass(), "status", enum0);
        setIntField(term42, term42.getClass(), "prefixLength", -616727354);
        setField(term42, term42.getClass(), "filePath", null);
        setField(term40, term40.getClass(), "file", term42);
        setIntField(term40, term40.getClass(), "order", -1955890973);
        Object term45 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term47 = newInstance(Class.forName("java.io.File"));
        setField(term45, term45.getClass(), "name", "");
        setField(term47, term47.getClass(), "path", null);
        setField(term47, term47.getClass(), "status", null);
        setIntField(term47, term47.getClass(), "prefixLength", -2038273078);
        setField(term47, term47.getClass(), "filePath", null);
        setField(term45, term45.getClass(), "file", term47);
        setIntField(term45, term45.getClass(), "order", 1227103734);
        Object term50 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.InputModel"));
        Object term52 = newInstance(Class.forName("java.io.File"));
        setField(term50, term50.getClass(), "name", "");
        setField(term52, term52.getClass(), "path", null);
        setField(term52, term52.getClass(), "status", null);
        setIntField(term52, term52.getClass(), "prefixLength", -1339778481);
        setField(term52, term52.getClass(), "filePath", null);
        setField(term50, term50.getClass(), "file", term52);
        setIntField(term50, term50.getClass(), "order", 1725571209);
        ArrayList term28 = new ArrayList();
        ((ArrayList) term28).add(term30);
        ((ArrayList) term28).add(term35);
        ((ArrayList) term28).add(term40);
        ((ArrayList) term28).add(term45);
        ((ArrayList) term28).add(term50);
        term2 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig"));
        Object term3 = newInstance(Class.forName("java.io.File"));
        setField(term3, term3.getClass(), "path", "PAEBtnZtTD");
        setField(term3, term3.getClass(), "status", enum0);
        setIntField(term3, term3.getClass(), "prefixLength", 568599855);
        setField(term3, term3.getClass(), "filePath", null);
        setField(term2, term2.getClass(), "destinyFolder", term3);
        setField(term2, term2.getClass(), "mdfiles", term28);
        setBooleanField(term2, term2.getClass(), "uniqueFile", false);
        setField(term2, term2.getClass(), "outputFileName", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.export.HtmlExporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.moacirrf.netbeans.markdown.export.ExporterConfig");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "export", argTypes, term1, args);
    }

};


