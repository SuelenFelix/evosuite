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
import java.lang.Object;
import java.util.ArrayList;

public class TaxConfig_getTaxRules_159089437615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21426;

    public TaxConfig_getTaxRules_159089437615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21427 = new Long(7899092949241236700L);
        Long term21485 = new Long(3369965039136843143L);
        Long term21496 = new Long(-383809899410674609L);
        Object term21484 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term21495 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term21484, term21484.getClass(), "id", term21485);
        setField(term21484, term21484.getClass(), "taxCode", "");
        setBooleanField(term21484, term21484.getClass(), "isLinear", false);
        setIntField(term21484, term21484.getClass(), "aFactor", 1545314376);
        setIntField(term21484, term21484.getClass(), "bFactor", 437959151);
        setBooleanField(term21484, term21484.getClass(), "isSquare", true);
        setIntField(term21484, term21484.getClass(), "aSquareFactor", 27780241);
        setIntField(term21484, term21484.getClass(), "bSquareFactor", -683868408);
        setIntField(term21484, term21484.getClass(), "cSuqreFactor", -381130069);
        setField(term21495, term21495.getClass(), "id", term21496);
        setField(term21495, term21495.getClass(), "description", null);
        setField(term21495, term21495.getClass(), "countryReason", null);
        setField(term21495, term21495.getClass(), "countryCode", null);
        setField(term21495, term21495.getClass(), "lastModifiedDate", null);
        setField(term21495, term21495.getClass(), "modifiedBy", null);
        setIntField(term21495, term21495.getClass(), "currentRulesCount", 885769749);
        setIntField(term21495, term21495.getClass(), "maxRulesCount", -1021168716);
        setField(term21495, term21495.getClass(), "taxRules", null);
        setField(term21484, term21484.getClass(), "taxConfig", term21495);
        ArrayList term21482 = new ArrayList();
        ((ArrayList) term21482).add(term21484);
        term21426 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term21465 = newInstance(Class.forName("java.time.Instant"));
        setField(term21426, term21426.getClass(), "id", term21427);
        setField(term21426, term21426.getClass(), "description", "jlhonEGrJH");
        setField(term21426, term21426.getClass(), "countryReason", "RKcKwlEYZb");
        setField(term21426, term21426.getClass(), "countryCode", "acPRDlpsid");
        setLongField(term21465, term21465.getClass(), "seconds", 1841230035L);
        setIntField(term21465, term21465.getClass(), "nanos", 815000000);
        setField(term21426, term21426.getClass(), "lastModifiedDate", term21465);
        setField(term21426, term21426.getClass(), "modifiedBy", "YyojIzvxLZ");
        setIntField(term21426, term21426.getClass(), "currentRulesCount", 37757400);
        setIntField(term21426, term21426.getClass(), "maxRulesCount", -1632221612);
        setField(term21426, term21426.getClass(), "taxRules", term21482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaxRules", argTypes, term21426, args);
    }

};


