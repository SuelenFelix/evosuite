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

public class TaxRule_getaFactor_10097960885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30355;

    public TaxRule_getaFactor_10097960885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30356 = new Long(7053349473507426657L);
        Long term30378 = new Long(8761438573959719489L);
        Long term30436 = new Long(-6772311116874630960L);
        Object term30435 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term30435, term30435.getClass(), "id", term30436);
        setField(term30435, term30435.getClass(), "taxCode", null);
        setBooleanField(term30435, term30435.getClass(), "isLinear", true);
        setIntField(term30435, term30435.getClass(), "aFactor", -1924668199);
        setIntField(term30435, term30435.getClass(), "bFactor", 903039854);
        setBooleanField(term30435, term30435.getClass(), "isSquare", false);
        setIntField(term30435, term30435.getClass(), "aSquareFactor", -705528573);
        setIntField(term30435, term30435.getClass(), "bSquareFactor", -480070896);
        setIntField(term30435, term30435.getClass(), "cSuqreFactor", -1811732249);
        setField(term30435, term30435.getClass(), "taxConfig", null);
        Object term30445 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term30445, term30445.getClass(), "id", null);
        setField(term30445, term30445.getClass(), "taxCode", null);
        setBooleanField(term30445, term30445.getClass(), "isLinear", false);
        setIntField(term30445, term30445.getClass(), "aFactor", 0);
        setIntField(term30445, term30445.getClass(), "bFactor", 0);
        setBooleanField(term30445, term30445.getClass(), "isSquare", false);
        setIntField(term30445, term30445.getClass(), "aSquareFactor", 0);
        setIntField(term30445, term30445.getClass(), "bSquareFactor", 0);
        setIntField(term30445, term30445.getClass(), "cSuqreFactor", 0);
        setField(term30445, term30445.getClass(), "taxConfig", null);
        ArrayList term30433 = new ArrayList();
        ((ArrayList) term30433).add(term30435);
        ((ArrayList) term30433).add(term30445);
        term30355 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term30377 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term30416 = newInstance(Class.forName("java.time.Instant"));
        setField(term30355, term30355.getClass(), "id", term30356);
        setField(term30355, term30355.getClass(), "taxCode", "fSLHLeuNoa");
        setBooleanField(term30355, term30355.getClass(), "isLinear", true);
        setIntField(term30355, term30355.getClass(), "aFactor", -1577886337);
        setIntField(term30355, term30355.getClass(), "bFactor", -481394578);
        setBooleanField(term30355, term30355.getClass(), "isSquare", true);
        setIntField(term30355, term30355.getClass(), "aSquareFactor", 1440683242);
        setIntField(term30355, term30355.getClass(), "bSquareFactor", -1746192055);
        setIntField(term30355, term30355.getClass(), "cSuqreFactor", -996911099);
        setField(term30377, term30377.getClass(), "id", term30378);
        setField(term30377, term30377.getClass(), "description", "IwgPFurObw");
        setField(term30377, term30377.getClass(), "countryReason", "WLaHlrYQyz");
        setField(term30377, term30377.getClass(), "countryCode", "CaeIUTuUFo");
        setLongField(term30416, term30416.getClass(), "seconds", 1661785330L);
        setIntField(term30416, term30416.getClass(), "nanos", 901000000);
        setField(term30377, term30377.getClass(), "lastModifiedDate", term30416);
        setField(term30377, term30377.getClass(), "modifiedBy", "rzoDGjHkzG");
        setIntField(term30377, term30377.getClass(), "currentRulesCount", -610865659);
        setIntField(term30377, term30377.getClass(), "maxRulesCount", 2044119255);
        setField(term30377, term30377.getClass(), "taxRules", term30433);
        setField(term30355, term30355.getClass(), "taxConfig", term30377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getaFactor", argTypes, term30355, args);
    }

};


