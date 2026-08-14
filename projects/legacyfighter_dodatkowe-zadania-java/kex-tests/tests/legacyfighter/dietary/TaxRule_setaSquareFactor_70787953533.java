package legacyfighter.dietary;

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
import static legacyfighter.dietary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class TaxRule_setaSquareFactor_70787953533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33078;
     Object term33086;

    public TaxRule_setaSquareFactor_70787953533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33078 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term33078, term33078.getClass(), "id", null);
        setField(term33078, term33078.getClass(), "taxCode", null);
        setBooleanField(term33078, term33078.getClass(), "isLinear", false);
        setIntField(term33078, term33078.getClass(), "aFactor", 0);
        setIntField(term33078, term33078.getClass(), "bFactor", 0);
        setBooleanField(term33078, term33078.getClass(), "isSquare", false);
        setIntField(term33078, term33078.getClass(), "aSquareFactor", 0);
        setIntField(term33078, term33078.getClass(), "bSquareFactor", 0);
        setIntField(term33078, term33078.getClass(), "cSuqreFactor", 0);
        setField(term33078, term33078.getClass(), "taxConfig", null);
        term33086 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term33086;
        callMethod(klass, "setaSquareFactor", argTypes, term33078, args);
    }

};


