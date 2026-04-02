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

public class TestSmell_getCode_10173649442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term506;

    public TestSmell_getCode_10173649442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term592 = new Integer(391863371);
        Integer term594 = new Integer(-1922583790);
        ArrayList term608 = new ArrayList();
        Class<? extends Object> term725 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term724 = ((Class) term725).getDeclaredField((String) "JUnit3");
        ((Field) term724).setAccessible(true);
        Object enum1 = ((Field) term724).get((Object) null);
        HashMap term622 = new HashMap();
        term506 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        Object term543 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term506, term506.getClass(), "name", "uuaPigETmJ");
        setField(term506, term506.getClass(), "method", "MxlszYVzRf");
        setField(term506, term506.getClass(), "range", "LQFpaHEwXR");
        setField(term543, term543.getClass(), "projectName", "oVcInYnLWB");
        setField(term543, term543.getClass(), "pathFile", "aJlieCFVtF");
        setField(term543, term543.getClass(), "name", "ZiaGIbnzTs");
        setField(term543, term543.getClass(), "fullName", "tbcdzjIfER");
        setField(term543, term543.getClass(), "numberMethods", term592);
        setField(term543, term543.getClass(), "numberLine", term594);
        setField(term543, term543.getClass(), "productionFile", "HyxfbSQYBe");
        setField(term543, term543.getClass(), "listTestSmell", term608);
        setField(term543, term543.getClass(), "junitVersion", enum1);
        setField(term543, term543.getClass(), "lineSumTestSmells", term622);
        setField(term506, term506.getClass(), "testClass", term543);
        setField(term506, term506.getClass(), "code", "hNxWaHcfhY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestSmell");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCode", argTypes, term506, args);
    }

};


