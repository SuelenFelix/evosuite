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

public class TaxRule_setbSquareFactor_207953595235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33096;
     Object term33104;

    public TaxRule_setbSquareFactor_207953595235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33096 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term33096, term33096.getClass(), "id", null);
        setField(term33096, term33096.getClass(), "taxCode", null);
        setBooleanField(term33096, term33096.getClass(), "isLinear", false);
        setIntField(term33096, term33096.getClass(), "aFactor", 0);
        setIntField(term33096, term33096.getClass(), "bFactor", 0);
        setBooleanField(term33096, term33096.getClass(), "isSquare", false);
        setIntField(term33096, term33096.getClass(), "aSquareFactor", 0);
        setIntField(term33096, term33096.getClass(), "bSquareFactor", 0);
        setIntField(term33096, term33096.getClass(), "cSuqreFactor", 0);
        setField(term33096, term33096.getClass(), "taxConfig", null);
        term33104 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term33104;
        callMethod(klass, "setbSquareFactor", argTypes, term33096, args);
    }

};


