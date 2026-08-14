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

public class TaxRuleService_createTaxConfigWithRule_8748227592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33709;

    public TaxRuleService_createTaxConfigWithRule_8748227592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33710 = new Long(-45437711112045954L);
        Long term33732 = new Long(-2665418140152906040L);
        Long term33790 = new Long(590621623960257295L);
        Object term33789 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term33789, term33789.getClass(), "id", term33790);
        setField(term33789, term33789.getClass(), "taxCode", null);
        setBooleanField(term33789, term33789.getClass(), "isLinear", false);
        setIntField(term33789, term33789.getClass(), "aFactor", -2094311816);
        setIntField(term33789, term33789.getClass(), "bFactor", 419332770);
        setBooleanField(term33789, term33789.getClass(), "isSquare", true);
        setIntField(term33789, term33789.getClass(), "aSquareFactor", 1742733401);
        setIntField(term33789, term33789.getClass(), "bSquareFactor", 1634939612);
        setIntField(term33789, term33789.getClass(), "cSuqreFactor", -590256406);
        setField(term33789, term33789.getClass(), "taxConfig", null);
        Long term33800 = new Long(-7639406314873940496L);
        Object term33799 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term33799, term33799.getClass(), "id", term33800);
        setField(term33799, term33799.getClass(), "taxCode", null);
        setBooleanField(term33799, term33799.getClass(), "isLinear", false);
        setIntField(term33799, term33799.getClass(), "aFactor", -1866172730);
        setIntField(term33799, term33799.getClass(), "bFactor", 1129688211);
        setBooleanField(term33799, term33799.getClass(), "isSquare", false);
        setIntField(term33799, term33799.getClass(), "aSquareFactor", 2126253731);
        setIntField(term33799, term33799.getClass(), "bSquareFactor", 1637943121);
        setIntField(term33799, term33799.getClass(), "cSuqreFactor", -1889806893);
        setField(term33799, term33799.getClass(), "taxConfig", null);
        Object term33809 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term33809, term33809.getClass(), "id", null);
        setField(term33809, term33809.getClass(), "taxCode", null);
        setBooleanField(term33809, term33809.getClass(), "isLinear", false);
        setIntField(term33809, term33809.getClass(), "aFactor", 0);
        setIntField(term33809, term33809.getClass(), "bFactor", 0);
        setBooleanField(term33809, term33809.getClass(), "isSquare", false);
        setIntField(term33809, term33809.getClass(), "aSquareFactor", 0);
        setIntField(term33809, term33809.getClass(), "bSquareFactor", 0);
        setIntField(term33809, term33809.getClass(), "cSuqreFactor", 0);
        setField(term33809, term33809.getClass(), "taxConfig", null);
        Object term33817 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term33817, term33817.getClass(), "id", null);
        setField(term33817, term33817.getClass(), "taxCode", null);
        setBooleanField(term33817, term33817.getClass(), "isLinear", false);
        setIntField(term33817, term33817.getClass(), "aFactor", 0);
        setIntField(term33817, term33817.getClass(), "bFactor", 0);
        setBooleanField(term33817, term33817.getClass(), "isSquare", false);
        setIntField(term33817, term33817.getClass(), "aSquareFactor", 0);
        setIntField(term33817, term33817.getClass(), "bSquareFactor", 0);
        setIntField(term33817, term33817.getClass(), "cSuqreFactor", 0);
        setField(term33817, term33817.getClass(), "taxConfig", null);
        Long term33826 = new Long(6549453781602844135L);
        Object term33825 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term33825, term33825.getClass(), "id", term33826);
        setField(term33825, term33825.getClass(), "taxCode", null);
        setBooleanField(term33825, term33825.getClass(), "isLinear", true);
        setIntField(term33825, term33825.getClass(), "aFactor", 364063308);
        setIntField(term33825, term33825.getClass(), "bFactor", -787041664);
        setBooleanField(term33825, term33825.getClass(), "isSquare", false);
        setIntField(term33825, term33825.getClass(), "aSquareFactor", 2141179437);
        setIntField(term33825, term33825.getClass(), "bSquareFactor", -826972140);
        setIntField(term33825, term33825.getClass(), "cSuqreFactor", 737250028);
        setField(term33825, term33825.getClass(), "taxConfig", null);
        ArrayList term33787 = new ArrayList();
        ((ArrayList) term33787).add(term33789);
        ((ArrayList) term33787).add(term33799);
        ((ArrayList) term33787).add(term33809);
        ((ArrayList) term33787).add(term33817);
        ((ArrayList) term33787).add(term33817);
        ((ArrayList) term33787).add(term33825);
        ((ArrayList) term33787).add(term33799);
        ((ArrayList) term33787).add(term33799);
        ((ArrayList) term33787).add(term33789);
        term33709 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term33731 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term33770 = newInstance(Class.forName("java.time.Instant"));
        setField(term33709, term33709.getClass(), "id", term33710);
        setField(term33709, term33709.getClass(), "taxCode", "jGxArBjtep");
        setBooleanField(term33709, term33709.getClass(), "isLinear", false);
        setIntField(term33709, term33709.getClass(), "aFactor", 806187937);
        setIntField(term33709, term33709.getClass(), "bFactor", -1646415676);
        setBooleanField(term33709, term33709.getClass(), "isSquare", false);
        setIntField(term33709, term33709.getClass(), "aSquareFactor", 1016563502);
        setIntField(term33709, term33709.getClass(), "bSquareFactor", -1845173237);
        setIntField(term33709, term33709.getClass(), "cSuqreFactor", -326684811);
        setField(term33731, term33731.getClass(), "id", term33732);
        setField(term33731, term33731.getClass(), "description", "dUXsPNSUez");
        setField(term33731, term33731.getClass(), "countryReason", "PxGDfPOAFS");
        setField(term33731, term33731.getClass(), "countryCode", "dZVxzYEeZe");
        setLongField(term33770, term33770.getClass(), "seconds", 1315360243L);
        setIntField(term33770, term33770.getClass(), "nanos", 1000000);
        setField(term33731, term33731.getClass(), "lastModifiedDate", term33770);
        setField(term33731, term33731.getClass(), "modifiedBy", "TnCQRmzwPf");
        setIntField(term33731, term33731.getClass(), "currentRulesCount", 1260583823);
        setIntField(term33731, term33731.getClass(), "maxRulesCount", -1368801661);
        setField(term33731, term33731.getClass(), "taxRules", term33787);
        setField(term33709, term33709.getClass(), "taxConfig", term33731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("legacyfighter.dietary.TaxRule");
        Object[] args = new Object[2];
        args[0] = "RQvXfSweVs";
        args[1] = term33709;
        callMethod(klass, "createTaxConfigWithRule", argTypes, null, args);
    }

};


