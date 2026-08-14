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
import java.lang.Boolean;

public class TaxRuleDto_setLinear_4314449462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211;
     Object term233;

    public TaxRuleDto_setLinear_4314449462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term224 = new Long(2535595959091595249L);
        term211 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term211, term211.getClass(), "formattedTaxCode", "dWRymuLBtr");
        setField(term211, term211.getClass(), "id", term224);
        setBooleanField(term211, term211.getClass(), "isLinear", false);
        setIntField(term211, term211.getClass(), "aFactor", -1968847291);
        setIntField(term211, term211.getClass(), "bFactor", 579005622);
        setBooleanField(term211, term211.getClass(), "isSquare", false);
        setIntField(term211, term211.getClass(), "aSquareFactor", -14890619);
        setIntField(term211, term211.getClass(), "bSquareFactor", 1632125673);
        setIntField(term211, term211.getClass(), "cSquareFactor", 454281060);
        term233 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term233;
        callMethod(klass, "setLinear", argTypes, term211, args);
    }

};


