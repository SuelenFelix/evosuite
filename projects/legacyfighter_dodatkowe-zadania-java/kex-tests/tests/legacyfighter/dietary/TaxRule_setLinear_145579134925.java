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
import java.lang.Boolean;

public class TaxRule_setLinear_145579134925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33006;
     Object term33014;

    public TaxRule_setLinear_145579134925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33006 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term33006, term33006.getClass(), "id", null);
        setField(term33006, term33006.getClass(), "taxCode", null);
        setBooleanField(term33006, term33006.getClass(), "isLinear", false);
        setIntField(term33006, term33006.getClass(), "aFactor", 0);
        setIntField(term33006, term33006.getClass(), "bFactor", 0);
        setBooleanField(term33006, term33006.getClass(), "isSquare", false);
        setIntField(term33006, term33006.getClass(), "aSquareFactor", 0);
        setIntField(term33006, term33006.getClass(), "bSquareFactor", 0);
        setIntField(term33006, term33006.getClass(), "cSuqreFactor", 0);
        setField(term33006, term33006.getClass(), "taxConfig", null);
        term33014 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term33014;
        callMethod(klass, "setLinear", argTypes, term33006, args);
    }

};


