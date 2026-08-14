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

public class TaxConfig_getCurrentRulesCount_71264269130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22025;

    public TaxConfig_getCurrentRulesCount_71264269130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22025 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term22025, term22025.getClass(), "id", null);
        setField(term22025, term22025.getClass(), "description", null);
        setField(term22025, term22025.getClass(), "countryReason", null);
        setField(term22025, term22025.getClass(), "countryCode", null);
        setField(term22025, term22025.getClass(), "lastModifiedDate", null);
        setField(term22025, term22025.getClass(), "modifiedBy", null);
        setIntField(term22025, term22025.getClass(), "currentRulesCount", 0);
        setIntField(term22025, term22025.getClass(), "maxRulesCount", 0);
        setField(term22025, term22025.getClass(), "taxRules", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentRulesCount", argTypes, term22025, args);
    }

};


