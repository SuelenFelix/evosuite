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

public class TaxRuleDto_getaSquareFactor_8085650329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443;

    public TaxRuleDto_getaSquareFactor_8085650329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term456 = new Long(8428634514691209827L);
        term443 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term443, term443.getClass(), "formattedTaxCode", "nyiiPDVjAc");
        setField(term443, term443.getClass(), "id", term456);
        setBooleanField(term443, term443.getClass(), "isLinear", true);
        setIntField(term443, term443.getClass(), "aFactor", -1465035361);
        setIntField(term443, term443.getClass(), "bFactor", 1090617576);
        setBooleanField(term443, term443.getClass(), "isSquare", true);
        setIntField(term443, term443.getClass(), "aSquareFactor", -1547384488);
        setIntField(term443, term443.getClass(), "bSquareFactor", 1442160736);
        setIntField(term443, term443.getClass(), "cSquareFactor", 1114000454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getaSquareFactor", argTypes, term443, args);
    }

};


