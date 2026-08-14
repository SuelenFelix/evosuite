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

public class TaxRuleDto_setbFactor_2402842666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343;
     Object term365;

    public TaxRuleDto_setbFactor_2402842666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term356 = new Long(5127676408959197577L);
        term343 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term343, term343.getClass(), "formattedTaxCode", "Ghbwtircqb");
        setField(term343, term343.getClass(), "id", term356);
        setBooleanField(term343, term343.getClass(), "isLinear", true);
        setIntField(term343, term343.getClass(), "aFactor", -112921587);
        setIntField(term343, term343.getClass(), "bFactor", 933028652);
        setBooleanField(term343, term343.getClass(), "isSquare", true);
        setIntField(term343, term343.getClass(), "aSquareFactor", 287287233);
        setIntField(term343, term343.getClass(), "bSquareFactor", 962840079);
        setIntField(term343, term343.getClass(), "cSquareFactor", 1540719661);
        term365 = new Integer(1265463001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term365;
        callMethod(klass, "setbFactor", argTypes, term343, args);
    }

};


