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

public class TestClass_setProductionFile_199534829114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11664;

    public TestClass_setProductionFile_199534829114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11713 = new Integer(-1465035361);
        Integer term11715 = new Integer(1090617576);
        ArrayList term11729 = new ArrayList();
        Class<? extends Object> term11815 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term11814 = ((Class) term11815).getDeclaredField((String) "None");
        ((Field) term11814).setAccessible(true);
        Object enum29 = ((Field) term11814).get((Object) null);
        HashMap term11741 = new HashMap();
        term11664 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term11664, term11664.getClass(), "projectName", "wKWbJssZuG");
        setField(term11664, term11664.getClass(), "pathFile", "NzBMMhkhpT");
        setField(term11664, term11664.getClass(), "name", "qCpEbQDHdF");
        setField(term11664, term11664.getClass(), "fullName", "AHbZyFOmlo");
        setField(term11664, term11664.getClass(), "numberMethods", term11713);
        setField(term11664, term11664.getClass(), "numberLine", term11715);
        setField(term11664, term11664.getClass(), "productionFile", "TwfWVQGiIj");
        setField(term11664, term11664.getClass(), "listTestSmell", term11729);
        setField(term11664, term11664.getClass(), "junitVersion", enum29);
        setField(term11664, term11664.getClass(), "lineSumTestSmells", term11741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EwQBhZjCIT";
        callMethod(klass, "setProductionFile", argTypes, term11664, args);
    }

};


