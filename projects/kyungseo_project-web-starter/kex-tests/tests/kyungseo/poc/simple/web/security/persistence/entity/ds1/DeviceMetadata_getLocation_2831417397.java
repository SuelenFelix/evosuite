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

public class DeviceMetadata_getLocation_2831417397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333;

    public DeviceMetadata_getLocation_2831417397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term334 = new Long(-5476826692763582090L);
        Long term336 = new Long(-872011222785455006L);
        term333 = newInstance(Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata"));
        Object term362 = newInstance(Class.forName("java.util.Date"));
        setField(term333, term333.getClass(), "id", term334);
        setField(term333, term333.getClass(), "userId", term336);
        setField(term333, term333.getClass(), "deviceDetails", "LQFpaHEwXR");
        setField(term333, term333.getClass(), "location", "oVcInYnLWB");
        setLongField(term362, term362.getClass(), "fastTime", 1429023851389L);
        setField(term362, term362.getClass(), "cdate", null);
        setField(term333, term333.getClass(), "lastLoggedIn", term362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.security.persistence.entity.ds1.DeviceMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocation", argTypes, term333, args);
    }

};


