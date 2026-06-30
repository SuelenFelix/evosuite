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

public class DeviceMetadata_equals_120715672311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561;
     Object term592;

    public DeviceMetadata_equals_120715672311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term562 = new Long(8059786003080744426L);
        Long term564 = new Long(-4365849114644724155L);
        term561 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata"));
        Object term590 = newInstance(Class.forName("java.util.Date"));
        setField(term561, term561.getClass(), "id", term562);
        setField(term561, term561.getClass(), "userId", term564);
        setField(term561, term561.getClass(), "deviceDetails", "xOEqzGAmDU");
        setField(term561, term561.getClass(), "location", "eZFUvlxvGV");
        setLongField(term590, term590.getClass(), "fastTime", 1589457921030L);
        setField(term590, term590.getClass(), "cdate", null);
        setField(term561, term561.getClass(), "lastLoggedIn", term590);
        term592 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term592;
        callMethod(klass, "equals", argTypes, term561, args);
    }

};


