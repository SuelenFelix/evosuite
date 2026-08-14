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

public class TaxRule_equals_30844959639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33132;

    public TaxRule_equals_30844959639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33132 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term33132, term33132.getClass(), "id", null);
        setField(term33132, term33132.getClass(), "taxCode", null);
        setBooleanField(term33132, term33132.getClass(), "isLinear", false);
        setIntField(term33132, term33132.getClass(), "aFactor", 0);
        setIntField(term33132, term33132.getClass(), "bFactor", 0);
        setBooleanField(term33132, term33132.getClass(), "isSquare", false);
        setIntField(term33132, term33132.getClass(), "aSquareFactor", 0);
        setIntField(term33132, term33132.getClass(), "bSquareFactor", 0);
        setIntField(term33132, term33132.getClass(), "cSuqreFactor", 0);
        setField(term33132, term33132.getClass(), "taxConfig", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term33132, args);
    }

};


