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

public class TaxRuleDto_init_5149186480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public TaxRuleDto_init_5149186480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4 = new Long(2442117782898005296L);
        Long term26 = new Long(6375119433582206027L);
        Long term84 = new Long(-8257434502486459194L);
        Object term83 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term83, term83.getClass(), "id", term84);
        setField(term83, term83.getClass(), "taxCode", null);
        setBooleanField(term83, term83.getClass(), "isLinear", false);
        setIntField(term83, term83.getClass(), "aFactor", -2038273078);
        setIntField(term83, term83.getClass(), "bFactor", 1227103734);
        setBooleanField(term83, term83.getClass(), "isSquare", false);
        setIntField(term83, term83.getClass(), "aSquareFactor", -1339778481);
        setIntField(term83, term83.getClass(), "bSquareFactor", 1725571209);
        setIntField(term83, term83.getClass(), "cSuqreFactor", -522618178);
        setField(term83, term83.getClass(), "taxConfig", null);
        Long term94 = new Long(-7237588299778557629L);
        Object term93 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term93, term93.getClass(), "id", term94);
        setField(term93, term93.getClass(), "taxCode", null);
        setBooleanField(term93, term93.getClass(), "isLinear", false);
        setIntField(term93, term93.getClass(), "aFactor", -1275173084);
        setIntField(term93, term93.getClass(), "bFactor", -244121226);
        setBooleanField(term93, term93.getClass(), "isSquare", true);
        setIntField(term93, term93.getClass(), "aSquareFactor", -203030934);
        setIntField(term93, term93.getClass(), "bSquareFactor", -1179120542);
        setIntField(term93, term93.getClass(), "cSuqreFactor", -73683645);
        setField(term93, term93.getClass(), "taxConfig", null);
        Object term103 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term103, term103.getClass(), "id", null);
        setField(term103, term103.getClass(), "taxCode", null);
        setBooleanField(term103, term103.getClass(), "isLinear", false);
        setIntField(term103, term103.getClass(), "aFactor", 0);
        setIntField(term103, term103.getClass(), "bFactor", 0);
        setBooleanField(term103, term103.getClass(), "isSquare", false);
        setIntField(term103, term103.getClass(), "aSquareFactor", 0);
        setIntField(term103, term103.getClass(), "bSquareFactor", 0);
        setIntField(term103, term103.getClass(), "cSuqreFactor", 0);
        setField(term103, term103.getClass(), "taxConfig", null);
        Object term111 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term111, term111.getClass(), "id", null);
        setField(term111, term111.getClass(), "taxCode", null);
        setBooleanField(term111, term111.getClass(), "isLinear", false);
        setIntField(term111, term111.getClass(), "aFactor", 0);
        setIntField(term111, term111.getClass(), "bFactor", 0);
        setBooleanField(term111, term111.getClass(), "isSquare", false);
        setIntField(term111, term111.getClass(), "aSquareFactor", 0);
        setIntField(term111, term111.getClass(), "bSquareFactor", 0);
        setIntField(term111, term111.getClass(), "cSuqreFactor", 0);
        setField(term111, term111.getClass(), "taxConfig", null);
        Object term119 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term119, term119.getClass(), "id", null);
        setField(term119, term119.getClass(), "taxCode", null);
        setBooleanField(term119, term119.getClass(), "isLinear", false);
        setIntField(term119, term119.getClass(), "aFactor", 0);
        setIntField(term119, term119.getClass(), "bFactor", 0);
        setBooleanField(term119, term119.getClass(), "isSquare", false);
        setIntField(term119, term119.getClass(), "aSquareFactor", 0);
        setIntField(term119, term119.getClass(), "bSquareFactor", 0);
        setIntField(term119, term119.getClass(), "cSuqreFactor", 0);
        setField(term119, term119.getClass(), "taxConfig", null);
        ArrayList term81 = new ArrayList();
        ((ArrayList) term81).add(term83);
        ((ArrayList) term81).add(term93);
        ((ArrayList) term81).add(term103);
        ((ArrayList) term81).add(term111);
        ((ArrayList) term81).add(term119);
        term3 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term25 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term64 = newInstance(Class.forName("java.time.Instant"));
        setField(term3, term3.getClass(), "id", term4);
        setField(term3, term3.getClass(), "taxCode", "PAEBtnZtTD");
        setBooleanField(term3, term3.getClass(), "isLinear", false);
        setIntField(term3, term3.getClass(), "aFactor", 568599855);
        setIntField(term3, term3.getClass(), "bFactor", 1162663216);
        setBooleanField(term3, term3.getClass(), "isSquare", false);
        setIntField(term3, term3.getClass(), "aSquareFactor", 1484323161);
        setIntField(term3, term3.getClass(), "bSquareFactor", 391863371);
        setIntField(term3, term3.getClass(), "cSuqreFactor", -1922583790);
        setField(term25, term25.getClass(), "id", term26);
        setField(term25, term25.getClass(), "description", "sjlJAEtRrb");
        setField(term25, term25.getClass(), "countryReason", "MuLcgQHgqz");
        setField(term25, term25.getClass(), "countryCode", "xxtlPwDYFs");
        setLongField(term64, term64.getClass(), "seconds", 1345871412L);
        setIntField(term64, term64.getClass(), "nanos", 244000000);
        setField(term25, term25.getClass(), "lastModifiedDate", term64);
        setField(term25, term25.getClass(), "modifiedBy", "jJCZpVmanW");
        setIntField(term25, term25.getClass(), "currentRulesCount", -616727354);
        setIntField(term25, term25.getClass(), "maxRulesCount", -1955890973);
        setField(term25, term25.getClass(), "taxRules", term81);
        setField(term3, term3.getClass(), "taxConfig", term25);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRuleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("legacyfighter.dietary.TaxRule");
        Object[] args = new Object[1];
        args[0] = term3;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


