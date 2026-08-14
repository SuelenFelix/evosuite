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

public class TaxRuleDto_setLinear_43144494619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714;
     Object term722;

    public TaxRuleDto_setLinear_43144494619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term714 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term714, term714.getClass(), "formattedTaxCode", null);
        setField(term714, term714.getClass(), "id", null);
        setBooleanField(term714, term714.getClass(), "isLinear", false);
        setIntField(term714, term714.getClass(), "aFactor", 0);
        setIntField(term714, term714.getClass(), "bFactor", 0);
        setBooleanField(term714, term714.getClass(), "isSquare", false);
        setIntField(term714, term714.getClass(), "aSquareFactor", 0);
        setIntField(term714, term714.getClass(), "bSquareFactor", 0);
        setIntField(term714, term714.getClass(), "cSquareFactor", 0);
        term722 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term722;
        callMethod(klass, "setLinear", argTypes, term714, args);
    }

};


