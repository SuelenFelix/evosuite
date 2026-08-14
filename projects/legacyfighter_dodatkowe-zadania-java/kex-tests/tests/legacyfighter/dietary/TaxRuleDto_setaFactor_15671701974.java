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
import java.lang.Integer;

public class TaxRuleDto_setaFactor_15671701974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;
     Object term299;

    public TaxRuleDto_setaFactor_15671701974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term290 = new Long(-872011222785455006L);
        term277 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term277, term277.getClass(), "formattedTaxCode", "SbAoxhfrkn");
        setField(term277, term277.getClass(), "id", term290);
        setBooleanField(term277, term277.getClass(), "isLinear", false);
        setIntField(term277, term277.getClass(), "aFactor", -184153539);
        setIntField(term277, term277.getClass(), "bFactor", 493620644);
        setBooleanField(term277, term277.getClass(), "isSquare", true);
        setIntField(term277, term277.getClass(), "aSquareFactor", 1328271830);
        setIntField(term277, term277.getClass(), "bSquareFactor", 1596070772);
        setIntField(term277, term277.getClass(), "cSquareFactor", 97029295);
        term299 = new Integer(-1371869594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term299;
        callMethod(klass, "setaFactor", argTypes, term277, args);
    }

};


