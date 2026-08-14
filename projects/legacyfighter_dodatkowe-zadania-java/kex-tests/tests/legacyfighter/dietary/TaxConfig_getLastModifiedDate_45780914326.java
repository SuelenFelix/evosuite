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

public class TaxConfig_getLastModifiedDate_45780914326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22013;

    public TaxConfig_getLastModifiedDate_45780914326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22013 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term22013, term22013.getClass(), "id", null);
        setField(term22013, term22013.getClass(), "description", null);
        setField(term22013, term22013.getClass(), "countryReason", null);
        setField(term22013, term22013.getClass(), "countryCode", null);
        setField(term22013, term22013.getClass(), "lastModifiedDate", null);
        setField(term22013, term22013.getClass(), "modifiedBy", null);
        setIntField(term22013, term22013.getClass(), "currentRulesCount", 0);
        setIntField(term22013, term22013.getClass(), "maxRulesCount", 0);
        setField(term22013, term22013.getClass(), "taxRules", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term22013, args);
    }

};


