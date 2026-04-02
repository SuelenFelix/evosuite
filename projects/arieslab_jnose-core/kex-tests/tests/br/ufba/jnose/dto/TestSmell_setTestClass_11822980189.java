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

public class TestSmell_setTestClass_11822980189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3735;
     Object term3873;

    public TestSmell_setTestClass_11822980189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3821 = new Integer(-1007160944);
        Integer term3823 = new Integer(1135664017);
        ArrayList term3837 = new ArrayList();
        Class<? extends Object> term4044 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term4043 = ((Class) term4044).getDeclaredField((String) "JUnit3");
        ((Field) term4043).setAccessible(true);
        Object enum8 = ((Field) term4043).get((Object) null);
        HashMap term3851 = new HashMap();
        term3735 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        Object term3772 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term3735, term3735.getClass(), "name", "cAPeiZHKGJ");
        setField(term3735, term3735.getClass(), "method", "LvJFtLBaxj");
        setField(term3735, term3735.getClass(), "range", "PHvxnGHptP");
        setField(term3772, term3772.getClass(), "projectName", "TimdotUuNC");
        setField(term3772, term3772.getClass(), "pathFile", "PkWMRdJcBb");
        setField(term3772, term3772.getClass(), "name", "jSpAteRute");
        setField(term3772, term3772.getClass(), "fullName", "swZVeJAxjt");
        setField(term3772, term3772.getClass(), "numberMethods", term3821);
        setField(term3772, term3772.getClass(), "numberLine", term3823);
        setField(term3772, term3772.getClass(), "productionFile", "xOcJIiQQDu");
        setField(term3772, term3772.getClass(), "listTestSmell", term3837);
        setField(term3772, term3772.getClass(), "junitVersion", enum8);
        setField(term3772, term3772.getClass(), "lineSumTestSmells", term3851);
        setField(term3735, term3735.getClass(), "testClass", term3772);
        setField(term3735, term3735.getClass(), "code", "JqXGgAhZPl");
        Integer term3922 = new Integer(865208305);
        Integer term3924 = new Integer(-1275173084);
        ArrayList term3938 = new ArrayList();
        Class<? extends Object> term4329 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term4328 = ((Class) term4329).getDeclaredField((String) "JUnit4");
        ((Field) term4328).setAccessible(true);
        Object enum9 = ((Field) term4328).get((Object) null);
        HashMap term3952 = new HashMap();
        term3873 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term3873, term3873.getClass(), "projectName", "jiKYgYHqIS");
        setField(term3873, term3873.getClass(), "pathFile", "DfISiziTgG");
        setField(term3873, term3873.getClass(), "name", "XqgfKFvPSD");
        setField(term3873, term3873.getClass(), "fullName", "JiVRgTZvKc");
        setField(term3873, term3873.getClass(), "numberMethods", term3922);
        setField(term3873, term3873.getClass(), "numberLine", term3924);
        setField(term3873, term3873.getClass(), "productionFile", "XPKmummaqg");
        setField(term3873, term3873.getClass(), "listTestSmell", term3938);
        setField(term3873, term3873.getClass(), "junitVersion", enum9);
        setField(term3873, term3873.getClass(), "lineSumTestSmells", term3952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestSmell");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.ufba.jnose.dto.TestClass");
        Object[] args = new Object[1];
        args[0] = term3873;
        callMethod(klass, "setTestClass", argTypes, term3735, args);
    }

};


