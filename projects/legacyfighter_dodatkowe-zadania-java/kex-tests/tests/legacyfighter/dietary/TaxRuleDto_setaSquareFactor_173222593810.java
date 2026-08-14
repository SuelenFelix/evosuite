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

public class TaxRuleDto_setaSquareFactor_173222593810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475;
     Object term497;

    public TaxRuleDto_setaSquareFactor_173222593810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term488 = new Long(-2585684163342970173L);
        term475 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term475, term475.getClass(), "formattedTaxCode", "aKnKipADSo");
        setField(term475, term475.getClass(), "id", term488);
        setBooleanField(term475, term475.getClass(), "isLinear", true);
        setIntField(term475, term475.getClass(), "aFactor", -556405712);
        setIntField(term475, term475.getClass(), "bFactor", -1772434990);
        setBooleanField(term475, term475.getClass(), "isSquare", true);
        setIntField(term475, term475.getClass(), "aSquareFactor", -1845499264);
        setIntField(term475, term475.getClass(), "bSquareFactor", -505439934);
        setIntField(term475, term475.getClass(), "cSquareFactor", -344842608);
        term497 = new Integer(941650513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term497;
        callMethod(klass, "setaSquareFactor", argTypes, term475, args);
    }

};


