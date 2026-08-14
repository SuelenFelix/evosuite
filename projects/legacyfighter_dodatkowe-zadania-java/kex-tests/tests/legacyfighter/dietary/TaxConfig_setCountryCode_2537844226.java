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

public class TaxConfig_setCountryCode_2537844226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19971;

    public TaxConfig_setCountryCode_2537844226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19972 = new Long(-4682102699090617454L);
        Long term20030 = new Long(8018453258973130416L);
        Long term20041 = new Long(5592372218942533021L);
        Object term20029 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20040 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20029, term20029.getClass(), "id", term20030);
        setField(term20029, term20029.getClass(), "taxCode", "");
        setBooleanField(term20029, term20029.getClass(), "isLinear", true);
        setIntField(term20029, term20029.getClass(), "aFactor", -19567889);
        setIntField(term20029, term20029.getClass(), "bFactor", 693500318);
        setBooleanField(term20029, term20029.getClass(), "isSquare", false);
        setIntField(term20029, term20029.getClass(), "aSquareFactor", 1702404702);
        setIntField(term20029, term20029.getClass(), "bSquareFactor", 1141592999);
        setIntField(term20029, term20029.getClass(), "cSuqreFactor", 848113442);
        setField(term20040, term20040.getClass(), "id", term20041);
        setField(term20040, term20040.getClass(), "description", null);
        setField(term20040, term20040.getClass(), "countryReason", null);
        setField(term20040, term20040.getClass(), "countryCode", null);
        setField(term20040, term20040.getClass(), "lastModifiedDate", null);
        setField(term20040, term20040.getClass(), "modifiedBy", null);
        setIntField(term20040, term20040.getClass(), "currentRulesCount", 793974213);
        setIntField(term20040, term20040.getClass(), "maxRulesCount", 722546287);
        setField(term20040, term20040.getClass(), "taxRules", null);
        setField(term20029, term20029.getClass(), "taxConfig", term20040);
        Long term20046 = new Long(-4526944004625263747L);
        Long term20057 = new Long(-8195504192950938590L);
        Object term20045 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20056 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20045, term20045.getClass(), "id", term20046);
        setField(term20045, term20045.getClass(), "taxCode", "");
        setBooleanField(term20045, term20045.getClass(), "isLinear", true);
        setIntField(term20045, term20045.getClass(), "aFactor", -1703642288);
        setIntField(term20045, term20045.getClass(), "bFactor", 2075139747);
        setBooleanField(term20045, term20045.getClass(), "isSquare", false);
        setIntField(term20045, term20045.getClass(), "aSquareFactor", 2092881418);
        setIntField(term20045, term20045.getClass(), "bSquareFactor", 1732410866);
        setIntField(term20045, term20045.getClass(), "cSuqreFactor", 1084102599);
        setField(term20056, term20056.getClass(), "id", term20057);
        setField(term20056, term20056.getClass(), "description", null);
        setField(term20056, term20056.getClass(), "countryReason", null);
        setField(term20056, term20056.getClass(), "countryCode", null);
        setField(term20056, term20056.getClass(), "lastModifiedDate", null);
        setField(term20056, term20056.getClass(), "modifiedBy", null);
        setIntField(term20056, term20056.getClass(), "currentRulesCount", -1743503755);
        setIntField(term20056, term20056.getClass(), "maxRulesCount", 1641342112);
        setField(term20056, term20056.getClass(), "taxRules", null);
        setField(term20045, term20045.getClass(), "taxConfig", term20056);
        ArrayList term20027 = new ArrayList();
        ((ArrayList) term20027).add(term20029);
        ((ArrayList) term20027).add(term20045);
        term19971 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term20010 = newInstance(Class.forName("java.time.Instant"));
        setField(term19971, term19971.getClass(), "id", term19972);
        setField(term19971, term19971.getClass(), "description", "uOJFOUcNvv");
        setField(term19971, term19971.getClass(), "countryReason", "tkmmGweDwJ");
        setField(term19971, term19971.getClass(), "countryCode", "pMfTuAFXxg");
        setLongField(term20010, term20010.getClass(), "seconds", 1298065306L);
        setIntField(term20010, term20010.getClass(), "nanos", 825000000);
        setField(term19971, term19971.getClass(), "lastModifiedDate", term20010);
        setField(term19971, term19971.getClass(), "modifiedBy", "XCZmhkblRc");
        setIntField(term19971, term19971.getClass(), "currentRulesCount", 373810833);
        setIntField(term19971, term19971.getClass(), "maxRulesCount", -215979293);
        setField(term19971, term19971.getClass(), "taxRules", term20027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gvjdfHNzOa";
        callMethod(klass, "setCountryCode", argTypes, term19971, args);
    }

};


