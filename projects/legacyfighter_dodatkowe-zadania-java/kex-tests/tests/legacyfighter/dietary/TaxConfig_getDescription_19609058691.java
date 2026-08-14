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

public class TaxConfig_getDescription_19609058691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19181;

    public TaxConfig_getDescription_19609058691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19182 = new Long(-3988042285731673145L);
        ArrayList term19237 = new ArrayList();
        term19181 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term19220 = newInstance(Class.forName("java.time.Instant"));
        setField(term19181, term19181.getClass(), "id", term19182);
        setField(term19181, term19181.getClass(), "description", "gbbYBYyfvr");
        setField(term19181, term19181.getClass(), "countryReason", "SrWMUlbtWV");
        setField(term19181, term19181.getClass(), "countryCode", "VePIumgrrU");
        setLongField(term19220, term19220.getClass(), "seconds", 1630055567L);
        setIntField(term19220, term19220.getClass(), "nanos", 491000000);
        setField(term19181, term19181.getClass(), "lastModifiedDate", term19220);
        setField(term19181, term19181.getClass(), "modifiedBy", "DPwIqlszZo");
        setIntField(term19181, term19181.getClass(), "currentRulesCount", -861014847);
        setIntField(term19181, term19181.getClass(), "maxRulesCount", 2132934139);
        setField(term19181, term19181.getClass(), "taxRules", term19237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term19181, args);
    }

};


