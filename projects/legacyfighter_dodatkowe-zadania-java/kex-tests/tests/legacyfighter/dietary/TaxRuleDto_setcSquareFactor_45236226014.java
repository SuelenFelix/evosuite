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

public class TaxRuleDto_setcSquareFactor_45236226014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term607;
     Object term629;

    public TaxRuleDto_setcSquareFactor_45236226014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term620 = new Long(7009926388951271268L);
        term607 = newInstance(Class.forName("legacyfighter.dietary.TaxRuleDto"));
        setField(term607, term607.getClass(), "formattedTaxCode", "hxCBltsObl");
        setField(term607, term607.getClass(), "id", term620);
        setBooleanField(term607, term607.getClass(), "isLinear", false);
        setIntField(term607, term607.getClass(), "aFactor", 1532716628);
        setIntField(term607, term607.getClass(), "bFactor", -1801760683);
        setBooleanField(term607, term607.getClass(), "isSquare", false);
        setIntField(term607, term607.getClass(), "aSquareFactor", 1141317871);
        setIntField(term607, term607.getClass(), "bSquareFactor", 890669485);
        setIntField(term607, term607.getClass(), "cSquareFactor", 691577392);
        term629 = new Integer(-893623680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term629;
        callMethod(klass, "setcSquareFactor", argTypes, term607, args);
    }

};


