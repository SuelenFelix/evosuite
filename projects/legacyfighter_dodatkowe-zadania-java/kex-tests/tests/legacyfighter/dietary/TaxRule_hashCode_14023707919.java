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

public class TaxRule_hashCode_14023707919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32700;

    public TaxRule_hashCode_14023707919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32701 = new Long(8528564099162820842L);
        Long term32723 = new Long(-1931621459457925623L);
        ArrayList term32778 = new ArrayList();
        term32700 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term32722 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term32761 = newInstance(Class.forName("java.time.Instant"));
        setField(term32700, term32700.getClass(), "id", term32701);
        setField(term32700, term32700.getClass(), "taxCode", "UFGOnIMOzf");
        setBooleanField(term32700, term32700.getClass(), "isLinear", false);
        setIntField(term32700, term32700.getClass(), "aFactor", -1289646730);
        setIntField(term32700, term32700.getClass(), "bFactor", 983651082);
        setBooleanField(term32700, term32700.getClass(), "isSquare", false);
        setIntField(term32700, term32700.getClass(), "aSquareFactor", 794411004);
        setIntField(term32700, term32700.getClass(), "bSquareFactor", 1964107266);
        setIntField(term32700, term32700.getClass(), "cSuqreFactor", -256542569);
        setField(term32722, term32722.getClass(), "id", term32723);
        setField(term32722, term32722.getClass(), "description", "ySiyRlAQpt");
        setField(term32722, term32722.getClass(), "countryReason", "MiankJgKCp");
        setField(term32722, term32722.getClass(), "countryCode", "lmZBCmpOeb");
        setLongField(term32761, term32761.getClass(), "seconds", 1565038927L);
        setIntField(term32761, term32761.getClass(), "nanos", 228000000);
        setField(term32722, term32722.getClass(), "lastModifiedDate", term32761);
        setField(term32722, term32722.getClass(), "modifiedBy", "cPlYOAUqsP");
        setIntField(term32722, term32722.getClass(), "currentRulesCount", -1936597357);
        setIntField(term32722, term32722.getClass(), "maxRulesCount", -179816637);
        setField(term32722, term32722.getClass(), "taxRules", term32778);
        setField(term32700, term32700.getClass(), "taxConfig", term32722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term32700, args);
    }

};


