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

public class TaxRule_setTaxConfig_3213999442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29729;
     Object term29811;

    public TaxRule_setTaxConfig_3213999442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29730 = new Long(-5802364286448544947L);
        Long term29752 = new Long(7633060281229939158L);
        ArrayList term29807 = new ArrayList();
        term29729 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term29751 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term29790 = newInstance(Class.forName("java.time.Instant"));
        setField(term29729, term29729.getClass(), "id", term29730);
        setField(term29729, term29729.getClass(), "taxCode", "bqIuFFFwnP");
        setBooleanField(term29729, term29729.getClass(), "isLinear", true);
        setIntField(term29729, term29729.getClass(), "aFactor", 373110517);
        setIntField(term29729, term29729.getClass(), "bFactor", -1632703926);
        setBooleanField(term29729, term29729.getClass(), "isSquare", true);
        setIntField(term29729, term29729.getClass(), "aSquareFactor", -1031499401);
        setIntField(term29729, term29729.getClass(), "bSquareFactor", 280202002);
        setIntField(term29729, term29729.getClass(), "cSuqreFactor", -1074402599);
        setField(term29751, term29751.getClass(), "id", term29752);
        setField(term29751, term29751.getClass(), "description", "hDxvvVgGlk");
        setField(term29751, term29751.getClass(), "countryReason", "XdjSvjaTqk");
        setField(term29751, term29751.getClass(), "countryCode", "ukrlYVcvsg");
        setLongField(term29790, term29790.getClass(), "seconds", 1572369705L);
        setIntField(term29790, term29790.getClass(), "nanos", 867000000);
        setField(term29751, term29751.getClass(), "lastModifiedDate", term29790);
        setField(term29751, term29751.getClass(), "modifiedBy", "cpjqTCNflQ");
        setIntField(term29751, term29751.getClass(), "currentRulesCount", -1867539151);
        setIntField(term29751, term29751.getClass(), "maxRulesCount", -816430246);
        setField(term29751, term29751.getClass(), "taxRules", term29807);
        setField(term29729, term29729.getClass(), "taxConfig", term29751);
        Long term29812 = new Long(4171742078739516731L);
        Long term29870 = new Long(4391974157316283404L);
        Long term29881 = new Long(-8447404910321380142L);
        Object term29869 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term29880 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term29869, term29869.getClass(), "id", term29870);
        setField(term29869, term29869.getClass(), "taxCode", "");
        setBooleanField(term29869, term29869.getClass(), "isLinear", false);
        setIntField(term29869, term29869.getClass(), "aFactor", -949634053);
        setIntField(term29869, term29869.getClass(), "bFactor", 1495471055);
        setBooleanField(term29869, term29869.getClass(), "isSquare", true);
        setIntField(term29869, term29869.getClass(), "aSquareFactor", -583415628);
        setIntField(term29869, term29869.getClass(), "bSquareFactor", -1488660931);
        setIntField(term29869, term29869.getClass(), "cSuqreFactor", 1899095931);
        setField(term29880, term29880.getClass(), "id", term29881);
        setField(term29880, term29880.getClass(), "description", null);
        setField(term29880, term29880.getClass(), "countryReason", null);
        setField(term29880, term29880.getClass(), "countryCode", null);
        setField(term29880, term29880.getClass(), "lastModifiedDate", null);
        setField(term29880, term29880.getClass(), "modifiedBy", null);
        setIntField(term29880, term29880.getClass(), "currentRulesCount", 145571200);
        setIntField(term29880, term29880.getClass(), "maxRulesCount", -81919234);
        setField(term29880, term29880.getClass(), "taxRules", null);
        setField(term29869, term29869.getClass(), "taxConfig", term29880);
        Long term29886 = new Long(2505442540861032970L);
        Object term29885 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term29896 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term29885, term29885.getClass(), "id", term29886);
        setField(term29885, term29885.getClass(), "taxCode", "");
        setBooleanField(term29885, term29885.getClass(), "isLinear", false);
        setIntField(term29885, term29885.getClass(), "aFactor", 1545425140);
        setIntField(term29885, term29885.getClass(), "bFactor", -1580765555);
        setBooleanField(term29885, term29885.getClass(), "isSquare", true);
        setIntField(term29885, term29885.getClass(), "aSquareFactor", -1295149055);
        setIntField(term29885, term29885.getClass(), "bSquareFactor", -769814321);
        setIntField(term29885, term29885.getClass(), "cSuqreFactor", 114898432);
        setField(term29896, term29896.getClass(), "id", null);
        setField(term29896, term29896.getClass(), "description", null);
        setField(term29896, term29896.getClass(), "countryReason", null);
        setField(term29896, term29896.getClass(), "countryCode", null);
        setField(term29896, term29896.getClass(), "lastModifiedDate", null);
        setField(term29896, term29896.getClass(), "modifiedBy", null);
        setIntField(term29896, term29896.getClass(), "currentRulesCount", 0);
        setIntField(term29896, term29896.getClass(), "maxRulesCount", 0);
        setField(term29896, term29896.getClass(), "taxRules", null);
        setField(term29885, term29885.getClass(), "taxConfig", term29896);
        Long term29900 = new Long(3415544654174435087L);
        Long term29911 = new Long(-6444648462294378605L);
        Object term29899 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term29910 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term29899, term29899.getClass(), "id", term29900);
        setField(term29899, term29899.getClass(), "taxCode", "");
        setBooleanField(term29899, term29899.getClass(), "isLinear", true);
        setIntField(term29899, term29899.getClass(), "aFactor", 41779745);
        setIntField(term29899, term29899.getClass(), "bFactor", 908188015);
        setBooleanField(term29899, term29899.getClass(), "isSquare", true);
        setIntField(term29899, term29899.getClass(), "aSquareFactor", 1448289766);
        setIntField(term29899, term29899.getClass(), "bSquareFactor", 1377148923);
        setIntField(term29899, term29899.getClass(), "cSuqreFactor", 540775467);
        setField(term29910, term29910.getClass(), "id", term29911);
        setField(term29910, term29910.getClass(), "description", null);
        setField(term29910, term29910.getClass(), "countryReason", null);
        setField(term29910, term29910.getClass(), "countryCode", null);
        setField(term29910, term29910.getClass(), "lastModifiedDate", null);
        setField(term29910, term29910.getClass(), "modifiedBy", null);
        setIntField(term29910, term29910.getClass(), "currentRulesCount", -2083028527);
        setIntField(term29910, term29910.getClass(), "maxRulesCount", 1631605263);
        setField(term29910, term29910.getClass(), "taxRules", null);
        setField(term29899, term29899.getClass(), "taxConfig", term29910);
        Long term29916 = new Long(-3945232339387324807L);
        Object term29915 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term29926 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term29915, term29915.getClass(), "id", term29916);
        setField(term29915, term29915.getClass(), "taxCode", "");
        setBooleanField(term29915, term29915.getClass(), "isLinear", false);
        setIntField(term29915, term29915.getClass(), "aFactor", 2043960707);
        setIntField(term29915, term29915.getClass(), "bFactor", 272179554);
        setBooleanField(term29915, term29915.getClass(), "isSquare", true);
        setIntField(term29915, term29915.getClass(), "aSquareFactor", 1717711536);
        setIntField(term29915, term29915.getClass(), "bSquareFactor", -606339607);
        setIntField(term29915, term29915.getClass(), "cSuqreFactor", 800440712);
        setField(term29926, term29926.getClass(), "id", null);
        setField(term29926, term29926.getClass(), "description", null);
        setField(term29926, term29926.getClass(), "countryReason", null);
        setField(term29926, term29926.getClass(), "countryCode", null);
        setField(term29926, term29926.getClass(), "lastModifiedDate", null);
        setField(term29926, term29926.getClass(), "modifiedBy", null);
        setIntField(term29926, term29926.getClass(), "currentRulesCount", 0);
        setIntField(term29926, term29926.getClass(), "maxRulesCount", 0);
        setField(term29926, term29926.getClass(), "taxRules", null);
        setField(term29915, term29915.getClass(), "taxConfig", term29926);
        ArrayList term29867 = new ArrayList();
        ((ArrayList) term29867).add(term29869);
        ((ArrayList) term29867).add(term29885);
        ((ArrayList) term29867).add(term29899);
        ((ArrayList) term29867).add(term29915);
        ((ArrayList) term29867).add(term29915);
        term29811 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term29850 = newInstance(Class.forName("java.time.Instant"));
        setField(term29811, term29811.getClass(), "id", term29812);
        setField(term29811, term29811.getClass(), "description", "wiYGATEfmw");
        setField(term29811, term29811.getClass(), "countryReason", "FiALSqneIg");
        setField(term29811, term29811.getClass(), "countryCode", "lGVACSQceQ");
        setLongField(term29850, term29850.getClass(), "seconds", 1640244611L);
        setIntField(term29850, term29850.getClass(), "nanos", 861000000);
        setField(term29811, term29811.getClass(), "lastModifiedDate", term29850);
        setField(term29811, term29811.getClass(), "modifiedBy", "jpgWRbSvyQ");
        setIntField(term29811, term29811.getClass(), "currentRulesCount", 1754193865);
        setIntField(term29811, term29811.getClass(), "maxRulesCount", 25277058);
        setField(term29811, term29811.getClass(), "taxRules", term29867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("legacyfighter.dietary.TaxConfig");
        Object[] args = new Object[1];
        args[0] = term29811;
        callMethod(klass, "setTaxConfig", argTypes, term29729, args);
    }

};


