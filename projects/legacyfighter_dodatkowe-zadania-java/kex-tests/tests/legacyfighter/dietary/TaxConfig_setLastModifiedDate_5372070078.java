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

public class TaxConfig_setLastModifiedDate_5372070078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20287;
     Object term20405;

    public TaxConfig_setLastModifiedDate_5372070078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20288 = new Long(-1763360854589438694L);
        Long term20346 = new Long(-4225690761644993738L);
        Long term20357 = new Long(4498588544424613697L);
        Object term20345 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20356 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20345, term20345.getClass(), "id", term20346);
        setField(term20345, term20345.getClass(), "taxCode", "");
        setBooleanField(term20345, term20345.getClass(), "isLinear", true);
        setIntField(term20345, term20345.getClass(), "aFactor", 42982854);
        setIntField(term20345, term20345.getClass(), "bFactor", -1129506480);
        setBooleanField(term20345, term20345.getClass(), "isSquare", true);
        setIntField(term20345, term20345.getClass(), "aSquareFactor", 301438568);
        setIntField(term20345, term20345.getClass(), "bSquareFactor", -1667908453);
        setIntField(term20345, term20345.getClass(), "cSuqreFactor", 315910438);
        setField(term20356, term20356.getClass(), "id", term20357);
        setField(term20356, term20356.getClass(), "description", null);
        setField(term20356, term20356.getClass(), "countryReason", null);
        setField(term20356, term20356.getClass(), "countryCode", null);
        setField(term20356, term20356.getClass(), "lastModifiedDate", null);
        setField(term20356, term20356.getClass(), "modifiedBy", null);
        setIntField(term20356, term20356.getClass(), "currentRulesCount", -1673157821);
        setIntField(term20356, term20356.getClass(), "maxRulesCount", 1217804703);
        setField(term20356, term20356.getClass(), "taxRules", null);
        setField(term20345, term20345.getClass(), "taxConfig", term20356);
        Long term20362 = new Long(6913945762720683253L);
        Object term20361 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20372 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20361, term20361.getClass(), "id", term20362);
        setField(term20361, term20361.getClass(), "taxCode", "");
        setBooleanField(term20361, term20361.getClass(), "isLinear", false);
        setIntField(term20361, term20361.getClass(), "aFactor", 1086383182);
        setIntField(term20361, term20361.getClass(), "bFactor", 1425319286);
        setBooleanField(term20361, term20361.getClass(), "isSquare", false);
        setIntField(term20361, term20361.getClass(), "aSquareFactor", 1729919228);
        setIntField(term20361, term20361.getClass(), "bSquareFactor", 872351195);
        setIntField(term20361, term20361.getClass(), "cSuqreFactor", -1664328399);
        setField(term20372, term20372.getClass(), "id", null);
        setField(term20372, term20372.getClass(), "description", null);
        setField(term20372, term20372.getClass(), "countryReason", null);
        setField(term20372, term20372.getClass(), "countryCode", null);
        setField(term20372, term20372.getClass(), "lastModifiedDate", null);
        setField(term20372, term20372.getClass(), "modifiedBy", null);
        setIntField(term20372, term20372.getClass(), "currentRulesCount", 0);
        setIntField(term20372, term20372.getClass(), "maxRulesCount", 0);
        setField(term20372, term20372.getClass(), "taxRules", null);
        setField(term20361, term20361.getClass(), "taxConfig", term20372);
        Long term20376 = new Long(4815723481405472054L);
        Object term20375 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20386 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20375, term20375.getClass(), "id", term20376);
        setField(term20375, term20375.getClass(), "taxCode", "");
        setBooleanField(term20375, term20375.getClass(), "isLinear", false);
        setIntField(term20375, term20375.getClass(), "aFactor", -781185864);
        setIntField(term20375, term20375.getClass(), "bFactor", 340500914);
        setBooleanField(term20375, term20375.getClass(), "isSquare", true);
        setIntField(term20375, term20375.getClass(), "aSquareFactor", -2061712635);
        setIntField(term20375, term20375.getClass(), "bSquareFactor", 1182911731);
        setIntField(term20375, term20375.getClass(), "cSuqreFactor", 644726932);
        setField(term20386, term20386.getClass(), "id", null);
        setField(term20386, term20386.getClass(), "description", null);
        setField(term20386, term20386.getClass(), "countryReason", null);
        setField(term20386, term20386.getClass(), "countryCode", null);
        setField(term20386, term20386.getClass(), "lastModifiedDate", null);
        setField(term20386, term20386.getClass(), "modifiedBy", null);
        setIntField(term20386, term20386.getClass(), "currentRulesCount", 0);
        setIntField(term20386, term20386.getClass(), "maxRulesCount", 0);
        setField(term20386, term20386.getClass(), "taxRules", null);
        setField(term20375, term20375.getClass(), "taxConfig", term20386);
        Long term20390 = new Long(4003767587571884508L);
        Object term20389 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20400 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20389, term20389.getClass(), "id", term20390);
        setField(term20389, term20389.getClass(), "taxCode", "");
        setBooleanField(term20389, term20389.getClass(), "isLinear", false);
        setIntField(term20389, term20389.getClass(), "aFactor", -1195191239);
        setIntField(term20389, term20389.getClass(), "bFactor", -470798982);
        setBooleanField(term20389, term20389.getClass(), "isSquare", false);
        setIntField(term20389, term20389.getClass(), "aSquareFactor", 1844345719);
        setIntField(term20389, term20389.getClass(), "bSquareFactor", 1704024265);
        setIntField(term20389, term20389.getClass(), "cSuqreFactor", 501801161);
        setField(term20400, term20400.getClass(), "id", null);
        setField(term20400, term20400.getClass(), "description", null);
        setField(term20400, term20400.getClass(), "countryReason", null);
        setField(term20400, term20400.getClass(), "countryCode", null);
        setField(term20400, term20400.getClass(), "lastModifiedDate", null);
        setField(term20400, term20400.getClass(), "modifiedBy", null);
        setIntField(term20400, term20400.getClass(), "currentRulesCount", 0);
        setIntField(term20400, term20400.getClass(), "maxRulesCount", 0);
        setField(term20400, term20400.getClass(), "taxRules", null);
        setField(term20389, term20389.getClass(), "taxConfig", term20400);
        ArrayList term20343 = new ArrayList();
        ((ArrayList) term20343).add(term20345);
        ((ArrayList) term20343).add(term20361);
        ((ArrayList) term20343).add(term20375);
        ((ArrayList) term20343).add(term20389);
        term20287 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term20326 = newInstance(Class.forName("java.time.Instant"));
        setField(term20287, term20287.getClass(), "id", term20288);
        setField(term20287, term20287.getClass(), "description", "pLvkKHqNYX");
        setField(term20287, term20287.getClass(), "countryReason", "PwqnuJJwjR");
        setField(term20287, term20287.getClass(), "countryCode", "NFkbBiPeiw");
        setLongField(term20326, term20326.getClass(), "seconds", 1837509436L);
        setIntField(term20326, term20326.getClass(), "nanos", 971000000);
        setField(term20287, term20287.getClass(), "lastModifiedDate", term20326);
        setField(term20287, term20287.getClass(), "modifiedBy", "tlRvilQyjJ");
        setIntField(term20287, term20287.getClass(), "currentRulesCount", 40965975);
        setIntField(term20287, term20287.getClass(), "maxRulesCount", -194718582);
        setField(term20287, term20287.getClass(), "taxRules", term20343);
        term20405 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term20405, term20405.getClass(), "seconds", 1401543935L);
        setIntField(term20405, term20405.getClass(), "nanos", 23000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term20405;
        callMethod(klass, "setLastModifiedDate", argTypes, term20287, args);
    }

};


