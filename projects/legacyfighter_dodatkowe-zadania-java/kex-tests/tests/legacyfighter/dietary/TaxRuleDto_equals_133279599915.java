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

public class TaxRuleDto_equals_133279599915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term641;
     Object term663;

    public TaxRuleDto_equals_133279599915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term654 = new Long(-7672528020740371001L);
        term641 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term641, term641.getClass(), "formattedTaxCode", "BndsHwAFMv");
        setField(term641, term641.getClass(), "id", term654);
        setBooleanField(term641, term641.getClass(), "isLinear", true);
        setIntField(term641, term641.getClass(), "aFactor", -1963434938);
        setIntField(term641, term641.getClass(), "bFactor", 906181092);
        setBooleanField(term641, term641.getClass(), "isSquare", true);
        setIntField(term641, term641.getClass(), "aSquareFactor", 1045657203);
        setIntField(term641, term641.getClass(), "bSquareFactor", 1386130016);
        setIntField(term641, term641.getClass(), "cSquareFactor", 1072005683);
        term663 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term663;
        callMethod(klass, "equals", argTypes, term641, args);
    }

};


