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

public class TaxRuleDto_getaFactor_1455031520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term724;

    public TaxRuleDto_getaFactor_1455031520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term724 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term724, term724.getClass(), "formattedTaxCode", null);
        setField(term724, term724.getClass(), "id", null);
        setBooleanField(term724, term724.getClass(), "isLinear", false);
        setIntField(term724, term724.getClass(), "aFactor", 0);
        setIntField(term724, term724.getClass(), "bFactor", 0);
        setBooleanField(term724, term724.getClass(), "isSquare", false);
        setIntField(term724, term724.getClass(), "aSquareFactor", 0);
        setIntField(term724, term724.getClass(), "bSquareFactor", 0);
        setIntField(term724, term724.getClass(), "cSquareFactor", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getaFactor", argTypes, term724, args);
    }

};


