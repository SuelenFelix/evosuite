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

public class TaxRule_getTaxCode_105201765320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32832;

    public TaxRule_getTaxCode_105201765320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32833 = new Long(-947267660485940099L);
        Long term32855 = new Long(-1329447485805427573L);
        Long term32913 = new Long(-2298075900308676256L);
        Object term32912 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term32912, term32912.getClass(), "id", term32913);
        setField(term32912, term32912.getClass(), "taxCode", null);
        setBooleanField(term32912, term32912.getClass(), "isLinear", false);
        setIntField(term32912, term32912.getClass(), "aFactor", 407640701);
        setIntField(term32912, term32912.getClass(), "bFactor", -55858757);
        setBooleanField(term32912, term32912.getClass(), "isSquare", true);
        setIntField(term32912, term32912.getClass(), "aSquareFactor", 1101065297);
        setIntField(term32912, term32912.getClass(), "bSquareFactor", -110542660);
        setIntField(term32912, term32912.getClass(), "cSuqreFactor", 1430629000);
        setField(term32912, term32912.getClass(), "taxConfig", null);
        Object term32922 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term32922, term32922.getClass(), "id", null);
        setField(term32922, term32922.getClass(), "taxCode", null);
        setBooleanField(term32922, term32922.getClass(), "isLinear", false);
        setIntField(term32922, term32922.getClass(), "aFactor", 0);
        setIntField(term32922, term32922.getClass(), "bFactor", 0);
        setBooleanField(term32922, term32922.getClass(), "isSquare", false);
        setIntField(term32922, term32922.getClass(), "aSquareFactor", 0);
        setIntField(term32922, term32922.getClass(), "bSquareFactor", 0);
        setIntField(term32922, term32922.getClass(), "cSuqreFactor", 0);
        setField(term32922, term32922.getClass(), "taxConfig", null);
        ArrayList term32910 = new ArrayList();
        ((ArrayList) term32910).add(term32912);
        ((ArrayList) term32910).add(term32922);
        term32832 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term32854 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term32893 = newInstance(Class.forName("java.time.Instant"));
        setField(term32832, term32832.getClass(), "id", term32833);
        setField(term32832, term32832.getClass(), "taxCode", "ritBUyuuKt");
        setBooleanField(term32832, term32832.getClass(), "isLinear", false);
        setIntField(term32832, term32832.getClass(), "aFactor", -1304594615);
        setIntField(term32832, term32832.getClass(), "bFactor", 1384334359);
        setBooleanField(term32832, term32832.getClass(), "isSquare", true);
        setIntField(term32832, term32832.getClass(), "aSquareFactor", -552245510);
        setIntField(term32832, term32832.getClass(), "bSquareFactor", 1590263959);
        setIntField(term32832, term32832.getClass(), "cSuqreFactor", -203971814);
        setField(term32854, term32854.getClass(), "id", term32855);
        setField(term32854, term32854.getClass(), "description", "YfziBBiPvL");
        setField(term32854, term32854.getClass(), "countryReason", "lNBaHEkYui");
        setField(term32854, term32854.getClass(), "countryCode", "BqxRCYZwmn");
        setLongField(term32893, term32893.getClass(), "seconds", 1308527949L);
        setIntField(term32893, term32893.getClass(), "nanos", 856000000);
        setField(term32854, term32854.getClass(), "lastModifiedDate", term32893);
        setField(term32854, term32854.getClass(), "modifiedBy", "KHPDZjrXQp");
        setIntField(term32854, term32854.getClass(), "currentRulesCount", -786856127);
        setIntField(term32854, term32854.getClass(), "maxRulesCount", 891987554);
        setField(term32854, term32854.getClass(), "taxRules", term32910);
        setField(term32832, term32832.getClass(), "taxConfig", term32854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaxCode", argTypes, term32832, args);
    }

};


