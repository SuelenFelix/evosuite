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

public class TaxRuleDto_setSquare_18855915908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;
     Object term431;

    public TaxRuleDto_setSquare_18855915908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term422 = new Long(-4920224193275732920L);
        term409 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term409, term409.getClass(), "formattedTaxCode", "IDCWpPLRkE");
        setField(term409, term409.getClass(), "id", term422);
        setBooleanField(term409, term409.getClass(), "isLinear", false);
        setIntField(term409, term409.getClass(), "aFactor", -478195677);
        setIntField(term409, term409.getClass(), "bFactor", 972867650);
        setBooleanField(term409, term409.getClass(), "isSquare", true);
        setIntField(term409, term409.getClass(), "aSquareFactor", 1655935355);
        setIntField(term409, term409.getClass(), "bSquareFactor", -481533957);
        setIntField(term409, term409.getClass(), "cSquareFactor", 1240914516);
        term431 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term431;
        callMethod(klass, "setSquare", argTypes, term409, args);
    }

};


