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

public class TestSmell_getTestClass_113050361210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4553;

    public TestSmell_getTestClass_113050361210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4639 = new Integer(-203030934);
        Integer term4641 = new Integer(-1179120542);
        ArrayList term4655 = new ArrayList();
        Class<? extends Object> term4772 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term4771 = ((Class) term4772).getDeclaredField((String) "JUnit3");
        ((Field) term4771).setAccessible(true);
        Object enum10 = ((Field) term4771).get((Object) null);
        HashMap term4669 = new HashMap();
        term4553 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        Object term4590 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term4553, term4553.getClass(), "name", "SPpkrGcPRr");
        setField(term4553, term4553.getClass(), "method", "sEccwbJKYE");
        setField(term4553, term4553.getClass(), "range", "AWRooQKkdW");
        setField(term4590, term4590.getClass(), "projectName", "vjxIhXHxGR");
        setField(term4590, term4590.getClass(), "pathFile", "QXzGXbEXMu");
        setField(term4590, term4590.getClass(), "name", "qxSDVejjiY");
        setField(term4590, term4590.getClass(), "fullName", "xBsXSDjXYK");
        setField(term4590, term4590.getClass(), "numberMethods", term4639);
        setField(term4590, term4590.getClass(), "numberLine", term4641);
        setField(term4590, term4590.getClass(), "productionFile", "sEnIVFtZuQ");
        setField(term4590, term4590.getClass(), "listTestSmell", term4655);
        setField(term4590, term4590.getClass(), "junitVersion", enum10);
        setField(term4590, term4590.getClass(), "lineSumTestSmells", term4669);
        setField(term4553, term4553.getClass(), "testClass", term4590);
        setField(term4553, term4553.getClass(), "code", "fztQhjqwdP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestSmell");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTestClass", argTypes, term4553, args);
    }

};


