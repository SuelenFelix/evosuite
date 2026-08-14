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

public class TaxRule_isSquare_192497188330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33052;

    public TaxRule_isSquare_192497188330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33052 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term33052, term33052.getClass(), "id", null);
        setField(term33052, term33052.getClass(), "taxCode", null);
        setBooleanField(term33052, term33052.getClass(), "isLinear", false);
        setIntField(term33052, term33052.getClass(), "aFactor", 0);
        setIntField(term33052, term33052.getClass(), "bFactor", 0);
        setBooleanField(term33052, term33052.getClass(), "isSquare", false);
        setIntField(term33052, term33052.getClass(), "aSquareFactor", 0);
        setIntField(term33052, term33052.getClass(), "bSquareFactor", 0);
        setIntField(term33052, term33052.getClass(), "cSuqreFactor", 0);
        setField(term33052, term33052.getClass(), "taxConfig", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSquare", argTypes, term33052, args);
    }

};


