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

public class TaxConfig_getModifiedBy_41126665328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22019;

    public TaxConfig_getModifiedBy_41126665328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22019 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term22019, term22019.getClass(), "id", null);
        setField(term22019, term22019.getClass(), "description", null);
        setField(term22019, term22019.getClass(), "countryReason", null);
        setField(term22019, term22019.getClass(), "countryCode", null);
        setField(term22019, term22019.getClass(), "lastModifiedDate", null);
        setField(term22019, term22019.getClass(), "modifiedBy", null);
        setIntField(term22019, term22019.getClass(), "currentRulesCount", 0);
        setIntField(term22019, term22019.getClass(), "maxRulesCount", 0);
        setField(term22019, term22019.getClass(), "taxRules", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModifiedBy", argTypes, term22019, args);
    }

};


