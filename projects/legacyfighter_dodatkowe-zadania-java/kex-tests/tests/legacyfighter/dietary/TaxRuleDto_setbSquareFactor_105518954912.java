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

public class TaxRuleDto_setbSquareFactor_105518954912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541;
     Object term563;

    public TaxRuleDto_setbSquareFactor_105518954912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term554 = new Long(-4365849114644724155L);
        term541 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term541, term541.getClass(), "formattedTaxCode", "UlajhuVLaP");
        setField(term541, term541.getClass(), "id", term554);
        setBooleanField(term541, term541.getClass(), "isLinear", true);
        setIntField(term541, term541.getClass(), "aFactor", -1347665717);
        setIntField(term541, term541.getClass(), "bFactor", -1888585309);
        setBooleanField(term541, term541.getClass(), "isSquare", true);
        setIntField(term541, term541.getClass(), "aSquareFactor", 683666002);
        setIntField(term541, term541.getClass(), "bSquareFactor", 1596213415);
        setIntField(term541, term541.getClass(), "cSquareFactor", -268815336);
        term563 = new Integer(-1210583429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term563;
        callMethod(klass, "setbSquareFactor", argTypes, term541, args);
    }

};


