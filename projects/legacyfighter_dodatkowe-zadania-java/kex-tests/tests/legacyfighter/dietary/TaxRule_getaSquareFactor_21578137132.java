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

public class TaxRule_getaSquareFactor_21578137132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33070;

    public TaxRule_getaSquareFactor_21578137132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33070 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term33070, term33070.getClass(), "id", null);
        setField(term33070, term33070.getClass(), "taxCode", null);
        setBooleanField(term33070, term33070.getClass(), "isLinear", false);
        setIntField(term33070, term33070.getClass(), "aFactor", 0);
        setIntField(term33070, term33070.getClass(), "bFactor", 0);
        setBooleanField(term33070, term33070.getClass(), "isSquare", false);
        setIntField(term33070, term33070.getClass(), "aSquareFactor", 0);
        setIntField(term33070, term33070.getClass(), "bSquareFactor", 0);
        setIntField(term33070, term33070.getClass(), "cSuqreFactor", 0);
        setField(term33070, term33070.getClass(), "taxConfig", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getaSquareFactor", argTypes, term33070, args);
    }

};


