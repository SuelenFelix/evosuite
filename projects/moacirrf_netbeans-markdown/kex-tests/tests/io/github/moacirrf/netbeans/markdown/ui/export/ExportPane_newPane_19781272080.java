package io.github.moacirrf.netbeans.markdown.ui.export;

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
import static io.github.moacirrf.netbeans.markdown.ui.export.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;

public class ExportPane_newPane_19781272080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ExportPane_newPane_19781272080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81 = Class.forName((String) "java.io.File$PathStatus");
        Field term80 = ((Class) term81).getDeclaredField((String) "INVALID");
        ((Field) term80).setAccessible(true);
        Object enum0 = ((Field) term80).get((Object) null);
        Object term4 = newInstance(Class.forName("java.io.File"));
        setField(term4, term4.getClass(), "path", "PAEBtnZtTD");
        setField(term4, term4.getClass(), "status", enum0);
        setIntField(term4, term4.getClass(), "prefixLength", 568599855);
        setField(term4, term4.getClass(), "filePath", null);
        Object term22 = newInstance(Class.forName("java.io.File"));
        setField(term22, term22.getClass(), "path", "");
        setField(term22, term22.getClass(), "status", enum0);
        setIntField(term22, term22.getClass(), "prefixLength", 1162663216);
        setField(term22, term22.getClass(), "filePath", null);
        Object term26 = newInstance(Class.forName("java.io.File"));
        setField(term26, term26.getClass(), "path", null);
        setField(term26, term26.getClass(), "status", enum0);
        setIntField(term26, term26.getClass(), "prefixLength", 1484323161);
        setField(term26, term26.getClass(), "filePath", null);
        term1 = new LinkedList();
        ((LinkedList) term1).add(term4);
        ((LinkedList) term1).add(term22);
        ((LinkedList) term1).add(term26);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = null;
        callMethod(klass, "newPane", argTypes, null, args);
    }

};


