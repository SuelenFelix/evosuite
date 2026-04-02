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
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class TestClass_setProjectName_20554913744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7960;

    public TestClass_setProjectName_20554913744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8009 = new Integer(-1786399638);
        Integer term8011 = new Integer(2055867847);
        ArrayList term8025 = new ArrayList();
        Class<? extends Object> term8113 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term8112 = ((Class) term8113).getDeclaredField((String) "JUnit4");
        ((Field) term8112).setAccessible(true);
        Object enum19 = ((Field) term8112).get((Object) null);
        HashMap term8039 = new HashMap();
        term7960 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term7960, term7960.getClass(), "projectName", "VeDtgDzGAN");
        setField(term7960, term7960.getClass(), "pathFile", "aWYOWZFyaX");
        setField(term7960, term7960.getClass(), "name", "BRIVNtfUWU");
        setField(term7960, term7960.getClass(), "fullName", "DbiCVtPPCT");
        setField(term7960, term7960.getClass(), "numberMethods", term8009);
        setField(term7960, term7960.getClass(), "numberLine", term8011);
        setField(term7960, term7960.getClass(), "productionFile", "WzFopsaDuG");
        setField(term7960, term7960.getClass(), "listTestSmell", term8025);
        setField(term7960, term7960.getClass(), "junitVersion", enum19);
        setField(term7960, term7960.getClass(), "lineSumTestSmells", term8039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "smnHEqRFRx";
        callMethod(klass, "setProjectName", argTypes, term7960, args);
    }

};


