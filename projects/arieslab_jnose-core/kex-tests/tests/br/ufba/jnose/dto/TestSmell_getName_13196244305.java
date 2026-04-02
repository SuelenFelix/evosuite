package br.ufba.jnose.dto;

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
import static br.ufba.jnose.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.String;
import java.util.HashMap;

public class TestSmell_getName_13196244305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1879;

    public TestSmell_getName_13196244305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1965 = new Integer(1134449235);
        Integer term1967 = new Integer(-883034806);
        ArrayList term1981 = new ArrayList();
        Class<? extends Object> term2098 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term2097 = ((Class) term2098).getDeclaredField((String) "JUnit4");
        ((Field) term2097).setAccessible(true);
        Object enum4 = ((Field) term2097).get((Object) null);
        HashMap term1995 = new HashMap();
        term1879 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        Object term1916 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term1879, term1879.getClass(), "name", "gGSMzuGICf");
        setField(term1879, term1879.getClass(), "method", "hxCBltsObl");
        setField(term1879, term1879.getClass(), "range", "BndsHwAFMv");
        setField(term1916, term1916.getClass(), "projectName", "GzFkzHGYFt");
        setField(term1916, term1916.getClass(), "pathFile", "tShwQLRGNe");
        setField(term1916, term1916.getClass(), "name", "LvtrsXUliU");
        setField(term1916, term1916.getClass(), "fullName", "xLbjWUgOIL");
        setField(term1916, term1916.getClass(), "numberMethods", term1965);
        setField(term1916, term1916.getClass(), "numberLine", term1967);
        setField(term1916, term1916.getClass(), "productionFile", "jDtqGUpnZN");
        setField(term1916, term1916.getClass(), "listTestSmell", term1981);
        setField(term1916, term1916.getClass(), "junitVersion", enum4);
        setField(term1916, term1916.getClass(), "lineSumTestSmells", term1995);
        setField(term1879, term1879.getClass(), "testClass", term1916);
        setField(term1879, term1879.getClass(), "code", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestSmell");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1879, args);
    }

};


