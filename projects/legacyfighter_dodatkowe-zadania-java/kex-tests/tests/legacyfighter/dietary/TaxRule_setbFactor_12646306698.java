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
import java.lang.Integer;

public class TaxRule_setbFactor_12646306698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30833;
     Object term30943;

    public TaxRule_setbFactor_12646306698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30834 = new Long(-5615015000728170842L);
        Long term30856 = new Long(-8165230786269861125L);
        Long term30914 = new Long(7818214521807331044L);
        Object term30913 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term30913, term30913.getClass(), "id", term30914);
        setField(term30913, term30913.getClass(), "taxCode", null);
        setBooleanField(term30913, term30913.getClass(), "isLinear", false);
        setIntField(term30913, term30913.getClass(), "aFactor", -232601868);
        setIntField(term30913, term30913.getClass(), "bFactor", -1743056588);
        setBooleanField(term30913, term30913.getClass(), "isSquare", true);
        setIntField(term30913, term30913.getClass(), "aSquareFactor", 576646846);
        setIntField(term30913, term30913.getClass(), "bSquareFactor", 916507296);
        setIntField(term30913, term30913.getClass(), "cSuqreFactor", 1307887729);
        setField(term30913, term30913.getClass(), "taxConfig", null);
        Long term30924 = new Long(-2143540634259970953L);
        Object term30923 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term30923, term30923.getClass(), "id", term30924);
        setField(term30923, term30923.getClass(), "taxCode", null);
        setBooleanField(term30923, term30923.getClass(), "isLinear", false);
        setIntField(term30923, term30923.getClass(), "aFactor", -1373407191);
        setIntField(term30923, term30923.getClass(), "bFactor", 1013516042);
        setBooleanField(term30923, term30923.getClass(), "isSquare", false);
        setIntField(term30923, term30923.getClass(), "aSquareFactor", 284652039);
        setIntField(term30923, term30923.getClass(), "bSquareFactor", 1163350537);
        setIntField(term30923, term30923.getClass(), "cSuqreFactor", -855026181);
        setField(term30923, term30923.getClass(), "taxConfig", null);
        Object term30933 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term30933, term30933.getClass(), "id", null);
        setField(term30933, term30933.getClass(), "taxCode", null);
        setBooleanField(term30933, term30933.getClass(), "isLinear", false);
        setIntField(term30933, term30933.getClass(), "aFactor", 0);
        setIntField(term30933, term30933.getClass(), "bFactor", 0);
        setBooleanField(term30933, term30933.getClass(), "isSquare", false);
        setIntField(term30933, term30933.getClass(), "aSquareFactor", 0);
        setIntField(term30933, term30933.getClass(), "bSquareFactor", 0);
        setIntField(term30933, term30933.getClass(), "cSuqreFactor", 0);
        setField(term30933, term30933.getClass(), "taxConfig", null);
        ArrayList term30911 = new ArrayList();
        ((ArrayList) term30911).add(term30913);
        ((ArrayList) term30911).add(term30923);
        ((ArrayList) term30911).add(term30933);
        term30833 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term30855 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term30894 = newInstance(Class.forName("java.time.Instant"));
        setField(term30833, term30833.getClass(), "id", term30834);
        setField(term30833, term30833.getClass(), "taxCode", "BRMTHqqoRg");
        setBooleanField(term30833, term30833.getClass(), "isLinear", true);
        setIntField(term30833, term30833.getClass(), "aFactor", -918570985);
        setIntField(term30833, term30833.getClass(), "bFactor", 242181753);
        setBooleanField(term30833, term30833.getClass(), "isSquare", true);
        setIntField(term30833, term30833.getClass(), "aSquareFactor", -1356117545);
        setIntField(term30833, term30833.getClass(), "bSquareFactor", -1539896141);
        setIntField(term30833, term30833.getClass(), "cSuqreFactor", 798480099);
        setField(term30855, term30855.getClass(), "id", term30856);
        setField(term30855, term30855.getClass(), "description", "nOElYZBeyU");
        setField(term30855, term30855.getClass(), "countryReason", "eUXPtGmoNg");
        setField(term30855, term30855.getClass(), "countryCode", "ZjqXyUmAJY");
        setLongField(term30894, term30894.getClass(), "seconds", 1851602444L);
        setIntField(term30894, term30894.getClass(), "nanos", 260000000);
        setField(term30855, term30855.getClass(), "lastModifiedDate", term30894);
        setField(term30855, term30855.getClass(), "modifiedBy", "pjEERkBbYo");
        setIntField(term30855, term30855.getClass(), "currentRulesCount", -1624038595);
        setIntField(term30855, term30855.getClass(), "maxRulesCount", 1593619323);
        setField(term30855, term30855.getClass(), "taxRules", term30911);
        setField(term30833, term30833.getClass(), "taxConfig", term30855);
        term30943 = new Integer(-287005602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30943;
        callMethod(klass, "setbFactor", argTypes, term30833, args);
    }

};


