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

public class TaxConfig_hashCode_87397085118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21895;

    public TaxConfig_hashCode_87397085118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21896 = new Long(-2356977949142999853L);
        ArrayList term21951 = new ArrayList();
        term21895 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term21934 = newInstance(Class.forName("java.time.Instant"));
        setField(term21895, term21895.getClass(), "id", term21896);
        setField(term21895, term21895.getClass(), "description", "CQYmAsjvPU");
        setField(term21895, term21895.getClass(), "countryReason", "NNkIIFpxiB");
        setField(term21895, term21895.getClass(), "countryCode", "sBmtvFPDso");
        setLongField(term21934, term21934.getClass(), "seconds", 1710602340L);
        setIntField(term21934, term21934.getClass(), "nanos", 656000000);
        setField(term21895, term21895.getClass(), "lastModifiedDate", term21934);
        setField(term21895, term21895.getClass(), "modifiedBy", "qsUIxrLolr");
        setIntField(term21895, term21895.getClass(), "currentRulesCount", -1184374392);
        setIntField(term21895, term21895.getClass(), "maxRulesCount", -758870402);
        setField(term21895, term21895.getClass(), "taxRules", term21951);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term21895, args);
    }

};


