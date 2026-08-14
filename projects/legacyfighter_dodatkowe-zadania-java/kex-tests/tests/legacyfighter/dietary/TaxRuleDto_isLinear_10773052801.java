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

public class TaxRuleDto_isLinear_10773052801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;

    public TaxRuleDto_isLinear_10773052801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term192 = new Long(-4325723315152823407L);
        term179 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term179, term179.getClass(), "formattedTaxCode", "OWDIEULEFu");
        setField(term179, term179.getClass(), "id", term192);
        setBooleanField(term179, term179.getClass(), "isLinear", false);
        setIntField(term179, term179.getClass(), "aFactor", -602026508);
        setIntField(term179, term179.getClass(), "bFactor", -157887805);
        setBooleanField(term179, term179.getClass(), "isSquare", true);
        setIntField(term179, term179.getClass(), "aSquareFactor", 1876565163);
        setIntField(term179, term179.getClass(), "bSquareFactor", -817164822);
        setIntField(term179, term179.getClass(), "cSquareFactor", -1016503459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isLinear", argTypes, term179, args);
    }

};


