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

public class TaxConfig_setCurrentRulesCount_202939825331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22028;
     Object term22031;

    public TaxConfig_setCurrentRulesCount_202939825331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22028 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term22028, term22028.getClass(), "id", null);
        setField(term22028, term22028.getClass(), "description", null);
        setField(term22028, term22028.getClass(), "countryReason", null);
        setField(term22028, term22028.getClass(), "countryCode", null);
        setField(term22028, term22028.getClass(), "lastModifiedDate", null);
        setField(term22028, term22028.getClass(), "modifiedBy", null);
        setIntField(term22028, term22028.getClass(), "currentRulesCount", 0);
        setIntField(term22028, term22028.getClass(), "maxRulesCount", 0);
        setField(term22028, term22028.getClass(), "taxRules", null);
        term22031 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22031;
        callMethod(klass, "setCurrentRulesCount", argTypes, term22028, args);
    }

};


