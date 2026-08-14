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

public class TaxConfig_setDescription_185785505321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21998;

    public TaxConfig_setDescription_185785505321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21998 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term21998, term21998.getClass(), "id", null);
        setField(term21998, term21998.getClass(), "description", null);
        setField(term21998, term21998.getClass(), "countryReason", null);
        setField(term21998, term21998.getClass(), "countryCode", null);
        setField(term21998, term21998.getClass(), "lastModifiedDate", null);
        setField(term21998, term21998.getClass(), "modifiedBy", null);
        setIntField(term21998, term21998.getClass(), "currentRulesCount", 0);
        setIntField(term21998, term21998.getClass(), "maxRulesCount", 0);
        setField(term21998, term21998.getClass(), "taxRules", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDescription", argTypes, term21998, args);
    }

};


