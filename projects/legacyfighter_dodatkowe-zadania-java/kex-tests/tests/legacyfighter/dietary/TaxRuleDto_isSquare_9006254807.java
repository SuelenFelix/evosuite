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

public class TaxRuleDto_isSquare_9006254807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377;

    public TaxRuleDto_isSquare_9006254807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term390 = new Long(-6573104506744284592L);
        term377 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term377, term377.getClass(), "formattedTaxCode", "xrwlQZdwCp");
        setField(term377, term377.getClass(), "id", term390);
        setBooleanField(term377, term377.getClass(), "isLinear", false);
        setIntField(term377, term377.getClass(), "aFactor", 335112684);
        setIntField(term377, term377.getClass(), "bFactor", 1551099402);
        setBooleanField(term377, term377.getClass(), "isSquare", false);
        setIntField(term377, term377.getClass(), "aSquareFactor", -2027534003);
        setIntField(term377, term377.getClass(), "bSquareFactor", 1063420942);
        setIntField(term377, term377.getClass(), "cSquareFactor", 1375330971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSquare", argTypes, term377, args);
    }

};


