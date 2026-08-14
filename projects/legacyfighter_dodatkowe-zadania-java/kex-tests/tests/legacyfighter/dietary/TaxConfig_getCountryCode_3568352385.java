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

public class TaxConfig_getCountryCode_3568352385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19811;

    public TaxConfig_getCountryCode_3568352385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19812 = new Long(-6299955839293054069L);
        Long term19870 = new Long(3573273176206440433L);
        Long term19881 = new Long(8242382965219431687L);
        Object term19869 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term19880 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term19869, term19869.getClass(), "id", term19870);
        setField(term19869, term19869.getClass(), "taxCode", "");
        setBooleanField(term19869, term19869.getClass(), "isLinear", false);
        setIntField(term19869, term19869.getClass(), "aFactor", -616562794);
        setIntField(term19869, term19869.getClass(), "bFactor", 750084083);
        setBooleanField(term19869, term19869.getClass(), "isSquare", false);
        setIntField(term19869, term19869.getClass(), "aSquareFactor", -1603460382);
        setIntField(term19869, term19869.getClass(), "bSquareFactor", -298939768);
        setIntField(term19869, term19869.getClass(), "cSuqreFactor", -767031634);
        setField(term19880, term19880.getClass(), "id", term19881);
        setField(term19880, term19880.getClass(), "description", null);
        setField(term19880, term19880.getClass(), "countryReason", null);
        setField(term19880, term19880.getClass(), "countryCode", null);
        setField(term19880, term19880.getClass(), "lastModifiedDate", null);
        setField(term19880, term19880.getClass(), "modifiedBy", null);
        setIntField(term19880, term19880.getClass(), "currentRulesCount", -2072469750);
        setIntField(term19880, term19880.getClass(), "maxRulesCount", 2106616847);
        setField(term19880, term19880.getClass(), "taxRules", null);
        setField(term19869, term19869.getClass(), "taxConfig", term19880);
        Long term19886 = new Long(-1721083210597101555L);
        Long term19897 = new Long(937792282597213200L);
        Object term19885 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term19896 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term19885, term19885.getClass(), "id", term19886);
        setField(term19885, term19885.getClass(), "taxCode", "");
        setBooleanField(term19885, term19885.getClass(), "isLinear", false);
        setIntField(term19885, term19885.getClass(), "aFactor", -1016087889);
        setIntField(term19885, term19885.getClass(), "bFactor", 1968287557);
        setBooleanField(term19885, term19885.getClass(), "isSquare", true);
        setIntField(term19885, term19885.getClass(), "aSquareFactor", 1101385603);
        setIntField(term19885, term19885.getClass(), "bSquareFactor", 1980267589);
        setIntField(term19885, term19885.getClass(), "cSuqreFactor", -2009434910);
        setField(term19896, term19896.getClass(), "id", term19897);
        setField(term19896, term19896.getClass(), "description", null);
        setField(term19896, term19896.getClass(), "countryReason", null);
        setField(term19896, term19896.getClass(), "countryCode", null);
        setField(term19896, term19896.getClass(), "lastModifiedDate", null);
        setField(term19896, term19896.getClass(), "modifiedBy", null);
        setIntField(term19896, term19896.getClass(), "currentRulesCount", -374887532);
        setIntField(term19896, term19896.getClass(), "maxRulesCount", -165487736);
        setField(term19896, term19896.getClass(), "taxRules", null);
        setField(term19885, term19885.getClass(), "taxConfig", term19896);
        Long term19902 = new Long(5295517562699482299L);
        Object term19901 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term19912 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term19901, term19901.getClass(), "id", term19902);
        setField(term19901, term19901.getClass(), "taxCode", "");
        setBooleanField(term19901, term19901.getClass(), "isLinear", true);
        setIntField(term19901, term19901.getClass(), "aFactor", 1016087323);
        setIntField(term19901, term19901.getClass(), "bFactor", 1957748979);
        setBooleanField(term19901, term19901.getClass(), "isSquare", false);
        setIntField(term19901, term19901.getClass(), "aSquareFactor", -1290093259);
        setIntField(term19901, term19901.getClass(), "bSquareFactor", -1200934890);
        setIntField(term19901, term19901.getClass(), "cSuqreFactor", 1765633108);
        setField(term19912, term19912.getClass(), "id", null);
        setField(term19912, term19912.getClass(), "description", null);
        setField(term19912, term19912.getClass(), "countryReason", null);
        setField(term19912, term19912.getClass(), "countryCode", null);
        setField(term19912, term19912.getClass(), "lastModifiedDate", null);
        setField(term19912, term19912.getClass(), "modifiedBy", null);
        setIntField(term19912, term19912.getClass(), "currentRulesCount", 0);
        setIntField(term19912, term19912.getClass(), "maxRulesCount", 0);
        setField(term19912, term19912.getClass(), "taxRules", null);
        setField(term19901, term19901.getClass(), "taxConfig", term19912);
        Long term19916 = new Long(6135782592145916721L);
        Object term19915 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term19926 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term19915, term19915.getClass(), "id", term19916);
        setField(term19915, term19915.getClass(), "taxCode", "");
        setBooleanField(term19915, term19915.getClass(), "isLinear", false);
        setIntField(term19915, term19915.getClass(), "aFactor", -1151122332);
        setIntField(term19915, term19915.getClass(), "bFactor", 953387911);
        setBooleanField(term19915, term19915.getClass(), "isSquare", false);
        setIntField(term19915, term19915.getClass(), "aSquareFactor", -1550025613);
        setIntField(term19915, term19915.getClass(), "bSquareFactor", 814617314);
        setIntField(term19915, term19915.getClass(), "cSuqreFactor", -159489307);
        setField(term19926, term19926.getClass(), "id", null);
        setField(term19926, term19926.getClass(), "description", null);
        setField(term19926, term19926.getClass(), "countryReason", null);
        setField(term19926, term19926.getClass(), "countryCode", null);
        setField(term19926, term19926.getClass(), "lastModifiedDate", null);
        setField(term19926, term19926.getClass(), "modifiedBy", null);
        setIntField(term19926, term19926.getClass(), "currentRulesCount", 0);
        setIntField(term19926, term19926.getClass(), "maxRulesCount", 0);
        setField(term19926, term19926.getClass(), "taxRules", null);
        setField(term19915, term19915.getClass(), "taxConfig", term19926);
        ArrayList term19867 = new ArrayList();
        ((ArrayList) term19867).add(term19869);
        ((ArrayList) term19867).add(term19885);
        ((ArrayList) term19867).add(term19901);
        ((ArrayList) term19867).add(term19915);
        term19811 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term19850 = newInstance(Class.forName("java.time.Instant"));
        setField(term19811, term19811.getClass(), "id", term19812);
        setField(term19811, term19811.getClass(), "description", "BMMonTIZgJ");
        setField(term19811, term19811.getClass(), "countryReason", "QXyFXBjFde");
        setField(term19811, term19811.getClass(), "countryCode", "xVFgeyYxZS");
        setLongField(term19850, term19850.getClass(), "seconds", 1667564808L);
        setIntField(term19850, term19850.getClass(), "nanos", 637000000);
        setField(term19811, term19811.getClass(), "lastModifiedDate", term19850);
        setField(term19811, term19811.getClass(), "modifiedBy", "iQiGTulJiH");
        setIntField(term19811, term19811.getClass(), "currentRulesCount", -263876378);
        setIntField(term19811, term19811.getClass(), "maxRulesCount", -755209283);
        setField(term19811, term19811.getClass(), "taxRules", term19867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountryCode", argTypes, term19811, args);
    }

};


