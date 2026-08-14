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
import java.lang.Boolean;

public class TaxRule_setLinear_14557913494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30211;
     Object term30303;

    public TaxRule_setLinear_14557913494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30212 = new Long(8116689826697820264L);
        Long term30234 = new Long(6594952836231202437L);
        Long term30292 = new Long(-6888944543104457634L);
        Object term30291 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term30291, term30291.getClass(), "id", term30292);
        setField(term30291, term30291.getClass(), "taxCode", null);
        setBooleanField(term30291, term30291.getClass(), "isLinear", true);
        setIntField(term30291, term30291.getClass(), "aFactor", -1455026066);
        setIntField(term30291, term30291.getClass(), "bFactor", -169160528);
        setBooleanField(term30291, term30291.getClass(), "isSquare", true);
        setIntField(term30291, term30291.getClass(), "aSquareFactor", 951748736);
        setIntField(term30291, term30291.getClass(), "bSquareFactor", 787260842);
        setIntField(term30291, term30291.getClass(), "cSuqreFactor", -137516512);
        setField(term30291, term30291.getClass(), "taxConfig", null);
        ArrayList term30289 = new ArrayList();
        ((ArrayList) term30289).add(term30291);
        term30211 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term30233 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term30272 = newInstance(Class.forName("java.time.Instant"));
        setField(term30211, term30211.getClass(), "id", term30212);
        setField(term30211, term30211.getClass(), "taxCode", "rgniLaOaiz");
        setBooleanField(term30211, term30211.getClass(), "isLinear", true);
        setIntField(term30211, term30211.getClass(), "aFactor", 466007219);
        setIntField(term30211, term30211.getClass(), "bFactor", -2142979104);
        setBooleanField(term30211, term30211.getClass(), "isSquare", false);
        setIntField(term30211, term30211.getClass(), "aSquareFactor", -1983330479);
        setIntField(term30211, term30211.getClass(), "bSquareFactor", 1929952462);
        setIntField(term30211, term30211.getClass(), "cSuqreFactor", 701114540);
        setField(term30233, term30233.getClass(), "id", term30234);
        setField(term30233, term30233.getClass(), "description", "fzQzzdIOMC");
        setField(term30233, term30233.getClass(), "countryReason", "hLVDOhfCKX");
        setField(term30233, term30233.getClass(), "countryCode", "yXLTfzOgfX");
        setLongField(term30272, term30272.getClass(), "seconds", 1796695552L);
        setIntField(term30272, term30272.getClass(), "nanos", 255000000);
        setField(term30233, term30233.getClass(), "lastModifiedDate", term30272);
        setField(term30233, term30233.getClass(), "modifiedBy", "MANlfBKTPY");
        setIntField(term30233, term30233.getClass(), "currentRulesCount", -1284079635);
        setIntField(term30233, term30233.getClass(), "maxRulesCount", -2130090775);
        setField(term30233, term30233.getClass(), "taxRules", term30289);
        setField(term30211, term30211.getClass(), "taxConfig", term30233);
        term30303 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term30303;
        callMethod(klass, "setLinear", argTypes, term30211, args);
    }

};


