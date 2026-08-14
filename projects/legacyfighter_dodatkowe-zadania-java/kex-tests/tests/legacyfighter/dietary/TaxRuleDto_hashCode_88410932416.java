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
import java.lang.Long;

public class TaxRuleDto_hashCode_88410932416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674;

    public TaxRuleDto_hashCode_88410932416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term687 = new Long(-4502405999831680926L);
        term674 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term674, term674.getClass(), "formattedTaxCode", "GzFkzHGYFt");
        setField(term674, term674.getClass(), "id", term687);
        setBooleanField(term674, term674.getClass(), "isLinear", false);
        setIntField(term674, term674.getClass(), "aFactor", 1861318859);
        setIntField(term674, term674.getClass(), "bFactor", 1474524152);
        setBooleanField(term674, term674.getClass(), "isSquare", true);
        setIntField(term674, term674.getClass(), "aSquareFactor", 568954359);
        setIntField(term674, term674.getClass(), "bSquareFactor", 53410913);
        setIntField(term674, term674.getClass(), "cSquareFactor", -375014958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term674, args);
    }

};


