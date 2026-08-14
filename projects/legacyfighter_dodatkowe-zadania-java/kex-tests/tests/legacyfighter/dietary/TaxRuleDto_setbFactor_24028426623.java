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
import java.lang.Integer;

public class TaxRuleDto_setbFactor_24028426623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term750;
     Object term758;

    public TaxRuleDto_setbFactor_24028426623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term750 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term750, term750.getClass(), "formattedTaxCode", null);
        setField(term750, term750.getClass(), "id", null);
        setBooleanField(term750, term750.getClass(), "isLinear", false);
        setIntField(term750, term750.getClass(), "aFactor", 0);
        setIntField(term750, term750.getClass(), "bFactor", 0);
        setBooleanField(term750, term750.getClass(), "isSquare", false);
        setIntField(term750, term750.getClass(), "aSquareFactor", 0);
        setIntField(term750, term750.getClass(), "bSquareFactor", 0);
        setIntField(term750, term750.getClass(), "cSquareFactor", 0);
        term758 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term758;
        callMethod(klass, "setbFactor", argTypes, term750, args);
    }

};


