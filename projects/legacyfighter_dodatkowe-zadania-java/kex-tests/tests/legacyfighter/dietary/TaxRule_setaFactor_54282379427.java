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

public class TaxRule_setaFactor_54282379427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33024;
     Object term33032;

    public TaxRule_setaFactor_54282379427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33024 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term33024, term33024.getClass(), "id", null);
        setField(term33024, term33024.getClass(), "taxCode", null);
        setBooleanField(term33024, term33024.getClass(), "isLinear", false);
        setIntField(term33024, term33024.getClass(), "aFactor", 0);
        setIntField(term33024, term33024.getClass(), "bFactor", 0);
        setBooleanField(term33024, term33024.getClass(), "isSquare", false);
        setIntField(term33024, term33024.getClass(), "aSquareFactor", 0);
        setIntField(term33024, term33024.getClass(), "bSquareFactor", 0);
        setIntField(term33024, term33024.getClass(), "cSuqreFactor", 0);
        setField(term33024, term33024.getClass(), "taxConfig", null);
        term33032 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term33032;
        callMethod(klass, "setaFactor", argTypes, term33024, args);
    }

};


