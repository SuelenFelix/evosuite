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
import java.lang.Integer;

public class TaxConfig_setMaxRulesCount_107717205633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22036;
     Object term22039;

    public TaxConfig_setMaxRulesCount_107717205633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22036 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term22036, term22036.getClass(), "id", null);
        setField(term22036, term22036.getClass(), "description", null);
        setField(term22036, term22036.getClass(), "countryReason", null);
        setField(term22036, term22036.getClass(), "countryCode", null);
        setField(term22036, term22036.getClass(), "lastModifiedDate", null);
        setField(term22036, term22036.getClass(), "modifiedBy", null);
        setIntField(term22036, term22036.getClass(), "currentRulesCount", 0);
        setIntField(term22036, term22036.getClass(), "maxRulesCount", 0);
        setField(term22036, term22036.getClass(), "taxRules", null);
        term22039 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22039;
        callMethod(klass, "setMaxRulesCount", argTypes, term22036, args);
    }

};


