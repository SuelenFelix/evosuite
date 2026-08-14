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

public class TaxRule_setbSquareFactor_207953595214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31799;
     Object term31901;

    public TaxRule_setbSquareFactor_207953595214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31800 = new Long(2371696206810185880L);
        Long term31822 = new Long(-3926033211239834024L);
        Long term31880 = new Long(7585284844822710343L);
        Object term31879 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term31879, term31879.getClass(), "id", term31880);
        setField(term31879, term31879.getClass(), "taxCode", null);
        setBooleanField(term31879, term31879.getClass(), "isLinear", false);
        setIntField(term31879, term31879.getClass(), "aFactor", 619484749);
        setIntField(term31879, term31879.getClass(), "bFactor", 490271003);
        setBooleanField(term31879, term31879.getClass(), "isSquare", false);
        setIntField(term31879, term31879.getClass(), "aSquareFactor", 1541867826);
        setIntField(term31879, term31879.getClass(), "bSquareFactor", -137176190);
        setIntField(term31879, term31879.getClass(), "cSuqreFactor", 348263044);
        setField(term31879, term31879.getClass(), "taxConfig", null);
        Long term31890 = new Long(-4234850307320476025L);
        Object term31889 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term31889, term31889.getClass(), "id", term31890);
        setField(term31889, term31889.getClass(), "taxCode", null);
        setBooleanField(term31889, term31889.getClass(), "isLinear", false);
        setIntField(term31889, term31889.getClass(), "aFactor", 62449386);
        setIntField(term31889, term31889.getClass(), "bFactor", -1488558129);
        setBooleanField(term31889, term31889.getClass(), "isSquare", true);
        setIntField(term31889, term31889.getClass(), "aSquareFactor", -929614389);
        setIntField(term31889, term31889.getClass(), "bSquareFactor", 1585326879);
        setIntField(term31889, term31889.getClass(), "cSuqreFactor", 1161195592);
        setField(term31889, term31889.getClass(), "taxConfig", null);
        ArrayList term31877 = new ArrayList();
        ((ArrayList) term31877).add(term31879);
        ((ArrayList) term31877).add(term31889);
        term31799 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term31821 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term31860 = newInstance(Class.forName("java.time.Instant"));
        setField(term31799, term31799.getClass(), "id", term31800);
        setField(term31799, term31799.getClass(), "taxCode", "yaCGGogKro");
        setBooleanField(term31799, term31799.getClass(), "isLinear", false);
        setIntField(term31799, term31799.getClass(), "aFactor", -2005743628);
        setIntField(term31799, term31799.getClass(), "bFactor", -1204207224);
        setBooleanField(term31799, term31799.getClass(), "isSquare", false);
        setIntField(term31799, term31799.getClass(), "aSquareFactor", -77932500);
        setIntField(term31799, term31799.getClass(), "bSquareFactor", -1558194793);
        setIntField(term31799, term31799.getClass(), "cSuqreFactor", -13354986);
        setField(term31821, term31821.getClass(), "id", term31822);
        setField(term31821, term31821.getClass(), "description", "qxrRUnjshF");
        setField(term31821, term31821.getClass(), "countryReason", "WmVcapKAeJ");
        setField(term31821, term31821.getClass(), "countryCode", "jevOVdQdpc");
        setLongField(term31860, term31860.getClass(), "seconds", 1671432970L);
        setIntField(term31860, term31860.getClass(), "nanos", 86000000);
        setField(term31821, term31821.getClass(), "lastModifiedDate", term31860);
        setField(term31821, term31821.getClass(), "modifiedBy", "TLLVSGTNsz");
        setIntField(term31821, term31821.getClass(), "currentRulesCount", -2134459880);
        setIntField(term31821, term31821.getClass(), "maxRulesCount", -1811405838);
        setField(term31821, term31821.getClass(), "taxRules", term31877);
        setField(term31799, term31799.getClass(), "taxConfig", term31821);
        term31901 = new Integer(1053680722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31901;
        callMethod(klass, "setbSquareFactor", argTypes, term31799, args);
    }

};


