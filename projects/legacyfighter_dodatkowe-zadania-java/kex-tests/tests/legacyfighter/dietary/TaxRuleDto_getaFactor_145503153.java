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

public class TaxRuleDto_getaFactor_145503153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245;

    public TaxRuleDto_getaFactor_145503153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term258 = new Long(-5476826692763582090L);
        term245 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term245, term245.getClass(), "formattedTaxCode", "AijpHYOFuy");
        setField(term245, term245.getClass(), "id", term258);
        setBooleanField(term245, term245.getClass(), "isLinear", true);
        setIntField(term245, term245.getClass(), "aFactor", -1786399638);
        setIntField(term245, term245.getClass(), "bFactor", 2055867847);
        setBooleanField(term245, term245.getClass(), "isSquare", false);
        setIntField(term245, term245.getClass(), "aSquareFactor", -1048298087);
        setIntField(term245, term245.getClass(), "bSquareFactor", 292681826);
        setIntField(term245, term245.getClass(), "cSquareFactor", 458147407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getaFactor", argTypes, term245, args);
    }

};


