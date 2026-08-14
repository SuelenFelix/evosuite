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

public class TaxConfig_getMaxRulesCount_15351115032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22033;

    public TaxConfig_getMaxRulesCount_15351115032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22033 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term22033, term22033.getClass(), "id", null);
        setField(term22033, term22033.getClass(), "description", null);
        setField(term22033, term22033.getClass(), "countryReason", null);
        setField(term22033, term22033.getClass(), "countryCode", null);
        setField(term22033, term22033.getClass(), "lastModifiedDate", null);
        setField(term22033, term22033.getClass(), "modifiedBy", null);
        setIntField(term22033, term22033.getClass(), "currentRulesCount", 0);
        setIntField(term22033, term22033.getClass(), "maxRulesCount", 0);
        setField(term22033, term22033.getClass(), "taxRules", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxRulesCount", argTypes, term22033, args);
    }

};


