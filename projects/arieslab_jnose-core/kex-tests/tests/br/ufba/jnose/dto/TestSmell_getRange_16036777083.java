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

public class TestSmell_getRange_16036777083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959;

    public TestSmell_getRange_16036777083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1045 = new Integer(-1955890973);
        Integer term1047 = new Integer(-2038273078);
        ArrayList term1061 = new ArrayList();
        Class<? extends Object> term1178 = Class.forName((String) "br.ufba.jnose.dto.TestClass$JunitVersion");
        Field term1177 = ((Class) term1178).getDeclaredField((String) "JUnit3");
        ((Field) term1177).setAccessible(true);
        Object enum2 = ((Field) term1177).get((Object) null);
        HashMap term1075 = new HashMap();
        term959 = newInstance(Class.forName("br.ufba.jnose.dto.TestSmell"));
        Object term996 = newInstance(Class.forName("br.ufba.jnose.dto.TestClass"));
        setField(term959, term959.getClass(), "name", "RkybSrpybU");
        setField(term959, term959.getClass(), "method", "xOEqzGAmDU");
        setField(term959, term959.getClass(), "range", "eZFUvlxvGV");
        setField(term996, term996.getClass(), "projectName", "BYqFIqCKAV");
        setField(term996, term996.getClass(), "pathFile", "vrQLuWIDJX");
        setField(term996, term996.getClass(), "name", "flxyYxBRtu");
        setField(term996, term996.getClass(), "fullName", "OclPbYPkcH");
        setField(term996, term996.getClass(), "numberMethods", term1045);
        setField(term996, term996.getClass(), "numberLine", term1047);
        setField(term996, term996.getClass(), "productionFile", "IoAlmYsBwc");
        setField(term996, term996.getClass(), "listTestSmell", term1061);
        setField(term996, term996.getClass(), "junitVersion", enum2);
        setField(term996, term996.getClass(), "lineSumTestSmells", term1075);
        setField(term959, term959.getClass(), "testClass", term996);
        setField(term959, term959.getClass(), "code", "OWDIEULEFu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.dto.TestSmell");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRange", argTypes, term959, args);
    }

};


