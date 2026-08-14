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

public class TaxRuleDto_getbFactor_179290414822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term742;

    public TaxRuleDto_getbFactor_179290414822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term742 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term742, term742.getClass(), "formattedTaxCode", null);
        setField(term742, term742.getClass(), "id", null);
        setBooleanField(term742, term742.getClass(), "isLinear", false);
        setIntField(term742, term742.getClass(), "aFactor", 0);
        setIntField(term742, term742.getClass(), "bFactor", 0);
        setBooleanField(term742, term742.getClass(), "isSquare", false);
        setIntField(term742, term742.getClass(), "aSquareFactor", 0);
        setIntField(term742, term742.getClass(), "bSquareFactor", 0);
        setIntField(term742, term742.getClass(), "cSquareFactor", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getbFactor", argTypes, term742, args);
    }

};


