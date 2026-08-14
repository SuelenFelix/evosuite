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

public class TaxRuleDto_setaSquareFactor_173222593827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term786;
     Object term794;

    public TaxRuleDto_setaSquareFactor_173222593827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term786 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term786, term786.getClass(), "formattedTaxCode", null);
        setField(term786, term786.getClass(), "id", null);
        setBooleanField(term786, term786.getClass(), "isLinear", false);
        setIntField(term786, term786.getClass(), "aFactor", 0);
        setIntField(term786, term786.getClass(), "bFactor", 0);
        setBooleanField(term786, term786.getClass(), "isSquare", false);
        setIntField(term786, term786.getClass(), "aSquareFactor", 0);
        setIntField(term786, term786.getClass(), "bSquareFactor", 0);
        setIntField(term786, term786.getClass(), "cSquareFactor", 0);
        term794 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term794;
        callMethod(klass, "setaSquareFactor", argTypes, term786, args);
    }

};


