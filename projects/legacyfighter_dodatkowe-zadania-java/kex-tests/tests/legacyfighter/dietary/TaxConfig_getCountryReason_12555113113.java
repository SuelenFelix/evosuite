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

public class TaxConfig_getCountryReason_12555113113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19465;

    public TaxConfig_getCountryReason_12555113113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19466 = new Long(4369503082568083627L);
        Long term19524 = new Long(-1148001666040486410L);
        Long term19535 = new Long(-2097210721190032076L);
        Object term19523 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term19534 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term19523, term19523.getClass(), "id", term19524);
        setField(term19523, term19523.getClass(), "taxCode", "");
        setBooleanField(term19523, term19523.getClass(), "isLinear", false);
        setIntField(term19523, term19523.getClass(), "aFactor", 1762934060);
        setIntField(term19523, term19523.getClass(), "bFactor", -859828739);
        setBooleanField(term19523, term19523.getClass(), "isSquare", false);
        setIntField(term19523, term19523.getClass(), "aSquareFactor", 1986855642);
        setIntField(term19523, term19523.getClass(), "bSquareFactor", 1280322790);
        setIntField(term19523, term19523.getClass(), "cSuqreFactor", -1702209203);
        setField(term19534, term19534.getClass(), "id", term19535);
        setField(term19534, term19534.getClass(), "description", null);
        setField(term19534, term19534.getClass(), "countryReason", null);
        setField(term19534, term19534.getClass(), "countryCode", null);
        setField(term19534, term19534.getClass(), "lastModifiedDate", null);
        setField(term19534, term19534.getClass(), "modifiedBy", null);
        setIntField(term19534, term19534.getClass(), "currentRulesCount", -1592307668);
        setIntField(term19534, term19534.getClass(), "maxRulesCount", -203832871);
        setField(term19534, term19534.getClass(), "taxRules", null);
        setField(term19523, term19523.getClass(), "taxConfig", term19534);
        Long term19540 = new Long(-2080067238602928154L);
        Object term19539 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term19550 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term19539, term19539.getClass(), "id", term19540);
        setField(term19539, term19539.getClass(), "taxCode", "");
        setBooleanField(term19539, term19539.getClass(), "isLinear", true);
        setIntField(term19539, term19539.getClass(), "aFactor", -2024983877);
        setIntField(term19539, term19539.getClass(), "bFactor", 1757149811);
        setBooleanField(term19539, term19539.getClass(), "isSquare", false);
        setIntField(term19539, term19539.getClass(), "aSquareFactor", 1505375686);
        setIntField(term19539, term19539.getClass(), "bSquareFactor", -132005524);
        setIntField(term19539, term19539.getClass(), "cSuqreFactor", -1235127374);
        setField(term19550, term19550.getClass(), "id", null);
        setField(term19550, term19550.getClass(), "description", null);
        setField(term19550, term19550.getClass(), "countryReason", null);
        setField(term19550, term19550.getClass(), "countryCode", null);
        setField(term19550, term19550.getClass(), "lastModifiedDate", null);
        setField(term19550, term19550.getClass(), "modifiedBy", null);
        setIntField(term19550, term19550.getClass(), "currentRulesCount", 0);
        setIntField(term19550, term19550.getClass(), "maxRulesCount", 0);
        setField(term19550, term19550.getClass(), "taxRules", null);
        setField(term19539, term19539.getClass(), "taxConfig", term19550);
        ArrayList term19521 = new ArrayList();
        ((ArrayList) term19521).add(term19523);
        ((ArrayList) term19521).add(term19539);
        ((ArrayList) term19521).add(term19539);
        term19465 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term19504 = newInstance(Class.forName("java.time.Instant"));
        setField(term19465, term19465.getClass(), "id", term19466);
        setField(term19465, term19465.getClass(), "description", "EAIAAStlTz");
        setField(term19465, term19465.getClass(), "countryReason", "yIWXcOQTgy");
        setField(term19465, term19465.getClass(), "countryCode", "xAWekqanqc");
        setLongField(term19504, term19504.getClass(), "seconds", 1755133084L);
        setIntField(term19504, term19504.getClass(), "nanos", 362000000);
        setField(term19465, term19465.getClass(), "lastModifiedDate", term19504);
        setField(term19465, term19465.getClass(), "modifiedBy", "GSOWFHMlbF");
        setIntField(term19465, term19465.getClass(), "currentRulesCount", -1231122778);
        setIntField(term19465, term19465.getClass(), "maxRulesCount", 1923558221);
        setField(term19465, term19465.getClass(), "taxRules", term19521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountryReason", argTypes, term19465, args);
    }

};


