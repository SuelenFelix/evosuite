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
import java.lang.Integer;

public class TaxConfig_setCurrentRulesCount_202939825312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20977;
     Object term21037;

    public TaxConfig_setCurrentRulesCount_202939825312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20978 = new Long(-6289397283685653555L);
        ArrayList term21033 = new ArrayList();
        term20977 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term21016 = newInstance(Class.forName("java.time.Instant"));
        setField(term20977, term20977.getClass(), "id", term20978);
        setField(term20977, term20977.getClass(), "description", "duOyJsARTD");
        setField(term20977, term20977.getClass(), "countryReason", "xPnOHsNlyc");
        setField(term20977, term20977.getClass(), "countryCode", "OTSPWPJefj");
        setLongField(term21016, term21016.getClass(), "seconds", 1706636196L);
        setIntField(term21016, term21016.getClass(), "nanos", 274000000);
        setField(term20977, term20977.getClass(), "lastModifiedDate", term21016);
        setField(term20977, term20977.getClass(), "modifiedBy", "EOTYMqXRmE");
        setIntField(term20977, term20977.getClass(), "currentRulesCount", 1342884142);
        setIntField(term20977, term20977.getClass(), "maxRulesCount", -1454325068);
        setField(term20977, term20977.getClass(), "taxRules", term21033);
        term21037 = new Integer(346714653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21037;
        callMethod(klass, "setCurrentRulesCount", argTypes, term20977, args);
    }

};


