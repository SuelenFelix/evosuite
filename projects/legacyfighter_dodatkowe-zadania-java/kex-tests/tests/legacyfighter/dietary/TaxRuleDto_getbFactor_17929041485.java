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

public class TaxRuleDto_getbFactor_17929041485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311;

    public TaxRuleDto_getbFactor_17929041485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term324 = new Long(-316468845751588286L);
        term311 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term311, term311.getClass(), "formattedTaxCode", "kuTXqwMtDB");
        setField(term311, term311.getClass(), "id", term324);
        setBooleanField(term311, term311.getClass(), "isLinear", true);
        setIntField(term311, term311.getClass(), "aFactor", -2095575670);
        setIntField(term311, term311.getClass(), "bFactor", 1225272962);
        setBooleanField(term311, term311.getClass(), "isSquare", true);
        setIntField(term311, term311.getClass(), "aSquareFactor", 1324040357);
        setIntField(term311, term311.getClass(), "bSquareFactor", -1588772968);
        setIntField(term311, term311.getClass(), "cSquareFactor", -93135961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getbFactor", argTypes, term311, args);
    }

};


