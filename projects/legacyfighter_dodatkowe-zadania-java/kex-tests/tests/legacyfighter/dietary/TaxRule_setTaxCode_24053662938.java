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

public class TaxRule_setTaxCode_24053662938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33124;

    public TaxRule_setTaxCode_24053662938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33124 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term33124, term33124.getClass(), "id", null);
        setField(term33124, term33124.getClass(), "taxCode", null);
        setBooleanField(term33124, term33124.getClass(), "isLinear", false);
        setIntField(term33124, term33124.getClass(), "aFactor", 0);
        setIntField(term33124, term33124.getClass(), "bFactor", 0);
        setBooleanField(term33124, term33124.getClass(), "isSquare", false);
        setIntField(term33124, term33124.getClass(), "aSquareFactor", 0);
        setIntField(term33124, term33124.getClass(), "bSquareFactor", 0);
        setIntField(term33124, term33124.getClass(), "cSuqreFactor", 0);
        setField(term33124, term33124.getClass(), "taxConfig", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTaxCode", argTypes, term33124, args);
    }

};


