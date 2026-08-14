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

public class TaxRule_isLinear_5295887724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32998;

    public TaxRule_isLinear_5295887724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32998 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term32998, term32998.getClass(), "id", null);
        setField(term32998, term32998.getClass(), "taxCode", null);
        setBooleanField(term32998, term32998.getClass(), "isLinear", false);
        setIntField(term32998, term32998.getClass(), "aFactor", 0);
        setIntField(term32998, term32998.getClass(), "bFactor", 0);
        setBooleanField(term32998, term32998.getClass(), "isSquare", false);
        setIntField(term32998, term32998.getClass(), "aSquareFactor", 0);
        setIntField(term32998, term32998.getClass(), "bSquareFactor", 0);
        setIntField(term32998, term32998.getClass(), "cSuqreFactor", 0);
        setField(term32998, term32998.getClass(), "taxConfig", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLinear", argTypes, term32998, args);
    }

};


