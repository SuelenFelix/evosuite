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

public class TaxConfig_setTaxRules_152440929835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22044;

    public TaxConfig_setTaxRules_152440929835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22044 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term22044, term22044.getClass(), "id", null);
        setField(term22044, term22044.getClass(), "description", null);
        setField(term22044, term22044.getClass(), "countryReason", null);
        setField(term22044, term22044.getClass(), "countryCode", null);
        setField(term22044, term22044.getClass(), "lastModifiedDate", null);
        setField(term22044, term22044.getClass(), "modifiedBy", null);
        setIntField(term22044, term22044.getClass(), "currentRulesCount", 0);
        setIntField(term22044, term22044.getClass(), "maxRulesCount", 0);
        setField(term22044, term22044.getClass(), "taxRules", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTaxRules", argTypes, term22044, args);
    }

};


