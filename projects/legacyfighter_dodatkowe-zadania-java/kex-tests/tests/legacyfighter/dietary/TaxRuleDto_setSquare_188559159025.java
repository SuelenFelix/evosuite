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
import java.lang.Boolean;

public class TaxRuleDto_setSquare_188559159025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term768;
     Object term776;

    public TaxRuleDto_setSquare_188559159025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term768 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term768, term768.getClass(), "formattedTaxCode", null);
        setField(term768, term768.getClass(), "id", null);
        setBooleanField(term768, term768.getClass(), "isLinear", false);
        setIntField(term768, term768.getClass(), "aFactor", 0);
        setIntField(term768, term768.getClass(), "bFactor", 0);
        setBooleanField(term768, term768.getClass(), "isSquare", false);
        setIntField(term768, term768.getClass(), "aSquareFactor", 0);
        setIntField(term768, term768.getClass(), "bSquareFactor", 0);
        setIntField(term768, term768.getClass(), "cSquareFactor", 0);
        term776 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term776;
        callMethod(klass, "setSquare", argTypes, term768, args);
    }

};


