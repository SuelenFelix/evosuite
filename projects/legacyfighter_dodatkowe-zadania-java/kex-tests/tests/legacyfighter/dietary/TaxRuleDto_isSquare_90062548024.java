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

public class TaxRuleDto_isSquare_90062548024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term760;

    public TaxRuleDto_isSquare_90062548024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term760 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term760, term760.getClass(), "formattedTaxCode", null);
        setField(term760, term760.getClass(), "id", null);
        setBooleanField(term760, term760.getClass(), "isLinear", false);
        setIntField(term760, term760.getClass(), "aFactor", 0);
        setIntField(term760, term760.getClass(), "bFactor", 0);
        setBooleanField(term760, term760.getClass(), "isSquare", false);
        setIntField(term760, term760.getClass(), "aSquareFactor", 0);
        setIntField(term760, term760.getClass(), "bSquareFactor", 0);
        setIntField(term760, term760.getClass(), "cSquareFactor", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSquare", argTypes, term760, args);
    }

};


