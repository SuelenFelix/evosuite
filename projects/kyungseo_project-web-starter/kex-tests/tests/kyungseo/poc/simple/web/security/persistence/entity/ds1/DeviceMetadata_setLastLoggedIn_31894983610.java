package kyungseo.poc.simple.web.security.persistence.entity.ds1;

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
import static kyungseo.poc.simple.web.security.persistence.entity.ds1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class DeviceMetadata_setLastLoggedIn_31894983610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508;
     Object term539;

    public DeviceMetadata_setLastLoggedIn_31894983610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term509 = new Long(8428634514691209827L);
        Long term511 = new Long(-2585684163342970173L);
        term508 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata"));
        Object term537 = newInstance(Class.forName("java.util.Date"));
        setField(term508, term508.getClass(), "id", term509);
        setField(term508, term508.getClass(), "userId", term511);
        setField(term508, term508.getClass(), "deviceDetails", "hNxWaHcfhY");
        setField(term508, term508.getClass(), "location", "RkybSrpybU");
        setLongField(term537, term537.getClass(), "fastTime", 1500721068023L);
        setField(term537, term537.getClass(), "cdate", null);
        setField(term508, term508.getClass(), "lastLoggedIn", term537);
        term539 = newInstance(Class.forName("java.util.Date"));
        setLongField(term539, term539.getClass(), "fastTime", 1797203628025L);
        setField(term539, term539.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term539;
        callMethod(klass, "setLastLoggedIn", argTypes, term508, args);
    }

};


