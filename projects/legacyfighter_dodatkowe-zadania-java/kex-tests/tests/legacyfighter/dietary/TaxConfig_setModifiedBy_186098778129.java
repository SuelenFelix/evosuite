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

public class TaxConfig_setModifiedBy_186098778129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22022;

    public TaxConfig_setModifiedBy_186098778129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22022 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term22022, term22022.getClass(), "id", null);
        setField(term22022, term22022.getClass(), "description", null);
        setField(term22022, term22022.getClass(), "countryReason", null);
        setField(term22022, term22022.getClass(), "countryCode", null);
        setField(term22022, term22022.getClass(), "lastModifiedDate", null);
        setField(term22022, term22022.getClass(), "modifiedBy", null);
        setIntField(term22022, term22022.getClass(), "currentRulesCount", 0);
        setIntField(term22022, term22022.getClass(), "maxRulesCount", 0);
        setField(term22022, term22022.getClass(), "taxRules", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setModifiedBy", argTypes, term22022, args);
    }

};


