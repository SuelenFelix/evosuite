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

public class TaxRuleDto_equals_133279599932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term832;

    public TaxRuleDto_equals_133279599932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term832 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term832, term832.getClass(), "formattedTaxCode", null);
        setField(term832, term832.getClass(), "id", null);
        setBooleanField(term832, term832.getClass(), "isLinear", false);
        setIntField(term832, term832.getClass(), "aFactor", 0);
        setIntField(term832, term832.getClass(), "bFactor", 0);
        setBooleanField(term832, term832.getClass(), "isSquare", false);
        setIntField(term832, term832.getClass(), "aSquareFactor", 0);
        setIntField(term832, term832.getClass(), "bSquareFactor", 0);
        setIntField(term832, term832.getClass(), "cSquareFactor", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term832, args);
    }

};


