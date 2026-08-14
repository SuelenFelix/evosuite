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

public class TaxRule_isSquare_19249718839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30995;

    public TaxRule_isSquare_19249718839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30996 = new Long(-7968999170526273722L);
        Long term31018 = new Long(-391398551284253915L);
        Long term31076 = new Long(-2791473406557466846L);
        Object term31075 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term31075, term31075.getClass(), "id", term31076);
        setField(term31075, term31075.getClass(), "taxCode", null);
        setBooleanField(term31075, term31075.getClass(), "isLinear", true);
        setIntField(term31075, term31075.getClass(), "aFactor", -989538894);
        setIntField(term31075, term31075.getClass(), "bFactor", 1316863342);
        setBooleanField(term31075, term31075.getClass(), "isSquare", false);
        setIntField(term31075, term31075.getClass(), "aSquareFactor", 735033722);
        setIntField(term31075, term31075.getClass(), "bSquareFactor", -1409886459);
        setIntField(term31075, term31075.getClass(), "cSuqreFactor", 666379561);
        setField(term31075, term31075.getClass(), "taxConfig", null);
        Object term31085 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term31085, term31085.getClass(), "id", null);
        setField(term31085, term31085.getClass(), "taxCode", null);
        setBooleanField(term31085, term31085.getClass(), "isLinear", false);
        setIntField(term31085, term31085.getClass(), "aFactor", 0);
        setIntField(term31085, term31085.getClass(), "bFactor", 0);
        setBooleanField(term31085, term31085.getClass(), "isSquare", false);
        setIntField(term31085, term31085.getClass(), "aSquareFactor", 0);
        setIntField(term31085, term31085.getClass(), "bSquareFactor", 0);
        setIntField(term31085, term31085.getClass(), "cSuqreFactor", 0);
        setField(term31085, term31085.getClass(), "taxConfig", null);
        ArrayList term31073 = new ArrayList();
        ((ArrayList) term31073).add(term31075);
        ((ArrayList) term31073).add(term31085);
        ((ArrayList) term31073).add(term31085);
        term30995 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term31017 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term31056 = newInstance(Class.forName("java.time.Instant"));
        setField(term30995, term30995.getClass(), "id", term30996);
        setField(term30995, term30995.getClass(), "taxCode", "vHxsVQImjS");
        setBooleanField(term30995, term30995.getClass(), "isLinear", false);
        setIntField(term30995, term30995.getClass(), "aFactor", 923353564);
        setIntField(term30995, term30995.getClass(), "bFactor", 2013647768);
        setBooleanField(term30995, term30995.getClass(), "isSquare", true);
        setIntField(term30995, term30995.getClass(), "aSquareFactor", 1706579212);
        setIntField(term30995, term30995.getClass(), "bSquareFactor", -1073781147);
        setIntField(term30995, term30995.getClass(), "cSuqreFactor", 138913824);
        setField(term31017, term31017.getClass(), "id", term31018);
        setField(term31017, term31017.getClass(), "description", "jkVaRrZHQX");
        setField(term31017, term31017.getClass(), "countryReason", "gSFFUuJipG");
        setField(term31017, term31017.getClass(), "countryCode", "bQWfIFvxkQ");
        setLongField(term31056, term31056.getClass(), "seconds", 1526147148L);
        setIntField(term31056, term31056.getClass(), "nanos", 954000000);
        setField(term31017, term31017.getClass(), "lastModifiedDate", term31056);
        setField(term31017, term31017.getClass(), "modifiedBy", "aDoBLXfFQI");
        setIntField(term31017, term31017.getClass(), "currentRulesCount", -637767208);
        setIntField(term31017, term31017.getClass(), "maxRulesCount", 844890845);
        setField(term31017, term31017.getClass(), "taxRules", term31073);
        setField(term30995, term30995.getClass(), "taxConfig", term31017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSquare", argTypes, term30995, args);
    }

};


