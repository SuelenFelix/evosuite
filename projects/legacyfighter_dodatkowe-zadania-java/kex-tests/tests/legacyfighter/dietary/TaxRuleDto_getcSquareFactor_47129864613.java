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

public class TaxRuleDto_getcSquareFactor_47129864613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term575;

    public TaxRuleDto_getcSquareFactor_47129864613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term588 = new Long(2486810210675247493L);
        term575 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term575, term575.getClass(), "formattedTaxCode", "gGSMzuGICf");
        setField(term575, term575.getClass(), "id", term588);
        setBooleanField(term575, term575.getClass(), "isLinear", true);
        setIntField(term575, term575.getClass(), "aFactor", -663691365);
        setIntField(term575, term575.getClass(), "bFactor", 339854490);
        setBooleanField(term575, term575.getClass(), "isSquare", false);
        setIntField(term575, term575.getClass(), "aSquareFactor", -615654495);
        setIntField(term575, term575.getClass(), "bSquareFactor", -1476117762);
        setIntField(term575, term575.getClass(), "cSquareFactor", -341962980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getcSquareFactor", argTypes, term575, args);
    }

};


