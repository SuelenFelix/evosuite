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

public class TestClass_setFullName_167700720820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13979;

    public TestClass_setFullName_167700720820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14028 = new Integer(-1210583429);
        Integer term14030 = new Integer(-663691365);
        ArrayList term14044 = new ArrayList();
        Class<? extends Object> term14132 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term14131 = ((Class) term14132).getDeclaredField((String) "JUnit4");
        ((Field) term14131).setAccessible(true);
        Object enum35 = ((Field) term14131).get((Object) null);
        HashMap term14058 = new HashMap();
        term13979 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term13979, term13979.getClass(), "projectName", "SPtPatHeOm");
        setField(term13979, term13979.getClass(), "pathFile", "ywmcuThdfL");
        setField(term13979, term13979.getClass(), "name", "GBOEuByOfr");
        setField(term13979, term13979.getClass(), "fullName", "NHbOFFjyVK");
        setField(term13979, term13979.getClass(), "numberMethods", term14028);
        setField(term13979, term13979.getClass(), "numberLine", term14030);
        setField(term13979, term13979.getClass(), "productionFile", "zaloBqlrSo");
        setField(term13979, term13979.getClass(), "listTestSmell", term14044);
        setField(term13979, term13979.getClass(), "junitVersion", enum35);
        setField(term13979, term13979.getClass(), "lineSumTestSmells", term14058);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pXdglvyrQe";
        callMethod(klass, "setFullName", argTypes, term13979, args);
    }

};


